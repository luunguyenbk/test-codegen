# CampaignPropertiesApi

All URIs are relative to *https://app.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**campaignPropertyCreate**](CampaignPropertiesApi.md#campaignPropertyCreate) | **POST** /v4/api/campaign-property | 
[**campaignPropertyDelete**](CampaignPropertiesApi.md#campaignPropertyDelete) | **DELETE** /v4/api/campaign-property/{id} | 
[**campaignPropertyGet**](CampaignPropertiesApi.md#campaignPropertyGet) | **GET** /v4/api/campaign-property/{id} | 
[**campaignPropertySearch**](CampaignPropertiesApi.md#campaignPropertySearch) | **GET** /v4/api/campaign-property | 
[**campaignPropertyUpdate**](CampaignPropertiesApi.md#campaignPropertyUpdate) | **PUT** /v4/api/campaign-property/{id} | 

<a name="campaignPropertyCreate"></a>
# **campaignPropertyCreate**
> CampaignProperty campaignPropertyCreate(body)



Create a campaign property.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignPropertiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignPropertiesApi apiInstance = new CampaignPropertiesApi();
CampaignProperty body = new CampaignProperty(); // CampaignProperty | 
try {
    CampaignProperty result = apiInstance.campaignPropertyCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignPropertiesApi#campaignPropertyCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CampaignProperty**](CampaignProperty.md)|  | [optional]

### Return type

[**CampaignProperty**](CampaignProperty.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignPropertyDelete"></a>
# **campaignPropertyDelete**
> campaignPropertyDelete(id)



Remove a campaign property.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignPropertiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignPropertiesApi apiInstance = new CampaignPropertiesApi();
String id = "id_example"; // String | 
try {
    apiInstance.campaignPropertyDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignPropertiesApi#campaignPropertyDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="campaignPropertyGet"></a>
# **campaignPropertyGet**
> CampaignProperty campaignPropertyGet(id)



Retrieve a campaign property.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignPropertiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignPropertiesApi apiInstance = new CampaignPropertiesApi();
String id = "id_example"; // String | 
try {
    CampaignProperty result = apiInstance.campaignPropertyGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignPropertiesApi#campaignPropertyGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**CampaignProperty**](CampaignProperty.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="campaignPropertySearch"></a>
# **campaignPropertySearch**
> CampaignPropertyPaginationResponse campaignPropertySearch(filter, query, page, perPage, sort)



Search campaign properties.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignPropertiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignPropertiesApi apiInstance = new CampaignPropertiesApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    CampaignPropertyPaginationResponse result = apiInstance.campaignPropertySearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignPropertiesApi#campaignPropertySearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**java.util.HashMap**](.md)|  | [optional]
 **query** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **perPage** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**CampaignPropertyPaginationResponse**](CampaignPropertyPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="campaignPropertyUpdate"></a>
# **campaignPropertyUpdate**
> CampaignProperty campaignPropertyUpdate(id, body)



Update a campaign property.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignPropertiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignPropertiesApi apiInstance = new CampaignPropertiesApi();
String id = "id_example"; // String | 
CampaignProperty body = new CampaignProperty(); // CampaignProperty | 
try {
    CampaignProperty result = apiInstance.campaignPropertyUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignPropertiesApi#campaignPropertyUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**CampaignProperty**](CampaignProperty.md)|  | [optional]

### Return type

[**CampaignProperty**](CampaignProperty.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


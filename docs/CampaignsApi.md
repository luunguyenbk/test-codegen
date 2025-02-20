# CampaignsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**campaignCreate**](CampaignsApi.md#campaignCreate) | **POST** /v4/api/campaign | 
[**campaignDelete**](CampaignsApi.md#campaignDelete) | **DELETE** /v4/api/campaign/{id} | 
[**campaignGet**](CampaignsApi.md#campaignGet) | **GET** /v4/api/campaign/{id} | 
[**campaignSearch**](CampaignsApi.md#campaignSearch) | **GET** /v4/api/campaign | 
[**campaignUpdate**](CampaignsApi.md#campaignUpdate) | **PUT** /v4/api/campaign/{id} | 

<a name="campaignCreate"></a>
# **campaignCreate**
> Campaign campaignCreate(body)



Create a campaign.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignsApi apiInstance = new CampaignsApi();
CampaignCreate body = new CampaignCreate(); // CampaignCreate | 
try {
    Campaign result = apiInstance.campaignCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#campaignCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CampaignCreate**](CampaignCreate.md)|  | [optional]

### Return type

[**Campaign**](Campaign.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignDelete"></a>
# **campaignDelete**
> campaignDelete(id)



Remove a campaign.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignsApi apiInstance = new CampaignsApi();
String id = "id_example"; // String | 
try {
    apiInstance.campaignDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#campaignDelete");
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

<a name="campaignGet"></a>
# **campaignGet**
> Campaign campaignGet(id)



Retrieve a campaign

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignsApi apiInstance = new CampaignsApi();
String id = "id_example"; // String | 
try {
    Campaign result = apiInstance.campaignGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#campaignGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="campaignSearch"></a>
# **campaignSearch**
> CampaignPaginationResponse campaignSearch(filter, query, page, perPage, sort)



Search campaigns.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignsApi apiInstance = new CampaignsApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    CampaignPaginationResponse result = apiInstance.campaignSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#campaignSearch");
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

[**CampaignPaginationResponse**](CampaignPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="campaignUpdate"></a>
# **campaignUpdate**
> Campaign campaignUpdate(id, body)



Update a campaign.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignsApi apiInstance = new CampaignsApi();
String id = "id_example"; // String | 
CampaignUpdate body = new CampaignUpdate(); // CampaignUpdate | 
try {
    Campaign result = apiInstance.campaignUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#campaignUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**CampaignUpdate**](CampaignUpdate.md)|  | [optional]

### Return type

[**Campaign**](Campaign.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


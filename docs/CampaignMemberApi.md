# CampaignMemberApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**campaignMemberCreate**](CampaignMemberApi.md#campaignMemberCreate) | **POST** /v4/api/campaign-member | 
[**campaignMemberDelete**](CampaignMemberApi.md#campaignMemberDelete) | **DELETE** /v4/api/campaign-member/{id} | 
[**campaignMemberGet**](CampaignMemberApi.md#campaignMemberGet) | **GET** /v4/api/campaign-member/{id} | 
[**campaignMemberSearch**](CampaignMemberApi.md#campaignMemberSearch) | **GET** /v4/api/campaign-member | 
[**campaignMemberUpdate**](CampaignMemberApi.md#campaignMemberUpdate) | **PUT** /v4/api/campaign-member/{id} | 

<a name="campaignMemberCreate"></a>
# **campaignMemberCreate**
> CampaignMember campaignMemberCreate(body)



Create a campaign member.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignMemberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignMemberApi apiInstance = new CampaignMemberApi();
CampaignMemberCreate body = new CampaignMemberCreate(); // CampaignMemberCreate | 
try {
    CampaignMember result = apiInstance.campaignMemberCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignMemberApi#campaignMemberCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CampaignMemberCreate**](CampaignMemberCreate.md)|  | [optional]

### Return type

[**CampaignMember**](CampaignMember.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignMemberDelete"></a>
# **campaignMemberDelete**
> campaignMemberDelete(id)



Remove a campaign member.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignMemberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignMemberApi apiInstance = new CampaignMemberApi();
String id = "id_example"; // String | 
try {
    apiInstance.campaignMemberDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignMemberApi#campaignMemberDelete");
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

<a name="campaignMemberGet"></a>
# **campaignMemberGet**
> CampaignMember campaignMemberGet(id)



Retrieve a campaign member.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignMemberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignMemberApi apiInstance = new CampaignMemberApi();
String id = "id_example"; // String | 
try {
    CampaignMember result = apiInstance.campaignMemberGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignMemberApi#campaignMemberGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**CampaignMember**](CampaignMember.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="campaignMemberSearch"></a>
# **campaignMemberSearch**
> CampaignMemberPaginationResponse campaignMemberSearch(filter, query, page, perPage, sort)



Search campaign member.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignMemberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignMemberApi apiInstance = new CampaignMemberApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    CampaignMemberPaginationResponse result = apiInstance.campaignMemberSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignMemberApi#campaignMemberSearch");
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

[**CampaignMemberPaginationResponse**](CampaignMemberPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="campaignMemberUpdate"></a>
# **campaignMemberUpdate**
> CampaignMember campaignMemberUpdate(id, body)



Update a campaign member.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.CampaignMemberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CampaignMemberApi apiInstance = new CampaignMemberApi();
String id = "id_example"; // String | 
CampaignMemberUpdate body = new CampaignMemberUpdate(); // CampaignMemberUpdate | 
try {
    CampaignMember result = apiInstance.campaignMemberUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignMemberApi#campaignMemberUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**CampaignMemberUpdate**](CampaignMemberUpdate.md)|  | [optional]

### Return type

[**CampaignMember**](CampaignMember.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# ContentSharingRecommendApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contentSharingRecommendCreate**](ContentSharingRecommendApi.md#contentSharingRecommendCreate) | **POST** /v4/api/content-sharing-recommend | 
[**contentSharingRecommendedDelete**](ContentSharingRecommendApi.md#contentSharingRecommendedDelete) | **DELETE** /v4/api/content-sharing-recommend/{id} | 
[**contentSharingRecommendedGet**](ContentSharingRecommendApi.md#contentSharingRecommendedGet) | **GET** /v4/api/content-sharing-recommend/{id} | 
[**contentSharingRecommendedSearch**](ContentSharingRecommendApi.md#contentSharingRecommendedSearch) | **GET** /v4/api/content-sharing-recommend | 
[**contentSharingRecommendedUpdate**](ContentSharingRecommendApi.md#contentSharingRecommendedUpdate) | **PUT** /v4/api/content-sharing-recommend/{id} | 

<a name="contentSharingRecommendCreate"></a>
# **contentSharingRecommendCreate**
> ContentSharingRecommended contentSharingRecommendCreate(body)



Create a content sharing recommendation.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContentSharingRecommendApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContentSharingRecommendApi apiInstance = new ContentSharingRecommendApi();
ContentSharingRecommendedCreate body = new ContentSharingRecommendedCreate(); // ContentSharingRecommendedCreate | 
try {
    ContentSharingRecommended result = apiInstance.contentSharingRecommendCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentSharingRecommendApi#contentSharingRecommendCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContentSharingRecommendedCreate**](ContentSharingRecommendedCreate.md)|  | [optional]

### Return type

[**ContentSharingRecommended**](ContentSharingRecommended.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contentSharingRecommendedDelete"></a>
# **contentSharingRecommendedDelete**
> contentSharingRecommendedDelete(id)



Remove a content sharing recommendation.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContentSharingRecommendApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContentSharingRecommendApi apiInstance = new ContentSharingRecommendApi();
String id = "id_example"; // String | 
try {
    apiInstance.contentSharingRecommendedDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentSharingRecommendApi#contentSharingRecommendedDelete");
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

<a name="contentSharingRecommendedGet"></a>
# **contentSharingRecommendedGet**
> ContentSharingRecommended contentSharingRecommendedGet(id)



Retrieve a content sharing recommendation.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContentSharingRecommendApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContentSharingRecommendApi apiInstance = new ContentSharingRecommendApi();
String id = "id_example"; // String | 
try {
    ContentSharingRecommended result = apiInstance.contentSharingRecommendedGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentSharingRecommendApi#contentSharingRecommendedGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**ContentSharingRecommended**](ContentSharingRecommended.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentSharingRecommendedSearch"></a>
# **contentSharingRecommendedSearch**
> ContentSharingRecommendPaginationResponse contentSharingRecommendedSearch(filter, query, page, perPage, sort)



Get a list of all recommendations

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContentSharingRecommendApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContentSharingRecommendApi apiInstance = new ContentSharingRecommendApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ContentSharingRecommendPaginationResponse result = apiInstance.contentSharingRecommendedSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentSharingRecommendApi#contentSharingRecommendedSearch");
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

[**ContentSharingRecommendPaginationResponse**](ContentSharingRecommendPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentSharingRecommendedUpdate"></a>
# **contentSharingRecommendedUpdate**
> ContentSharingRecommended contentSharingRecommendedUpdate(id, body)



Update a content sharing recommendation.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContentSharingRecommendApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContentSharingRecommendApi apiInstance = new ContentSharingRecommendApi();
String id = "id_example"; // String | 
ContentSharingRecommendedUpdate body = new ContentSharingRecommendedUpdate(); // ContentSharingRecommendedUpdate | 
try {
    ContentSharingRecommended result = apiInstance.contentSharingRecommendedUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentSharingRecommendApi#contentSharingRecommendedUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**ContentSharingRecommendedUpdate**](ContentSharingRecommendedUpdate.md)|  | [optional]

### Return type

[**ContentSharingRecommended**](ContentSharingRecommended.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


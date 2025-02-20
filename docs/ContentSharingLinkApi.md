# ContentSharingLinkApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contentSharingLinkCreate**](ContentSharingLinkApi.md#contentSharingLinkCreate) | **POST** /v4/api/content-sharing-link | 
[**contentSharingLinkDelete**](ContentSharingLinkApi.md#contentSharingLinkDelete) | **DELETE** /v4/api/content-sharing-link/{id} | 
[**contentSharingLinkGet**](ContentSharingLinkApi.md#contentSharingLinkGet) | **GET** /v4/api/content-sharing-link/{id} | 
[**contentSharingLinkSearch**](ContentSharingLinkApi.md#contentSharingLinkSearch) | **GET** /v4/api/content-sharing-link | 
[**contentSharingLinkUpdate**](ContentSharingLinkApi.md#contentSharingLinkUpdate) | **PUT** /v4/api/content-sharing-link/{id} | 

<a name="contentSharingLinkCreate"></a>
# **contentSharingLinkCreate**
> ContentSharingLink contentSharingLinkCreate(body)



Create a content sharing link.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContentSharingLinkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContentSharingLinkApi apiInstance = new ContentSharingLinkApi();
ContentSharingLinkCreate body = new ContentSharingLinkCreate(); // ContentSharingLinkCreate | 
try {
    ContentSharingLink result = apiInstance.contentSharingLinkCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentSharingLinkApi#contentSharingLinkCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContentSharingLinkCreate**](ContentSharingLinkCreate.md)|  | [optional]

### Return type

[**ContentSharingLink**](ContentSharingLink.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contentSharingLinkDelete"></a>
# **contentSharingLinkDelete**
> contentSharingLinkDelete(id)



Remove a content sharing link.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContentSharingLinkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContentSharingLinkApi apiInstance = new ContentSharingLinkApi();
String id = "id_example"; // String | 
try {
    apiInstance.contentSharingLinkDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentSharingLinkApi#contentSharingLinkDelete");
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

<a name="contentSharingLinkGet"></a>
# **contentSharingLinkGet**
> ContentSharingLink contentSharingLinkGet(id)



Retrieve a content sharing category.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContentSharingLinkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContentSharingLinkApi apiInstance = new ContentSharingLinkApi();
String id = "id_example"; // String | 
try {
    ContentSharingLink result = apiInstance.contentSharingLinkGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentSharingLinkApi#contentSharingLinkGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**ContentSharingLink**](ContentSharingLink.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentSharingLinkSearch"></a>
# **contentSharingLinkSearch**
> ContentSharingLinkPaginationResponse contentSharingLinkSearch(filter, query, page, perPage, sort)



Get a list of all links

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContentSharingLinkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContentSharingLinkApi apiInstance = new ContentSharingLinkApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ContentSharingLinkPaginationResponse result = apiInstance.contentSharingLinkSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentSharingLinkApi#contentSharingLinkSearch");
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

[**ContentSharingLinkPaginationResponse**](ContentSharingLinkPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentSharingLinkUpdate"></a>
# **contentSharingLinkUpdate**
> ContentSharingLink contentSharingLinkUpdate(id, body)



Update a content sharing link.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContentSharingLinkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContentSharingLinkApi apiInstance = new ContentSharingLinkApi();
String id = "id_example"; // String | 
ContentSharingLinkUpdate body = new ContentSharingLinkUpdate(); // ContentSharingLinkUpdate | 
try {
    ContentSharingLink result = apiInstance.contentSharingLinkUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentSharingLinkApi#contentSharingLinkUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**ContentSharingLinkUpdate**](ContentSharingLinkUpdate.md)|  | [optional]

### Return type

[**ContentSharingLink**](ContentSharingLink.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


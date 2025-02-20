# ContentSharingCategoryApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contentSharingCategoryCreate**](ContentSharingCategoryApi.md#contentSharingCategoryCreate) | **POST** /v4/api/content-sharing-category | 
[**contentSharingCategoryDelete**](ContentSharingCategoryApi.md#contentSharingCategoryDelete) | **DELETE** /v4/api/content-sharing-category/{id} | 
[**contentSharingCategoryGet**](ContentSharingCategoryApi.md#contentSharingCategoryGet) | **GET** /v4/api/content-sharing-category/{id} | 
[**contentSharingCategorySearch**](ContentSharingCategoryApi.md#contentSharingCategorySearch) | **GET** /v4/api/content-sharing-category | 
[**contentSharingCategoryUpdate**](ContentSharingCategoryApi.md#contentSharingCategoryUpdate) | **PUT** /v4/api/content-sharing-category/{id} | 

<a name="contentSharingCategoryCreate"></a>
# **contentSharingCategoryCreate**
> ContentSharingCategory contentSharingCategoryCreate(body)



Create a content sharing category.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContentSharingCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContentSharingCategoryApi apiInstance = new ContentSharingCategoryApi();
ContentSharingCategoryCreate body = new ContentSharingCategoryCreate(); // ContentSharingCategoryCreate | 
try {
    ContentSharingCategory result = apiInstance.contentSharingCategoryCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentSharingCategoryApi#contentSharingCategoryCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContentSharingCategoryCreate**](ContentSharingCategoryCreate.md)|  | [optional]

### Return type

[**ContentSharingCategory**](ContentSharingCategory.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contentSharingCategoryDelete"></a>
# **contentSharingCategoryDelete**
> contentSharingCategoryDelete(id)



Remove a content sharing category.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContentSharingCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContentSharingCategoryApi apiInstance = new ContentSharingCategoryApi();
String id = "id_example"; // String | 
try {
    apiInstance.contentSharingCategoryDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentSharingCategoryApi#contentSharingCategoryDelete");
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

<a name="contentSharingCategoryGet"></a>
# **contentSharingCategoryGet**
> ContentSharingCategory contentSharingCategoryGet(id)



Retrieve a content sharing category.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContentSharingCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContentSharingCategoryApi apiInstance = new ContentSharingCategoryApi();
String id = "id_example"; // String | 
try {
    ContentSharingCategory result = apiInstance.contentSharingCategoryGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentSharingCategoryApi#contentSharingCategoryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**ContentSharingCategory**](ContentSharingCategory.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentSharingCategorySearch"></a>
# **contentSharingCategorySearch**
> ContentSharingCategoryPaginationResponse contentSharingCategorySearch(filter, query, page, perPage, sort)



Search content sharing categories

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContentSharingCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContentSharingCategoryApi apiInstance = new ContentSharingCategoryApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ContentSharingCategoryPaginationResponse result = apiInstance.contentSharingCategorySearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentSharingCategoryApi#contentSharingCategorySearch");
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

[**ContentSharingCategoryPaginationResponse**](ContentSharingCategoryPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentSharingCategoryUpdate"></a>
# **contentSharingCategoryUpdate**
> ContentSharingCategory contentSharingCategoryUpdate(id, body)



Update a content sharing category.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContentSharingCategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContentSharingCategoryApi apiInstance = new ContentSharingCategoryApi();
String id = "id_example"; // String | 
ContentSharingCategoryUpdate body = new ContentSharingCategoryUpdate(); // ContentSharingCategoryUpdate | 
try {
    ContentSharingCategory result = apiInstance.contentSharingCategoryUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentSharingCategoryApi#contentSharingCategoryUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**ContentSharingCategoryUpdate**](ContentSharingCategoryUpdate.md)|  | [optional]

### Return type

[**ContentSharingCategory**](ContentSharingCategory.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


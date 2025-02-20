# UserExternalIdApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userExternalId**](UserExternalIdApi.md#userExternalId) | **GET** /v4/api/user-external-id | 
[**userExternalIdCreate**](UserExternalIdApi.md#userExternalIdCreate) | **POST** /v4/api/user-external-id | 
[**userExternalIdDelete**](UserExternalIdApi.md#userExternalIdDelete) | **DELETE** /v4/api/user-external-id/{id} | 
[**userExternalIdGet**](UserExternalIdApi.md#userExternalIdGet) | **GET** /v4/api/user-external-id/{id} | 
[**userExternalIdUpdate**](UserExternalIdApi.md#userExternalIdUpdate) | **PUT** /v4/api/user-external-id/{id} | 

<a name="userExternalId"></a>
# **userExternalId**
> UserExternalIdPaginationResponse userExternalId(filter, query, page, perPage, sort)



Search user external ids.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.UserExternalIdApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserExternalIdApi apiInstance = new UserExternalIdApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    UserExternalIdPaginationResponse result = apiInstance.userExternalId(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserExternalIdApi#userExternalId");
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

[**UserExternalIdPaginationResponse**](UserExternalIdPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userExternalIdCreate"></a>
# **userExternalIdCreate**
> UserExternalId userExternalIdCreate(body)



Create a user external id.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.UserExternalIdApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserExternalIdApi apiInstance = new UserExternalIdApi();
UserExternalIdCreate body = new UserExternalIdCreate(); // UserExternalIdCreate | 
try {
    UserExternalId result = apiInstance.userExternalIdCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserExternalIdApi#userExternalIdCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserExternalIdCreate**](UserExternalIdCreate.md)|  | [optional]

### Return type

[**UserExternalId**](UserExternalId.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userExternalIdDelete"></a>
# **userExternalIdDelete**
> userExternalIdDelete(id)



Remove a user external id.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.UserExternalIdApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserExternalIdApi apiInstance = new UserExternalIdApi();
String id = "id_example"; // String | 
try {
    apiInstance.userExternalIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling UserExternalIdApi#userExternalIdDelete");
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

<a name="userExternalIdGet"></a>
# **userExternalIdGet**
> UserExternalId userExternalIdGet(id)



Retrieve a user external id.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.UserExternalIdApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserExternalIdApi apiInstance = new UserExternalIdApi();
String id = "id_example"; // String | 
try {
    UserExternalId result = apiInstance.userExternalIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserExternalIdApi#userExternalIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**UserExternalId**](UserExternalId.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userExternalIdUpdate"></a>
# **userExternalIdUpdate**
> UserExternalId userExternalIdUpdate(id, body)



Update a user external id.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.UserExternalIdApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserExternalIdApi apiInstance = new UserExternalIdApi();
String id = "id_example"; // String | 
UserExternalIdUpdate body = new UserExternalIdUpdate(); // UserExternalIdUpdate | 
try {
    UserExternalId result = apiInstance.userExternalIdUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserExternalIdApi#userExternalIdUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**UserExternalIdUpdate**](UserExternalIdUpdate.md)|  | [optional]

### Return type

[**UserExternalId**](UserExternalId.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


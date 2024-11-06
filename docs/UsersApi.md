# UsersApi

All URIs are relative to *https://app.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userGet**](UsersApi.md#userGet) | **GET** /v4/api/user/{id} | 
[**userSearch**](UsersApi.md#userSearch) | **GET** /v4/api/user | 

<a name="userGet"></a>
# **userGet**
> User userGet(id)



Retrieve an user.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UsersApi apiInstance = new UsersApi();
String id = "id_example"; // String | 
try {
    User result = apiInstance.userGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#userGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**User**](User.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userSearch"></a>
# **userSearch**
> UserPaginationResponse userSearch(filter, query, page, perPage, sort)



Search users.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UsersApi apiInstance = new UsersApi();
HashMap filter = new HashMap(); // HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    UserPaginationResponse result = apiInstance.userSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#userSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**HashMap**](.md)|  | [optional]
 **query** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **perPage** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**UserPaginationResponse**](UserPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


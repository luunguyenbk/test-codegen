# AccountCredentialsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountCredentialCreate**](AccountCredentialsApi.md#accountCredentialCreate) | **POST** /v4/api/account-credential | 
[**accountCredentialGet**](AccountCredentialsApi.md#accountCredentialGet) | **GET** /v4/api/account-credential/{id} | 
[**accountCredentialSearch**](AccountCredentialsApi.md#accountCredentialSearch) | **GET** /v4/api/account-credential | 
[**accountCredentialUpdate**](AccountCredentialsApi.md#accountCredentialUpdate) | **PUT** /v4/api/account-credential/{id} | 

<a name="accountCredentialCreate"></a>
# **accountCredentialCreate**
> AccountCredential accountCredentialCreate(body)



Create a account credential.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountCredentialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountCredentialsApi apiInstance = new AccountCredentialsApi();
AccountCredentialCreate body = new AccountCredentialCreate(); // AccountCredentialCreate | 
try {
    AccountCredential result = apiInstance.accountCredentialCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountCredentialsApi#accountCredentialCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountCredentialCreate**](AccountCredentialCreate.md)|  | [optional]

### Return type

[**AccountCredential**](AccountCredential.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountCredentialGet"></a>
# **accountCredentialGet**
> AccountCredential accountCredentialGet(id)



Retrieve a account credential.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountCredentialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountCredentialsApi apiInstance = new AccountCredentialsApi();
String id = "id_example"; // String | 
try {
    AccountCredential result = apiInstance.accountCredentialGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountCredentialsApi#accountCredentialGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**AccountCredential**](AccountCredential.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountCredentialSearch"></a>
# **accountCredentialSearch**
> AccountCredentialPaginationResponse accountCredentialSearch(filter, query, page, perPage, sort)



Search account credentials.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountCredentialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountCredentialsApi apiInstance = new AccountCredentialsApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    AccountCredentialPaginationResponse result = apiInstance.accountCredentialSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountCredentialsApi#accountCredentialSearch");
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

[**AccountCredentialPaginationResponse**](AccountCredentialPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountCredentialUpdate"></a>
# **accountCredentialUpdate**
> AccountCredential accountCredentialUpdate(id, body)



Update a account credential.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountCredentialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountCredentialsApi apiInstance = new AccountCredentialsApi();
String id = "id_example"; // String | 
AccountCredential body = new AccountCredential(); // AccountCredential | 
try {
    AccountCredential result = apiInstance.accountCredentialUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountCredentialsApi#accountCredentialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**AccountCredential**](AccountCredential.md)|  | [optional]

### Return type

[**AccountCredential**](AccountCredential.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


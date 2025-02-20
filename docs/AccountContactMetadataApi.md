# AccountContactMetadataApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountContactMetadata**](AccountContactMetadataApi.md#accountContactMetadata) | **GET** /v4/api/account-contact-metadata | 
[**accountContactMetadataCreate**](AccountContactMetadataApi.md#accountContactMetadataCreate) | **POST** /v4/api/account-contact-metadata | 
[**accountContactMetadataDelete**](AccountContactMetadataApi.md#accountContactMetadataDelete) | **DELETE** /v4/api/account-contact-metadata/{id} | 
[**accountContactMetadataGet**](AccountContactMetadataApi.md#accountContactMetadataGet) | **GET** /v4/api/account-contact-metadata/{id} | 
[**accountContactMetadataUpdate**](AccountContactMetadataApi.md#accountContactMetadataUpdate) | **PUT** /v4/api/account-contact-metadata/{id} | 

<a name="accountContactMetadata"></a>
# **accountContactMetadata**
> AccountContactMetadataPaginationResponse accountContactMetadata(filter, query, page, perPage, sort)



Search account contact metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountContactMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountContactMetadataApi apiInstance = new AccountContactMetadataApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    AccountContactMetadataPaginationResponse result = apiInstance.accountContactMetadata(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountContactMetadataApi#accountContactMetadata");
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

[**AccountContactMetadataPaginationResponse**](AccountContactMetadataPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountContactMetadataCreate"></a>
# **accountContactMetadataCreate**
> AccountContactMetadata accountContactMetadataCreate(body)



Create a account contact metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountContactMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountContactMetadataApi apiInstance = new AccountContactMetadataApi();
AccountContactMetadataCreate body = new AccountContactMetadataCreate(); // AccountContactMetadataCreate | 
try {
    AccountContactMetadata result = apiInstance.accountContactMetadataCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountContactMetadataApi#accountContactMetadataCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountContactMetadataCreate**](AccountContactMetadataCreate.md)|  | [optional]

### Return type

[**AccountContactMetadata**](AccountContactMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountContactMetadataDelete"></a>
# **accountContactMetadataDelete**
> accountContactMetadataDelete(id)



Remove a account contact metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountContactMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountContactMetadataApi apiInstance = new AccountContactMetadataApi();
String id = "id_example"; // String | 
try {
    apiInstance.accountContactMetadataDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountContactMetadataApi#accountContactMetadataDelete");
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

<a name="accountContactMetadataGet"></a>
# **accountContactMetadataGet**
> AccountContactMetadata accountContactMetadataGet(id)



Retrieve a account contact metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountContactMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountContactMetadataApi apiInstance = new AccountContactMetadataApi();
String id = "id_example"; // String | 
try {
    AccountContactMetadata result = apiInstance.accountContactMetadataGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountContactMetadataApi#accountContactMetadataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**AccountContactMetadata**](AccountContactMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountContactMetadataUpdate"></a>
# **accountContactMetadataUpdate**
> AccountContactMetadata accountContactMetadataUpdate(id, body)



Update a account contact metadata.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountContactMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountContactMetadataApi apiInstance = new AccountContactMetadataApi();
String id = "id_example"; // String | 
AccountContactMetadataUpdate body = new AccountContactMetadataUpdate(); // AccountContactMetadataUpdate | 
try {
    AccountContactMetadata result = apiInstance.accountContactMetadataUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountContactMetadataApi#accountContactMetadataUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**AccountContactMetadataUpdate**](AccountContactMetadataUpdate.md)|  | [optional]

### Return type

[**AccountContactMetadata**](AccountContactMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


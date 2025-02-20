# VendorMessagesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vendorMessageCreate**](VendorMessagesApi.md#vendorMessageCreate) | **POST** /v4/api/vendor-message | 
[**vendorMessageGet**](VendorMessagesApi.md#vendorMessageGet) | **GET** /v4/api/vendor-message/{id} | 
[**vendorMessageSearch**](VendorMessagesApi.md#vendorMessageSearch) | **GET** /v4/api/vendor-message | 

<a name="vendorMessageCreate"></a>
# **vendorMessageCreate**
> VendorMessage vendorMessageCreate(body)



Create a message template.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.VendorMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


VendorMessagesApi apiInstance = new VendorMessagesApi();
VendorMessageCreate body = new VendorMessageCreate(); // VendorMessageCreate | 
try {
    VendorMessage result = apiInstance.vendorMessageCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorMessagesApi#vendorMessageCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VendorMessageCreate**](VendorMessageCreate.md)|  | [optional]

### Return type

[**VendorMessage**](VendorMessage.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="vendorMessageGet"></a>
# **vendorMessageGet**
> VendorMessage vendorMessageGet(id)



Retrieve a message template.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.VendorMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


VendorMessagesApi apiInstance = new VendorMessagesApi();
String id = "id_example"; // String | 
try {
    VendorMessage result = apiInstance.vendorMessageGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorMessagesApi#vendorMessageGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**VendorMessage**](VendorMessage.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="vendorMessageSearch"></a>
# **vendorMessageSearch**
> VendorMessagePaginationResponse vendorMessageSearch(filter, query, page, perPage, sort)



Search vendor messages.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.VendorMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


VendorMessagesApi apiInstance = new VendorMessagesApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    VendorMessagePaginationResponse result = apiInstance.vendorMessageSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorMessagesApi#vendorMessageSearch");
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

[**VendorMessagePaginationResponse**](VendorMessagePaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


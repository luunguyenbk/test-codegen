# DealersApi

All URIs are relative to *https://app.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dealerGet**](DealersApi.md#dealerGet) | **GET** /v4/api/dealer/{id} | 
[**dealerSearch**](DealersApi.md#dealerSearch) | **GET** /v4/api/dealer | 

<a name="dealerGet"></a>
# **dealerGet**
> Dealer dealerGet(id)



Retrieve a dealer.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DealersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DealersApi apiInstance = new DealersApi();
String id = "id_example"; // String | 
try {
    Dealer result = apiInstance.dealerGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealersApi#dealerGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Dealer**](Dealer.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealerSearch"></a>
# **dealerSearch**
> DealerPaginationResponse dealerSearch(filter, query, page, perPage, sort)



Search dealers.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DealersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DealersApi apiInstance = new DealersApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    DealerPaginationResponse result = apiInstance.dealerSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealersApi#dealerSearch");
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

[**DealerPaginationResponse**](DealerPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


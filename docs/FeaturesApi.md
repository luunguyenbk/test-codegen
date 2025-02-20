# FeaturesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**feature**](FeaturesApi.md#feature) | **GET** /v4/api/feature | 
[**featureGet**](FeaturesApi.md#featureGet) | **GET** /v4/api/feature/{id} | 

<a name="feature"></a>
# **feature**
> FeaturePaginationResponse feature(filter, query, page, perPage, sort)



Search features.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.FeaturesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FeaturesApi apiInstance = new FeaturesApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    FeaturePaginationResponse result = apiInstance.feature(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeaturesApi#feature");
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

[**FeaturePaginationResponse**](FeaturePaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="featureGet"></a>
# **featureGet**
> Feature featureGet(id)



Retrieve a feature.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.FeaturesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FeaturesApi apiInstance = new FeaturesApi();
String id = "id_example"; // String | 
try {
    Feature result = apiInstance.featureGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeaturesApi#featureGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Feature**](Feature.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


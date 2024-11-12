# DistrictsApi

All URIs are relative to *https://app.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**districtCreate**](DistrictsApi.md#districtCreate) | **POST** /v4/api/district | 
[**districtDelete**](DistrictsApi.md#districtDelete) | **DELETE** /v4/api/district/{id} | 
[**districtGet**](DistrictsApi.md#districtGet) | **GET** /v4/api/district/{id} | 
[**districtSearch**](DistrictsApi.md#districtSearch) | **GET** /v4/api/district | 
[**districtUpdate**](DistrictsApi.md#districtUpdate) | **PUT** /v4/api/district/{id} | 

<a name="districtCreate"></a>
# **districtCreate**
> District districtCreate(body)



Create a district.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DistrictsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DistrictsApi apiInstance = new DistrictsApi();
DistrictCreate body = new DistrictCreate(); // DistrictCreate | 
try {
    District result = apiInstance.districtCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistrictsApi#districtCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DistrictCreate**](DistrictCreate.md)|  | [optional]

### Return type

[**District**](District.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="districtDelete"></a>
# **districtDelete**
> districtDelete(id)



Remove a district.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DistrictsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DistrictsApi apiInstance = new DistrictsApi();
String id = "id_example"; // String | 
try {
    apiInstance.districtDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DistrictsApi#districtDelete");
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

<a name="districtGet"></a>
# **districtGet**
> District districtGet(id)



Retrieve a district.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DistrictsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DistrictsApi apiInstance = new DistrictsApi();
String id = "id_example"; // String | 
try {
    District result = apiInstance.districtGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistrictsApi#districtGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**District**](District.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="districtSearch"></a>
# **districtSearch**
> DistrictPaginationResponse districtSearch(filter, query, page, perPage, sort)



Search districts.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DistrictsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DistrictsApi apiInstance = new DistrictsApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    DistrictPaginationResponse result = apiInstance.districtSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistrictsApi#districtSearch");
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

[**DistrictPaginationResponse**](DistrictPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="districtUpdate"></a>
# **districtUpdate**
> District districtUpdate(id, body)



Update a district.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DistrictsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DistrictsApi apiInstance = new DistrictsApi();
String id = "id_example"; // String | 
DistrictUpdate body = new DistrictUpdate(); // DistrictUpdate | 
try {
    District result = apiInstance.districtUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistrictsApi#districtUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**DistrictUpdate**](DistrictUpdate.md)|  | [optional]

### Return type

[**District**](District.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


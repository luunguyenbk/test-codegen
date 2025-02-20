# RegionsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**regionCreate**](RegionsApi.md#regionCreate) | **POST** /v4/api/region | 
[**regionDelete**](RegionsApi.md#regionDelete) | **DELETE** /v4/api/region/{id} | 
[**regionGet**](RegionsApi.md#regionGet) | **GET** /v4/api/region/{id} | 
[**regionSearch**](RegionsApi.md#regionSearch) | **GET** /v4/api/region | 
[**regionUpdate**](RegionsApi.md#regionUpdate) | **PUT** /v4/api/region/{id} | 

<a name="regionCreate"></a>
# **regionCreate**
> Region regionCreate(body)



Create a region.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RegionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RegionsApi apiInstance = new RegionsApi();
RegionCreate body = new RegionCreate(); // RegionCreate | 
try {
    Region result = apiInstance.regionCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegionsApi#regionCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RegionCreate**](RegionCreate.md)|  | [optional]

### Return type

[**Region**](Region.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="regionDelete"></a>
# **regionDelete**
> regionDelete(id)



Remove a region.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RegionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RegionsApi apiInstance = new RegionsApi();
String id = "id_example"; // String | 
try {
    apiInstance.regionDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling RegionsApi#regionDelete");
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

<a name="regionGet"></a>
# **regionGet**
> Region regionGet(id)



Retrieve a region.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RegionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RegionsApi apiInstance = new RegionsApi();
String id = "id_example"; // String | 
try {
    Region result = apiInstance.regionGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegionsApi#regionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Region**](Region.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="regionSearch"></a>
# **regionSearch**
> RegionPaginationResponse regionSearch(filter, query, page, perPage, sort)



Search regions.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RegionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RegionsApi apiInstance = new RegionsApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    RegionPaginationResponse result = apiInstance.regionSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegionsApi#regionSearch");
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

[**RegionPaginationResponse**](RegionPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="regionUpdate"></a>
# **regionUpdate**
> Region regionUpdate(id, body)



Update a district.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.RegionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RegionsApi apiInstance = new RegionsApi();
String id = "id_example"; // String | 
RegionUpdate body = new RegionUpdate(); // RegionUpdate | 
try {
    Region result = apiInstance.regionUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegionsApi#regionUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**RegionUpdate**](RegionUpdate.md)|  | [optional]

### Return type

[**Region**](Region.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


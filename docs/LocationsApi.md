# LocationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationGet**](LocationsApi.md#locationGet) | **GET** /v4/api/location/{id} | 
[**locationSearch**](LocationsApi.md#locationSearch) | **GET** /v4/api/location | 

<a name="locationGet"></a>
# **locationGet**
> Location locationGet(id)



Retrieve a location.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationsApi apiInstance = new LocationsApi();
String id = "id_example"; // String | 
try {
    Location result = apiInstance.locationGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#locationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Location**](Location.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locationSearch"></a>
# **locationSearch**
> LocationPaginationResponse locationSearch(filter, query, page, perPage, sort)



Search locations.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LocationsApi apiInstance = new LocationsApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    LocationPaginationResponse result = apiInstance.locationSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#locationSearch");
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

[**LocationPaginationResponse**](LocationPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# DealerAllowedFeaturesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dealerAllowedFeatureCreate**](DealerAllowedFeaturesApi.md#dealerAllowedFeatureCreate) | **POST** /v4/api/dealer-allowed-feature | 
[**dealerAllowedFeatureDelete**](DealerAllowedFeaturesApi.md#dealerAllowedFeatureDelete) | **DELETE** /v4/api/dealer-allowed-feature/{dealer}/{feature} | 

<a name="dealerAllowedFeatureCreate"></a>
# **dealerAllowedFeatureCreate**
> DealerAllowedFeature dealerAllowedFeatureCreate(body)



Create a dealer allowed feature.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DealerAllowedFeaturesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DealerAllowedFeaturesApi apiInstance = new DealerAllowedFeaturesApi();
DealerAllowedFeatureCreate body = new DealerAllowedFeatureCreate(); // DealerAllowedFeatureCreate | 
try {
    DealerAllowedFeature result = apiInstance.dealerAllowedFeatureCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealerAllowedFeaturesApi#dealerAllowedFeatureCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DealerAllowedFeatureCreate**](DealerAllowedFeatureCreate.md)|  | [optional]

### Return type

[**DealerAllowedFeature**](DealerAllowedFeature.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dealerAllowedFeatureDelete"></a>
# **dealerAllowedFeatureDelete**
> dealerAllowedFeatureDelete(dealer, feature)



Remove a dealer allowed feature.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.DealerAllowedFeaturesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DealerAllowedFeaturesApi apiInstance = new DealerAllowedFeaturesApi();
String dealer = "dealer_example"; // String | 
String feature = "feature_example"; // String | 
try {
    apiInstance.dealerAllowedFeatureDelete(dealer, feature);
} catch (ApiException e) {
    System.err.println("Exception when calling DealerAllowedFeaturesApi#dealerAllowedFeatureDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealer** | **String**|  |
 **feature** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


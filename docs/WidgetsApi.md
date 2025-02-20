# WidgetsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v4ApiWidgetsCampaignsAccountIdGet**](WidgetsApi.md#v4ApiWidgetsCampaignsAccountIdGet) | **GET** /v4/api/widgets/campaigns/{accountId} | 

<a name="v4ApiWidgetsCampaignsAccountIdGet"></a>
# **v4ApiWidgetsCampaignsAccountIdGet**
> v4ApiWidgetsCampaignsAccountIdGet(accountId)



### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.WidgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


WidgetsApi apiInstance = new WidgetsApi();
String accountId = "accountId_example"; // String | 
try {
    apiInstance.v4ApiWidgetsCampaignsAccountIdGet(accountId);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#v4ApiWidgetsCampaignsAccountIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


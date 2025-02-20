# AuthenticationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authMe**](AuthenticationApi.md#authMe) | **GET** /v4/api/auth/me | 
[**login**](AuthenticationApi.md#login) | **POST** /v4/api/auth/login | 
[**logout**](AuthenticationApi.md#logout) | **GET** /v4/api/auth/logout | 
[**switchDealer**](AuthenticationApi.md#switchDealer) | **GET** /v4/api/auth/switch | 

<a name="authMe"></a>
# **authMe**
> User authMe()



Get currently logged in user.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AuthenticationApi apiInstance = new AuthenticationApi();
try {
    User result = apiInstance.authMe();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#authMe");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="login"></a>
# **login**
> InlineResponse200 login(body)



Log in.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AuthenticationApi apiInstance = new AuthenticationApi();
AuthLoginBody body = new AuthLoginBody(); // AuthLoginBody | 
try {
    InlineResponse200 result = apiInstance.login(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuthLoginBody**](AuthLoginBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logout"></a>
# **logout**
> logout()



Log out.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AuthenticationApi apiInstance = new AuthenticationApi();
try {
    apiInstance.logout();
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#logout");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="switchDealer"></a>
# **switchDealer**
> switchDealer(dealerId, roleId)



Switch active dealer.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AuthenticationApi apiInstance = new AuthenticationApi();
Integer dealerId = 56; // Integer | 
Integer roleId = 56; // Integer | 
try {
    apiInstance.switchDealer(dealerId, roleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#switchDealer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealerId** | **Integer**|  | [optional]
 **roleId** | **Integer**|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


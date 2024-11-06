# AccountMembersApi

All URIs are relative to *https://app.statflo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountMemberCreate**](AccountMembersApi.md#accountMemberCreate) | **POST** /v4/api/account-member | 
[**accountMemberDelete**](AccountMembersApi.md#accountMemberDelete) | **DELETE** /v4/api/account-member/{id} | 
[**accountMemberGet**](AccountMembersApi.md#accountMemberGet) | **GET** /v4/api/account-member/{id} | 
[**accountMemberSearch**](AccountMembersApi.md#accountMemberSearch) | **GET** /v4/api/account-member | 
[**accountMemberUpdate**](AccountMembersApi.md#accountMemberUpdate) | **PUT** /v4/api/account-member/{id} | 

<a name="accountMemberCreate"></a>
# **accountMemberCreate**
> AccountMember accountMemberCreate(body)



Create an account.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountMembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountMembersApi apiInstance = new AccountMembersApi();
AccountMemberCreate body = new AccountMemberCreate(); // AccountMemberCreate | 
try {
    AccountMember result = apiInstance.accountMemberCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountMembersApi#accountMemberCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountMemberCreate**](AccountMemberCreate.md)|  | [optional]

### Return type

[**AccountMember**](AccountMember.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountMemberDelete"></a>
# **accountMemberDelete**
> accountMemberDelete(id)



Remove an account member.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountMembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountMembersApi apiInstance = new AccountMembersApi();
String id = "id_example"; // String | 
try {
    apiInstance.accountMemberDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountMembersApi#accountMemberDelete");
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

<a name="accountMemberGet"></a>
# **accountMemberGet**
> AccountMember accountMemberGet(id)



Retrieve an account member.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountMembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountMembersApi apiInstance = new AccountMembersApi();
String id = "id_example"; // String | 
try {
    AccountMember result = apiInstance.accountMemberGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountMembersApi#accountMemberGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**AccountMember**](AccountMember.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountMemberSearch"></a>
# **accountMemberSearch**
> AccountMemberPaginationResponse accountMemberSearch(filter, query, page, perPage, sort)



Search account members.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountMembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountMembersApi apiInstance = new AccountMembersApi();
HashMap filter = new HashMap(); // HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    AccountMemberPaginationResponse result = apiInstance.accountMemberSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountMembersApi#accountMemberSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**HashMap**](.md)|  | [optional]
 **query** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **perPage** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**AccountMemberPaginationResponse**](AccountMemberPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountMemberUpdate"></a>
# **accountMemberUpdate**
> AccountMember accountMemberUpdate(id, body)



Update an account member.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.AccountMembersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountMembersApi apiInstance = new AccountMembersApi();
String id = "id_example"; // String | 
AccountMemberUpdate body = new AccountMemberUpdate(); // AccountMemberUpdate | 
try {
    AccountMember result = apiInstance.accountMemberUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountMembersApi#accountMemberUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**AccountMemberUpdate**](AccountMemberUpdate.md)|  | [optional]

### Return type

[**AccountMember**](AccountMember.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


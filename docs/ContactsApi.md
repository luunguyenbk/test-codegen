# ContactsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contactCreate**](ContactsApi.md#contactCreate) | **POST** /v4/api/contact | 
[**contactDelete**](ContactsApi.md#contactDelete) | **DELETE** /v4/api/contact/{id} | 
[**contactGet**](ContactsApi.md#contactGet) | **GET** /v4/api/contact/{id} | 
[**contactSearch**](ContactsApi.md#contactSearch) | **GET** /v4/api/contact | 
[**contactUpdate**](ContactsApi.md#contactUpdate) | **PUT** /v4/api/contact/{id} | 

<a name="contactCreate"></a>
# **contactCreate**
> ContactCreate contactCreate(body)



Create a contact.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContactsApi apiInstance = new ContactsApi();
Contact body = new Contact(); // Contact | 
try {
    ContactCreate result = apiInstance.contactCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#contactCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Contact**](Contact.md)|  | [optional]

### Return type

[**ContactCreate**](ContactCreate.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contactDelete"></a>
# **contactDelete**
> contactDelete(id)



Remove a contact.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContactsApi apiInstance = new ContactsApi();
String id = "id_example"; // String | 
try {
    apiInstance.contactDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#contactDelete");
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

<a name="contactGet"></a>
# **contactGet**
> Contact contactGet(id)



Retrieve a contact.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContactsApi apiInstance = new ContactsApi();
String id = "id_example"; // String | 
try {
    Contact result = apiInstance.contactGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#contactGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Contact**](Contact.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contactSearch"></a>
# **contactSearch**
> ContactPaginationResponse contactSearch(filter, query, page, perPage, sort)



Search contacts.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContactsApi apiInstance = new ContactsApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ContactPaginationResponse result = apiInstance.contactSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#contactSearch");
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

[**ContactPaginationResponse**](ContactPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contactUpdate"></a>
# **contactUpdate**
> Contact contactUpdate(id, body)



Update a contact.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ContactsApi apiInstance = new ContactsApi();
String id = "id_example"; // String | 
ContactUpdate body = new ContactUpdate(); // ContactUpdate | 
try {
    Contact result = apiInstance.contactUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#contactUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**ContactUpdate**](ContactUpdate.md)|  | [optional]

### Return type

[**Contact**](Contact.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


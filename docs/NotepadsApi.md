# NotepadsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notepadCreate**](NotepadsApi.md#notepadCreate) | **POST** /v4/api/notepad | 
[**notepadGet**](NotepadsApi.md#notepadGet) | **GET** /v4/api/notepad/{id} | 
[**notepadSearch**](NotepadsApi.md#notepadSearch) | **GET** /v4/api/notepad | 
[**notepadUpdate**](NotepadsApi.md#notepadUpdate) | **PUT** /v4/api/notepad/{id} | 

<a name="notepadCreate"></a>
# **notepadCreate**
> Notepad notepadCreate(body)



Create a notepad.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.NotepadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotepadsApi apiInstance = new NotepadsApi();
NotepadCreate body = new NotepadCreate(); // NotepadCreate | 
try {
    Notepad result = apiInstance.notepadCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotepadsApi#notepadCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NotepadCreate**](NotepadCreate.md)|  | [optional]

### Return type

[**Notepad**](Notepad.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="notepadGet"></a>
# **notepadGet**
> Notepad notepadGet(id)



Retrieve a notepad.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.NotepadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotepadsApi apiInstance = new NotepadsApi();
String id = "id_example"; // String | 
try {
    Notepad result = apiInstance.notepadGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotepadsApi#notepadGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Notepad**](Notepad.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notepadSearch"></a>
# **notepadSearch**
> NotepadPaginationResponse notepadSearch(filter, query, page, perPage, sort)



Search notepads.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.NotepadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotepadsApi apiInstance = new NotepadsApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    NotepadPaginationResponse result = apiInstance.notepadSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotepadsApi#notepadSearch");
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

[**NotepadPaginationResponse**](NotepadPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notepadUpdate"></a>
# **notepadUpdate**
> Notepad notepadUpdate(id, body)



Update a notepad.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.NotepadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotepadsApi apiInstance = new NotepadsApi();
String id = "id_example"; // String | 
NotepadUpdate body = new NotepadUpdate(); // NotepadUpdate | 
try {
    Notepad result = apiInstance.notepadUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotepadsApi#notepadUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**NotepadUpdate**](NotepadUpdate.md)|  | [optional]

### Return type

[**Notepad**](Notepad.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


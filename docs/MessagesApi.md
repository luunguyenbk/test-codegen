# MessagesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**messageCreate**](MessagesApi.md#messageCreate) | **POST** /v4/api/message | 
[**messageGet**](MessagesApi.md#messageGet) | **GET** /v4/api/message/{id} | 
[**messageSearch**](MessagesApi.md#messageSearch) | **GET** /v4/api/message | 
[**messageUpdate**](MessagesApi.md#messageUpdate) | **PUT** /v4/api/message/{id} | 

<a name="messageCreate"></a>
# **messageCreate**
> Message messageCreate(body)



Create a message.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagesApi apiInstance = new MessagesApi();
MessageCreate body = new MessageCreate(); // MessageCreate | 
try {
    Message result = apiInstance.messageCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#messageCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MessageCreate**](MessageCreate.md)|  | [optional]

### Return type

[**Message**](Message.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="messageGet"></a>
# **messageGet**
> Message messageGet(id)



Retrieve a message.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagesApi apiInstance = new MessagesApi();
String id = "id_example"; // String | 
try {
    Message result = apiInstance.messageGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#messageGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Message**](Message.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="messageSearch"></a>
# **messageSearch**
> MessagePaginationResponse messageSearch(filter, query, page, perPage, sort)



Search messages.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagesApi apiInstance = new MessagesApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    MessagePaginationResponse result = apiInstance.messageSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#messageSearch");
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

[**MessagePaginationResponse**](MessagePaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="messageUpdate"></a>
# **messageUpdate**
> Message messageUpdate(id, body)



Update a message.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagesApi apiInstance = new MessagesApi();
String id = "id_example"; // String | 
MessageUpdate body = new MessageUpdate(); // MessageUpdate | 
try {
    Message result = apiInstance.messageUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#messageUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**MessageUpdate**](MessageUpdate.md)|  | [optional]

### Return type

[**Message**](Message.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


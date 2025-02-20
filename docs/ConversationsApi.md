# ConversationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversationCreate**](ConversationsApi.md#conversationCreate) | **POST** /v4/api/conversation | 
[**conversationGet**](ConversationsApi.md#conversationGet) | **GET** /v4/api/conversation/{id} | 
[**conversationSearch**](ConversationsApi.md#conversationSearch) | **GET** /v4/api/conversation | 
[**conversationUpdate**](ConversationsApi.md#conversationUpdate) | **PUT** /v4/api/conversation/{id} | 

<a name="conversationCreate"></a>
# **conversationCreate**
> Conversation conversationCreate(body)



Create a conversation.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConversationsApi apiInstance = new ConversationsApi();
ConversationCreate body = new ConversationCreate(); // ConversationCreate | 
try {
    Conversation result = apiInstance.conversationCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#conversationCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConversationCreate**](ConversationCreate.md)|  | [optional]

### Return type

[**Conversation**](Conversation.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="conversationGet"></a>
# **conversationGet**
> Conversation conversationGet(id)



Retrieve a conversation.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConversationsApi apiInstance = new ConversationsApi();
String id = "id_example"; // String | 
try {
    Conversation result = apiInstance.conversationGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#conversationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Conversation**](Conversation.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="conversationSearch"></a>
# **conversationSearch**
> ConversationPaginationResponse conversationSearch(filter, query, page, perPage, sort)



Search conversations.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConversationsApi apiInstance = new ConversationsApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ConversationPaginationResponse result = apiInstance.conversationSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#conversationSearch");
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

[**ConversationPaginationResponse**](ConversationPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="conversationUpdate"></a>
# **conversationUpdate**
> Conversation conversationUpdate(id, body)



Update a conversation.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConversationsApi apiInstance = new ConversationsApi();
String id = "id_example"; // String | 
ConversationUpdate body = new ConversationUpdate(); // ConversationUpdate | 
try {
    Conversation result = apiInstance.conversationUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#conversationUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**ConversationUpdate**](ConversationUpdate.md)|  | [optional]

### Return type

[**Conversation**](Conversation.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


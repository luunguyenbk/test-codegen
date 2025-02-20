# TasksApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**taskCreate**](TasksApi.md#taskCreate) | **POST** /v4/api/task | 
[**taskDelete**](TasksApi.md#taskDelete) | **DELETE** /v4/api/task/{id} | 
[**taskGet**](TasksApi.md#taskGet) | **GET** /v4/api/task/{id} | 
[**taskSearch**](TasksApi.md#taskSearch) | **GET** /v4/api/task | 
[**taskUpdate**](TasksApi.md#taskUpdate) | **PUT** /v4/api/task/{id} | 

<a name="taskCreate"></a>
# **taskCreate**
> Task taskCreate(body)



Create a task.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.TasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TasksApi apiInstance = new TasksApi();
TaskCreate body = new TaskCreate(); // TaskCreate | 
try {
    Task result = apiInstance.taskCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#taskCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TaskCreate**](TaskCreate.md)|  | [optional]

### Return type

[**Task**](Task.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="taskDelete"></a>
# **taskDelete**
> taskDelete(id)



Remove a task.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.TasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TasksApi apiInstance = new TasksApi();
String id = "id_example"; // String | 
try {
    apiInstance.taskDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#taskDelete");
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

<a name="taskGet"></a>
# **taskGet**
> Task taskGet(id)



Retrieve a task.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.TasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TasksApi apiInstance = new TasksApi();
String id = "id_example"; // String | 
try {
    Task result = apiInstance.taskGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#taskGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Task**](Task.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="taskSearch"></a>
# **taskSearch**
> TaskPaginationResponse taskSearch(filter, query, page, perPage, sort)



Search tasks.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.TasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TasksApi apiInstance = new TasksApi();
java.util.HashMap filter = new java.util.HashMap(); // java.util.HashMap | 
String query = "query_example"; // String | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    TaskPaginationResponse result = apiInstance.taskSearch(filter, query, page, perPage, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#taskSearch");
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

[**TaskPaginationResponse**](TaskPaginationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="taskUpdate"></a>
# **taskUpdate**
> Task taskUpdate(id, body)



Update a task.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.TasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TasksApi apiInstance = new TasksApi();
String id = "id_example"; // String | 
TaskUpdate body = new TaskUpdate(); // TaskUpdate | 
try {
    Task result = apiInstance.taskUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#taskUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**TaskUpdate**](TaskUpdate.md)|  | [optional]

### Return type

[**Task**](Task.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


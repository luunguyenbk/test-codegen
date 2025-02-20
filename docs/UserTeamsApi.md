# UserTeamsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userTeamCreate**](UserTeamsApi.md#userTeamCreate) | **POST** /v4/api/user-team | 
[**userTeamDelete**](UserTeamsApi.md#userTeamDelete) | **DELETE** /v4/api/user-team/{team}/{user} | 

<a name="userTeamCreate"></a>
# **userTeamCreate**
> UserTeam userTeamCreate(body)



Assign user to a team.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.UserTeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserTeamsApi apiInstance = new UserTeamsApi();
UserTeamCreate body = new UserTeamCreate(); // UserTeamCreate | 
try {
    UserTeam result = apiInstance.userTeamCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserTeamsApi#userTeamCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserTeamCreate**](UserTeamCreate.md)|  | [optional]

### Return type

[**UserTeam**](UserTeam.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userTeamDelete"></a>
# **userTeamDelete**
> userTeamDelete(team, user)



Remove user from team.

### Example
```java
// Import classes:
//import com.statflo.client.ApiClient;
//import com.statflo.client.ApiException;
//import com.statflo.client.Configuration;
//import com.statflo.client.auth.*;
//import com.statflo.client.api.UserTeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserTeamsApi apiInstance = new UserTeamsApi();
String team = "team_example"; // String | 
String user = "user_example"; // String | 
try {
    apiInstance.userTeamDelete(team, user);
} catch (ApiException e) {
    System.err.println("Exception when calling UserTeamsApi#userTeamDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **team** | **String**|  |
 **user** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


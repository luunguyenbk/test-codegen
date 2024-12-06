# statflo-java-sdk

Statflo API
- SDK version: V4.1.107-hotfix
  - Build date: 2024-12-06T16:31:40.316484Z[Etc/UTC]

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users
Add the JitPack repository to your build file

```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
```

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.github.Statflo</groupId>
  <artifactId>statflo-java-sdk</artifactId>
  <version>V4.1.107-hotfix</version>
</dependency>
```

### Gradle users
Add it in your root build.gradle at the end of repositories:
```groovy
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```

Add this dependency to your project's build file:

```groovy
dependencies {
        implementation 'com.github.Statflo:statflo-java-sdk:V4.1.107-hotfix'
}
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/statflo-java-sdk-V4.1.107-hotfix.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.AccountActionsApi;
import com.statflo.client.model.AccountActionPaginationResponse;
import com.statflo.client.model.AccountActionSummary;

import java.util.HashMap;

public class AccountActionExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        AccountActionsApi accountActionsApi = new AccountActionsApi(apiClient);

        HashMap<String, String> filter = new HashMap<>();
        AccountActionPaginationResponse accountActionPaginationResponse = accountActionsApi.accountActionSearch(filter, "", 1, 10, "");
        for (AccountActionSummary item : accountActionPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.CampaignsApi;
import com.statflo.client.model.CampaignPaginationResponse;
import com.statflo.client.model.CampaignSummary;

import java.util.HashMap;

public class CampaignExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        CampaignsApi campaignsApi = new CampaignsApi(apiClient);
        HashMap<String, String> filter = new HashMap<>();

        CampaignPaginationResponse campaignPaginationResponse = campaignsApi.campaignSearch(filter, "", 1, 10, "");
        for (CampaignSummary campaignSummary : campaignPaginationResponse.getItems()) {
            System.out.println(campaignSummary);
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://app.statflo.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountActionsApi* | [**accountActionCreate**](docs/AccountActionsApi.md#accountActionCreate) | **POST** /v4/api/account-action | 
*AccountActionsApi* | [**accountActionGet**](docs/AccountActionsApi.md#accountActionGet) | **GET** /v4/api/account-action/{id} | 
*AccountActionsApi* | [**accountActionSearch**](docs/AccountActionsApi.md#accountActionSearch) | **GET** /v4/api/account-action | 
*AccountMembersApi* | [**accountMemberCreate**](docs/AccountMembersApi.md#accountMemberCreate) | **POST** /v4/api/account-member | 
*AccountMembersApi* | [**accountMemberDelete**](docs/AccountMembersApi.md#accountMemberDelete) | **DELETE** /v4/api/account-member/{id} | 
*AccountMembersApi* | [**accountMemberGet**](docs/AccountMembersApi.md#accountMemberGet) | **GET** /v4/api/account-member/{id} | 
*AccountMembersApi* | [**accountMemberSearch**](docs/AccountMembersApi.md#accountMemberSearch) | **GET** /v4/api/account-member | 
*AccountMembersApi* | [**accountMemberUpdate**](docs/AccountMembersApi.md#accountMemberUpdate) | **PUT** /v4/api/account-member/{id} | 
*AccountsApi* | [**accountCreate**](docs/AccountsApi.md#accountCreate) | **POST** /v4/api/account | 
*AccountsApi* | [**accountDelete**](docs/AccountsApi.md#accountDelete) | **DELETE** /v4/api/account/{id} | 
*AccountsApi* | [**accountGet**](docs/AccountsApi.md#accountGet) | **GET** /v4/api/account/{id} | 
*AccountsApi* | [**accountSearch**](docs/AccountsApi.md#accountSearch) | **GET** /v4/api/account | 
*AccountsApi* | [**accountUpdate**](docs/AccountsApi.md#accountUpdate) | **PUT** /v4/api/account/{id} | 
*AuthenticationApi* | [**authMe**](docs/AuthenticationApi.md#authMe) | **GET** /v4/api/auth/me | 
*AuthenticationApi* | [**login**](docs/AuthenticationApi.md#login) | **POST** /v4/api/auth/login | 
*AuthenticationApi* | [**logout**](docs/AuthenticationApi.md#logout) | **GET** /v4/api/auth/logout | 
*AuthenticationApi* | [**switchDealer**](docs/AuthenticationApi.md#switchDealer) | **GET** /v4/api/auth/switch | 
*CampaignMemberApi* | [**campaignMemberCreate**](docs/CampaignMemberApi.md#campaignMemberCreate) | **POST** /v4/api/campaign-member | 
*CampaignMemberApi* | [**campaignMemberDelete**](docs/CampaignMemberApi.md#campaignMemberDelete) | **DELETE** /v4/api/campaign-member/{id} | 
*CampaignMemberApi* | [**campaignMemberGet**](docs/CampaignMemberApi.md#campaignMemberGet) | **GET** /v4/api/campaign-member/{id} | 
*CampaignMemberApi* | [**campaignMemberSearch**](docs/CampaignMemberApi.md#campaignMemberSearch) | **GET** /v4/api/campaign-member | 
*CampaignMemberApi* | [**campaignMemberUpdate**](docs/CampaignMemberApi.md#campaignMemberUpdate) | **PUT** /v4/api/campaign-member/{id} | 
*CampaignMetadataApi* | [**campaignMetadataCreate**](docs/CampaignMetadataApi.md#campaignMetadataCreate) | **POST** /v4/api/campaign-metadata | 
*CampaignMetadataApi* | [**campaignMetadataDelete**](docs/CampaignMetadataApi.md#campaignMetadataDelete) | **DELETE** /v4/api/campaign-metadata/{id} | 
*CampaignMetadataApi* | [**campaignMetadataGet**](docs/CampaignMetadataApi.md#campaignMetadataGet) | **GET** /v4/api/campaign-metadata/{id} | 
*CampaignMetadataApi* | [**campaignMetadataSearch**](docs/CampaignMetadataApi.md#campaignMetadataSearch) | **GET** /v4/api/campaign-metadata | 
*CampaignMetadataApi* | [**campaignMetadataUpdate**](docs/CampaignMetadataApi.md#campaignMetadataUpdate) | **PUT** /v4/api/campaign-metadata/{id} | 
*CampaignPropertiesApi* | [**campaignPropertyCreate**](docs/CampaignPropertiesApi.md#campaignPropertyCreate) | **POST** /v4/api/campaign-property | 
*CampaignPropertiesApi* | [**campaignPropertyDelete**](docs/CampaignPropertiesApi.md#campaignPropertyDelete) | **DELETE** /v4/api/campaign-property/{id} | 
*CampaignPropertiesApi* | [**campaignPropertyGet**](docs/CampaignPropertiesApi.md#campaignPropertyGet) | **GET** /v4/api/campaign-property/{id} | 
*CampaignPropertiesApi* | [**campaignPropertySearch**](docs/CampaignPropertiesApi.md#campaignPropertySearch) | **GET** /v4/api/campaign-property | 
*CampaignPropertiesApi* | [**campaignPropertyUpdate**](docs/CampaignPropertiesApi.md#campaignPropertyUpdate) | **PUT** /v4/api/campaign-property/{id} | 
*CampaignsApi* | [**campaignCreate**](docs/CampaignsApi.md#campaignCreate) | **POST** /v4/api/campaign | 
*CampaignsApi* | [**campaignDelete**](docs/CampaignsApi.md#campaignDelete) | **DELETE** /v4/api/campaign/{id} | 
*CampaignsApi* | [**campaignGet**](docs/CampaignsApi.md#campaignGet) | **GET** /v4/api/campaign/{id} | 
*CampaignsApi* | [**campaignSearch**](docs/CampaignsApi.md#campaignSearch) | **GET** /v4/api/campaign | 
*CampaignsApi* | [**campaignUpdate**](docs/CampaignsApi.md#campaignUpdate) | **PUT** /v4/api/campaign/{id} | 
*ContactsApi* | [**contactCreate**](docs/ContactsApi.md#contactCreate) | **POST** /v4/api/contact | 
*ContactsApi* | [**contactDelete**](docs/ContactsApi.md#contactDelete) | **DELETE** /v4/api/contact/{id} | 
*ContactsApi* | [**contactGet**](docs/ContactsApi.md#contactGet) | **GET** /v4/api/contact/{id} | 
*ContactsApi* | [**contactSearch**](docs/ContactsApi.md#contactSearch) | **GET** /v4/api/contact | 
*ContactsApi* | [**contactUpdate**](docs/ContactsApi.md#contactUpdate) | **PUT** /v4/api/contact/{id} | 
*DealersApi* | [**dealerGet**](docs/DealersApi.md#dealerGet) | **GET** /v4/api/dealer/{id} | 
*DealersApi* | [**dealerSearch**](docs/DealersApi.md#dealerSearch) | **GET** /v4/api/dealer | 
*DistrictsApi* | [**districtCreate**](docs/DistrictsApi.md#districtCreate) | **POST** /v4/api/district | 
*DistrictsApi* | [**districtDelete**](docs/DistrictsApi.md#districtDelete) | **DELETE** /v4/api/district/{id} | 
*DistrictsApi* | [**districtGet**](docs/DistrictsApi.md#districtGet) | **GET** /v4/api/district/{id} | 
*DistrictsApi* | [**districtSearch**](docs/DistrictsApi.md#districtSearch) | **GET** /v4/api/district | 
*DistrictsApi* | [**districtUpdate**](docs/DistrictsApi.md#districtUpdate) | **PUT** /v4/api/district/{id} | 
*LocationsApi* | [**locationGet**](docs/LocationsApi.md#locationGet) | **GET** /v4/api/location/{id} | 
*LocationsApi* | [**locationSearch**](docs/LocationsApi.md#locationSearch) | **GET** /v4/api/location | 
*MessageTemplateAssignmentsApi* | [**messageTemplateAssignmentCreate**](docs/MessageTemplateAssignmentsApi.md#messageTemplateAssignmentCreate) | **POST** /v4/api/message-template-assignment | 
*MessageTemplateAssignmentsApi* | [**messageTemplateAssignmentDelete**](docs/MessageTemplateAssignmentsApi.md#messageTemplateAssignmentDelete) | **DELETE** /v4/api/message-template-assignment/{id} | 
*MessageTemplateAssignmentsApi* | [**messageTemplateAssignmentGet**](docs/MessageTemplateAssignmentsApi.md#messageTemplateAssignmentGet) | **GET** /v4/api/message-template-assignment/{id} | 
*MessageTemplateAssignmentsApi* | [**messageTemplateAssignmentSearch**](docs/MessageTemplateAssignmentsApi.md#messageTemplateAssignmentSearch) | **GET** /v4/api/message-template-assignment | 
*MessageTemplateAssignmentsApi* | [**messageTemplateAssignmentUpdate**](docs/MessageTemplateAssignmentsApi.md#messageTemplateAssignmentUpdate) | **PUT** /v4/api/message-template-assignment/{id} | 
*MessageTemplatesApi* | [**messageTemplateCreate**](docs/MessageTemplatesApi.md#messageTemplateCreate) | **POST** /v4/api/message-template | 
*MessageTemplatesApi* | [**messageTemplateDelete**](docs/MessageTemplatesApi.md#messageTemplateDelete) | **DELETE** /v4/api/message-template/{id} | 
*MessageTemplatesApi* | [**messageTemplateGet**](docs/MessageTemplatesApi.md#messageTemplateGet) | **GET** /v4/api/message-template/{id} | 
*MessageTemplatesApi* | [**messageTemplateSearch**](docs/MessageTemplatesApi.md#messageTemplateSearch) | **GET** /v4/api/message-template | 
*MessageTemplatesApi* | [**messageTemplateUpdate**](docs/MessageTemplatesApi.md#messageTemplateUpdate) | **PUT** /v4/api/message-template/{id} | 
*NotepadsApi* | [**notepadCreate**](docs/NotepadsApi.md#notepadCreate) | **POST** /v4/api/notepad | 
*NotepadsApi* | [**notepadGet**](docs/NotepadsApi.md#notepadGet) | **GET** /v4/api/notepad/{id} | 
*NotepadsApi* | [**notepadSearch**](docs/NotepadsApi.md#notepadSearch) | **GET** /v4/api/notepad | 
*NotepadsApi* | [**notepadUpdate**](docs/NotepadsApi.md#notepadUpdate) | **PUT** /v4/api/notepad/{id} | 
*RegionsApi* | [**regionCreate**](docs/RegionsApi.md#regionCreate) | **POST** /v4/api/region | 
*RegionsApi* | [**regionDelete**](docs/RegionsApi.md#regionDelete) | **DELETE** /v4/api/region/{id} | 
*RegionsApi* | [**regionGet**](docs/RegionsApi.md#regionGet) | **GET** /v4/api/region/{id} | 
*RegionsApi* | [**regionSearch**](docs/RegionsApi.md#regionSearch) | **GET** /v4/api/region | 
*RegionsApi* | [**regionUpdate**](docs/RegionsApi.md#regionUpdate) | **PUT** /v4/api/region/{id} | 
*TasksApi* | [**taskCreate**](docs/TasksApi.md#taskCreate) | **POST** /v4/api/task | 
*TasksApi* | [**taskDelete**](docs/TasksApi.md#taskDelete) | **DELETE** /v4/api/task/{id} | 
*TasksApi* | [**taskGet**](docs/TasksApi.md#taskGet) | **GET** /v4/api/task/{id} | 
*TasksApi* | [**taskSearch**](docs/TasksApi.md#taskSearch) | **GET** /v4/api/task | 
*TasksApi* | [**taskUpdate**](docs/TasksApi.md#taskUpdate) | **PUT** /v4/api/task/{id} | 
*TeamsApi* | [**teamCreate**](docs/TeamsApi.md#teamCreate) | **POST** /v4/api/team | 
*TeamsApi* | [**teamDelete**](docs/TeamsApi.md#teamDelete) | **DELETE** /v4/api/team/{id} | 
*TeamsApi* | [**teamGet**](docs/TeamsApi.md#teamGet) | **GET** /v4/api/team/{id} | 
*TeamsApi* | [**teamSearch**](docs/TeamsApi.md#teamSearch) | **GET** /v4/api/team | 
*TeamsApi* | [**teamUpdate**](docs/TeamsApi.md#teamUpdate) | **PUT** /v4/api/team/{id} | 
*UserTeamsApi* | [**userTeamCreate**](docs/UserTeamsApi.md#userTeamCreate) | **POST** /v4/api/user-team | 
*UserTeamsApi* | [**userTeamDelete**](docs/UserTeamsApi.md#userTeamDelete) | **DELETE** /v4/api/user-team/{team}/{user} | 
*UsersApi* | [**userGet**](docs/UsersApi.md#userGet) | **GET** /v4/api/user/{id} | 
*UsersApi* | [**userSearch**](docs/UsersApi.md#userSearch) | **GET** /v4/api/user | 
*WidgetsApi* | [**v4ApiWidgetsCampaignsAccountIdGet**](docs/WidgetsApi.md#v4ApiWidgetsCampaignsAccountIdGet) | **GET** /v4/api/widgets/campaigns/{accountId} | 

## Documentation for Models

 - [Account](docs/Account.md)
 - [AccountAction](docs/AccountAction.md)
 - [AccountActionCreate](docs/AccountActionCreate.md)
 - [AccountActionPaginationResponse](docs/AccountActionPaginationResponse.md)
 - [AccountActionSummary](docs/AccountActionSummary.md)
 - [AccountActionUpdate](docs/AccountActionUpdate.md)
 - [AccountContactMetadata](docs/AccountContactMetadata.md)
 - [AccountContactMetadataSummary](docs/AccountContactMetadataSummary.md)
 - [AccountCreate](docs/AccountCreate.md)
 - [AccountMember](docs/AccountMember.md)
 - [AccountMemberCreate](docs/AccountMemberCreate.md)
 - [AccountMemberPaginationResponse](docs/AccountMemberPaginationResponse.md)
 - [AccountMemberSummary](docs/AccountMemberSummary.md)
 - [AccountMemberUpdate](docs/AccountMemberUpdate.md)
 - [AccountPaginationResponse](docs/AccountPaginationResponse.md)
 - [AccountSummary](docs/AccountSummary.md)
 - [AccountUpdate](docs/AccountUpdate.md)
 - [AuthLoginBody](docs/AuthLoginBody.md)
 - [CallListVisibilityStatus](docs/CallListVisibilityStatus.md)
 - [CallListVisibilityStatusCreate](docs/CallListVisibilityStatusCreate.md)
 - [CallListVisibilityStatusSummary](docs/CallListVisibilityStatusSummary.md)
 - [CallListVisibilityStatusUpdate](docs/CallListVisibilityStatusUpdate.md)
 - [Campaign](docs/Campaign.md)
 - [CampaignCreate](docs/CampaignCreate.md)
 - [CampaignMember](docs/CampaignMember.md)
 - [CampaignMemberCreate](docs/CampaignMemberCreate.md)
 - [CampaignMemberPaginationResponse](docs/CampaignMemberPaginationResponse.md)
 - [CampaignMemberSummary](docs/CampaignMemberSummary.md)
 - [CampaignMemberUpdate](docs/CampaignMemberUpdate.md)
 - [CampaignMetadata](docs/CampaignMetadata.md)
 - [CampaignMetadataCreate](docs/CampaignMetadataCreate.md)
 - [CampaignMetadataPaginationResponse](docs/CampaignMetadataPaginationResponse.md)
 - [CampaignMetadataSummary](docs/CampaignMetadataSummary.md)
 - [CampaignMetadataUpdate](docs/CampaignMetadataUpdate.md)
 - [CampaignPaginationResponse](docs/CampaignPaginationResponse.md)
 - [CampaignProperty](docs/CampaignProperty.md)
 - [CampaignPropertyCreate](docs/CampaignPropertyCreate.md)
 - [CampaignPropertyPaginationResponse](docs/CampaignPropertyPaginationResponse.md)
 - [CampaignPropertySummary](docs/CampaignPropertySummary.md)
 - [CampaignPropertyUpdate](docs/CampaignPropertyUpdate.md)
 - [CampaignSummary](docs/CampaignSummary.md)
 - [CampaignUpdate](docs/CampaignUpdate.md)
 - [Carrier](docs/Carrier.md)
 - [CarrierAllowedCallLists](docs/CarrierAllowedCallLists.md)
 - [CarrierAllowedCallListsCreate](docs/CarrierAllowedCallListsCreate.md)
 - [CarrierAllowedCallListsSummary](docs/CarrierAllowedCallListsSummary.md)
 - [CarrierAllowedCallListsUpdate](docs/CarrierAllowedCallListsUpdate.md)
 - [CarrierCreate](docs/CarrierCreate.md)
 - [CarrierStatistics](docs/CarrierStatistics.md)
 - [CarrierStatisticsCreate](docs/CarrierStatisticsCreate.md)
 - [CarrierStatisticsSummary](docs/CarrierStatisticsSummary.md)
 - [CarrierStatisticsUpdate](docs/CarrierStatisticsUpdate.md)
 - [CarrierSummary](docs/CarrierSummary.md)
 - [CarrierUpdate](docs/CarrierUpdate.md)
 - [Contact](docs/Contact.md)
 - [ContactCreate](docs/ContactCreate.md)
 - [ContactPaginationResponse](docs/ContactPaginationResponse.md)
 - [ContactSummary](docs/ContactSummary.md)
 - [ContactUpdate](docs/ContactUpdate.md)
 - [Dealer](docs/Dealer.md)
 - [DealerCreate](docs/DealerCreate.md)
 - [DealerFeature](docs/DealerFeature.md)
 - [DealerFeatureCreate](docs/DealerFeatureCreate.md)
 - [DealerFeatureSummary](docs/DealerFeatureSummary.md)
 - [DealerFeatureUpdate](docs/DealerFeatureUpdate.md)
 - [DealerMetaData](docs/DealerMetaData.md)
 - [DealerMetaDataCreate](docs/DealerMetaDataCreate.md)
 - [DealerMetaDataSummary](docs/DealerMetaDataSummary.md)
 - [DealerMetaDataUpdate](docs/DealerMetaDataUpdate.md)
 - [DealerPaginationResponse](docs/DealerPaginationResponse.md)
 - [DealerSummary](docs/DealerSummary.md)
 - [DealerUpdate](docs/DealerUpdate.md)
 - [District](docs/District.md)
 - [DistrictCreate](docs/DistrictCreate.md)
 - [DistrictPaginationResponse](docs/DistrictPaginationResponse.md)
 - [DistrictSummary](docs/DistrictSummary.md)
 - [DistrictUpdate](docs/DistrictUpdate.md)
 - [Feature](docs/Feature.md)
 - [FeatureCreate](docs/FeatureCreate.md)
 - [FeatureSummary](docs/FeatureSummary.md)
 - [FeatureUpdate](docs/FeatureUpdate.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [Location](docs/Location.md)
 - [LocationCreate](docs/LocationCreate.md)
 - [LocationPaginationResponse](docs/LocationPaginationResponse.md)
 - [LocationSummary](docs/LocationSummary.md)
 - [LocationUpdate](docs/LocationUpdate.md)
 - [MessageTemplate](docs/MessageTemplate.md)
 - [MessageTemplateAssignment](docs/MessageTemplateAssignment.md)
 - [MessageTemplateAssignmentCreate](docs/MessageTemplateAssignmentCreate.md)
 - [MessageTemplateAssignmentPaginationResponse](docs/MessageTemplateAssignmentPaginationResponse.md)
 - [MessageTemplateAssignmentSummary](docs/MessageTemplateAssignmentSummary.md)
 - [MessageTemplateAssignmentUpdate](docs/MessageTemplateAssignmentUpdate.md)
 - [MessageTemplateCreate](docs/MessageTemplateCreate.md)
 - [MessageTemplatePaginationResponse](docs/MessageTemplatePaginationResponse.md)
 - [MessageTemplateSummary](docs/MessageTemplateSummary.md)
 - [MessageTemplateUpdate](docs/MessageTemplateUpdate.md)
 - [Notepad](docs/Notepad.md)
 - [NotepadCreate](docs/NotepadCreate.md)
 - [NotepadPaginationResponse](docs/NotepadPaginationResponse.md)
 - [NotepadSummary](docs/NotepadSummary.md)
 - [NotepadUpdate](docs/NotepadUpdate.md)
 - [Pagination](docs/Pagination.md)
 - [Permission](docs/Permission.md)
 - [PermissionCreate](docs/PermissionCreate.md)
 - [PermissionSummary](docs/PermissionSummary.md)
 - [PermissionUpdate](docs/PermissionUpdate.md)
 - [ReassignRep](docs/ReassignRep.md)
 - [ReassignRepCreate](docs/ReassignRepCreate.md)
 - [ReassignRepSummary](docs/ReassignRepSummary.md)
 - [ReassignRepUpdate](docs/ReassignRepUpdate.md)
 - [Region](docs/Region.md)
 - [RegionCreate](docs/RegionCreate.md)
 - [RegionPaginationResponse](docs/RegionPaginationResponse.md)
 - [RegionSummary](docs/RegionSummary.md)
 - [RegionUpdate](docs/RegionUpdate.md)
 - [Role](docs/Role.md)
 - [RoleCreate](docs/RoleCreate.md)
 - [RolePermission](docs/RolePermission.md)
 - [RolePermissionCreate](docs/RolePermissionCreate.md)
 - [RolePermissionSummary](docs/RolePermissionSummary.md)
 - [RolePermissionUpdate](docs/RolePermissionUpdate.md)
 - [RoleSummary](docs/RoleSummary.md)
 - [RoleUpdate](docs/RoleUpdate.md)
 - [Task](docs/Task.md)
 - [TaskCreate](docs/TaskCreate.md)
 - [TaskPaginationResponse](docs/TaskPaginationResponse.md)
 - [TaskSummary](docs/TaskSummary.md)
 - [TaskUpdate](docs/TaskUpdate.md)
 - [Team](docs/Team.md)
 - [TeamCreate](docs/TeamCreate.md)
 - [TeamPaginationResponse](docs/TeamPaginationResponse.md)
 - [TeamSummary](docs/TeamSummary.md)
 - [TeamUpdate](docs/TeamUpdate.md)
 - [Timeline](docs/Timeline.md)
 - [TimelineCreate](docs/TimelineCreate.md)
 - [TimelineSummary](docs/TimelineSummary.md)
 - [TimelineUpdate](docs/TimelineUpdate.md)
 - [User](docs/User.md)
 - [UserActivityLog](docs/UserActivityLog.md)
 - [UserActivityLogCreate](docs/UserActivityLogCreate.md)
 - [UserActivityLogSummary](docs/UserActivityLogSummary.md)
 - [UserActivityLogUpdate](docs/UserActivityLogUpdate.md)
 - [UserCreate](docs/UserCreate.md)
 - [UserPaginationResponse](docs/UserPaginationResponse.md)
 - [UserPermission](docs/UserPermission.md)
 - [UserPermissionCreate](docs/UserPermissionCreate.md)
 - [UserPermissionSummary](docs/UserPermissionSummary.md)
 - [UserPermissionUpdate](docs/UserPermissionUpdate.md)
 - [UserSummary](docs/UserSummary.md)
 - [UserTeam](docs/UserTeam.md)
 - [UserTeamCreate](docs/UserTeamCreate.md)
 - [UserTeamSummary](docs/UserTeamSummary.md)
 - [UserTeamUpdate](docs/UserTeamUpdate.md)
 - [UserUpdate](docs/UserUpdate.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### Bearer



## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



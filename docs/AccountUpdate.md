# AccountUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  | 
**name** | **String** |  | 
**accountId** | **String** |  | 
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) |  | 
**externalUserId** | **String** |  |  [optional]
**externalLocationId** | **String** |  |  [optional]
**city** | **String** |  |  [optional]
**numberOfCampaignMembers** | **Integer** |  |  [optional]
**dealValue** | **String** |  |  [optional]
**potentialRenewals** | **Integer** |  |  [optional]
**totalResiduals** | **String** |  |  [optional]
**totalEligibleRevenue** | **String** |  |  [optional]
**lastSpokenDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastActivityDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**additionsInYear** | **Integer** |  |  [optional]
**ineligibles** | **Integer** |  |  [optional]
**subsGps** | **Integer** |  |  [optional]
**subsHspa** | **Integer** |  |  [optional]
**subsCdma** | **Integer** |  |  [optional]
**subsMike** | **Integer** |  |  [optional]
**subsModems** | **Integer** |  |  [optional]
**prevExternalUserId** | **String** |  |  [optional]
**carrierStatistics** | **Integer** |  |  [optional]
**notClient** | **Integer** |  |  [optional]
**status** | **Integer** |  |  [optional]
**attempt** | **Integer** |  |  [optional]
**callType** | **Integer** |  |  [optional]
**callDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**originalExternalUserId** | **String** |  |  [optional]
**dateAdded** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**proposedAccountId** | **Integer** |  |  [optional]
**website** | **String** |  |  [optional]
**businessHours** | **String** |  |  [optional]
**vertical** | **String** |  |  [optional]
**sourceId** | **Integer** |  |  [optional]
**source** | **String** |  |  [optional]
**customerExternalId** | **String** |  |  [optional]
**couponCode** | **String** |  |  [optional]
**currentCarrierId** | **Integer** |  |  [optional]
**preferredCarrierId** | **Integer** |  |  [optional]
**oldBan** | **String** |  |  [optional]
**customerBusinessUnitCustomerId** | **String** |  |  [optional]
**brandId** | **Integer** |  |  [optional]
**seatType** | **String** |  |  [optional]
**rptBu** | **String** |  |  [optional]
**recordOwned** | **Boolean** |  |  [optional]
**accountSubtype** | **String** |  |  [optional]
**dateCreated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**dateUpdated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]

<a name="AccountTypeEnum"></a>
## Enum: AccountTypeEnum
Name | Value
---- | -----
B | &quot;B&quot;
I | &quot;I&quot;
L | &quot;L&quot;
C | &quot;C&quot;
D | &quot;D&quot;

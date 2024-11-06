# AccountMemberUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  | 
**accountId** | **String** |  |  [optional]
**phoneNumber** | **String** |  | 
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) |  | 
**language** | [**LanguageEnum**](#LanguageEnum) |  |  [optional]
**accountName** | **String** |  |  [optional]
**accountMemberName** | **String** |  |  [optional]
**service** | **String** |  |  [optional]
**product** | **String** |  |  [optional]
**serviceStartDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**serviceEndDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**locationId** | **String** |  |  [optional]
**dateCreated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**tradeIn** | **String** |  |  [optional]
**imei** | **String** |  |  [optional]
**esnDec** | **String** |  |  [optional]
**eduf** | **Float** |  |  [optional]
**contactTerm** | **Integer** |  |  [optional]
**contactMonthsLeft** | **Integer** |  |  [optional]
**units** | **String** |  |  [optional]
**streetNumber** | **String** |  |  [optional]
**streetName** | **String** |  |  [optional]
**unitType** | **String** |  |  [optional]
**unit** | **String** |  |  [optional]
**poBox** | **String** |  |  [optional]
**rr** | **String** |  |  [optional]
**city** | **String** |  |  [optional]
**province** | **String** |  |  [optional]
**postalCode** | **String** |  |  [optional]
**homePhone** | **String** |  |  [optional]
**businessPhone** | **String** |  |  [optional]
**businessExtensions** | **String** |  |  [optional]
**email** | **String** |  |  [optional]
**status** | **Boolean** |  |  [optional]
**avgDataUsage** | **Integer** |  |  [optional]
**avgMinutesUsage** | **Integer** |  |  [optional]
**avgLongDistanceUsage** | **Integer** |  |  [optional]
**avgRoamingUsage** | **Integer** |  |  [optional]
**avgDataOverage** | **Integer** |  |  [optional]
**avgMinsOverage** | **Integer** |  |  [optional]
**avgLdOverage** | **Float** |  |  [optional]
**avgRoamOverage** | **Float** |  |  [optional]
**campaignType** | **String** |  |  [optional]
**campaignId** | **String** |  |  [optional]
**avgRpu** | **Float** |  |  [optional]
**tab** | **Float** |  |  [optional]
**tabCharge** | **Float** |  |  [optional]
**tabDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**source** | **String** |  |  [optional]
**sourceId** | **Integer** |  |  [optional]
**customerExternalId** | **String** |  |  [optional]
**oldBan** | **String** |  |  [optional]
**salesforceLineId** | **String** |  |  [optional]
**byodCustomer** | **String** |  |  [optional]
**prepaid** | **String** |  |  [optional]
**subscriberId** | **String** |  |  [optional]
**portInCarrierId** | **Integer** |  |  [optional]
**portInCarrierName** | **String** |  |  [optional]

<a name="AccountTypeEnum"></a>
## Enum: AccountTypeEnum
Name | Value
---- | -----
B | &quot;B&quot;
I | &quot;I&quot;
L | &quot;L&quot;
C | &quot;C&quot;
D | &quot;D&quot;

<a name="LanguageEnum"></a>
## Enum: LanguageEnum
Name | Value
---- | -----
EN | &quot;en&quot;
FR | &quot;fr&quot;

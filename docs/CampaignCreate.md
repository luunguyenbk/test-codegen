# CampaignCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**id** | **Integer** |  | 
**campaignNickname** | **String** |  | 
**totangoName** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  | 
**frequency** | [**FrequencyEnum**](#FrequencyEnum) |  | 
**lifetime** | **String** |  |  [optional]
**method** | **String** |  |  [optional]
**carrierAllowed** | **Boolean** |  |  [optional]
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) |  |  [optional]
**dncScrub** | **Boolean** |  |  [optional]
**reportingPeriodType** | **String** |  |  [optional]
**reportingPeriodBefore** | **Integer** |  |  [optional]
**reportingPeriodAfter** | **Integer** |  |  [optional]
**transactionEarliest** | **String** |  |  [optional]
**transactionLatest** | **String** |  |  [optional]
**productTypes** | **String** |  |  [optional]
**source** | **String** |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ADD | &quot;add&quot;
MONTHLY | &quot;monthly&quot;
ONCE | &quot;once&quot;
DAILY | &quot;daily&quot;

<a name="FrequencyEnum"></a>
## Enum: FrequencyEnum
Name | Value
---- | -----
MONTHLY | &quot;monthly&quot;
ONCE | &quot;once&quot;
DAILY | &quot;daily&quot;

<a name="AccountTypeEnum"></a>
## Enum: AccountTypeEnum
Name | Value
---- | -----
I | &quot;I&quot;
D | &quot;D&quot;
C | &quot;C&quot;
B | &quot;B&quot;
L | &quot;L&quot;
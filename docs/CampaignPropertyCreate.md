# CampaignPropertyCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  | 
**dealerId** | **Integer** |  |  [optional]
**campaignId** | **Integer** |  | 
**campaignTerminationDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**campaignPriority** | **Integer** |  |  [optional]
**displayPriority** | **Integer** |  |  [optional]
**carryoverUnattempted** | **Boolean** |  |  [optional]
**visibility** | **Integer** |  |  [optional]
**visibilityCrm** | [**VisibilityCrmEnum**](#VisibilityCrmEnum) |  |  [optional]
**visibilityReport** | [**VisibilityReportEnum**](#VisibilityReportEnum) |  |  [optional]

<a name="VisibilityCrmEnum"></a>
## Enum: VisibilityCrmEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_10 | 10
NUMBER_30 | 30

<a name="VisibilityReportEnum"></a>
## Enum: VisibilityReportEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_10 | 10
NUMBER_30 | 30

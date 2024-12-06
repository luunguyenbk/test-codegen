# CampaignMetadataUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  | 
**campaignId** | **Integer** |  |  [optional]
**metadata** | [**MetadataEnum**](#MetadataEnum) |  |  [optional]
**value** | **Object** |  |  [optional]
**dateAdded** | [**OffsetDateTime**](OffsetDateTime.md) |  | 

<a name="MetadataEnum"></a>
## Enum: MetadataEnum
Name | Value
---- | -----
VISIBILITY_CRM | &quot;visibility_crm&quot;
VISIBILITY_REPORT | &quot;visibility_report&quot;
TRANSLATIONS | &quot;translations&quot;
CALL_LIST_PRIORITY | &quot;call_list_priority&quot;
OVERRIDE_DEFAULT_VISIBILITY | &quot;override_default_visibility&quot;
VISIBILITY_LEAD_SELECTION | &quot;visibility_lead_selection&quot;
DEFAULT_START_END_DATE | &quot;default_start_end_date&quot;
SALESFORCE_CAMPAIGN_ID | &quot;salesforce_campaign_id&quot;

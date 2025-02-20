# MessageUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  | 
**userId** | **Integer** |  |  [optional]
**conversationId** | **Integer** |  |  [optional]
**content** | **String** |  | 
**action** | **String** |  |  [optional]
**provider** | **String** |  |  [optional]
**referenceId** | **String** |  |  [optional]
**deliveryStatus** | [**DeliveryStatusEnum**](#DeliveryStatusEnum) |  |  [optional]
**ipAddress** | **String** |  |  [optional]
**associatedAppPhoneNumber** | **String** |  |  [optional]
**associatedAppPhoneNumberType** | [**AssociatedAppPhoneNumberTypeEnum**](#AssociatedAppPhoneNumberTypeEnum) |  |  [optional]
**messageTemplateId** | **String** |  |  [optional]
**dateAdded** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**dateSent** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]

<a name="DeliveryStatusEnum"></a>
## Enum: DeliveryStatusEnum
Name | Value
---- | -----
NEW | &quot;new&quot;
OK | &quot;ok&quot;
ERROR | &quot;error&quot;
REJECTED | &quot;rejected&quot;
FAILED | &quot;failed&quot;
AUTO | &quot;auto&quot;

<a name="AssociatedAppPhoneNumberTypeEnum"></a>
## Enum: AssociatedAppPhoneNumberTypeEnum
Name | Value
---- | -----
MASQUERADE | &quot;masquerade&quot;
PRIMARY | &quot;primary&quot;
PRIVATE | &quot;private&quot;
OUTLET | &quot;outlet&quot;

# TaskUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**description** | **String** |  | 
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**userIdAssigned** | **Integer** |  |  [optional]
**priority** | **Integer** |  |  [optional]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**id** | **Integer** |  | 
**accountId** | **String** |  | 
**dateAdded** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**recordSource** | **String** |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
TO_DO | &quot;To Do&quot;
IN_PROGRESS | &quot;In Progress&quot;
BLOCKED | &quot;Blocked&quot;
COMPLETED | &quot;Completed&quot;

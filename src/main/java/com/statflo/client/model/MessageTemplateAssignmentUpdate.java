/*
 * Statflo API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.statflo.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * MessageTemplateAssignmentUpdate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-06T16:55:16.528716Z[Etc/UTC]")
public class MessageTemplateAssignmentUpdate {
  @SerializedName("id")
  private String id = null;

  @SerializedName("propertyId")
  private Integer propertyId = null;

  @SerializedName("templateId")
  private String templateId = null;

  @SerializedName("priority")
  private Integer priority = 100;

  @SerializedName("assignDate")
  private OffsetDateTime assignDate = null;

  @SerializedName("dateUpdate")
  private OffsetDateTime dateUpdate = null;

  @SerializedName("unassignDate")
  private OffsetDateTime unassignDate = null;

  public MessageTemplateAssignmentUpdate id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MessageTemplateAssignmentUpdate propertyId(Integer propertyId) {
    this.propertyId = propertyId;
    return this;
  }

   /**
   * Get propertyId
   * @return propertyId
  **/
  @Schema(description = "")
  public Integer getPropertyId() {
    return propertyId;
  }

  public void setPropertyId(Integer propertyId) {
    this.propertyId = propertyId;
  }

  public MessageTemplateAssignmentUpdate templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @Schema(description = "")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public MessageTemplateAssignmentUpdate priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Schema(description = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public MessageTemplateAssignmentUpdate assignDate(OffsetDateTime assignDate) {
    this.assignDate = assignDate;
    return this;
  }

   /**
   * Get assignDate
   * @return assignDate
  **/
  @Schema(description = "")
  public OffsetDateTime getAssignDate() {
    return assignDate;
  }

  public void setAssignDate(OffsetDateTime assignDate) {
    this.assignDate = assignDate;
  }

  public MessageTemplateAssignmentUpdate dateUpdate(OffsetDateTime dateUpdate) {
    this.dateUpdate = dateUpdate;
    return this;
  }

   /**
   * Get dateUpdate
   * @return dateUpdate
  **/
  @Schema(description = "")
  public OffsetDateTime getDateUpdate() {
    return dateUpdate;
  }

  public void setDateUpdate(OffsetDateTime dateUpdate) {
    this.dateUpdate = dateUpdate;
  }

  public MessageTemplateAssignmentUpdate unassignDate(OffsetDateTime unassignDate) {
    this.unassignDate = unassignDate;
    return this;
  }

   /**
   * Get unassignDate
   * @return unassignDate
  **/
  @Schema(description = "")
  public OffsetDateTime getUnassignDate() {
    return unassignDate;
  }

  public void setUnassignDate(OffsetDateTime unassignDate) {
    this.unassignDate = unassignDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageTemplateAssignmentUpdate messageTemplateAssignmentUpdate = (MessageTemplateAssignmentUpdate) o;
    return Objects.equals(this.id, messageTemplateAssignmentUpdate.id) &&
        Objects.equals(this.propertyId, messageTemplateAssignmentUpdate.propertyId) &&
        Objects.equals(this.templateId, messageTemplateAssignmentUpdate.templateId) &&
        Objects.equals(this.priority, messageTemplateAssignmentUpdate.priority) &&
        Objects.equals(this.assignDate, messageTemplateAssignmentUpdate.assignDate) &&
        Objects.equals(this.dateUpdate, messageTemplateAssignmentUpdate.dateUpdate) &&
        Objects.equals(this.unassignDate, messageTemplateAssignmentUpdate.unassignDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, propertyId, templateId, priority, assignDate, dateUpdate, unassignDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageTemplateAssignmentUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    assignDate: ").append(toIndentedString(assignDate)).append("\n");
    sb.append("    dateUpdate: ").append(toIndentedString(dateUpdate)).append("\n");
    sb.append("    unassignDate: ").append(toIndentedString(unassignDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

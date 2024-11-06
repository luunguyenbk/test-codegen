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
 * MessageTemplateCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-06T18:18:45.760652Z[Etc/UTC]")
public class MessageTemplateCreate {
  @SerializedName("id")
  private String id = null;

  @SerializedName("templateName")
  private String templateName = null;

  /**
   * Gets or Sets language
   */
  @JsonAdapter(LanguageEnum.Adapter.class)
  public enum LanguageEnum {
    EN("en"),
    FR("fr"),
    CMN("cmn"),
    ES("es"),
    YUE("yue"),
    AR("ar"),
    KO("ko"),
    PA("pa"),
    TL("tl"),
    FA("fa");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static LanguageEnum fromValue(String text) {
      for (LanguageEnum b : LanguageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<LanguageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LanguageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LanguageEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return LanguageEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("language")
  private LanguageEnum language = LanguageEnum.EN;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("template")
  private Object template = null;

  @SerializedName("callListId")
  private Integer callListId = null;

  @SerializedName("priority")
  private Integer priority = 100;

  @SerializedName("dateDeleted")
  private OffsetDateTime dateDeleted = null;

  public MessageTemplateCreate id(String id) {
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

  public MessageTemplateCreate templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * Get templateName
   * @return templateName
  **/
  @Schema(required = true, description = "")
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  public MessageTemplateCreate language(LanguageEnum language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @Schema(description = "")
  public LanguageEnum getLanguage() {
    return language;
  }

  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }

  public MessageTemplateCreate metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public MessageTemplateCreate template(Object template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @Schema(required = true, description = "")
  public Object getTemplate() {
    return template;
  }

  public void setTemplate(Object template) {
    this.template = template;
  }

  public MessageTemplateCreate callListId(Integer callListId) {
    this.callListId = callListId;
    return this;
  }

   /**
   * Get callListId
   * @return callListId
  **/
  @Schema(description = "")
  public Integer getCallListId() {
    return callListId;
  }

  public void setCallListId(Integer callListId) {
    this.callListId = callListId;
  }

  public MessageTemplateCreate priority(Integer priority) {
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

  public MessageTemplateCreate dateDeleted(OffsetDateTime dateDeleted) {
    this.dateDeleted = dateDeleted;
    return this;
  }

   /**
   * Get dateDeleted
   * @return dateDeleted
  **/
  @Schema(description = "")
  public OffsetDateTime getDateDeleted() {
    return dateDeleted;
  }

  public void setDateDeleted(OffsetDateTime dateDeleted) {
    this.dateDeleted = dateDeleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageTemplateCreate messageTemplateCreate = (MessageTemplateCreate) o;
    return Objects.equals(this.id, messageTemplateCreate.id) &&
        Objects.equals(this.templateName, messageTemplateCreate.templateName) &&
        Objects.equals(this.language, messageTemplateCreate.language) &&
        Objects.equals(this.metadata, messageTemplateCreate.metadata) &&
        Objects.equals(this.template, messageTemplateCreate.template) &&
        Objects.equals(this.callListId, messageTemplateCreate.callListId) &&
        Objects.equals(this.priority, messageTemplateCreate.priority) &&
        Objects.equals(this.dateDeleted, messageTemplateCreate.dateDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, templateName, language, metadata, template, callListId, priority, dateDeleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageTemplateCreate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    callListId: ").append(toIndentedString(callListId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    dateDeleted: ").append(toIndentedString(dateDeleted)).append("\n");
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

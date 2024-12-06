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
/**
 * CampaignSummary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-06T16:31:40.316484Z[Etc/UTC]")

public class CampaignSummary {
  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("campaignNickname")
  private String campaignNickname = null;

  @SerializedName("totangoName")
  private String totangoName = null;

  @SerializedName("type")
  private String type = "add";

  @SerializedName("frequency")
  private String frequency = "monthly";

  @SerializedName("lifetime")
  private String lifetime = "monthly";

  @SerializedName("method")
  private String method = "provided";

  @SerializedName("carrierAllowed")
  private Boolean carrierAllowed = false;

  @SerializedName("accountType")
  private String accountType = "I";

  @SerializedName("dncScrub")
  private Boolean dncScrub = false;

  @SerializedName("reportingPeriodType")
  private String reportingPeriodType = "month";

  @SerializedName("reportingPeriodBefore")
  private Integer reportingPeriodBefore = 0;

  @SerializedName("reportingPeriodAfter")
  private Integer reportingPeriodAfter = 0;

  @SerializedName("transactionEarliest")
  private String transactionEarliest = null;

  @SerializedName("transactionLatest")
  private String transactionLatest = null;

  @SerializedName("productTypes")
  private String productTypes = null;

  @SerializedName("source")
  private String source = "api";

  public CampaignSummary title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CampaignSummary description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CampaignSummary id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CampaignSummary campaignNickname(String campaignNickname) {
    this.campaignNickname = campaignNickname;
    return this;
  }

   /**
   * Get campaignNickname
   * @return campaignNickname
  **/
  @Schema(required = true, description = "")
  public String getCampaignNickname() {
    return campaignNickname;
  }

  public void setCampaignNickname(String campaignNickname) {
    this.campaignNickname = campaignNickname;
  }

  public CampaignSummary totangoName(String totangoName) {
    this.totangoName = totangoName;
    return this;
  }

   /**
   * Get totangoName
   * @return totangoName
  **/
  @Schema(description = "")
  public String getTotangoName() {
    return totangoName;
  }

  public void setTotangoName(String totangoName) {
    this.totangoName = totangoName;
  }

  public CampaignSummary type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CampaignSummary frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @Schema(description = "")
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public CampaignSummary lifetime(String lifetime) {
    this.lifetime = lifetime;
    return this;
  }

   /**
   * Get lifetime
   * @return lifetime
  **/
  @Schema(description = "")
  public String getLifetime() {
    return lifetime;
  }

  public void setLifetime(String lifetime) {
    this.lifetime = lifetime;
  }

  public CampaignSummary method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @Schema(description = "")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public CampaignSummary carrierAllowed(Boolean carrierAllowed) {
    this.carrierAllowed = carrierAllowed;
    return this;
  }

   /**
   * Get carrierAllowed
   * @return carrierAllowed
  **/
  @Schema(description = "")
  public Boolean isCarrierAllowed() {
    return carrierAllowed;
  }

  public void setCarrierAllowed(Boolean carrierAllowed) {
    this.carrierAllowed = carrierAllowed;
  }

  public CampaignSummary accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @Schema(description = "")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public CampaignSummary dncScrub(Boolean dncScrub) {
    this.dncScrub = dncScrub;
    return this;
  }

   /**
   * Get dncScrub
   * @return dncScrub
  **/
  @Schema(description = "")
  public Boolean isDncScrub() {
    return dncScrub;
  }

  public void setDncScrub(Boolean dncScrub) {
    this.dncScrub = dncScrub;
  }

  public CampaignSummary reportingPeriodType(String reportingPeriodType) {
    this.reportingPeriodType = reportingPeriodType;
    return this;
  }

   /**
   * Get reportingPeriodType
   * @return reportingPeriodType
  **/
  @Schema(description = "")
  public String getReportingPeriodType() {
    return reportingPeriodType;
  }

  public void setReportingPeriodType(String reportingPeriodType) {
    this.reportingPeriodType = reportingPeriodType;
  }

  public CampaignSummary reportingPeriodBefore(Integer reportingPeriodBefore) {
    this.reportingPeriodBefore = reportingPeriodBefore;
    return this;
  }

   /**
   * Get reportingPeriodBefore
   * @return reportingPeriodBefore
  **/
  @Schema(description = "")
  public Integer getReportingPeriodBefore() {
    return reportingPeriodBefore;
  }

  public void setReportingPeriodBefore(Integer reportingPeriodBefore) {
    this.reportingPeriodBefore = reportingPeriodBefore;
  }

  public CampaignSummary reportingPeriodAfter(Integer reportingPeriodAfter) {
    this.reportingPeriodAfter = reportingPeriodAfter;
    return this;
  }

   /**
   * Get reportingPeriodAfter
   * @return reportingPeriodAfter
  **/
  @Schema(description = "")
  public Integer getReportingPeriodAfter() {
    return reportingPeriodAfter;
  }

  public void setReportingPeriodAfter(Integer reportingPeriodAfter) {
    this.reportingPeriodAfter = reportingPeriodAfter;
  }

  public CampaignSummary transactionEarliest(String transactionEarliest) {
    this.transactionEarliest = transactionEarliest;
    return this;
  }

   /**
   * Get transactionEarliest
   * @return transactionEarliest
  **/
  @Schema(description = "")
  public String getTransactionEarliest() {
    return transactionEarliest;
  }

  public void setTransactionEarliest(String transactionEarliest) {
    this.transactionEarliest = transactionEarliest;
  }

  public CampaignSummary transactionLatest(String transactionLatest) {
    this.transactionLatest = transactionLatest;
    return this;
  }

   /**
   * Get transactionLatest
   * @return transactionLatest
  **/
  @Schema(description = "")
  public String getTransactionLatest() {
    return transactionLatest;
  }

  public void setTransactionLatest(String transactionLatest) {
    this.transactionLatest = transactionLatest;
  }

  public CampaignSummary productTypes(String productTypes) {
    this.productTypes = productTypes;
    return this;
  }

   /**
   * Get productTypes
   * @return productTypes
  **/
  @Schema(description = "")
  public String getProductTypes() {
    return productTypes;
  }

  public void setProductTypes(String productTypes) {
    this.productTypes = productTypes;
  }

  public CampaignSummary source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignSummary campaignSummary = (CampaignSummary) o;
    return Objects.equals(this.title, campaignSummary.title) &&
        Objects.equals(this.description, campaignSummary.description) &&
        Objects.equals(this.id, campaignSummary.id) &&
        Objects.equals(this.campaignNickname, campaignSummary.campaignNickname) &&
        Objects.equals(this.totangoName, campaignSummary.totangoName) &&
        Objects.equals(this.type, campaignSummary.type) &&
        Objects.equals(this.frequency, campaignSummary.frequency) &&
        Objects.equals(this.lifetime, campaignSummary.lifetime) &&
        Objects.equals(this.method, campaignSummary.method) &&
        Objects.equals(this.carrierAllowed, campaignSummary.carrierAllowed) &&
        Objects.equals(this.accountType, campaignSummary.accountType) &&
        Objects.equals(this.dncScrub, campaignSummary.dncScrub) &&
        Objects.equals(this.reportingPeriodType, campaignSummary.reportingPeriodType) &&
        Objects.equals(this.reportingPeriodBefore, campaignSummary.reportingPeriodBefore) &&
        Objects.equals(this.reportingPeriodAfter, campaignSummary.reportingPeriodAfter) &&
        Objects.equals(this.transactionEarliest, campaignSummary.transactionEarliest) &&
        Objects.equals(this.transactionLatest, campaignSummary.transactionLatest) &&
        Objects.equals(this.productTypes, campaignSummary.productTypes) &&
        Objects.equals(this.source, campaignSummary.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, id, campaignNickname, totangoName, type, frequency, lifetime, method, carrierAllowed, accountType, dncScrub, reportingPeriodType, reportingPeriodBefore, reportingPeriodAfter, transactionEarliest, transactionLatest, productTypes, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignSummary {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    campaignNickname: ").append(toIndentedString(campaignNickname)).append("\n");
    sb.append("    totangoName: ").append(toIndentedString(totangoName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    lifetime: ").append(toIndentedString(lifetime)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    carrierAllowed: ").append(toIndentedString(carrierAllowed)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    dncScrub: ").append(toIndentedString(dncScrub)).append("\n");
    sb.append("    reportingPeriodType: ").append(toIndentedString(reportingPeriodType)).append("\n");
    sb.append("    reportingPeriodBefore: ").append(toIndentedString(reportingPeriodBefore)).append("\n");
    sb.append("    reportingPeriodAfter: ").append(toIndentedString(reportingPeriodAfter)).append("\n");
    sb.append("    transactionEarliest: ").append(toIndentedString(transactionEarliest)).append("\n");
    sb.append("    transactionLatest: ").append(toIndentedString(transactionLatest)).append("\n");
    sb.append("    productTypes: ").append(toIndentedString(productTypes)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

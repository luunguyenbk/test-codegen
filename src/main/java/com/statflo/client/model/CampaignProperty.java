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
import com.statflo.client.model.CampaignSummary;
import com.statflo.client.model.CampaignVisibility;
import com.statflo.client.model.Dealer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CampaignProperty
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-02-20T13:23:55.050119-05:00[America/Toronto]")

public class CampaignProperty {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("dealer")
  private Dealer dealer = null;

  @SerializedName("campaign")
  private CampaignSummary campaign = null;

  @SerializedName("campaignPriority")
  private Integer campaignPriority = null;

  @SerializedName("displayPriority")
  private Integer displayPriority = null;

  @SerializedName("carryoverUnattempted")
  private Boolean carryoverUnattempted = false;

  @SerializedName("visibilityCrmStatus")
  private CampaignVisibility visibilityCrmStatus = null;

  @SerializedName("visibilityReportStatus")
  private CampaignVisibility visibilityReportStatus = null;

  public CampaignProperty id(Integer id) {
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

  public CampaignProperty dealer(Dealer dealer) {
    this.dealer = dealer;
    return this;
  }

   /**
   * Get dealer
   * @return dealer
  **/
  @Schema(description = "")
  public Dealer getDealer() {
    return dealer;
  }

  public void setDealer(Dealer dealer) {
    this.dealer = dealer;
  }

  public CampaignProperty campaign(CampaignSummary campaign) {
    this.campaign = campaign;
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @Schema(description = "")
  public CampaignSummary getCampaign() {
    return campaign;
  }

  public void setCampaign(CampaignSummary campaign) {
    this.campaign = campaign;
  }

  public CampaignProperty campaignPriority(Integer campaignPriority) {
    this.campaignPriority = campaignPriority;
    return this;
  }

   /**
   * Get campaignPriority
   * @return campaignPriority
  **/
  @Schema(description = "")
  public Integer getCampaignPriority() {
    return campaignPriority;
  }

  public void setCampaignPriority(Integer campaignPriority) {
    this.campaignPriority = campaignPriority;
  }

  public CampaignProperty displayPriority(Integer displayPriority) {
    this.displayPriority = displayPriority;
    return this;
  }

   /**
   * Get displayPriority
   * @return displayPriority
  **/
  @Schema(description = "")
  public Integer getDisplayPriority() {
    return displayPriority;
  }

  public void setDisplayPriority(Integer displayPriority) {
    this.displayPriority = displayPriority;
  }

  public CampaignProperty carryoverUnattempted(Boolean carryoverUnattempted) {
    this.carryoverUnattempted = carryoverUnattempted;
    return this;
  }

   /**
   * Get carryoverUnattempted
   * @return carryoverUnattempted
  **/
  @Schema(description = "")
  public Boolean isCarryoverUnattempted() {
    return carryoverUnattempted;
  }

  public void setCarryoverUnattempted(Boolean carryoverUnattempted) {
    this.carryoverUnattempted = carryoverUnattempted;
  }

  public CampaignProperty visibilityCrmStatus(CampaignVisibility visibilityCrmStatus) {
    this.visibilityCrmStatus = visibilityCrmStatus;
    return this;
  }

   /**
   * Get visibilityCrmStatus
   * @return visibilityCrmStatus
  **/
  @Schema(description = "")
  public CampaignVisibility getVisibilityCrmStatus() {
    return visibilityCrmStatus;
  }

  public void setVisibilityCrmStatus(CampaignVisibility visibilityCrmStatus) {
    this.visibilityCrmStatus = visibilityCrmStatus;
  }

  public CampaignProperty visibilityReportStatus(CampaignVisibility visibilityReportStatus) {
    this.visibilityReportStatus = visibilityReportStatus;
    return this;
  }

   /**
   * Get visibilityReportStatus
   * @return visibilityReportStatus
  **/
  @Schema(description = "")
  public CampaignVisibility getVisibilityReportStatus() {
    return visibilityReportStatus;
  }

  public void setVisibilityReportStatus(CampaignVisibility visibilityReportStatus) {
    this.visibilityReportStatus = visibilityReportStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignProperty campaignProperty = (CampaignProperty) o;
    return Objects.equals(this.id, campaignProperty.id) &&
        Objects.equals(this.dealer, campaignProperty.dealer) &&
        Objects.equals(this.campaign, campaignProperty.campaign) &&
        Objects.equals(this.campaignPriority, campaignProperty.campaignPriority) &&
        Objects.equals(this.displayPriority, campaignProperty.displayPriority) &&
        Objects.equals(this.carryoverUnattempted, campaignProperty.carryoverUnattempted) &&
        Objects.equals(this.visibilityCrmStatus, campaignProperty.visibilityCrmStatus) &&
        Objects.equals(this.visibilityReportStatus, campaignProperty.visibilityReportStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dealer, campaign, campaignPriority, displayPriority, carryoverUnattempted, visibilityCrmStatus, visibilityReportStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignProperty {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dealer: ").append(toIndentedString(dealer)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    campaignPriority: ").append(toIndentedString(campaignPriority)).append("\n");
    sb.append("    displayPriority: ").append(toIndentedString(displayPriority)).append("\n");
    sb.append("    carryoverUnattempted: ").append(toIndentedString(carryoverUnattempted)).append("\n");
    sb.append("    visibilityCrmStatus: ").append(toIndentedString(visibilityCrmStatus)).append("\n");
    sb.append("    visibilityReportStatus: ").append(toIndentedString(visibilityReportStatus)).append("\n");
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

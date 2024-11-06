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
import com.statflo.client.model.Campaign;
import com.statflo.client.model.Dealer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * CampaignPropertySummary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-06T20:14:26.276980Z[Etc/UTC]")
public class CampaignPropertySummary {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("dealer")
  private Dealer dealer = null;

  @SerializedName("campaign")
  private Campaign campaign = null;

  @SerializedName("campaignTerminationDate")
  private OffsetDateTime campaignTerminationDate = null;

  @SerializedName("campaignPriority")
  private Integer campaignPriority = null;

  @SerializedName("displayPriority")
  private Integer displayPriority = null;

  @SerializedName("carryoverUnattempted")
  private Boolean carryoverUnattempted = false;

  @SerializedName("visibility")
  private Integer visibility = 0;

  @SerializedName("visibilityCrm")
  private Integer visibilityCrm = 30;

  @SerializedName("visibilityReport")
  private Integer visibilityReport = 30;

  public CampaignPropertySummary id(Integer id) {
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

  public CampaignPropertySummary dealer(Dealer dealer) {
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

  public CampaignPropertySummary campaign(Campaign campaign) {
    this.campaign = campaign;
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @Schema(description = "")
  public Campaign getCampaign() {
    return campaign;
  }

  public void setCampaign(Campaign campaign) {
    this.campaign = campaign;
  }

  public CampaignPropertySummary campaignTerminationDate(OffsetDateTime campaignTerminationDate) {
    this.campaignTerminationDate = campaignTerminationDate;
    return this;
  }

   /**
   * Get campaignTerminationDate
   * @return campaignTerminationDate
  **/
  @Schema(description = "")
  public OffsetDateTime getCampaignTerminationDate() {
    return campaignTerminationDate;
  }

  public void setCampaignTerminationDate(OffsetDateTime campaignTerminationDate) {
    this.campaignTerminationDate = campaignTerminationDate;
  }

  public CampaignPropertySummary campaignPriority(Integer campaignPriority) {
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

  public CampaignPropertySummary displayPriority(Integer displayPriority) {
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

  public CampaignPropertySummary carryoverUnattempted(Boolean carryoverUnattempted) {
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

  public CampaignPropertySummary visibility(Integer visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @Schema(description = "")
  public Integer getVisibility() {
    return visibility;
  }

  public void setVisibility(Integer visibility) {
    this.visibility = visibility;
  }

  public CampaignPropertySummary visibilityCrm(Integer visibilityCrm) {
    this.visibilityCrm = visibilityCrm;
    return this;
  }

   /**
   * Get visibilityCrm
   * @return visibilityCrm
  **/
  @Schema(required = true, description = "")
  public Integer getVisibilityCrm() {
    return visibilityCrm;
  }

  public void setVisibilityCrm(Integer visibilityCrm) {
    this.visibilityCrm = visibilityCrm;
  }

  public CampaignPropertySummary visibilityReport(Integer visibilityReport) {
    this.visibilityReport = visibilityReport;
    return this;
  }

   /**
   * Get visibilityReport
   * @return visibilityReport
  **/
  @Schema(required = true, description = "")
  public Integer getVisibilityReport() {
    return visibilityReport;
  }

  public void setVisibilityReport(Integer visibilityReport) {
    this.visibilityReport = visibilityReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignPropertySummary campaignPropertySummary = (CampaignPropertySummary) o;
    return Objects.equals(this.id, campaignPropertySummary.id) &&
        Objects.equals(this.dealer, campaignPropertySummary.dealer) &&
        Objects.equals(this.campaign, campaignPropertySummary.campaign) &&
        Objects.equals(this.campaignTerminationDate, campaignPropertySummary.campaignTerminationDate) &&
        Objects.equals(this.campaignPriority, campaignPropertySummary.campaignPriority) &&
        Objects.equals(this.displayPriority, campaignPropertySummary.displayPriority) &&
        Objects.equals(this.carryoverUnattempted, campaignPropertySummary.carryoverUnattempted) &&
        Objects.equals(this.visibility, campaignPropertySummary.visibility) &&
        Objects.equals(this.visibilityCrm, campaignPropertySummary.visibilityCrm) &&
        Objects.equals(this.visibilityReport, campaignPropertySummary.visibilityReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dealer, campaign, campaignTerminationDate, campaignPriority, displayPriority, carryoverUnattempted, visibility, visibilityCrm, visibilityReport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPropertySummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dealer: ").append(toIndentedString(dealer)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    campaignTerminationDate: ").append(toIndentedString(campaignTerminationDate)).append("\n");
    sb.append("    campaignPriority: ").append(toIndentedString(campaignPriority)).append("\n");
    sb.append("    displayPriority: ").append(toIndentedString(displayPriority)).append("\n");
    sb.append("    carryoverUnattempted: ").append(toIndentedString(carryoverUnattempted)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    visibilityCrm: ").append(toIndentedString(visibilityCrm)).append("\n");
    sb.append("    visibilityReport: ").append(toIndentedString(visibilityReport)).append("\n");
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

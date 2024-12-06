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
import com.statflo.client.model.Carrier;
import com.statflo.client.model.Dealer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * CampaignMember
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-06T16:29:11.904925Z[Etc/UTC]")

public class CampaignMember {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("accountName")
  private String accountName = null;

  @SerializedName("campaign")
  private Campaign campaign = null;

  @SerializedName("campaignId")
  private Integer campaignId = null;

  @SerializedName("startDate")
  private OffsetDateTime startDate = null;

  @SerializedName("endDate")
  private OffsetDateTime endDate = null;

  @SerializedName("secondaryDealerId")
  private String secondaryDealerId = null;

  @SerializedName("carrier")
  private Carrier carrier = null;

  @SerializedName("dealer")
  private Dealer dealer = null;

  @SerializedName("campaignNickname")
  private String campaignNickname = null;

  @SerializedName("source")
  private String source = "api";

  @SerializedName("dateCreated")
  private OffsetDateTime dateCreated = null;

  @SerializedName("excludeDnc")
  private String excludeDnc = null;

  @SerializedName("excludeDncDate")
  private OffsetDateTime excludeDncDate = null;

  @SerializedName("excludeKill")
  private String excludeKill = null;

  @SerializedName("excludeDuplicate")
  private String excludeDuplicate = null;

  @SerializedName("excludeTerminated")
  private String excludeTerminated = null;

  @SerializedName("excludeTerminatedDate")
  private OffsetDateTime excludeTerminatedDate = null;

  @SerializedName("excludePrepaid")
  private String excludePrepaid = null;

  @SerializedName("excludeNoDealerMatch")
  private String excludeNoDealerMatch = null;

  @SerializedName("excludeArchived")
  private String excludeArchived = null;

  @SerializedName("excludeLegacy")
  private String excludeLegacy = null;

  public CampaignMember id(Integer id) {
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

  public CampaignMember accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public CampaignMember phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @Schema(description = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public CampaignMember accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @Schema(description = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public CampaignMember campaign(Campaign campaign) {
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

  public CampaignMember campaignId(Integer campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @Schema(required = true, description = "")
  public Integer getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Integer campaignId) {
    this.campaignId = campaignId;
  }

  public CampaignMember startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @Schema(description = "")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public CampaignMember endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @Schema(description = "")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public CampaignMember secondaryDealerId(String secondaryDealerId) {
    this.secondaryDealerId = secondaryDealerId;
    return this;
  }

   /**
   * Get secondaryDealerId
   * @return secondaryDealerId
  **/
  @Schema(description = "")
  public String getSecondaryDealerId() {
    return secondaryDealerId;
  }

  public void setSecondaryDealerId(String secondaryDealerId) {
    this.secondaryDealerId = secondaryDealerId;
  }

  public CampaignMember carrier(Carrier carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * Get carrier
   * @return carrier
  **/
  @Schema(description = "")
  public Carrier getCarrier() {
    return carrier;
  }

  public void setCarrier(Carrier carrier) {
    this.carrier = carrier;
  }

  public CampaignMember dealer(Dealer dealer) {
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

  public CampaignMember campaignNickname(String campaignNickname) {
    this.campaignNickname = campaignNickname;
    return this;
  }

   /**
   * Get campaignNickname
   * @return campaignNickname
  **/
  @Schema(description = "")
  public String getCampaignNickname() {
    return campaignNickname;
  }

  public void setCampaignNickname(String campaignNickname) {
    this.campaignNickname = campaignNickname;
  }

  public CampaignMember source(String source) {
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

  public CampaignMember dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public CampaignMember excludeDnc(String excludeDnc) {
    this.excludeDnc = excludeDnc;
    return this;
  }

   /**
   * Get excludeDnc
   * @return excludeDnc
  **/
  @Schema(description = "")
  public String getExcludeDnc() {
    return excludeDnc;
  }

  public void setExcludeDnc(String excludeDnc) {
    this.excludeDnc = excludeDnc;
  }

  public CampaignMember excludeDncDate(OffsetDateTime excludeDncDate) {
    this.excludeDncDate = excludeDncDate;
    return this;
  }

   /**
   * Get excludeDncDate
   * @return excludeDncDate
  **/
  @Schema(description = "")
  public OffsetDateTime getExcludeDncDate() {
    return excludeDncDate;
  }

  public void setExcludeDncDate(OffsetDateTime excludeDncDate) {
    this.excludeDncDate = excludeDncDate;
  }

  public CampaignMember excludeKill(String excludeKill) {
    this.excludeKill = excludeKill;
    return this;
  }

   /**
   * Get excludeKill
   * @return excludeKill
  **/
  @Schema(description = "")
  public String getExcludeKill() {
    return excludeKill;
  }

  public void setExcludeKill(String excludeKill) {
    this.excludeKill = excludeKill;
  }

  public CampaignMember excludeDuplicate(String excludeDuplicate) {
    this.excludeDuplicate = excludeDuplicate;
    return this;
  }

   /**
   * Get excludeDuplicate
   * @return excludeDuplicate
  **/
  @Schema(description = "")
  public String getExcludeDuplicate() {
    return excludeDuplicate;
  }

  public void setExcludeDuplicate(String excludeDuplicate) {
    this.excludeDuplicate = excludeDuplicate;
  }

  public CampaignMember excludeTerminated(String excludeTerminated) {
    this.excludeTerminated = excludeTerminated;
    return this;
  }

   /**
   * Get excludeTerminated
   * @return excludeTerminated
  **/
  @Schema(description = "")
  public String getExcludeTerminated() {
    return excludeTerminated;
  }

  public void setExcludeTerminated(String excludeTerminated) {
    this.excludeTerminated = excludeTerminated;
  }

  public CampaignMember excludeTerminatedDate(OffsetDateTime excludeTerminatedDate) {
    this.excludeTerminatedDate = excludeTerminatedDate;
    return this;
  }

   /**
   * Get excludeTerminatedDate
   * @return excludeTerminatedDate
  **/
  @Schema(description = "")
  public OffsetDateTime getExcludeTerminatedDate() {
    return excludeTerminatedDate;
  }

  public void setExcludeTerminatedDate(OffsetDateTime excludeTerminatedDate) {
    this.excludeTerminatedDate = excludeTerminatedDate;
  }

  public CampaignMember excludePrepaid(String excludePrepaid) {
    this.excludePrepaid = excludePrepaid;
    return this;
  }

   /**
   * Get excludePrepaid
   * @return excludePrepaid
  **/
  @Schema(description = "")
  public String getExcludePrepaid() {
    return excludePrepaid;
  }

  public void setExcludePrepaid(String excludePrepaid) {
    this.excludePrepaid = excludePrepaid;
  }

  public CampaignMember excludeNoDealerMatch(String excludeNoDealerMatch) {
    this.excludeNoDealerMatch = excludeNoDealerMatch;
    return this;
  }

   /**
   * Get excludeNoDealerMatch
   * @return excludeNoDealerMatch
  **/
  @Schema(description = "")
  public String getExcludeNoDealerMatch() {
    return excludeNoDealerMatch;
  }

  public void setExcludeNoDealerMatch(String excludeNoDealerMatch) {
    this.excludeNoDealerMatch = excludeNoDealerMatch;
  }

  public CampaignMember excludeArchived(String excludeArchived) {
    this.excludeArchived = excludeArchived;
    return this;
  }

   /**
   * Get excludeArchived
   * @return excludeArchived
  **/
  @Schema(description = "")
  public String getExcludeArchived() {
    return excludeArchived;
  }

  public void setExcludeArchived(String excludeArchived) {
    this.excludeArchived = excludeArchived;
  }

  public CampaignMember excludeLegacy(String excludeLegacy) {
    this.excludeLegacy = excludeLegacy;
    return this;
  }

   /**
   * Get excludeLegacy
   * @return excludeLegacy
  **/
  @Schema(description = "")
  public String getExcludeLegacy() {
    return excludeLegacy;
  }

  public void setExcludeLegacy(String excludeLegacy) {
    this.excludeLegacy = excludeLegacy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignMember campaignMember = (CampaignMember) o;
    return Objects.equals(this.id, campaignMember.id) &&
        Objects.equals(this.accountId, campaignMember.accountId) &&
        Objects.equals(this.phoneNumber, campaignMember.phoneNumber) &&
        Objects.equals(this.accountName, campaignMember.accountName) &&
        Objects.equals(this.campaign, campaignMember.campaign) &&
        Objects.equals(this.campaignId, campaignMember.campaignId) &&
        Objects.equals(this.startDate, campaignMember.startDate) &&
        Objects.equals(this.endDate, campaignMember.endDate) &&
        Objects.equals(this.secondaryDealerId, campaignMember.secondaryDealerId) &&
        Objects.equals(this.carrier, campaignMember.carrier) &&
        Objects.equals(this.dealer, campaignMember.dealer) &&
        Objects.equals(this.campaignNickname, campaignMember.campaignNickname) &&
        Objects.equals(this.source, campaignMember.source) &&
        Objects.equals(this.dateCreated, campaignMember.dateCreated) &&
        Objects.equals(this.excludeDnc, campaignMember.excludeDnc) &&
        Objects.equals(this.excludeDncDate, campaignMember.excludeDncDate) &&
        Objects.equals(this.excludeKill, campaignMember.excludeKill) &&
        Objects.equals(this.excludeDuplicate, campaignMember.excludeDuplicate) &&
        Objects.equals(this.excludeTerminated, campaignMember.excludeTerminated) &&
        Objects.equals(this.excludeTerminatedDate, campaignMember.excludeTerminatedDate) &&
        Objects.equals(this.excludePrepaid, campaignMember.excludePrepaid) &&
        Objects.equals(this.excludeNoDealerMatch, campaignMember.excludeNoDealerMatch) &&
        Objects.equals(this.excludeArchived, campaignMember.excludeArchived) &&
        Objects.equals(this.excludeLegacy, campaignMember.excludeLegacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountId, phoneNumber, accountName, campaign, campaignId, startDate, endDate, secondaryDealerId, carrier, dealer, campaignNickname, source, dateCreated, excludeDnc, excludeDncDate, excludeKill, excludeDuplicate, excludeTerminated, excludeTerminatedDate, excludePrepaid, excludeNoDealerMatch, excludeArchived, excludeLegacy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignMember {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    secondaryDealerId: ").append(toIndentedString(secondaryDealerId)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    dealer: ").append(toIndentedString(dealer)).append("\n");
    sb.append("    campaignNickname: ").append(toIndentedString(campaignNickname)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    excludeDnc: ").append(toIndentedString(excludeDnc)).append("\n");
    sb.append("    excludeDncDate: ").append(toIndentedString(excludeDncDate)).append("\n");
    sb.append("    excludeKill: ").append(toIndentedString(excludeKill)).append("\n");
    sb.append("    excludeDuplicate: ").append(toIndentedString(excludeDuplicate)).append("\n");
    sb.append("    excludeTerminated: ").append(toIndentedString(excludeTerminated)).append("\n");
    sb.append("    excludeTerminatedDate: ").append(toIndentedString(excludeTerminatedDate)).append("\n");
    sb.append("    excludePrepaid: ").append(toIndentedString(excludePrepaid)).append("\n");
    sb.append("    excludeNoDealerMatch: ").append(toIndentedString(excludeNoDealerMatch)).append("\n");
    sb.append("    excludeArchived: ").append(toIndentedString(excludeArchived)).append("\n");
    sb.append("    excludeLegacy: ").append(toIndentedString(excludeLegacy)).append("\n");
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

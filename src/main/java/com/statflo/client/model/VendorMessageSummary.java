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
import com.statflo.client.model.Dealer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * VendorMessageSummary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-02-21T09:59:18.881896-05:00[America/Toronto]")

public class VendorMessageSummary {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("dealer")
  private Dealer dealer = null;

  @SerializedName("payload")
  private Object payload = null;

  @SerializedName("action")
  private String action = null;

  @SerializedName("dateAdded")
  private OffsetDateTime dateAdded = null;

  public VendorMessageSummary id(Integer id) {
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

  public VendorMessageSummary dealer(Dealer dealer) {
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

  public VendorMessageSummary payload(Object payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @Schema(description = "")
  public Object getPayload() {
    return payload;
  }

  public void setPayload(Object payload) {
    this.payload = payload;
  }

  public VendorMessageSummary action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public VendorMessageSummary dateAdded(OffsetDateTime dateAdded) {
    this.dateAdded = dateAdded;
    return this;
  }

   /**
   * Get dateAdded
   * @return dateAdded
  **/
  @Schema(description = "")
  public OffsetDateTime getDateAdded() {
    return dateAdded;
  }

  public void setDateAdded(OffsetDateTime dateAdded) {
    this.dateAdded = dateAdded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorMessageSummary vendorMessageSummary = (VendorMessageSummary) o;
    return Objects.equals(this.id, vendorMessageSummary.id) &&
        Objects.equals(this.dealer, vendorMessageSummary.dealer) &&
        Objects.equals(this.payload, vendorMessageSummary.payload) &&
        Objects.equals(this.action, vendorMessageSummary.action) &&
        Objects.equals(this.dateAdded, vendorMessageSummary.dateAdded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dealer, payload, action, dateAdded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorMessageSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dealer: ").append(toIndentedString(dealer)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
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

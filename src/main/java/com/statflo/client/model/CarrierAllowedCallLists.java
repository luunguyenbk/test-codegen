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
 * CarrierAllowedCallLists
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-06T16:28:13.044281Z[Etc/UTC]")

public class CarrierAllowedCallLists {
  @SerializedName("carrierId")
  private Integer carrierId = null;

  @SerializedName("callListId")
  private Integer callListId = null;

  public CarrierAllowedCallLists carrierId(Integer carrierId) {
    this.carrierId = carrierId;
    return this;
  }

   /**
   * Get carrierId
   * @return carrierId
  **/
  @Schema(required = true, description = "")
  public Integer getCarrierId() {
    return carrierId;
  }

  public void setCarrierId(Integer carrierId) {
    this.carrierId = carrierId;
  }

  public CarrierAllowedCallLists callListId(Integer callListId) {
    this.callListId = callListId;
    return this;
  }

   /**
   * Get callListId
   * @return callListId
  **/
  @Schema(required = true, description = "")
  public Integer getCallListId() {
    return callListId;
  }

  public void setCallListId(Integer callListId) {
    this.callListId = callListId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarrierAllowedCallLists carrierAllowedCallLists = (CarrierAllowedCallLists) o;
    return Objects.equals(this.carrierId, carrierAllowedCallLists.carrierId) &&
        Objects.equals(this.callListId, carrierAllowedCallLists.callListId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierId, callListId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarrierAllowedCallLists {\n");
    
    sb.append("    carrierId: ").append(toIndentedString(carrierId)).append("\n");
    sb.append("    callListId: ").append(toIndentedString(callListId)).append("\n");
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

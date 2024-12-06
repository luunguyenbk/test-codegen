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
 * RolePermissionCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-06T16:41:24.386652Z[Etc/UTC]")

public class RolePermissionCreate {
  @SerializedName("dealerSpecific")
  private Boolean dealerSpecific = null;

  @SerializedName("dealerBlacklisted")
  private Boolean dealerBlacklisted = null;

  public RolePermissionCreate dealerSpecific(Boolean dealerSpecific) {
    this.dealerSpecific = dealerSpecific;
    return this;
  }

   /**
   * Get dealerSpecific
   * @return dealerSpecific
  **/
  @Schema(required = true, description = "")
  public Boolean isDealerSpecific() {
    return dealerSpecific;
  }

  public void setDealerSpecific(Boolean dealerSpecific) {
    this.dealerSpecific = dealerSpecific;
  }

  public RolePermissionCreate dealerBlacklisted(Boolean dealerBlacklisted) {
    this.dealerBlacklisted = dealerBlacklisted;
    return this;
  }

   /**
   * Get dealerBlacklisted
   * @return dealerBlacklisted
  **/
  @Schema(required = true, description = "")
  public Boolean isDealerBlacklisted() {
    return dealerBlacklisted;
  }

  public void setDealerBlacklisted(Boolean dealerBlacklisted) {
    this.dealerBlacklisted = dealerBlacklisted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RolePermissionCreate rolePermissionCreate = (RolePermissionCreate) o;
    return Objects.equals(this.dealerSpecific, rolePermissionCreate.dealerSpecific) &&
        Objects.equals(this.dealerBlacklisted, rolePermissionCreate.dealerBlacklisted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealerSpecific, dealerBlacklisted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RolePermissionCreate {\n");
    
    sb.append("    dealerSpecific: ").append(toIndentedString(dealerSpecific)).append("\n");
    sb.append("    dealerBlacklisted: ").append(toIndentedString(dealerBlacklisted)).append("\n");
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

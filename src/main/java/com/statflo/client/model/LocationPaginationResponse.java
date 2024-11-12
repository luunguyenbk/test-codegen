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
import com.statflo.client.model.LocationSummary;
import com.statflo.client.model.Pagination;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LocationPaginationResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-12T22:33:43.160743Z[Etc/UTC]")

public class LocationPaginationResponse {
  @SerializedName("items")
  private List<LocationSummary> items = null;

  @SerializedName("pagination")
  private Pagination pagination = null;

  public LocationPaginationResponse items(List<LocationSummary> items) {
    this.items = items;
    return this;
  }

  public LocationPaginationResponse addItemsItem(LocationSummary itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<LocationSummary>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(description = "")
  public List<LocationSummary> getItems() {
    return items;
  }

  public void setItems(List<LocationSummary> items) {
    this.items = items;
  }

  public LocationPaginationResponse pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @Schema(description = "")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationPaginationResponse locationPaginationResponse = (LocationPaginationResponse) o;
    return Objects.equals(this.items, locationPaginationResponse.items) &&
        Objects.equals(this.pagination, locationPaginationResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, pagination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationPaginationResponse {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

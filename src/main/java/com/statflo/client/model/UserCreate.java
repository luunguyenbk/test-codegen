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
import java.util.ArrayList;
import java.util.List;
/**
 * UserCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-06T16:36:37.659515Z[Etc/UTC]")

public class UserCreate {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("language")
  private String language = null;

  @SerializedName("salesRepId")
  private String salesRepId = null;

  @SerializedName("outletId")
  private String outletId = null;

  @SerializedName("districtId")
  private Integer districtId = null;

  @SerializedName("regionId")
  private Integer regionId = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("tokenParagon")
  private String tokenParagon = null;

  @SerializedName("userActive")
  private Boolean userActive = true;

  @SerializedName("permissions")
  private List<Object> permissions = new ArrayList<Object>();

  public UserCreate id(Integer id) {
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

  public UserCreate username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(description = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserCreate firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @Schema(description = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserCreate lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @Schema(description = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserCreate email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserCreate language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @Schema(description = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public UserCreate salesRepId(String salesRepId) {
    this.salesRepId = salesRepId;
    return this;
  }

   /**
   * Get salesRepId
   * @return salesRepId
  **/
  @Schema(description = "")
  public String getSalesRepId() {
    return salesRepId;
  }

  public void setSalesRepId(String salesRepId) {
    this.salesRepId = salesRepId;
  }

  public UserCreate outletId(String outletId) {
    this.outletId = outletId;
    return this;
  }

   /**
   * Get outletId
   * @return outletId
  **/
  @Schema(description = "")
  public String getOutletId() {
    return outletId;
  }

  public void setOutletId(String outletId) {
    this.outletId = outletId;
  }

  public UserCreate districtId(Integer districtId) {
    this.districtId = districtId;
    return this;
  }

   /**
   * Get districtId
   * @return districtId
  **/
  @Schema(description = "")
  public Integer getDistrictId() {
    return districtId;
  }

  public void setDistrictId(Integer districtId) {
    this.districtId = districtId;
  }

  public UserCreate regionId(Integer regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Get regionId
   * @return regionId
  **/
  @Schema(description = "")
  public Integer getRegionId() {
    return regionId;
  }

  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }

  public UserCreate token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @Schema(description = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public UserCreate tokenParagon(String tokenParagon) {
    this.tokenParagon = tokenParagon;
    return this;
  }

   /**
   * Get tokenParagon
   * @return tokenParagon
  **/
  @Schema(description = "")
  public String getTokenParagon() {
    return tokenParagon;
  }

  public void setTokenParagon(String tokenParagon) {
    this.tokenParagon = tokenParagon;
  }

  public UserCreate userActive(Boolean userActive) {
    this.userActive = userActive;
    return this;
  }

   /**
   * Get userActive
   * @return userActive
  **/
  @Schema(description = "")
  public Boolean isUserActive() {
    return userActive;
  }

  public void setUserActive(Boolean userActive) {
    this.userActive = userActive;
  }

  public UserCreate permissions(List<Object> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UserCreate addPermissionsItem(Object permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @Schema(required = true, description = "")
  public List<Object> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Object> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCreate userCreate = (UserCreate) o;
    return Objects.equals(this.id, userCreate.id) &&
        Objects.equals(this.username, userCreate.username) &&
        Objects.equals(this.firstName, userCreate.firstName) &&
        Objects.equals(this.lastName, userCreate.lastName) &&
        Objects.equals(this.email, userCreate.email) &&
        Objects.equals(this.language, userCreate.language) &&
        Objects.equals(this.salesRepId, userCreate.salesRepId) &&
        Objects.equals(this.outletId, userCreate.outletId) &&
        Objects.equals(this.districtId, userCreate.districtId) &&
        Objects.equals(this.regionId, userCreate.regionId) &&
        Objects.equals(this.token, userCreate.token) &&
        Objects.equals(this.tokenParagon, userCreate.tokenParagon) &&
        Objects.equals(this.userActive, userCreate.userActive) &&
        Objects.equals(this.permissions, userCreate.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, firstName, lastName, email, language, salesRepId, outletId, districtId, regionId, token, tokenParagon, userActive, permissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    salesRepId: ").append(toIndentedString(salesRepId)).append("\n");
    sb.append("    outletId: ").append(toIndentedString(outletId)).append("\n");
    sb.append("    districtId: ").append(toIndentedString(districtId)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tokenParagon: ").append(toIndentedString(tokenParagon)).append("\n");
    sb.append("    userActive: ").append(toIndentedString(userActive)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

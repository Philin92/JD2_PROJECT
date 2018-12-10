package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Medium
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-08T11:08:14.094+03:00")

public class Medium   {
  @JsonProperty("city")
  private String city = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("emailAddress")
  private String emailAddress = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("postcode")
  private String postcode = null;

  @JsonProperty("stateOrProvince")
  private String stateOrProvince = null;

  @JsonProperty("streetOne")
  private String streetOne = null;

  @JsonProperty("streetTwo")
  private String streetTwo = null;

  public Medium city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Medium country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Medium emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Get emailAddress
   * @return emailAddress
  **/
  @ApiModelProperty(value = "")


  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Medium type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Medium number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Medium postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

  /**
   * Get postcode
   * @return postcode
  **/
  @ApiModelProperty(value = "")


  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public Medium stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

  /**
   * Get stateOrProvince
   * @return stateOrProvince
  **/
  @ApiModelProperty(value = "")


  public String getStateOrProvince() {
    return stateOrProvince;
  }

  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  public Medium streetOne(String streetOne) {
    this.streetOne = streetOne;
    return this;
  }

  /**
   * Get streetOne
   * @return streetOne
  **/
  @ApiModelProperty(value = "")


  public String getStreetOne() {
    return streetOne;
  }

  public void setStreetOne(String streetOne) {
    this.streetOne = streetOne;
  }

  public Medium streetTwo(String streetTwo) {
    this.streetTwo = streetTwo;
    return this;
  }

  /**
   * Get streetTwo
   * @return streetTwo
  **/
  @ApiModelProperty(value = "")


  public String getStreetTwo() {
    return streetTwo;
  }

  public void setStreetTwo(String streetTwo) {
    this.streetTwo = streetTwo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Medium medium = (Medium) o;
    return Objects.equals(this.city, medium.city) &&
        Objects.equals(this.country, medium.country) &&
        Objects.equals(this.emailAddress, medium.emailAddress) &&
        Objects.equals(this.type, medium.type) &&
        Objects.equals(this.number, medium.number) &&
        Objects.equals(this.postcode, medium.postcode) &&
        Objects.equals(this.stateOrProvince, medium.stateOrProvince) &&
        Objects.equals(this.streetOne, medium.streetOne) &&
        Objects.equals(this.streetTwo, medium.streetTwo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, emailAddress, type, number, postcode, stateOrProvince, streetOne, streetTwo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Medium {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    streetOne: ").append(toIndentedString(streetOne)).append("\n");
    sb.append("    streetTwo: ").append(toIndentedString(streetTwo)).append("\n");
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


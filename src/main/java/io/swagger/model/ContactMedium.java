package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Medium;
import io.swagger.model.ValidFor;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContactMedium
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-08T11:08:14.094+03:00")
@Entity
public class ContactMedium extends BasePojo  {

  @Column
  @JsonProperty("type")
  private String type = null;

  @Embedded
  @JsonProperty("validFor")
  private ValidFor validFor = null;

  @Embedded
  @JsonProperty("medium")
  private Medium medium = null;

  @Column
  @JsonProperty("preferred")
  private String preferred = null;

  public ContactMedium type(String type) {
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

  public ContactMedium validFor(ValidFor validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ValidFor getValidFor() {
    return validFor;
  }

  public void setValidFor(ValidFor validFor) {
    this.validFor = validFor;
  }

  public ContactMedium medium(Medium medium) {
    this.medium = medium;
    return this;
  }

  /**
   * Get medium
   * @return medium
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Medium getMedium() {
    return medium;
  }

  public void setMedium(Medium medium) {
    this.medium = medium;
  }

  public ContactMedium preferred(String preferred) {
    this.preferred = preferred;
    return this;
  }

  /**
   * Get preferred
   * @return preferred
  **/
  @ApiModelProperty(value = "")


  public String getPreferred() {
    return preferred;
  }

  public void setPreferred(String preferred) {
    this.preferred = preferred;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactMedium contactMedium = (ContactMedium) o;
    return Objects.equals(this.type, contactMedium.type) &&
        Objects.equals(this.validFor, contactMedium.validFor) &&
        Objects.equals(this.medium, contactMedium.medium) &&
        Objects.equals(this.preferred, contactMedium.preferred);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, validFor, medium, preferred);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactMedium {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
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


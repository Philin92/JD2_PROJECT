package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ValidFor;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerAccountTaxExemption
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-08T11:08:14.094+03:00")
@Entity
public class CustomerAccountTaxExemption   {

  @JsonProperty("issuingJurisdiction")
  @Column
  private String issuingJurisdiction = null;

  @Id
  @JsonProperty("certificateNumber")
  private String certificateNumber = null;

  @JsonProperty("reason")
  @Column
  private String reason = null;

  @JsonProperty("validFor")
  @Embedded
  private ValidFor validFor = null;

  public CustomerAccountTaxExemption issuingJurisdiction(String issuingJurisdiction) {
    this.issuingJurisdiction = issuingJurisdiction;
    return this;
  }

  /**
   * Get issuingJurisdiction
   * @return issuingJurisdiction
  **/
  @ApiModelProperty(value = "")


  public String getIssuingJurisdiction() {
    return issuingJurisdiction;
  }

  public void setIssuingJurisdiction(String issuingJurisdiction) {
    this.issuingJurisdiction = issuingJurisdiction;
  }

  public CustomerAccountTaxExemption certificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
    return this;
  }

  /**
   * Get certificateNumber
   * @return certificateNumber
  **/
  @ApiModelProperty(value = "")


  public String getCertificateNumber() {
    return certificateNumber;
  }

  public void setCertificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
  }

  public CustomerAccountTaxExemption reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public CustomerAccountTaxExemption validFor(ValidFor validFor) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerAccountTaxExemption customerAccountTaxExemption = (CustomerAccountTaxExemption) o;
    return Objects.equals(this.issuingJurisdiction, customerAccountTaxExemption.issuingJurisdiction) &&
        Objects.equals(this.certificateNumber, customerAccountTaxExemption.certificateNumber) &&
        Objects.equals(this.reason, customerAccountTaxExemption.reason) &&
        Objects.equals(this.validFor, customerAccountTaxExemption.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuingJurisdiction, certificateNumber, reason, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAccountTaxExemption {\n");
    
    sb.append("    issuingJurisdiction: ").append(toIndentedString(issuingJurisdiction)).append("\n");
    sb.append("    certificateNumber: ").append(toIndentedString(certificateNumber)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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


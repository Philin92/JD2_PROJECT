package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ValidFor;
import org.hibernate.annotations.GenericGenerator;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerCreditProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-08T11:08:14.094+03:00")
@Entity
public class CustomerCreditProfile extends BasePojo {

  @Column
  @JsonProperty("creditProfileDate")
  private OffsetDateTime creditProfileDate = null;

  @Embedded
  @JsonProperty("validFor")
  private ValidFor validFor = null;

  @Column
  @JsonProperty("creditRiskRating")
  private String creditRiskRating = null;

  @Column
  @JsonProperty("creditScore")
  private String creditScore = null;

  public CustomerCreditProfile creditProfileDate(OffsetDateTime creditProfileDate) {
    this.creditProfileDate = creditProfileDate;
    return this;
  }

  /**
   * Get creditProfileDate
   * @return creditProfileDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreditProfileDate() {
    return creditProfileDate;
  }

  public void setCreditProfileDate(OffsetDateTime creditProfileDate) {
    this.creditProfileDate = creditProfileDate;
  }

  public CustomerCreditProfile validFor(ValidFor validFor) {
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

  public CustomerCreditProfile creditRiskRating(String creditRiskRating) {
    this.creditRiskRating = creditRiskRating;
    return this;
  }

  /**
   * Get creditRiskRating
   * @return creditRiskRating
  **/
  @ApiModelProperty(value = "")


  public String getCreditRiskRating() {
    return creditRiskRating;
  }

  public void setCreditRiskRating(String creditRiskRating) {
    this.creditRiskRating = creditRiskRating;
  }

  public CustomerCreditProfile creditScore(String creditScore) {
    this.creditScore = creditScore;
    return this;
  }

  /**
   * Get creditScore
   * @return creditScore
  **/
  @ApiModelProperty(value = "")


  public String getCreditScore() {
    return creditScore;
  }

  public void setCreditScore(String creditScore) {
    this.creditScore = creditScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerCreditProfile customerCreditProfile = (CustomerCreditProfile) o;
    return Objects.equals(this.creditProfileDate, customerCreditProfile.creditProfileDate) &&
        Objects.equals(this.validFor, customerCreditProfile.validFor) &&
        Objects.equals(this.creditRiskRating, customerCreditProfile.creditRiskRating) &&
        Objects.equals(this.creditScore, customerCreditProfile.creditScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditProfileDate, validFor, creditRiskRating, creditScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerCreditProfile {\n");
    
    sb.append("    creditProfileDate: ").append(toIndentedString(creditProfileDate)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    creditRiskRating: ").append(toIndentedString(creditRiskRating)).append("\n");
    sb.append("    creditScore: ").append(toIndentedString(creditScore)).append("\n");
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


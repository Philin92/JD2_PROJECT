package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreditCard
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-08T11:08:14.094+03:00")
@Entity
public class CreditCard   {
  @Id
  @JsonProperty("creditCardHolder")
  private String creditCardHolder = null;

  @Column
  @JsonProperty("type")
  private String type = null;

  @Column
  @JsonProperty("number")
  private String number = null;

  @Column
  @JsonProperty("expirationDate")
  private OffsetDateTime expirationDate = null;

  public CreditCard creditCardHolder(String creditCardHolder) {
    this.creditCardHolder = creditCardHolder;
    return this;
  }

  /**
   * Get creditCardHolder
   * @return creditCardHolder
  **/
  @ApiModelProperty(value = "")


  public String getCreditCardHolder() {
    return creditCardHolder;
  }

  public void setCreditCardHolder(String creditCardHolder) {
    this.creditCardHolder = creditCardHolder;
  }

  public CreditCard type(String type) {
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

  public CreditCard number(String number) {
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

  public CreditCard expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCard creditCard = (CreditCard) o;
    return Objects.equals(this.creditCardHolder, creditCard.creditCardHolder) &&
        Objects.equals(this.type, creditCard.type) &&
        Objects.equals(this.number, creditCard.number) &&
        Objects.equals(this.expirationDate, creditCard.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditCardHolder, type, number, expirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCard {\n");
    
    sb.append("    creditCardHolder: ").append(toIndentedString(creditCardHolder)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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


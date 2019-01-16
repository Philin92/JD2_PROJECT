package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BankAccount;
import io.swagger.model.CreditCard;
import io.swagger.model.Reference;
import io.swagger.model.ValidFor;
import org.hibernate.annotations.Cascade;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentMean
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-08T11:08:14.094+03:00")
@Entity
public class PaymentMean   {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @JsonProperty("id")
  private Long id = null;

  @Column
  @JsonProperty("href")
  private String href = null;

  @Column
  @JsonProperty("name")
  private String name = null;

  @Embedded
  @JsonProperty("validFor")
  private ValidFor validFor = null;

  @Column
  @JsonProperty("type")
  private String type = null;

  @ManyToOne
  @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
  @JsonProperty("bankAccount")
  private BankAccount bankAccount = null;

  @ManyToOne
  @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
  @JsonProperty("relatedParty")
  private Reference relatedParty = null;

  @ManyToOne
  @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
  @JsonProperty("creditCard")
  private CreditCard creditCard = null;

  public PaymentMean id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PaymentMean href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(value = "")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public PaymentMean name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PaymentMean validFor(ValidFor validFor) {
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

  public PaymentMean type(String type) {
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

  public PaymentMean bankAccount(BankAccount bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

  /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BankAccount getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(BankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  public PaymentMean relatedParty(Reference relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  /**
   * Get relatedParty
   * @return relatedParty
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Reference getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(Reference relatedParty) {
    this.relatedParty = relatedParty;
  }

  public PaymentMean creditCard(CreditCard creditCard) {
    this.creditCard = creditCard;
    return this;
  }

  /**
   * Get creditCard
   * @return creditCard
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CreditCard getCreditCard() {
    return creditCard;
  }

  public void setCreditCard(CreditCard creditCard) {
    this.creditCard = creditCard;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMean paymentMean = (PaymentMean) o;
    return Objects.equals(this.id, paymentMean.id) &&
        Objects.equals(this.href, paymentMean.href) &&
        Objects.equals(this.name, paymentMean.name) &&
        Objects.equals(this.validFor, paymentMean.validFor) &&
        Objects.equals(this.type, paymentMean.type) &&
        Objects.equals(this.bankAccount, paymentMean.bankAccount) &&
        Objects.equals(this.relatedParty, paymentMean.relatedParty) &&
        Objects.equals(this.creditCard, paymentMean.creditCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, validFor, type, bankAccount, relatedParty, creditCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMean {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    creditCard: ").append(toIndentedString(creditCard)).append("\n");
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


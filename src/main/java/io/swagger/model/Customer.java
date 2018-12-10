package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Characteristic;
import io.swagger.model.ContactMedium;
import io.swagger.model.CustomerAccount;
import io.swagger.model.CustomerCreditProfile;
import io.swagger.model.PaymentMean;
import io.swagger.model.Reference;
import io.swagger.model.ValidFor;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Customer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-08T11:08:14.094+03:00")

public class Customer   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("validFor")
  private ValidFor validFor = null;

  @JsonProperty("customerRank")
  private String customerRank = null;

  @JsonProperty("relatedParty")
  private Reference relatedParty = null;

  @JsonProperty("characteristic")
  @Valid
  private List<Characteristic> characteristic = null;

  @JsonProperty("contactMedium")
  @Valid
  private List<ContactMedium> contactMedium = null;

  @JsonProperty("customerAccount")
  @Valid
  private List<CustomerAccount> customerAccount = null;

  @JsonProperty("customerCreditProfile")
  @Valid
  private List<CustomerCreditProfile> customerCreditProfile = null;

  @JsonProperty("paymentMean")
  @Valid
  private List<PaymentMean> paymentMean = null;

  public Customer id(Long id) {
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

  public Customer href(String href) {
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

  public Customer name(String name) {
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

  public Customer status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Customer description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Customer validFor(ValidFor validFor) {
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

  public Customer customerRank(String customerRank) {
    this.customerRank = customerRank;
    return this;
  }

  /**
   * Get customerRank
   * @return customerRank
  **/
  @ApiModelProperty(value = "")


  public String getCustomerRank() {
    return customerRank;
  }

  public void setCustomerRank(String customerRank) {
    this.customerRank = customerRank;
  }

  public Customer relatedParty(Reference relatedParty) {
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

  public Customer characteristic(List<Characteristic> characteristic) {
    this.characteristic = characteristic;
    return this;
  }

  public Customer addCharacteristicItem(Characteristic characteristicItem) {
    if (this.characteristic == null) {
      this.characteristic = new ArrayList<Characteristic>();
    }
    this.characteristic.add(characteristicItem);
    return this;
  }

  /**
   * Get characteristic
   * @return characteristic
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Characteristic> getCharacteristic() {
    return characteristic;
  }

  public void setCharacteristic(List<Characteristic> characteristic) {
    this.characteristic = characteristic;
  }

  public Customer contactMedium(List<ContactMedium> contactMedium) {
    this.contactMedium = contactMedium;
    return this;
  }

  public Customer addContactMediumItem(ContactMedium contactMediumItem) {
    if (this.contactMedium == null) {
      this.contactMedium = new ArrayList<ContactMedium>();
    }
    this.contactMedium.add(contactMediumItem);
    return this;
  }

  /**
   * Get contactMedium
   * @return contactMedium
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ContactMedium> getContactMedium() {
    return contactMedium;
  }

  public void setContactMedium(List<ContactMedium> contactMedium) {
    this.contactMedium = contactMedium;
  }

  public Customer customerAccount(List<CustomerAccount> customerAccount) {
    this.customerAccount = customerAccount;
    return this;
  }

  public Customer addCustomerAccountItem(CustomerAccount customerAccountItem) {
    if (this.customerAccount == null) {
      this.customerAccount = new ArrayList<CustomerAccount>();
    }
    this.customerAccount.add(customerAccountItem);
    return this;
  }

  /**
   * Get customerAccount
   * @return customerAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CustomerAccount> getCustomerAccount() {
    return customerAccount;
  }

  public void setCustomerAccount(List<CustomerAccount> customerAccount) {
    this.customerAccount = customerAccount;
  }

  public Customer customerCreditProfile(List<CustomerCreditProfile> customerCreditProfile) {
    this.customerCreditProfile = customerCreditProfile;
    return this;
  }

  public Customer addCustomerCreditProfileItem(CustomerCreditProfile customerCreditProfileItem) {
    if (this.customerCreditProfile == null) {
      this.customerCreditProfile = new ArrayList<CustomerCreditProfile>();
    }
    this.customerCreditProfile.add(customerCreditProfileItem);
    return this;
  }

  /**
   * Get customerCreditProfile
   * @return customerCreditProfile
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CustomerCreditProfile> getCustomerCreditProfile() {
    return customerCreditProfile;
  }

  public void setCustomerCreditProfile(List<CustomerCreditProfile> customerCreditProfile) {
    this.customerCreditProfile = customerCreditProfile;
  }

  public Customer paymentMean(List<PaymentMean> paymentMean) {
    this.paymentMean = paymentMean;
    return this;
  }

  public Customer addPaymentMeanItem(PaymentMean paymentMeanItem) {
    if (this.paymentMean == null) {
      this.paymentMean = new ArrayList<PaymentMean>();
    }
    this.paymentMean.add(paymentMeanItem);
    return this;
  }

  /**
   * Get paymentMean
   * @return paymentMean
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<PaymentMean> getPaymentMean() {
    return paymentMean;
  }

  public void setPaymentMean(List<PaymentMean> paymentMean) {
    this.paymentMean = paymentMean;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) &&
        Objects.equals(this.href, customer.href) &&
        Objects.equals(this.name, customer.name) &&
        Objects.equals(this.status, customer.status) &&
        Objects.equals(this.description, customer.description) &&
        Objects.equals(this.validFor, customer.validFor) &&
        Objects.equals(this.customerRank, customer.customerRank) &&
        Objects.equals(this.relatedParty, customer.relatedParty) &&
        Objects.equals(this.characteristic, customer.characteristic) &&
        Objects.equals(this.contactMedium, customer.contactMedium) &&
        Objects.equals(this.customerAccount, customer.customerAccount) &&
        Objects.equals(this.customerCreditProfile, customer.customerCreditProfile) &&
        Objects.equals(this.paymentMean, customer.paymentMean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, status, description, validFor, customerRank, relatedParty, characteristic, contactMedium, customerAccount, customerCreditProfile, paymentMean);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    customerRank: ").append(toIndentedString(customerRank)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    characteristic: ").append(toIndentedString(characteristic)).append("\n");
    sb.append("    contactMedium: ").append(toIndentedString(contactMedium)).append("\n");
    sb.append("    customerAccount: ").append(toIndentedString(customerAccount)).append("\n");
    sb.append("    customerCreditProfile: ").append(toIndentedString(customerCreditProfile)).append("\n");
    sb.append("    paymentMean: ").append(toIndentedString(paymentMean)).append("\n");
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


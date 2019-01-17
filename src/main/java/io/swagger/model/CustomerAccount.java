package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;

/**
 * CustomerAccount
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-08T11:08:14.094+03:00")
@Entity
public class CustomerAccount   {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("href")
  @Column
  private String href = null;//9

  @JsonProperty("name")
  @Column
  private String name = null;//11

  @JsonProperty("description")
  @Column
  private String description = null;//8

  @JsonProperty("status")
  @Column
  private String status = null;//15

  @JsonProperty("accountType")
  @Column
  private String accountType = null;//1

  @JsonProperty("creditLimit")
  @Column
  private String creditLimit = null;//3

  @JsonProperty("pin")
  @Column
  private String pin = null;//13

  @JsonProperty("receivableBalance")
  @Column
  private Float receivableBalance = null;//14

  @OneToMany(
          cascade = CascadeType.ALL,
          orphanRemoval = true
  )
  @JoinColumn(name = "customerAccount_id")
  @JsonProperty("customerAccountTaxExemption")
  @Valid
  @LazyCollection(LazyCollectionOption.FALSE)
  private List<CustomerAccountTaxExemption> customerAccountTaxExemption = null;//6

  @OneToMany(
          cascade = CascadeType.ALL,
          orphanRemoval = true
  )
  @JoinColumn(name = "customerAccount_id")
  @JsonProperty("customerAccountRelationship")
  @Valid
  @LazyCollection(LazyCollectionOption.FALSE)
  private List<CustomerAccountRelationship> customerAccountRelationship = null;//5

  @OneToMany(
          cascade = CascadeType.ALL,
          orphanRemoval = true
  )
  @JoinColumn(name = "customerAccount_id")
  @JsonProperty("contact")
  @Valid
  @LazyCollection(LazyCollectionOption.FALSE)
  private List<Contact> contact = null;//2

  @ManyToOne
  @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
  @JsonProperty("customerRef")//7
  private CustomerRef customerRef = null;

  @OneToMany(
          cascade = CascadeType.ALL,
          orphanRemoval = true
  )
  @JoinColumn(name = "customerAccount_id")
  @JsonProperty("customerAccountBalance")
  @LazyCollection(LazyCollectionOption.FALSE)
  private List<CustomerAccountBalance> customerAccountBalance = null;//4

  @OneToMany(
          cascade = CascadeType.ALL,
          orphanRemoval = true
  )
  @JoinColumn(name = "customerAccount_id")
  @JsonProperty("paymentPlan")
  @LazyCollection(LazyCollectionOption.FALSE)
  private List<PaymentPlan> paymentPlan = null;//12

  @Column
  @JsonProperty("lastModified")
  private OffsetDateTime lastModified = null;//10

  public CustomerAccount id(Long id) {
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

  public CustomerAccount href(String href) {
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

  public CustomerAccount name(String name) {
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

  public CustomerAccount description(String description) {
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

  public CustomerAccount status(String status) {
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

  public CustomerAccount accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(value = "")


  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public CustomerAccount creditLimit(String creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

  /**
   * Get creditLimit
   * @return creditLimit
  **/
  @ApiModelProperty(value = "")


  public String getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(String creditLimit) {
    this.creditLimit = creditLimit;
  }

  public CustomerAccount pin(String pin) {
    this.pin = pin;
    return this;
  }

  /**
   * Get pin
   * @return pin
  **/
  @ApiModelProperty(value = "")


  public String getPin() {
    return pin;
  }

  public void setPin(String pin) {
    this.pin = pin;
  }

  public CustomerAccount receivableBalance(Float receivableBalance) {
    this.receivableBalance = receivableBalance;
    return this;
  }

  /**
   * Get receivableBalance
   * @return receivableBalance
  **/
  @ApiModelProperty(value = "")


  public Float getReceivableBalance() {
    return receivableBalance;
  }

  public void setReceivableBalance(Float receivableBalance) {
    this.receivableBalance = receivableBalance;
  }

  public CustomerAccount customerAccountTaxExemption(List<CustomerAccountTaxExemption> customerAccountTaxExemption) {
    this.customerAccountTaxExemption = customerAccountTaxExemption;
    return this;
  }

  public CustomerAccount addCustomerAccountTaxExemptionItem(CustomerAccountTaxExemption customerAccountTaxExemptionItem) {
    if (this.customerAccountTaxExemption == null) {
      this.customerAccountTaxExemption = new ArrayList<CustomerAccountTaxExemption>();
    }
    this.customerAccountTaxExemption.add(customerAccountTaxExemptionItem);
    return this;
  }

  /**
   * Get customerAccountTaxExemption
   * @return customerAccountTaxExemption
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CustomerAccountTaxExemption> getCustomerAccountTaxExemption() {
    return customerAccountTaxExemption;
  }

  public void setCustomerAccountTaxExemption(List<CustomerAccountTaxExemption> customerAccountTaxExemption) {

    if(this.customerAccountTaxExemption==null){
      this.customerAccountTaxExemption = customerAccountTaxExemption;
    }
    else{
      this.customerAccountTaxExemption.clear();
      if(customerAccountTaxExemption!=null) {
        this.customerAccountTaxExemption.addAll(customerAccountTaxExemption);
      }
    }
  }

  public CustomerAccount customerAccountRelationship(List<CustomerAccountRelationship> customerAccountRelationship) {
    this.customerAccountRelationship = customerAccountRelationship;
    return this;
  }

  public CustomerAccount addCustomerAccountRelationshipItem(CustomerAccountRelationship customerAccountRelationshipItem) {
    if (this.customerAccountRelationship == null) {
      this.customerAccountRelationship = new ArrayList<CustomerAccountRelationship>();
    }
    this.customerAccountRelationship.add(customerAccountRelationshipItem);
    return this;
  }

  /**
   * Get customerAccountRelationship
   * @return customerAccountRelationship
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CustomerAccountRelationship> getCustomerAccountRelationship() {
    return customerAccountRelationship;
  }

  public void setCustomerAccountRelationship(List<CustomerAccountRelationship> customerAccountRelationship) {
    if(this.customerAccountRelationship == null) {
      this.customerAccountRelationship = customerAccountRelationship;
    }
    else {
        this.customerAccountRelationship.clear();
      if(customerAccountRelationship!=null) {
        this.customerAccountRelationship.addAll(customerAccountRelationship);
      }
    }
  }

  public CustomerAccount contact(List<Contact> contact) {
    this.contact = contact;
    return this;
  }

  public CustomerAccount addContactItem(Contact contactItem) {
    if (this.contact == null) {
      this.contact = new ArrayList<Contact>();
    }
    this.contact.add(contactItem);
    return this;
  }

  /**
   * Get contact
   * @return contact
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Contact> getContact() {
    return contact;
  }

  public void setContact(List<Contact> contact) {
    if(this.contact==null) {
      this.contact = contact;
    }
    else {
        this.contact.clear();
      if(contact!=null){
        this.contact.addAll(contact);
      }
    }
  }

  public CustomerAccount customer(CustomerRef customer) {
    this.customerRef = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CustomerRef getCustomerRef() {
    return customerRef;
  }

  public void setCustomerRef(CustomerRef customer) {
    this.customerRef = customer;
  }

  public CustomerAccount customerAccountBalance(List<CustomerAccountBalance> customerAccountBalance) {
    this.customerAccountBalance = customerAccountBalance;
    return this;
  }

  public CustomerAccount addCustomerAccountBalanceItem(CustomerAccountBalance customerAccountBalanceItem) {
    if (this.customerAccountBalance == null) {
      this.customerAccountBalance = new ArrayList<CustomerAccountBalance>();
    }
    this.customerAccountBalance.add(customerAccountBalanceItem);
    return this;
  }

  /**
   * Get customerAccountBalance
   * @return customerAccountBalance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CustomerAccountBalance> getCustomerAccountBalance() {
    return customerAccountBalance;
  }

  public void setCustomerAccountBalance(List<CustomerAccountBalance> customerAccountBalance) {
    if(this.customerAccountBalance==null) {
      this.customerAccountBalance = customerAccountBalance;
    }
    else {
        this.customerAccountBalance.clear();
      if(customerAccountBalance!=null) {
        this.customerAccountBalance.addAll(customerAccountBalance);
      }
    }
  }

  public CustomerAccount paymentPlan(List<PaymentPlan> paymentPlan) {
    this.paymentPlan = paymentPlan;
    return this;
  }

  public CustomerAccount addPaymentPlanItem(PaymentPlan paymentPlanItem) {
    if (this.paymentPlan == null) {
      this.paymentPlan = new ArrayList<PaymentPlan>();
    }
    this.paymentPlan.add(paymentPlanItem);
    return this;
  }

  /**
   * Get paymentPlan
   * @return paymentPlan
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<PaymentPlan> getPaymentPlan() {
    return paymentPlan;
  }

  public void setPaymentPlan(List<PaymentPlan> paymentPlan) {
    if(this.paymentPlan==null) {
      this.paymentPlan = paymentPlan;
    }
    else {
        this.paymentPlan.clear();
      if(paymentPlan!=null) {
        this.paymentPlan.addAll(paymentPlan);
      }
    }
  }

  public CustomerAccount lastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified
   * @return lastModified
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getLastModified() {
    return lastModified;
  }

  public void setLastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerAccount customerAccount = (CustomerAccount) o;
    return Objects.equals(this.id, customerAccount.id) &&
        Objects.equals(this.href, customerAccount.href) &&
        Objects.equals(this.name, customerAccount.name) &&
        Objects.equals(this.description, customerAccount.description) &&
        Objects.equals(this.status, customerAccount.status) &&
        Objects.equals(this.accountType, customerAccount.accountType) &&
        Objects.equals(this.creditLimit, customerAccount.creditLimit) &&
        Objects.equals(this.pin, customerAccount.pin) &&
        Objects.equals(this.receivableBalance, customerAccount.receivableBalance) &&
        Objects.equals(this.customerAccountTaxExemption, customerAccount.customerAccountTaxExemption) &&
        Objects.equals(this.customerAccountRelationship, customerAccount.customerAccountRelationship) &&
        Objects.equals(this.contact, customerAccount.contact) &&
        Objects.equals(this.customerRef, customerAccount.customerRef) &&
        Objects.equals(this.customerAccountBalance, customerAccount.customerAccountBalance) &&
        Objects.equals(this.paymentPlan, customerAccount.paymentPlan) &&
        Objects.equals(this.lastModified, customerAccount.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, description, status, accountType, creditLimit, pin, receivableBalance, customerAccountTaxExemption, customerAccountRelationship, contact, customerRef, customerAccountBalance, paymentPlan, lastModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    receivableBalance: ").append(toIndentedString(receivableBalance)).append("\n");
    sb.append("    customerAccountTaxExemption: ").append(toIndentedString(customerAccountTaxExemption)).append("\n");
    sb.append("    customerAccountRelationship: ").append(toIndentedString(customerAccountRelationship)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customerRef)).append("\n");
    sb.append("    customerAccountBalance: ").append(toIndentedString(customerAccountBalance)).append("\n");
    sb.append("    paymentPlan: ").append(toIndentedString(paymentPlan)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomerAccountRef;
import io.swagger.model.ValidFor;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerAccountRelationship
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-08T11:08:14.094+03:00")
@Entity
public class CustomerAccountRelationship extends BasePojo {

  @Column
  @JsonProperty("relationshipType")
  private String relationshipType = null;

  @Embedded
  @JsonProperty("validFor")
  private ValidFor validFor = null;

  @OneToMany(
          cascade = CascadeType.ALL,
          orphanRemoval = true
  )
  @JoinColumn(name = "customerAccountRelationship_id")
  @JsonProperty("customerAccount")
  @Valid
  private List<CustomerAccountRef> customerAccount = null;

  public CustomerAccountRelationship relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * Get relationshipType
   * @return relationshipType
  **/
  @ApiModelProperty(value = "")


  public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public CustomerAccountRelationship validFor(ValidFor validFor) {
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

  public CustomerAccountRelationship customerAccount(List<CustomerAccountRef> customerAccount) {
    this.customerAccount = customerAccount;
    return this;
  }

  public CustomerAccountRelationship addCustomerAccountItem(CustomerAccountRef customerAccountItem) {
    if (this.customerAccount == null) {
      this.customerAccount = new ArrayList<CustomerAccountRef>();
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

  public List<CustomerAccountRef> getCustomerAccount() {
    return customerAccount;
  }

  public void setCustomerAccount(List<CustomerAccountRef> customerAccount) {
    this.customerAccount = customerAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerAccountRelationship customerAccountRelationship = (CustomerAccountRelationship) o;
    return Objects.equals(this.relationshipType, customerAccountRelationship.relationshipType) &&
        Objects.equals(this.validFor, customerAccountRelationship.validFor) &&
        Objects.equals(this.customerAccount, customerAccountRelationship.customerAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationshipType, validFor, customerAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAccountRelationship {\n");
    
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    customerAccount: ").append(toIndentedString(customerAccount)).append("\n");
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


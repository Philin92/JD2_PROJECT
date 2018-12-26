package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ContactMedium;
import io.swagger.model.Reference;
import io.swagger.model.ValidFor;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contact
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-08T11:08:14.094+03:00")
@Entity
public class Contact   {
  @Column
  @JsonProperty("contactType")
  private String contactType = null;

  @Embedded
  @JsonProperty("validFor")
  private ValidFor validFor = null;

  @Id
  @JsonProperty("contactName")
  private String contactName = null;

  @Column
  @JsonProperty("partyRoleType")
  private String partyRoleType = null;

  @OneToMany(
          cascade = CascadeType.ALL,
          orphanRemoval = true
  )
  @JoinColumn(name = "contakt_name")
  @JsonProperty("contactMedium")
  @Valid
  private List<ContactMedium> contactMedium = null;

  @ManyToOne(cascade = CascadeType.ALL)
  @JsonProperty("relatedParty")
  private Reference relatedParty = null;

  public Contact contactType(String contactType) {
    this.contactType = contactType;
    return this;
  }

  /**
   * Get contactType
   * @return contactType
  **/
  @ApiModelProperty(value = "")


  public String getContactType() {
    return contactType;
  }

  public void setContactType(String contactType) {
    this.contactType = contactType;
  }

  public Contact validFor(ValidFor validFor) {
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

  public Contact contactName(String contactName) {
    this.contactName = contactName;
    return this;
  }

  /**
   * Get contactName
   * @return contactName
  **/
  @ApiModelProperty(value = "")


  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public Contact partyRoleType(String partyRoleType) {
    this.partyRoleType = partyRoleType;
    return this;
  }

  /**
   * Get partyRoleType
   * @return partyRoleType
  **/
  @ApiModelProperty(value = "")


  public String getPartyRoleType() {
    return partyRoleType;
  }

  public void setPartyRoleType(String partyRoleType) {
    this.partyRoleType = partyRoleType;
  }

  public Contact contactMedium(List<ContactMedium> contactMedium) {
    this.contactMedium = contactMedium;
    return this;
  }

  public Contact addContactMediumItem(ContactMedium contactMediumItem) {
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

  public Contact relatedParty(Reference relatedParty) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.contactType, contact.contactType) &&
        Objects.equals(this.validFor, contact.validFor) &&
        Objects.equals(this.contactName, contact.contactName) &&
        Objects.equals(this.partyRoleType, contact.partyRoleType) &&
        Objects.equals(this.contactMedium, contact.contactMedium) &&
        Objects.equals(this.relatedParty, contact.relatedParty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactType, validFor, contactName, partyRoleType, contactMedium, relatedParty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    partyRoleType: ").append(toIndentedString(partyRoleType)).append("\n");
    sb.append("    contactMedium: ").append(toIndentedString(contactMedium)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
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


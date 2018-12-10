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
 * BankAccount
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-08T11:08:14.094+03:00")

public class BankAccount   {
  @JsonProperty("bIC")
  private String bIC = null;

  @JsonProperty("domiciliation")
  private String domiciliation = null;

  @JsonProperty("iBAN")
  private String iBAN = null;

  @JsonProperty("accountHolder")
  private String accountHolder = null;

  public BankAccount bIC(String bIC) {
    this.bIC = bIC;
    return this;
  }

  /**
   * Get bIC
   * @return bIC
  **/
  @ApiModelProperty(value = "")


  public String getBIC() {
    return bIC;
  }

  public void setBIC(String bIC) {
    this.bIC = bIC;
  }

  public BankAccount domiciliation(String domiciliation) {
    this.domiciliation = domiciliation;
    return this;
  }

  /**
   * Get domiciliation
   * @return domiciliation
  **/
  @ApiModelProperty(value = "")


  public String getDomiciliation() {
    return domiciliation;
  }

  public void setDomiciliation(String domiciliation) {
    this.domiciliation = domiciliation;
  }

  public BankAccount iBAN(String iBAN) {
    this.iBAN = iBAN;
    return this;
  }

  /**
   * Get iBAN
   * @return iBAN
  **/
  @ApiModelProperty(value = "")


  public String getIBAN() {
    return iBAN;
  }

  public void setIBAN(String iBAN) {
    this.iBAN = iBAN;
  }

  public BankAccount accountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
    return this;
  }

  /**
   * Get accountHolder
   * @return accountHolder
  **/
  @ApiModelProperty(value = "")


  public String getAccountHolder() {
    return accountHolder;
  }

  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccount bankAccount = (BankAccount) o;
    return Objects.equals(this.bIC, bankAccount.bIC) &&
        Objects.equals(this.domiciliation, bankAccount.domiciliation) &&
        Objects.equals(this.iBAN, bankAccount.iBAN) &&
        Objects.equals(this.accountHolder, bankAccount.accountHolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bIC, domiciliation, iBAN, accountHolder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccount {\n");
    
    sb.append("    bIC: ").append(toIndentedString(bIC)).append("\n");
    sb.append("    domiciliation: ").append(toIndentedString(domiciliation)).append("\n");
    sb.append("    iBAN: ").append(toIndentedString(iBAN)).append("\n");
    sb.append("    accountHolder: ").append(toIndentedString(accountHolder)).append("\n");
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


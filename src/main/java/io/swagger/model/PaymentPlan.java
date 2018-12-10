package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PaymentMeanRef;
import io.swagger.model.ValidFor;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentPlan
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-08T11:08:14.094+03:00")

public class PaymentPlan   {
  @JsonProperty("status")
  private String status = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("priority")
  private String priority = null;

  @JsonProperty("amount")
  private Float amount = null;

  @JsonProperty("paymentFrequency")
  private String paymentFrequency = null;

  @JsonProperty("numberOfPayments")
  private String numberOfPayments = null;

  @JsonProperty("validFor")
  private ValidFor validFor = null;

  @JsonProperty("paymentMean")
  private PaymentMeanRef paymentMean = null;

  public PaymentPlan status(String status) {
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

  public PaymentPlan type(String type) {
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

  public PaymentPlan priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")


  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public PaymentPlan amount(Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")


  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public PaymentPlan paymentFrequency(String paymentFrequency) {
    this.paymentFrequency = paymentFrequency;
    return this;
  }

  /**
   * Get paymentFrequency
   * @return paymentFrequency
  **/
  @ApiModelProperty(value = "")


  public String getPaymentFrequency() {
    return paymentFrequency;
  }

  public void setPaymentFrequency(String paymentFrequency) {
    this.paymentFrequency = paymentFrequency;
  }

  public PaymentPlan numberOfPayments(String numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
    return this;
  }

  /**
   * Get numberOfPayments
   * @return numberOfPayments
  **/
  @ApiModelProperty(value = "")


  public String getNumberOfPayments() {
    return numberOfPayments;
  }

  public void setNumberOfPayments(String numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
  }

  public PaymentPlan validFor(ValidFor validFor) {
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

  public PaymentPlan paymentMean(PaymentMeanRef paymentMean) {
    this.paymentMean = paymentMean;
    return this;
  }

  /**
   * Get paymentMean
   * @return paymentMean
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentMeanRef getPaymentMean() {
    return paymentMean;
  }

  public void setPaymentMean(PaymentMeanRef paymentMean) {
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
    PaymentPlan paymentPlan = (PaymentPlan) o;
    return Objects.equals(this.status, paymentPlan.status) &&
        Objects.equals(this.type, paymentPlan.type) &&
        Objects.equals(this.priority, paymentPlan.priority) &&
        Objects.equals(this.amount, paymentPlan.amount) &&
        Objects.equals(this.paymentFrequency, paymentPlan.paymentFrequency) &&
        Objects.equals(this.numberOfPayments, paymentPlan.numberOfPayments) &&
        Objects.equals(this.validFor, paymentPlan.validFor) &&
        Objects.equals(this.paymentMean, paymentPlan.paymentMean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, type, priority, amount, paymentFrequency, numberOfPayments, validFor, paymentMean);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentPlan {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    paymentFrequency: ").append(toIndentedString(paymentFrequency)).append("\n");
    sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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


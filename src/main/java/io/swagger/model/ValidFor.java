package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ValidFor
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-08T11:08:14.094+03:00")
//TODO: по поводу Embedeble
@Embeddable
public class ValidFor   {
  @Column
  @JsonProperty("startDateTime")
  private OffsetDateTime startDateTime = null;

  @Column
  @JsonProperty("endDateTime")
  private OffsetDateTime endDateTime = null;

  public ValidFor startDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  /**
   * Get startDateTime
   * @return startDateTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }

  public ValidFor endDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * Get endDateTime
   * @return endDateTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidFor validFor = (ValidFor) o;
    return Objects.equals(this.startDateTime, validFor.startDateTime) &&
        Objects.equals(this.endDateTime, validFor.endDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDateTime, endDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidFor {\n");
    
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
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


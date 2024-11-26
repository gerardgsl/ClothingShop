package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PriceResponse
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-11-26T20:47:02.199113588Z[GMT]")


public class PriceResponse   {
  @JsonProperty("productId")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer productId = null;

  @JsonProperty("brandId")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer brandId = null;

  @JsonProperty("priceList")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer priceList = null;

  @JsonProperty("startDate")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private OffsetDateTime startDate = null;

  @JsonProperty("endDate")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private OffsetDateTime endDate = null;

  @JsonProperty("price")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Double price = null;

  @JsonProperty("currency")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String currency = null;


  public PriceResponse productId(Integer productId) { 

    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
   **/
  
  @Schema(description = "")
  
  public Integer getProductId() {  
    return productId;
  }



  public void setProductId(Integer productId) { 
    this.productId = productId;
  }

  public PriceResponse brandId(Integer brandId) { 

    this.brandId = brandId;
    return this;
  }

  /**
   * Get brandId
   * @return brandId
   **/
  
  @Schema(description = "")
  
  public Integer getBrandId() {  
    return brandId;
  }



  public void setBrandId(Integer brandId) { 
    this.brandId = brandId;
  }

  public PriceResponse priceList(Integer priceList) { 

    this.priceList = priceList;
    return this;
  }

  /**
   * Get priceList
   * @return priceList
   **/
  
  @Schema(description = "")
  
  public Integer getPriceList() {  
    return priceList;
  }



  public void setPriceList(Integer priceList) { 
    this.priceList = priceList;
  }

  public PriceResponse startDate(OffsetDateTime startDate) { 

    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   **/
  
  @Schema(description = "")
  
@Valid
  public OffsetDateTime getStartDate() {  
    return startDate;
  }



  public void setStartDate(OffsetDateTime startDate) { 
    this.startDate = startDate;
  }

  public PriceResponse endDate(OffsetDateTime endDate) { 

    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   **/
  
  @Schema(description = "")
  
@Valid
  public OffsetDateTime getEndDate() {  
    return endDate;
  }



  public void setEndDate(OffsetDateTime endDate) { 
    this.endDate = endDate;
  }

  public PriceResponse price(Double price) { 

    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   **/
  
  @Schema(description = "")
  
  public Double getPrice() {  
    return price;
  }



  public void setPrice(Double price) { 
    this.price = price;
  }

  public PriceResponse currency(String currency) { 

    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   **/
  
  @Schema(description = "")
  
  public String getCurrency() {  
    return currency;
  }



  public void setCurrency(String currency) { 
    this.currency = currency;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceResponse priceResponse = (PriceResponse) o;
    return Objects.equals(this.productId, priceResponse.productId) &&
        Objects.equals(this.brandId, priceResponse.brandId) &&
        Objects.equals(this.priceList, priceResponse.priceList) &&
        Objects.equals(this.startDate, priceResponse.startDate) &&
        Objects.equals(this.endDate, priceResponse.endDate) &&
        Objects.equals(this.price, priceResponse.price) &&
        Objects.equals(this.currency, priceResponse.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, brandId, priceList, startDate, endDate, price, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceResponse {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    priceList: ").append(toIndentedString(priceList)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

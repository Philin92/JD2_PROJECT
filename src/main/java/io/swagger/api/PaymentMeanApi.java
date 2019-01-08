/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.1-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.PaymentMean;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-08T11:08:14.094+03:00")

@Api(value = "paymentMean", description = "the paymentMean API")
public interface PaymentMeanApi {

    @ApiOperation(value = "paymentMeanCreate", nickname = "paymentMeanCreate", notes = "", response = PaymentMean.class, tags={ "paymentMean", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "PaymentMean", response = PaymentMean.class) })
    @RequestMapping(value = "/paymentMean",
        produces = { "application/json" }, 
        //consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PaymentMean> paymentMeanCreate(@ApiParam(value = "" ,required=true )  @Valid @RequestBody PaymentMean paymentMean);


    @ApiOperation(value = "paymentMeanDelete", nickname = "paymentMeanDelete", notes = "", tags={ "paymentMean", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Success") })
    @RequestMapping(value = "/paymentMean/{paymentMeanId}",
        produces = { "application/json" }, 
        //consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> paymentMeanDelete(@ApiParam(value = "",required=true) @PathVariable("paymentMeanId") String paymentMeanId);


    @ApiOperation(value = "paymentMeanFind", nickname = "paymentMeanFind", notes = "", response = PaymentMean.class, responseContainer = "List", tags={ "paymentMean", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of PaymentMean", response = PaymentMean.class, responseContainer = "List") })
    @RequestMapping(value = "/paymentMean",
        produces = { "application/json" }, 
        //consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<PaymentMean>> paymentMeanFind(@ApiParam(value = "") @Valid @RequestParam(value = "fields", required = false) String fields);


    @ApiOperation(value = "paymentMeanGet", nickname = "paymentMeanGet", notes = "", response = PaymentMean.class, tags={ "paymentMean", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "PaymentMean", response = PaymentMean.class) })
    @RequestMapping(value = "/paymentMean/{paymentMeanId}",
        produces = { "application/json" }, 
        //consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<PaymentMean> paymentMeanGet(@ApiParam(value = "",required=true) @PathVariable("paymentMeanId") String paymentMeanId,@ApiParam(value = "") @Valid @RequestParam(value = "fields", required = false) String fields);


    @ApiOperation(value = "paymentMeanPatch", nickname = "paymentMeanPatch", notes = "", response = PaymentMean.class, tags={ "paymentMean", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success PaymentMean", response = PaymentMean.class) })
    @RequestMapping(value = "/paymentMean/{paymentMeanId}",
        produces = { "application/json" }, 
        //consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<PaymentMean> paymentMeanPatch(@ApiParam(value = "",required=true) @PathVariable("paymentMeanId") String paymentMeanId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody PaymentMean paymentMean);


    @ApiOperation(value = "paymentMeanUpdate", nickname = "paymentMeanUpdate", notes = "", response = PaymentMean.class, tags={ "paymentMean", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Success PaymentMean", response = PaymentMean.class) })
    @RequestMapping(value = "/paymentMean/{paymentMeanId}",
        produces = { "application/json" }, 
        //consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<PaymentMean> paymentMeanUpdate(@ApiParam(value = "",required=true) @PathVariable("paymentMeanId") String paymentMeanId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody PaymentMean paymentMean);

}

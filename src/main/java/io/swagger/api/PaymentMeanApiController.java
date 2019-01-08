package io.swagger.api;

import io.swagger.model.BankAccount;
import io.swagger.model.PaymentMean;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.services.interfaces.PaymentMeanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-08T11:08:14.094+03:00")

@Controller
public class PaymentMeanApiController implements PaymentMeanApi {

    private static final Logger log = LoggerFactory.getLogger(PaymentMeanApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private PaymentMeanService paymentMeanService;

    @org.springframework.beans.factory.annotation.Autowired
    public PaymentMeanApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    private PaymentMean paymentMeanInst(String prefix){
        PaymentMean paymentMean = new PaymentMean();

        paymentMean.setName("payment mean name: "+prefix);
        paymentMean.setHref("payment mean href: "+prefix);
        paymentMean.setType("payment mean type: "+prefix);

        BankAccount bankAccount = new BankAccount();

        bankAccount.setBIC("bank account BIC: "+prefix);
        bankAccount.setIBAN("bank account IBAN: "+prefix);
        bankAccount.setDomiciliation("bank domiciliation: "+prefix);

        paymentMean.setBankAccount(bankAccount);

        return paymentMean;
    }

    public ResponseEntity<PaymentMean> paymentMeanCreate(@ApiParam(value = "" ,required=true )  @Valid @RequestBody PaymentMean paymentMean) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                //return new ResponseEntity<PaymentMean>(objectMapper.readValue("{  \"bankAccount\" : {    \"accountHolder\" : \"accountHolder\",    \"iBAN\" : \"iBAN\",    \"domiciliation\" : \"domiciliation\",    \"bIC\" : \"bIC\"  },  \"validFor\" : {    \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",    \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"  },  \"name\" : \"name\",  \"id\" : 2,  \"href\" : \"href\",  \"type\" : \"type\",  \"relatedParty\" : {    \"role\" : \"role\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"creditCard\" : {    \"number\" : \"number\",    \"creditCardHolder\" : \"creditCardHolder\",    \"type\" : \"type\",    \"expirationDate\" : \"2000-01-23T04:56:07.000+00:00\"  }}", PaymentMean.class), HttpStatus.NOT_IMPLEMENTED);
                paymentMeanService.create(List.of(
                        paymentMeanInst("1"),
                        paymentMeanInst("2"),
                        paymentMeanInst("3"),
                        paymentMeanInst("4"),
                        paymentMeanInst("5")
                ));

                return new ResponseEntity<PaymentMean>(HttpStatus.OK);

            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentMean>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentMean>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> paymentMeanDelete(@ApiParam(value = "",required=true) @PathVariable("paymentMeanId") String paymentMeanId) {
        String accept = request.getHeader("Accept");
        try {
            Long id = Long.valueOf(paymentMeanId);
            paymentMeanService.deleteById(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<PaymentMean>> paymentMeanFind(@ApiParam(value = "") @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                //return new ResponseEntity<List<PaymentMean>>(objectMapper.readValue("[ {  \"bankAccount\" : {    \"accountHolder\" : \"accountHolder\",    \"iBAN\" : \"iBAN\",    \"domiciliation\" : \"domiciliation\",    \"bIC\" : \"bIC\"  },  \"validFor\" : {    \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",    \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"  },  \"name\" : \"name\",  \"id\" : 2,  \"href\" : \"href\",  \"type\" : \"type\",  \"relatedParty\" : {    \"role\" : \"role\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"creditCard\" : {    \"number\" : \"number\",    \"creditCardHolder\" : \"creditCardHolder\",    \"type\" : \"type\",    \"expirationDate\" : \"2000-01-23T04:56:07.000+00:00\"  }}, {  \"bankAccount\" : {    \"accountHolder\" : \"accountHolder\",    \"iBAN\" : \"iBAN\",    \"domiciliation\" : \"domiciliation\",    \"bIC\" : \"bIC\"  },  \"validFor\" : {    \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",    \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"  },  \"name\" : \"name\",  \"id\" : 2,  \"href\" : \"href\",  \"type\" : \"type\",  \"relatedParty\" : {    \"role\" : \"role\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"creditCard\" : {    \"number\" : \"number\",    \"creditCardHolder\" : \"creditCardHolder\",    \"type\" : \"type\",    \"expirationDate\" : \"2000-01-23T04:56:07.000+00:00\"  }} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                return new ResponseEntity<List<PaymentMean>>(
                        paymentMeanService.findList(),HttpStatus.OK
                );
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<PaymentMean>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<PaymentMean>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentMean> paymentMeanGet(@ApiParam(value = "",required=true) @PathVariable("paymentMeanId") String paymentMeanId,@ApiParam(value = "") @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                //return new ResponseEntity<PaymentMean>(objectMapper.readValue("{  \"bankAccount\" : {    \"accountHolder\" : \"accountHolder\",    \"iBAN\" : \"iBAN\",    \"domiciliation\" : \"domiciliation\",    \"bIC\" : \"bIC\"  },  \"validFor\" : {    \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",    \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"  },  \"name\" : \"name\",  \"id\" : 2,  \"href\" : \"href\",  \"type\" : \"type\",  \"relatedParty\" : {    \"role\" : \"role\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"creditCard\" : {    \"number\" : \"number\",    \"creditCardHolder\" : \"creditCardHolder\",    \"type\" : \"type\",    \"expirationDate\" : \"2000-01-23T04:56:07.000+00:00\"  }}", PaymentMean.class), HttpStatus.NOT_IMPLEMENTED);
                Long id = Long.valueOf(paymentMeanId);
                return new ResponseEntity<PaymentMean>(
                        paymentMeanService.getById(id),HttpStatus.OK
                );
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentMean>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentMean>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentMean> paymentMeanPatch(@ApiParam(value = "",required=true) @PathVariable("paymentMeanId") String paymentMeanId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody PaymentMean paymentMean) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentMean>(objectMapper.readValue("{  \"bankAccount\" : {    \"accountHolder\" : \"accountHolder\",    \"iBAN\" : \"iBAN\",    \"domiciliation\" : \"domiciliation\",    \"bIC\" : \"bIC\"  },  \"validFor\" : {    \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",    \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"  },  \"name\" : \"name\",  \"id\" : 2,  \"href\" : \"href\",  \"type\" : \"type\",  \"relatedParty\" : {    \"role\" : \"role\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"creditCard\" : {    \"number\" : \"number\",    \"creditCardHolder\" : \"creditCardHolder\",    \"type\" : \"type\",    \"expirationDate\" : \"2000-01-23T04:56:07.000+00:00\"  }}", PaymentMean.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentMean>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentMean>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentMean> paymentMeanUpdate(@ApiParam(value = "",required=true) @PathVariable("paymentMeanId") String paymentMeanId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody PaymentMean paymentMean) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                //return new ResponseEntity<PaymentMean>(objectMapper.readValue("{  \"bankAccount\" : {    \"accountHolder\" : \"accountHolder\",    \"iBAN\" : \"iBAN\",    \"domiciliation\" : \"domiciliation\",    \"bIC\" : \"bIC\"  },  \"validFor\" : {    \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",    \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"  },  \"name\" : \"name\",  \"id\" : 2,  \"href\" : \"href\",  \"type\" : \"type\",  \"relatedParty\" : {    \"role\" : \"role\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"creditCard\" : {    \"number\" : \"number\",    \"creditCardHolder\" : \"creditCardHolder\",    \"type\" : \"type\",    \"expirationDate\" : \"2000-01-23T04:56:07.000+00:00\"  }}", PaymentMean.class), HttpStatus.NOT_IMPLEMENTED);
                Long id = Long.valueOf(paymentMeanId);
                PaymentMean update = paymentMeanInst("update");
                update.setId(id);
                return new ResponseEntity<PaymentMean>(
                        paymentMeanService.update(id,update),HttpStatus.OK
                );
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentMean>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentMean>(HttpStatus.NOT_IMPLEMENTED);
    }

}

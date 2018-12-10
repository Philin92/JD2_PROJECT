package io.swagger.api;

import io.swagger.model.Hub;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class HubApiController implements HubApi {

    private static final Logger log = LoggerFactory.getLogger(HubApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public HubApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Hub> hubCreate(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Hub hub) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Hub>(objectMapper.readValue("{  \"query\" : \"query\",  \"callback\" : \"callback\",  \"id\" : \"id\"}", Hub.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Hub>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Hub>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> hubDelete(@ApiParam(value = "",required=true) @PathVariable("hubId") String hubId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Hub>> hubFind() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Hub>>(objectMapper.readValue("[ {  \"query\" : \"query\",  \"callback\" : \"callback\",  \"id\" : \"id\"}, {  \"query\" : \"query\",  \"callback\" : \"callback\",  \"id\" : \"id\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Hub>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Hub>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Hub> hubGet(@ApiParam(value = "",required=true) @PathVariable("hubId") String hubId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Hub>(objectMapper.readValue("{  \"query\" : \"query\",  \"callback\" : \"callback\",  \"id\" : \"id\"}", Hub.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Hub>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Hub>(HttpStatus.NOT_IMPLEMENTED);
    }

}

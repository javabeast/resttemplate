package com.example.resttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
public class ApiWebService {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/template/apiClient", method = RequestMethod.GET)
    public ResponseEntity getApiClientList() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        String awsUrl = "";
        String onpremUrl = "";
        String fspUrl = "";
        return restTemplate.exchange(fspUrl, HttpMethod.GET, entity, String.class);
    }
}

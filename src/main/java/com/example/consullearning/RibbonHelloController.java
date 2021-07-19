package com.example.consullearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonHelloController {

    @Autowired
    private RestTemplate restTemplate;
    private String serviceName = "MyProducer";

    @RequestMapping("health")
    public String hello() {
        String callServiceResult = restTemplate.getForObject("http://"+serviceName+"/health", String.class);
        return callServiceResult;
    }
}
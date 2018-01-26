package com.wh.service.impl;

import com.netflix.discovery.converters.Auto;
import com.wh.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String hello() {
        return restTemplate.getForObject("http://SERVICE-HI/index",String.class);
    }
}

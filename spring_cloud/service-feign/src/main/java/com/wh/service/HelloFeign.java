package com.wh.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service-hi")
public interface HelloFeign {

    @RequestMapping("/index")
    String sayHi();
}

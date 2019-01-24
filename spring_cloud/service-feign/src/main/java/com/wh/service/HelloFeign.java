package com.wh.service;

import com.wh.fallback.HelloFeignFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "service-hi", fallback = HelloFeignFallBack.class)
public interface HelloFeign {

  @RequestMapping("/index")
  String sayHi();
}

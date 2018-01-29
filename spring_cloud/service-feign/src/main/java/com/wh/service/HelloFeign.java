package com.wh.service;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("service-hi")
public interface HelloFeign {

}

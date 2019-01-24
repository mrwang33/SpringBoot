package com.wh.controller;

import com.netflix.discovery.converters.Auto;
import com.wh.service.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

  @Autowired
  private HelloFeign helloFeign;

  @RequestMapping(value = "/sayHi", method = RequestMethod.GET)
  public String sayHi() {
    return helloFeign.sayHi();
  }
}

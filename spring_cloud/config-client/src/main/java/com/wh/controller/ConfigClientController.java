package com.wh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {

  @Value("${foo}")
  private String version;

  @RequestMapping("/hi")
  public String getConfig() {
    return version;
  }
}

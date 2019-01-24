package com.wh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wh on 17-6-29.
 */
@RestController
public class MyController {

  @RequestMapping("/index")
  public Object 你好啊() {
    return "hello world";
  }
}

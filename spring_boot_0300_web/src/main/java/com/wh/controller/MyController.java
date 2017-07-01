package com.wh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wh on 17-7-1.
 */
@Controller
public class MyController {

    @RequestMapping("/")
    public String index() {
        System.out.printf("nihoua");
        return "index";
    }
}

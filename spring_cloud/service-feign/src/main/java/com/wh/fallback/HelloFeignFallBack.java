package com.wh.fallback;

import com.wh.service.HelloFeign;
import org.springframework.stereotype.Component;

@Component
public class HelloFeignFallBack implements HelloFeign {
    @Override
    public String sayHi() {
        return "oh no, server is down!";
    }
}

package com.wh.feign;

import com.wh.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "springcloud-dao")
public interface UserFeign {

    @RequestMapping("/index")
    List<User> getAllUser();

    @RequestMapping("/save")
    int saveUser(@RequestBody User user);
}

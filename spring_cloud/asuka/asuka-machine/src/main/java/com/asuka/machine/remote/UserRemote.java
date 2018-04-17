package com.asuka.machine.remote;

import com.asuka.common.RestResponse;
import com.asuka.user.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("asuka-user")
public interface UserRemote {

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    RestResponse save(User user);
}

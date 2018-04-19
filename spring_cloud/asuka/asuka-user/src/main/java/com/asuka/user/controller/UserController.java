package com.asuka.user.controller;

import com.asuka.common.RestCode;
import com.asuka.common.RestResponse;
import com.asuka.user.entity.User;
import com.asuka.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public RestResponse<User> login(@RequestBody User user) {
        User login = userService.login(user);
        if (login == null) {
            return RestResponse.error(RestCode.USER_NOT_FOUND);
        }
        return RestResponse.success(login);
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public RestResponse save(@RequestBody User user) {
        int save = userService.save(user);
        return save > 0 ? RestResponse.success() : RestResponse.error(RestCode.ILLEGAL_PARAMS);
    }
}

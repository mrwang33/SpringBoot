package com.asuka.user.controller;

import com.asuka.user.common.RestCode;
import com.asuka.user.common.RestResponse;
import com.asuka.user.entity.User;
import com.asuka.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}

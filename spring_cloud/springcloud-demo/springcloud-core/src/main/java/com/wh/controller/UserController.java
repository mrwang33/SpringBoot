package com.wh.controller;

import com.wh.entity.User;
import com.wh.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserFeign userFeign;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<User> getAllUser() {
        return userFeign.getAllUser();
    }
}

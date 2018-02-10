package com.wh.controller;

import com.wh.entity.User;
import com.wh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public List<User> getAll() {
        return userService.getAll();
    }

    @RequestMapping("/save")
    public int save(@RequestBody User user) {
        return userService.saveUser(user);
    }
}

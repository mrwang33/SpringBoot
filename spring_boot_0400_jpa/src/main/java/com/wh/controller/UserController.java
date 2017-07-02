package com.wh.controller;

import com.wh.entity.User;
import com.wh.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by wh on 17-7-2.
 */
@RestController
public class UserController {
    @Resource
    private UserRepository userRepository;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public Object getAll() {
        return userRepository.findAll();
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public Object addUser(User user) {
        return userRepository.save(user);
    }
}

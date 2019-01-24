package com.wh.controller;

import com.wh.entity.User;
import com.wh.repository.UserRepository;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wh on 17-7-2.
 */
@RestController
@RequestMapping("/user")
public class UserController {

  @Resource
  private UserRepository userRepository;

  @GetMapping
  public Object getAll() {
    return userRepository.findAll();
  }

  @PostMapping
  public Object addUser(@RequestBody User user) {
    User save = userRepository.save(user);
    return 1;
  }
}

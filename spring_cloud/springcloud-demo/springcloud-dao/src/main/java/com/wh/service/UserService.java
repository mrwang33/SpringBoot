package com.wh.service;

import com.wh.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    int saveUser(User user);
}

package com.wh.service.impl;

import com.wh.entity.User;
import com.wh.mapper.UserMapper;
import com.wh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }
}

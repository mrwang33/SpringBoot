package com.asuka.user.service.impl;

import com.asuka.user.entity.User;
import com.asuka.user.mapper.UserMapper;
import com.asuka.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getById(Serializable id) {
        return null;
    }

    @Override
    public int save(User user) {
        return 0;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public int delete(Serializable id) {
        return 0;
    }

    @Override
    public User login(User user) {
        List<User> byUsernameAndPassword = userMapper.getByUsernameAndPassword(user);
        return byUsernameAndPassword.size() > 0 ? byUsernameAndPassword.get(0) : null;
    }
}

package com.asuka.user.service.impl;

import com.asuka.user.entity.User;
import com.asuka.user.mapper.UserMapper;
import com.asuka.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RedisTemplate<String,User> redisTemplate;

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
        // 先去缓存中查询
        User redisUser = redisTemplate.opsForValue().get(user.getUsername() + "---" + user.getPassword());
        if (redisUser != null) {
            // 如果存在直接返回
            return redisUser;
        }
        // 不存在 再进行查询
        List<User> byUsernameAndPassword = userMapper.getByUsernameAndPassword(user);
        User login = byUsernameAndPassword.size() > 0 ? byUsernameAndPassword.get(0) : null;
        return byUsernameAndPassword.size() > 0 ? byUsernameAndPassword.get(0) : null;
    }
}

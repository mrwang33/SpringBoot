package com.asuka.user.service.impl;

import com.alibaba.fastjson.JSON;
import com.asuka.user.entity.User;
import com.asuka.user.mapper.UserMapper;
import com.asuka.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserMapper userMapper;
  @Autowired
  private StringRedisTemplate redisTemplate;

  @Override
  public List<User> getAll() {
    return userMapper.getAll();
  }

  @Override
  public User getById(Serializable id) {
    return null;
  }

  @Override
  public int save(User user) {
    return userMapper.insert(user);
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
    String key = user.getUsername() + "---" + user.getPassword();
    // 先去缓存中查询
    User redisUser = JSON.parseObject(redisTemplate.opsForValue().get(key), User.class);
    if (redisUser != null) {
      // 如果存在直接返回
      return redisUser;
    }
    // 不存在 再进行查询
    List<User> byUsernameAndPassword = userMapper.getByUsernameAndPassword(user);
    User login = byUsernameAndPassword.size() > 0 ? byUsernameAndPassword.get(0) : null;
    if (login != null) {
      redisTemplate.opsForValue().set(key, JSON.toJSONString(login));
      // 设置5分钟过期时间
      redisTemplate.expire(key, 5, TimeUnit.MINUTES);
    }
    return login;
  }
}

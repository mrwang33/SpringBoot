package com.wh.mapper;

import com.wh.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> getAll();

    /**
     * 保存用户
     * @param user
     * @return
     */
    int insertUser(User user);
}

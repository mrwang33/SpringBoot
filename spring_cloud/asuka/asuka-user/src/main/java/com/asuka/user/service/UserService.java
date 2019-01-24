package com.asuka.user.service;

import com.asuka.service.BaseService;
import com.asuka.user.entity.User;

public interface UserService extends BaseService<User> {

  User login(User user);


}

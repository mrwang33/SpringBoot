package wang.ggblog.banner.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.ggblog.banner.entity.User;
import wang.ggblog.banner.repository.UserRepository;
import wang.ggblog.banner.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public List<User> getUsers() {
    return userRepository.findAll();
  }
}

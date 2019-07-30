package com.yukino.service;

import com.yukino.entity.User;
import com.yukino.repository.UserRepository;
import com.yukino.user.dto.UserDTO;
import com.yzyx.commons.tools.utils.ConvertUtils;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wanghuan
 */
@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public List<UserDTO> list() {
    return ConvertUtils.sourceToTarget(userRepository.selectList(null), UserDTO.class);
  }

  public boolean save(UserDTO userDTO) {
    User user = ConvertUtils.sourceToTarget(userDTO, User.class);
    return userRepository.insert(user) > 0;
  }
}

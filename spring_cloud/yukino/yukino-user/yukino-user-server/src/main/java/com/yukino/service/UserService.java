package com.yukino.service;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.yukino.common.utils.ConvertUtils;
import com.yukino.entity.User;
import com.yukino.repository.UserRepository;
import com.yukino.user.dto.UserDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

  @LcnTransaction
  @Transactional
  public boolean save(UserDTO userDTO) {
    User user = ConvertUtils.sourceToTarget(userDTO, User.class);
    return userRepository.insert(user) > 0;
  }
}

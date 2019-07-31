package com.yukino.user.feign.fallback;

import com.yukino.user.dto.UserDTO;
import com.yukino.user.feign.UserFeignClient;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * @author wanghuan
 */
@Component
public class UserFeignFallback implements UserFeignClient {

  @Override
  public ResponseEntity<List<UserDTO>> list() {
    return null;
  }

  @Override
  public ResponseEntity addUser(UserDTO userDTO) {
    return null;
  }
}

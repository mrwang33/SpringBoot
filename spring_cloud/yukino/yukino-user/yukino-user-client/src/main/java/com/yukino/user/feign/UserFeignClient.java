package com.yukino.user.feign;

import com.yukino.user.dto.UserDTO;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(serviceId = "yukino-user-server", path = "user", fallback = com.yukino.user.feign.fallback.UserFeignFallback.class)
public interface UserFeignClient {

  @GetMapping("list")
  ResponseEntity<List<UserDTO>> list();

  @PostMapping("/")
  ResponseEntity addUser(@RequestBody UserDTO userDTO);

}

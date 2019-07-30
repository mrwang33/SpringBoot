package com.yukino.controller;

import com.yukino.service.UserService;
import com.yukino.user.dto.UserDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghuan
 */
@RestController
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("list")
  public ResponseEntity<List<UserDTO>> list() {
    List<UserDTO> userList = userService.list();
    return ResponseEntity.ok(userList);
  }

  @PostMapping
  public ResponseEntity addUser(@RequestBody UserDTO userDTO) {
    boolean result = userService.save(userDTO);
    if (!result) {
      return ResponseEntity.badRequest().build();
    }
    return ResponseEntity.ok(null);
  }

}

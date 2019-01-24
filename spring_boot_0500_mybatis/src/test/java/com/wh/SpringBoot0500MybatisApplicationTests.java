package com.wh;

import com.wh.entity.User;
import com.wh.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot0500MybatisApplicationTests {

  @Autowired
  private UserService userService;


  @Test
  public void contextLoads() {
    List<User> allUsers = userService.getAllUsers();
    System.out.println("---------------");
  }

}

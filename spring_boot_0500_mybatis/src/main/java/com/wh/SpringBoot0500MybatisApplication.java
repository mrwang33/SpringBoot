package com.wh;

import com.wh.entity.User;
import com.wh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringBoot0500MybatisApplication {
    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot0500MybatisApplication.class, args);
    }

    @GetMapping("test")
    public Object getAll() {

        List<User> allUsers = userService.getAllUsers();
        return allUsers;
    }
}

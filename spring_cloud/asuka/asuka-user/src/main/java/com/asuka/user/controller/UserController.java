package com.asuka.user.controller;

import com.asuka.common.RestCode;
import com.asuka.common.RestResponse;
import com.asuka.user.entity.User;
import com.asuka.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public RestResponse<User> login(@RequestBody User user, HttpSession session) {
        User login = userService.login(user);
        session.setAttribute("user",login);
        return login == null ? RestResponse.error(RestCode.USER_NOT_FOUND) : RestResponse.success(login);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public RestResponse save(@RequestBody User user) {
        int save = userService.save(user);
        return save > 0 ? RestResponse.success() : RestResponse.error(RestCode.ILLEGAL_PARAMS);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public RestResponse<List<User>> getAllUser(HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user==null) {
            return RestResponse.error(RestCode.ILLEGAL_PARAMS);
        }
        return RestResponse.success(userService.getAll());
    }
}

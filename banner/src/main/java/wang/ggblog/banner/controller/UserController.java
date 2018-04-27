package wang.ggblog.banner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import wang.ggblog.banner.service.UserService;

@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("user")
    public String getUsers(ModelMap modelMap) {
        modelMap.addAttribute("users",userService.getUsers());
        return "user";
    }
}

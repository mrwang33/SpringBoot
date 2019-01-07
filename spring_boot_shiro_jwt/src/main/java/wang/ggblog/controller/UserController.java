package wang.ggblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wang.ggblog.bean.LoginParam;
import wang.ggblog.bean.RegisterParam;
import wang.ggblog.bean.ResponseBean;
import wang.ggblog.bean.User;
import wang.ggblog.exception.UnauthorizedException;
import wang.ggblog.service.UserServiceImpl;
import wang.ggblog.util.JWTUtil;

/**
 * @author wanghuan
 */
@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserServiceImpl userService;

  @PostMapping("/register")
  public ResponseBean register(@RequestBody RegisterParam user) {

    int save = userService.save(user);
    if (save == 0) {
      return new ResponseBean(500, "注册失败", null);
    }
    return new ResponseBean(200, "注册成功", null);
  }

  @PostMapping("/login")
  public ResponseBean login(@RequestBody LoginParam loginParam) {
    User user = userService.findByUsername(loginParam);
    if (user.getPassword().equals(loginParam.getPwd())) {
      return new ResponseBean(200, "Login success",
          JWTUtil.sign(user.getName(), user.getPassword()));
    } else {
      throw new UnauthorizedException();
    }
  }
}

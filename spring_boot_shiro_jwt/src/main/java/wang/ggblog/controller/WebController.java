package wang.ggblog.controller;

import lombok.extern.log4j.Log4j2;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import wang.ggblog.bean.ResponseBean;
import wang.ggblog.database.UserBean;
import wang.ggblog.database.UserService;
import wang.ggblog.exception.UnauthorizedException;
import wang.ggblog.util.JWTUtil;

@RestController
@Log4j2
public class WebController {

  private UserService userService;

  @Autowired
  public void setService(UserService userService) {
    this.userService = userService;
  }

  @PostMapping("/login")
  public ResponseBean login(@RequestParam("username") String username,
      @RequestParam("password") String password) {
    UserBean userBean = userService.getUser(username);
    if (userBean.getPassword().equals(password)) {
      return new ResponseBean(200, "Login success", JWTUtil.sign(username, password));
    } else {
      throw new UnauthorizedException();
    }
  }

  @GetMapping("/article")
  public ResponseBean article() {
    Subject subject = SecurityUtils.getSubject();
    if (subject.isAuthenticated()) {
      return new ResponseBean(200, "You are already logged in", null);
    } else {
      return new ResponseBean(200, "You are guest", null);
    }
  }

  @GetMapping("/require_auth")
  @RequiresAuthentication
  public ResponseBean requireAuth() {
    return new ResponseBean(200, "You are authenticated", null);
  }

  @GetMapping("/require_role")
  @RequiresRoles("admin")
  public ResponseBean requireRole() {
    return new ResponseBean(200, "You are visiting require_role", null);
  }

  @GetMapping("/require_permission")
  @RequiresPermissions(value = {"view", "edit"})
  public ResponseBean requirePermission() {
    return new ResponseBean(200, "You are visiting permission require edit,view", null);
  }

  @GetMapping("/user")
  public ResponseBean user() {
    return new ResponseBean(200, "super user", null);
  }

  @PostMapping("/user")
  @RequiresPermissions({"view", "addUser"})
  public ResponseBean saveUser() {
    return new ResponseBean(200, "OK!", null);
  }

  @RequestMapping(path = "/401")
  @ResponseStatus(HttpStatus.UNAUTHORIZED)
  public ResponseBean unauthorized() {
    return new ResponseBean(401, "Unauthorized", null);
  }
}

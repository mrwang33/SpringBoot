package wang.ggblog.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.ggblog.bean.LoginParam;
import wang.ggblog.bean.RegisterParam;
import wang.ggblog.bean.User;
import wang.ggblog.dao.UserDao;
import wang.ggblog.util.CommonUtil;

/**
 * @author wanghuan
 */
@Service
public class UserServiceImpl {

  @Autowired
  private UserDao userDao;

  public int save(RegisterParam user) {
    User user1 = new User();
    BeanUtils.copyProperties(user, user1);
    return userDao.insert(user1);
  }

  public User findByUsername(LoginParam loginParam) {
    User user = userDao.selectByUsername(loginParam.getName());
    if (user == null) {
      return null;
    }
    user.setPassword(CommonUtil.sha512(user.getPassword() + loginParam.getTimestamp()));
    return user;
  }
}

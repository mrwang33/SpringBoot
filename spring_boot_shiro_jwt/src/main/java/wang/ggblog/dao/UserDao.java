package wang.ggblog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import wang.ggblog.bean.User;

@Mapper
public interface UserDao extends BaseMapper<User> {

  User selectByUsername(String username);
}

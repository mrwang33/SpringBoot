package com.wh.mapper;

import com.wh.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wanghuan
 */
@Mapper
public interface UserMapper {

  public List<User> getAll();
}

package com.yukino.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yukino.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wanghuan
 */
@Mapper
public interface UserRepository extends BaseMapper<User> {

}

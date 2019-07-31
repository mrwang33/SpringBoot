package com.yukino.tools.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yukino.tools.entity.Tools;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ToolsRepository extends BaseMapper<Tools> {

}

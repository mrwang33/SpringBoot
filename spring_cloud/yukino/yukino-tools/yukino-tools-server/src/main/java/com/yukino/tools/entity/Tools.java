package com.yukino.tools.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author wanghuan
 */
@Data
@TableName("tools")
public class Tools {

  @TableId(type = IdType.AUTO)
  private Integer id;

  private Integer userId;

  private String name;
}

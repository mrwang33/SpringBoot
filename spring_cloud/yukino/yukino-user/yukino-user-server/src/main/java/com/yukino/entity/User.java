package com.yukino.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author wanghuan
 */
@Data
@TableName("user")
public class User {

  @TableId(type = IdType.AUTO)
  private Integer id;

  private String name;

  private Integer gender;
}

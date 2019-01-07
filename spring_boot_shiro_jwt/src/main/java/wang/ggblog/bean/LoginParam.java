package wang.ggblog.bean;

import lombok.Data;

/**
 * @author wanghuan
 */
@Data
public class LoginParam {

  private String name;

  private String pwd;

  private Long timestamp;
}

package com.wh.entity;

/**
 * @author wanghuan
 */
public class Production {

  private Integer productionId;

  private String productionName;

  private User user;

  public Integer getProductionId() {
    return productionId;
  }

  public void setProductionId(Integer productionId) {
    this.productionId = productionId;
  }

  public String getProductionName() {
    return productionName;
  }

  public void setProductionName(String productionName) {
    this.productionName = productionName;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}

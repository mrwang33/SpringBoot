package com.wh.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Created by wh on 17-7-2.
 */
@Entity
public class User {

  @Id
  @GeneratedValue
  private Integer id;
  private String username;
  private String password;
  @ManyToMany
  private List<Brand> brands;

  public User() {
  }

  public User(Integer id, String username, String password) {
    this.id = id;
    this.username = username;
    this.password = password;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<Brand> getBrands() {
    return brands;
  }

  public void setBrands(List<Brand> brands) {
    this.brands = brands;
  }
}

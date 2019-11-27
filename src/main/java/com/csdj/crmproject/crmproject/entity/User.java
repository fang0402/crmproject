/*
 * 文 件 名：用户实体类
 * 版权(c) 雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-27
 */
public class User {
  /**
   * Description ：  无参构造函数
   * @param：  无
   */
  public User() {
  }

  /**
   * Description ：  有参构造函数
   * @param userId
   * @param username
   * @param userpassword
   * @param departmentId
   * @param identity
   */
  public User(long userId, String username, String userpassword, long departmentId, String identity) {
    this.userId = userId;
    this.username = username;
    this.userpassword = userpassword;
    this.departmentId = departmentId;
    this.identity = identity;
  }

  /**
   * 用户id
   */
  private long userId;
  /**
   * 用户名
   */
  private String username;
  /**
   * 密码
   */
  private String userpassword;
  /**
   * 部门id
   */
  private long departmentId;
  /**
   * 身份
   */
  private String identity;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getUserpassword() {
    return userpassword;
  }

  public void setUserpassword(String userpassword) {
    this.userpassword = userpassword;
  }

  public long getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(long departmentId) {
    this.departmentId = departmentId;
  }

  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }
  /**
   * 显示数据
   * @return 显示数据
   */
  @Override
  public String toString() {
    return "User{" +
            "userId=" + userId +
            ", username='" + username + '\'' +
            ", userpassword='" + userpassword + '\'' +
            ", departmentId=" + departmentId +
            ", identity='" + identity + '\'' +
            '}';
  }
}

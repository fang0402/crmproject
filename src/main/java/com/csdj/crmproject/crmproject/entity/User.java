/*
 * 文 件 名：用户实体类
 * 版权(c) 2019-雷升公司 CRM项目组：
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
   * @param pkUserId
   * @param userName
   * @param userPassword
   * @param fkDepartmentId
   * @param userIdentity
   * @param userGmtCreate
   * @param userGmtModified
   */
  public User(long pkUserId, String userName, String userPassword, long fkDepartmentId, String userIdentity, String userGmtCreate, String userGmtModified) {
    this.pkUserId = pkUserId;
    this.userName = userName;
    this.userPassword = userPassword;
    this.fkDepartmentId = fkDepartmentId;
    this.userIdentity = userIdentity;
    this.userGmtCreate = userGmtCreate;
    this.userGmtModified = userGmtModified;
  }

  /**
   * 用户id
   */
  private long pkUserId;
  /**
   * 用户名
   */
  private String userName;
  /**
   * 密码
   */
  private String userPassword;
  /**
   * 部门id
   */
  private long fkDepartmentId;
  /**
   * 身份
   */
  private String userIdentity;
  /**
   * 创建时间
   */
  private String userGmtCreate;
  /**
   * 修改时间
   */
  private String userGmtModified;


  public long getPkUserId() {
    return pkUserId;
  }

  public void setPkUserId(long pkUserId) {
    this.pkUserId = pkUserId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }


  public long getFkDepartmentId() {
    return fkDepartmentId;
  }

  public void setFkDepartmentId(long fkDepartmentId) {
    this.fkDepartmentId = fkDepartmentId;
  }


  public String getUserIdentity() {
    return userIdentity;
  }

  public void setUserIdentity(String userIdentity) {
    this.userIdentity = userIdentity;
  }

  public String getUserGmtCreate() {
    return userGmtCreate;
  }

  public void setUserGmtCreate(String userGmtCreate) {
    this.userGmtCreate = userGmtCreate;
  }

  public String getUserGmtModified() {
    return userGmtModified;
  }

  public void setUserGmtModified(String userGmtModified) {
    this.userGmtModified = userGmtModified;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "User{" +
            "pkUserId=" + pkUserId +
            ", userName='" + userName + '\'' +
            ", userPassword='" + userPassword + '\'' +
            ", fkDepartmentId=" + fkDepartmentId +
            ", userIdentity='" + userIdentity + '\'' +
            ", userGmtCreate='" + userGmtCreate + '\'' +
            ", userGmtModified='" + userGmtModified + '\'' +
            '}';
  }
}

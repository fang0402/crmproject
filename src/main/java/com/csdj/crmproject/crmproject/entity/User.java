package com.sample;


public class User {

  private long pkUserId;
  private String userName;
  private String userPassword;
  private long fkDepartmentId;
  private String userIdentity;
  private java.sql.Timestamp userGmtCreate;
  private java.sql.Timestamp userGmtModified;
  private String sc;
  private String sd;
  private String se;


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


  public java.sql.Timestamp getUserGmtCreate() {
    return userGmtCreate;
  }

  public void setUserGmtCreate(java.sql.Timestamp userGmtCreate) {
    this.userGmtCreate = userGmtCreate;
  }


  public java.sql.Timestamp getUserGmtModified() {
    return userGmtModified;
  }

  public void setUserGmtModified(java.sql.Timestamp userGmtModified) {
    this.userGmtModified = userGmtModified;
  }


  public String getSc() {
    return sc;
  }

  public void setSc(String sc) {
    this.sc = sc;
  }


  public String getSd() {
    return sd;
  }

  public void setSd(String sd) {
    this.sd = sd;
  }


  public String getSe() {
    return se;
  }

  public void setSe(String se) {
    this.se = se;
  }

}

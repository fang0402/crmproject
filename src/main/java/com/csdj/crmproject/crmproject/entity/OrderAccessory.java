/*
 * 文 件 名：
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */
package com.csdj.crmproject.crmproject.entity;


public class OrderAccessory {

  private long pkOrderAccesssoryId;
  private String orderAccessoryName;
  private String orderAccessoryFileurl;
  private long fkOrderId;
  private String orderAccessoryContext;
  private String creator;
  private java.sql.Timestamp gmtCreate;
  private java.sql.Timestamp gmtModified;
  private String sa;
  private String sb;
  private String sc;


  public long getPkOrderAccesssoryId() {
    return pkOrderAccesssoryId;
  }

  public void setPkOrderAccesssoryId(long pkOrderAccesssoryId) {
    this.pkOrderAccesssoryId = pkOrderAccesssoryId;
  }


  public String getOrderAccessoryName() {
    return orderAccessoryName;
  }

  public void setOrderAccessoryName(String orderAccessoryName) {
    this.orderAccessoryName = orderAccessoryName;
  }


  public String getOrderAccessoryFileurl() {
    return orderAccessoryFileurl;
  }

  public void setOrderAccessoryFileurl(String orderAccessoryFileurl) {
    this.orderAccessoryFileurl = orderAccessoryFileurl;
  }


  public long getFkOrderId() {
    return fkOrderId;
  }

  public void setFkOrderId(long fkOrderId) {
    this.fkOrderId = fkOrderId;
  }


  public String getOrderAccessoryContext() {
    return orderAccessoryContext;
  }

  public void setOrderAccessoryContext(String orderAccessoryContext) {
    this.orderAccessoryContext = orderAccessoryContext;
  }


  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }


  public java.sql.Timestamp getGmtCreate() {
    return gmtCreate;
  }

  public void setGmtCreate(java.sql.Timestamp gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public java.sql.Timestamp getGmtModified() {
    return gmtModified;
  }

  public void setGmtModified(java.sql.Timestamp gmtModified) {
    this.gmtModified = gmtModified;
  }


  public String getSa() {
    return sa;
  }

  public void setSa(String sa) {
    this.sa = sa;
  }


  public String getSb() {
    return sb;
  }

  public void setSb(String sb) {
    this.sb = sb;
  }


  public String getSc() {
    return sc;
  }

  public void setSc(String sc) {
    this.sc = sc;
  }

}

/*
 * 文 件 名：销售机会-联系人实体类
 * 版权(c) 雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;
/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-27
 */
public class SalesContact {
  /**
   * Description ：  无参构造函数
   * @param：  无
   */
  public SalesContact() {
  }

  /**
   * Description ：  有参构造函数
   * @param salesContactId
   * @param salesId
   * @param contactId
   * @param contactRole
   * @param playaRole
   * @param synopsis
   */
  public SalesContact(long salesContactId, long salesId, long contactId, String contactRole, String playaRole, String synopsis) {
    this.salesContactId = salesContactId;
    this.salesId = salesId;
    this.contactId = contactId;
    this.contactRole = contactRole;
    this.playaRole = playaRole;
    this.synopsis = synopsis;
  }

  /**
   * 销售目标-联系人id主键
   */
  private long salesContactId;
  /**
   * 销售目标id
   */
  private long salesId;
  /**
   * 联系人id外键
   */
  private long contactId;
  /**
   * 联系人角色
   */
  private String contactRole;
  /**
   * 担任角色
   */
  private String playaRole;
  /**
   * 简介
   */
  private String synopsis;


  public long getSalesContactId() {
    return salesContactId;
  }

  public void setSalesContactId(long salesContactId) {
    this.salesContactId = salesContactId;
  }


  public long getSalesId() {
    return salesId;
  }

  public void setSalesId(long salesId) {
    this.salesId = salesId;
  }

  public long getContactId() {
    return contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public String getContactRole() {
    return contactRole;
  }

  public void setContactRole(String contactRole) {
    this.contactRole = contactRole;
  }

  public String getPlayaRole() {
    return playaRole;
  }

  public void setPlayaRole(String playaRole) {
    this.playaRole = playaRole;
  }

  public String getSynopsis() {
    return synopsis;
  }

  public void setSynopsis(String synopsis) {
    this.synopsis = synopsis;
  }
  /**
   * 显示数据
   * @return 显示数据
   */
  @Override
  public String toString() {
    return "SalesContact{" +
            "salesContactId=" + salesContactId +
            ", salesId=" + salesId +
            ", contactId=" + contactId +
            ", contactRole='" + contactRole + '\'' +
            ", playaRole='" + playaRole + '\'' +
            ", synopsis='" + synopsis + '\'' +
            '}';
  }
}

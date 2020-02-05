/*
 * 文 件 名：销售机会-联系人实体类
 * 版权(c) 2019-雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-27
 */
public class SalesoppContact {
  /**
   * Description ：  无参构造函数
   * @param：  无
   */
  public SalesoppContact() {
  }

  /**
   * Description ：  无参构造函数
   * @param pkSalesoppContactId
   * @param fkSalesId
   * @param fkContactId
   * @param soConContactRole
   * @param soConRole
   * @param soConSynopsis
   * @param soConGmtCreate
   * @param soConGmtModified
   */
  public SalesoppContact(long pkSalesoppContactId, long fkSalesId, long fkContactId, String soConContactRole, String soConRole, String soConSynopsis, String soConGmtCreate, String soConGmtModified) {
    this.pkSalesoppContactId = pkSalesoppContactId;
    this.fkSalesId = fkSalesId;
    this.fkContactId = fkContactId;
    this.soConContactRole = soConContactRole;
    this.soConRole = soConRole;
    this.soConSynopsis = soConSynopsis;
    this.soConGmtCreate = soConGmtCreate;
    this.soConGmtModified = soConGmtModified;
  }

  /**
   * 销售机会-联系人id
   */
  private long pkSalesoppContactId;
  /**
   * 联系机会id
   */
  private long fkSalesId;
  /**
   * 联系人id
   */
  private long fkContactId;
  /**
   * 联系人角色
   */
  private String soConContactRole;
  /**
   * 担任角色
   */
  private String soConRole;
  /**
   * 简介
   */
  private String soConSynopsis;
  /**
   * 创建时间
   */
  private String soConGmtCreate;
  /**
   * 修改时间
   */
  private String soConGmtModified;

  public long getPkSalesoppContactId() {
    return pkSalesoppContactId;
  }

  public void setPkSalesoppContactId(long pkSalesoppContactId) {
    this.pkSalesoppContactId = pkSalesoppContactId;
  }


  public long getFkSalesId() {
    return fkSalesId;
  }

  public void setFkSalesId(long fkSalesId) {
    this.fkSalesId = fkSalesId;
  }


  public long getFkContactId() {
    return fkContactId;
  }

  public void setFkContactId(long fkContactId) {
    this.fkContactId = fkContactId;
  }


  public String getSoConContactRole() {
    return soConContactRole;
  }

  public void setSoConContactRole(String soConContactRole) {
    this.soConContactRole = soConContactRole;
  }


  public String getSoConRole() {
    return soConRole;
  }

  public void setSoConRole(String soConRole) {
    this.soConRole = soConRole;
  }


  public String getSoConSynopsis() {
    return soConSynopsis;
  }

  public void setSoConSynopsis(String soConSynopsis) {
    this.soConSynopsis = soConSynopsis;
  }

  public String getSoConGmtCreate() {
    return soConGmtCreate;
  }

  public void setSoConGmtCreate(String soConGmtCreate) {
    this.soConGmtCreate = soConGmtCreate;
  }

  public String getSoConGmtModified() {
    return soConGmtModified;
  }

  public void setSoConGmtModified(String soConGmtModified) {
    this.soConGmtModified = soConGmtModified;
  }

  /**
   * 显示数据
   * @return 显示数据
   */
  @Override
  public String toString() {
    return "SalesoppContact{" +
            "pkSalesoppContactId=" + pkSalesoppContactId +
            ", fkSalesId=" + fkSalesId +
            ", fkContactId=" + fkContactId +
            ", soConContactRole='" + soConContactRole + '\'' +
            ", soConRole='" + soConRole + '\'' +
            ", soConSynopsis='" + soConSynopsis + '\'' +
            ", soConGmtCreate='" + soConGmtCreate + '\'' +
            ", soConGmtModified='" + soConGmtModified + '\'' +
            '}';
  }
}

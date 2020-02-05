/*
 * 文 件 名：
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author 尹嘉丽
 * @version 1.0
 * @date 2019-11-28
 * 订单附件
 */
public class OrderAccessory {
  /**
   * 订单附件编号
   */
  private long pkOrderAccesssoryId;
  /**
   * 附件名称
   */
  private String orderAccessoryName;
  /**
   * 路径
   */
  private String orderAccessoryFileuUrl;
  /**
   * 订单编号
   */
  private long fkOrderId;
  /**
   * 备注
   */
  private String orderAccessoryContext;
  /**
   * 创建人
   */
  private String creator;
  /**
   * 创建时间
   */
  private String gmtCreate;
  /**
   * 修改时间
   */
  private String  gmtModified;

  /**
   * 无参构造
   */
  public OrderAccessory() {
  }

  /**
   * 有参构造
   * @param pkOrderAccesssoryId
   * @param orderAccessoryName
   * @param orderAccessoryFileuUrl
   * @param fkOrderId
   * @param orderAccessoryContext
   * @param creator
   * @param gmtCreate
   * @param gmtModified
   */
  public OrderAccessory(long pkOrderAccesssoryId, String orderAccessoryName, String orderAccessoryFileuUrl, long fkOrderId, String orderAccessoryContext, String creator, String gmtCreate, String gmtModified) {
    this.pkOrderAccesssoryId = pkOrderAccesssoryId;
    this.orderAccessoryName = orderAccessoryName;
    this.orderAccessoryFileuUrl = orderAccessoryFileuUrl;
    this.fkOrderId = fkOrderId;
    this.orderAccessoryContext = orderAccessoryContext;
    this.creator = creator;
    this.gmtCreate = gmtCreate;
    this.gmtModified = gmtModified;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "OrderAccessory{" +
            "pkOrderAccesssoryId=" + pkOrderAccesssoryId +
            ", orderAccessoryName='" + orderAccessoryName + '\'' +
            ", orderAccessoryFileuUrl='" + orderAccessoryFileuUrl + '\'' +
            ", fkOrderId=" + fkOrderId +
            ", orderAccessoryContext='" + orderAccessoryContext + '\'' +
            ", creator='" + creator + '\'' +
            ", gmtCreate='" + gmtCreate + '\'' +
            ", gmtModified='" + gmtModified + '\'' +
            '}';
  }

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

  public String getOrderAccessoryFileuUrl() {
    return orderAccessoryFileuUrl;
  }

  public void setOrderAccessoryFileuUrl(String orderAccessoryFileuUrl) {
    this.orderAccessoryFileuUrl = orderAccessoryFileuUrl;
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

  public String getGmtCreate() {
    return gmtCreate;
  }

  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }

  public String getGmtModified() {
    return gmtModified;
  }

  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }
}

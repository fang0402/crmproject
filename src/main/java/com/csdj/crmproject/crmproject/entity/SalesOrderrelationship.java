/*
 * 文 件 名：销售机会-订单实体类
 * 版权(c) 雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;
/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-27
 */
public class SalesOrderrelationship {
  /**
   * Description ：  无参构造函数
   * @param：  无
   */
  public SalesOrderrelationship() {
  }

  /**
   * Description ：  有参构造函数
   * @param id
   * @param saleId
   * @param orderId
   */
  public SalesOrderrelationship(long id, long saleId, long orderId) {
    this.id = id;
    this.saleId = saleId;
    this.orderId = orderId;
  }

  /**
   * 销售机会-订单id
   */
  private long id;
  /**
   * 销售机会id外键
   */
  private long saleId;
  /**
   * 订单id外键
   */
  private long orderId;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getSaleId() {
    return saleId;
  }

  public void setSaleId(long saleId) {
    this.saleId = saleId;
  }

  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }

  /**
   * 显示数据
   * @return 显示数据
   */
  @Override
  public String toString() {
    return "SalesOrderrelationship{" +
            "id=" + id +
            ", saleId=" + saleId +
            ", orderId=" + orderId +
            '}';
  }
}

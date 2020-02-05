/*
 * 文 件 名：销售机会-订单实体类
 * 版权(c) 2019-雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-27
 */
public class SalesoppOrder {
  /**
   * Description ：  无参构造函数
   * @param：  无
   */
  public SalesoppOrder() {
  }

  /**
   * Description ：  有参构造函数
   * @param pkSalesoppOrderId
   * @param fkSalesoppId
   * @param fkOrderId
   */
  public SalesoppOrder(long pkSalesoppOrderId, long fkSalesoppId, long fkOrderId) {
    this.pkSalesoppOrderId = pkSalesoppOrderId;
    this.fkSalesoppId = fkSalesoppId;
    this.fkOrderId = fkOrderId;
  }

  /**
   * 销售机会-订单id
   */
  private long pkSalesoppOrderId;
  /**
   * 销售机会id
   */
  private long fkSalesoppId;
  /**
   * 订单id
   */
  private long fkOrderId;


  public long getPkSalesoppOrderId() {
    return pkSalesoppOrderId;
  }

  public void setPkSalesoppOrderId(long pkSalesoppOrderId) {
    this.pkSalesoppOrderId = pkSalesoppOrderId;
  }


  public long getFkSalesoppId() {
    return fkSalesoppId;
  }

  public void setFkSalesoppId(long fkSalesoppId) {
    this.fkSalesoppId = fkSalesoppId;
  }


  public long getFkOrderId() {
    return fkOrderId;
  }

  public void setFkOrderId(long fkOrderId) {
    this.fkOrderId = fkOrderId;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "SalesoppOrder{" +
            "pkSalesoppOrderId=" + pkSalesoppOrderId +
            ", fkSalesoppId=" + fkSalesoppId +
            ", fkOrderId=" + fkOrderId +
            '}';
  }
}

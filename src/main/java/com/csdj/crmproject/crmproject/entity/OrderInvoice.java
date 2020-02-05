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
 * 订单-发货单
 */
public class OrderInvoice {
  /**
   * 订单-发货单编号
   */
  private long pkOrderInvoiceId;
  /**
   * 订单编号
   */
  private long fkOrderId;
  /**
   * 发货单编号
   */
  private long fkInvoiceId;

  /**
   * 无参构造
   */
  public OrderInvoice() {
  }

  /**
   * 有参构造
   * @param pkOrderInvoiceId
   * @param fkOrderId
   * @param fkInvoiceId
   */
  public OrderInvoice(long pkOrderInvoiceId, long fkOrderId, long fkInvoiceId) {
    this.pkOrderInvoiceId = pkOrderInvoiceId;
    this.fkOrderId = fkOrderId;
    this.fkInvoiceId = fkInvoiceId;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "OrderInvoice{" +
            "pkOrderInvoiceId=" + pkOrderInvoiceId +
            ", fkOrderId=" + fkOrderId +
            ", fkInvoiceId=" + fkInvoiceId +
            '}';
  }

  public long getPkOrderInvoiceId() {
    return pkOrderInvoiceId;
  }

  public void setPkOrderInvoiceId(long pkOrderInvoiceId) {
    this.pkOrderInvoiceId = pkOrderInvoiceId;
  }


  public long getFkOrderId() {
    return fkOrderId;
  }

  public void setFkOrderId(long fkOrderId) {
    this.fkOrderId = fkOrderId;
  }


  public long getFkInvoiceId() {
    return fkInvoiceId;
  }

  public void setFkInvoiceId(long fkInvoiceId) {
    this.fkInvoiceId = fkInvoiceId;
  }

}

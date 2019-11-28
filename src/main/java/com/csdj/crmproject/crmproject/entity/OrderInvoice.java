/*
 * 文 件 名：
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */
package com.csdj.crmproject.crmproject.entity;


public class OrderInvoice {

  private long pkOrderInvoiceId;
  private long fkOrderId;
  private long fkInvoiceId;


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

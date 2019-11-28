/*
 * 文 件 名：
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */
package com.csdj.crmproject.crmproject.entity;


public class ContractInvoice {

  private long pkContractInvoiceId;
  private long fkContractId;
  private long fkInvoiceId;


  public long getPkContractInvoiceId() {
    return pkContractInvoiceId;
  }

  public void setPkContractInvoiceId(long pkContractInvoiceId) {
    this.pkContractInvoiceId = pkContractInvoiceId;
  }


  public long getFkContractId() {
    return fkContractId;
  }

  public void setFkContractId(long fkContractId) {
    this.fkContractId = fkContractId;
  }


  public long getFkInvoiceId() {
    return fkInvoiceId;
  }

  public void setFkInvoiceId(long fkInvoiceId) {
    this.fkInvoiceId = fkInvoiceId;
  }

}

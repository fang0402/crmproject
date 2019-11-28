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
 * 合同-发货单
 */
public class ContractInvoice {
  /**
   * 合同-发货单编号
   */
  private long pkContractInvoiceId;
  /**
   * 合同编号
   */
  private long fkContractId;
  /**
   * 发货单编号
   */
  private long fkInvoiceId;

  /**
   * 无参构造
   */
  public ContractInvoice() {
  }

  /**
   * 有参构造
   * @param pkContractInvoiceId
   * @param fkContractId
   * @param fkInvoiceId
   */
  public ContractInvoice(long pkContractInvoiceId, long fkContractId, long fkInvoiceId) {
    this.pkContractInvoiceId = pkContractInvoiceId;
    this.fkContractId = fkContractId;
    this.fkInvoiceId = fkInvoiceId;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "ContractInvoice{" +
            "pkContractInvoiceId=" + pkContractInvoiceId +
            ", fkContractId=" + fkContractId +
            ", fkInvoiceId=" + fkInvoiceId +
            '}';
  }

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

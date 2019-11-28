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
 * 合同-退货单
 */
public class ContractReturn {
  /**
   * 合同-退货单编号
   */
  private long pkContractReturnId;
  /**
   * 合同编号
   */
  private long fkContractId;
  /**
   * 退货单编号
   */
  private long fkReturnId;

  /**
   * 无参构造
   */
  public ContractReturn() {
  }

  /**
   * 有参构造
   * @param pkContractReturnId
   * @param fkContractId
   * @param fkReturnId
   */
  public ContractReturn(long pkContractReturnId, long fkContractId, long fkReturnId) {
    this.pkContractReturnId = pkContractReturnId;
    this.fkContractId = fkContractId;
    this.fkReturnId = fkReturnId;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "ContractReturn{" +
            "pkContractReturnId=" + pkContractReturnId +
            ", fkContractId=" + fkContractId +
            ", fkReturnId=" + fkReturnId +
            '}';
  }

  public long getPkContractReturnId() {
    return pkContractReturnId;
  }

  public void setPkContractReturnId(long pkContractReturnId) {
    this.pkContractReturnId = pkContractReturnId;
  }


  public long getFkContractId() {
    return fkContractId;
  }

  public void setFkContractId(long fkContractId) {
    this.fkContractId = fkContractId;
  }


  public long getFkReturnId() {
    return fkReturnId;
  }

  public void setFkReturnId(long fkReturnId) {
    this.fkReturnId = fkReturnId;
  }

}

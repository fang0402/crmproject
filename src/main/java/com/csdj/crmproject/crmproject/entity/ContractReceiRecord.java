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
 * 合同-收款记录
 */
public class ContractReceiRecord {
  /**
   * 合同-收款记录编号
   */
  private long pkContractReceiRecordId;
  /**
   * 合同编号
   */
  private long fkContractId;
  /**
   * 收款记录编号
   */
  private long fkReceiRecordId;

  /**
   * 无参构造
   */
  public ContractReceiRecord() {
  }

  /**
   * 有参构造
   * @param pkContractReceiRecordId
   * @param fkContractId
   * @param fkReceiRecordId
   */
  public ContractReceiRecord(long pkContractReceiRecordId, long fkContractId, long fkReceiRecordId) {
    this.pkContractReceiRecordId = pkContractReceiRecordId;
    this.fkContractId = fkContractId;
    this.fkReceiRecordId = fkReceiRecordId;
  }

  /**
   * 显示方法
   * @return
   */
  @Override
  public String toString() {
    return "ContractReceiRecord{" +
            "pkContractReceiRecordId=" + pkContractReceiRecordId +
            ", fkContractId=" + fkContractId +
            ", fkReceiRecordId=" + fkReceiRecordId +
            '}';
  }

  public long getPkContractReceiRecordId() {
    return pkContractReceiRecordId;
  }

  public void setPkContractReceiRecordId(long pkContractReceiRecordId) {
    this.pkContractReceiRecordId = pkContractReceiRecordId;
  }


  public long getFkContractId() {
    return fkContractId;
  }

  public void setFkContractId(long fkContractId) {
    this.fkContractId = fkContractId;
  }


  public long getFkReceiRecordId() {
    return fkReceiRecordId;
  }

  public void setFkReceiRecordId(long fkReceiRecordId) {
    this.fkReceiRecordId = fkReceiRecordId;
  }

}

/*
 * 文 件 名：
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */
package com.csdj.crmproject.crmproject.entity;


public class ContractReceiRecord {

  private long pkContractReceiRecordId;
  private long fkContractId;
  private long fkReceiRecordId;


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

/*
 * 文 件 名：
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */
package com.csdj.crmproject.crmproject.entity;


public class ContractReturn {

  private long pkContractReturnId;
  private long fkContractId;
  private long fkReturnId;


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

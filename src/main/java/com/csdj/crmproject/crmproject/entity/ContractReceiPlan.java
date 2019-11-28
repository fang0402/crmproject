/*
 * 文 件 名：
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */
package com.csdj.crmproject.crmproject.entity;


public class ContractReceiPlan {

  private long pkContractReceiPlanId;
  private long fkContractId;
  private long fkReceiPlanId;


  public long getPkContractReceiPlanId() {
    return pkContractReceiPlanId;
  }

  public void setPkContractReceiPlanId(long pkContractReceiPlanId) {
    this.pkContractReceiPlanId = pkContractReceiPlanId;
  }


  public long getFkContractId() {
    return fkContractId;
  }

  public void setFkContractId(long fkContractId) {
    this.fkContractId = fkContractId;
  }


  public long getFkReceiPlanId() {
    return fkReceiPlanId;
  }

  public void setFkReceiPlanId(long fkReceiPlanId) {
    this.fkReceiPlanId = fkReceiPlanId;
  }

}

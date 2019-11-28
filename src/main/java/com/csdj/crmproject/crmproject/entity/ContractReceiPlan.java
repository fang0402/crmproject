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
 * 合同-收款计划
 */
public class ContractReceiPlan {
  /**
   * 合同-收款计划编号
   */
  private long pkContractReceiPlanId;
  /**
   * 合同编号
   */
  private long fkContractId;
  /**
   * 收款计划编号
   */
  private long fkReceiPlanId;

  /**
   * 无参构造
   */
  public ContractReceiPlan() {
  }

  /**
   * 有参构造
   * @param pkContractReceiPlanId
   * @param fkContractId
   * @param fkReceiPlanId
   */
  public ContractReceiPlan(long pkContractReceiPlanId, long fkContractId, long fkReceiPlanId) {
    this.pkContractReceiPlanId = pkContractReceiPlanId;
    this.fkContractId = fkContractId;
    this.fkReceiPlanId = fkReceiPlanId;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "ContractReceiPlan{" +
            "pkContractReceiPlanId=" + pkContractReceiPlanId +
            ", fkContractId=" + fkContractId +
            ", fkReceiPlanId=" + fkReceiPlanId +
            '}';
  }

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

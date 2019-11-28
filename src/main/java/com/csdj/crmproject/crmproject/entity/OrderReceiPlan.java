/*
 * 文 件 名：
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */
package com.csdj.crmproject.crmproject.entity;


public class OrderReceiPlan {

  private long pkOrderReceiPlanId;
  private long fkOrderId;
  private long fkReceiPlanId;


  public long getPkOrderReceiPlanId() {
    return pkOrderReceiPlanId;
  }

  public void setPkOrderReceiPlanId(long pkOrderReceiPlanId) {
    this.pkOrderReceiPlanId = pkOrderReceiPlanId;
  }


  public long getFkOrderId() {
    return fkOrderId;
  }

  public void setFkOrderId(long fkOrderId) {
    this.fkOrderId = fkOrderId;
  }


  public long getFkReceiPlanId() {
    return fkReceiPlanId;
  }

  public void setFkReceiPlanId(long fkReceiPlanId) {
    this.fkReceiPlanId = fkReceiPlanId;
  }

}

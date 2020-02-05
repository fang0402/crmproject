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
 * 订单-收款计划
 */
public class OrderReceiPlan {
  /**
   * 订单-收款计划表编号
   */
  private long pkOrderReceiPlanId;
  /**
   * 订单编号
   */
  private long fkOrderId;
  /**
   * 收款计划编号
   */
  private long fkReceiPlanId;

  /**
   * 无参构造
   */
  public OrderReceiPlan() {
  }

  /**
   * 有参构造
   * @param pkOrderReceiPlanId
   * @param fkOrderId
   * @param fkReceiPlanId
   */
  public OrderReceiPlan(long pkOrderReceiPlanId, long fkOrderId, long fkReceiPlanId) {
    this.pkOrderReceiPlanId = pkOrderReceiPlanId;
    this.fkOrderId = fkOrderId;
    this.fkReceiPlanId = fkReceiPlanId;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "OrderReceiPlan{" +
            "pkOrderReceiPlanId=" + pkOrderReceiPlanId +
            ", fkOrderId=" + fkOrderId +
            ", fkReceiPlanId=" + fkReceiPlanId +
            '}';
  }

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

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
 * 订单-退货单
 */
public class OrderReturn {
  /**
   * 订单-退货单编号
   */
  private long pkOrderReturnId;
  /**
   * 订单编号
   */
  private long fkOrderId;
  /**
   * 退货单编号
   */
  private long fkReturnId;

  /**
   * 无参构造
   */
  public OrderReturn() {
  }

  /**
   * 有参构造
   * @param pkOrderReturnId
   * @param fkOrderId
   * @param fkReturnId
   */
  public OrderReturn(long pkOrderReturnId, long fkOrderId, long fkReturnId) {
    this.pkOrderReturnId = pkOrderReturnId;
    this.fkOrderId = fkOrderId;
    this.fkReturnId = fkReturnId;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "OrderReturn{" +
            "pkOrderReturnId=" + pkOrderReturnId +
            ", fkOrderId=" + fkOrderId +
            ", fkReturnId=" + fkReturnId +
            '}';
  }

  public long getPkOrderReturnId() {
    return pkOrderReturnId;
  }

  public void setPkOrderReturnId(long pkOrderReturnId) {
    this.pkOrderReturnId = pkOrderReturnId;
  }


  public long getFkOrderId() {
    return fkOrderId;
  }

  public void setFkOrderId(long fkOrderId) {
    this.fkOrderId = fkOrderId;
  }


  public long getFkReturnId() {
    return fkReturnId;
  }

  public void setFkReturnId(long fkReturnId) {
    this.fkReturnId = fkReturnId;
  }

}

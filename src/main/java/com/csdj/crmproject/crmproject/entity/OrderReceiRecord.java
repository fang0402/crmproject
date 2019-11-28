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
 * 订单-收款记录
 */
public class OrderReceiRecord {
  /**
   * 订单-收款记录编号
   */
  private long pkOrderReceiRecordId;
  /**
   * 订单编号
   */
  private long fkOrderId;
  /**
   * 收款记录编号
   */
  private long fkReceiRecordId;

  /**
   *无参构造
   */
  public OrderReceiRecord() {
  }

  /**
   * 有参构造
   * @param pkOrderReceiRecordId
   * @param fkOrderId
   * @param fkReceiRecordId
   */
  public OrderReceiRecord(long pkOrderReceiRecordId, long fkOrderId, long fkReceiRecordId) {
    this.pkOrderReceiRecordId = pkOrderReceiRecordId;
    this.fkOrderId = fkOrderId;
    this.fkReceiRecordId = fkReceiRecordId;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "OrderReceiRecord{" +
            "pkOrderReceiRecordId=" + pkOrderReceiRecordId +
            ", fkOrderId=" + fkOrderId +
            ", fkReceiRecordId=" + fkReceiRecordId +
            '}';
  }

  public long getPkOrderReceiRecordId() {
    return pkOrderReceiRecordId;
  }

  public void setPkOrderReceiRecordId(long pkOrderReceiRecordId) {
    this.pkOrderReceiRecordId = pkOrderReceiRecordId;
  }


  public long getFkOrderId() {
    return fkOrderId;
  }

  public void setFkOrderId(long fkOrderId) {
    this.fkOrderId = fkOrderId;
  }


  public long getFkReceiRecordId() {
    return fkReceiRecordId;
  }

  public void setFkReceiRecordId(long fkReceiRecordId) {
    this.fkReceiRecordId = fkReceiRecordId;
  }

}

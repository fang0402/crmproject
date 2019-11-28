/*
 * 文 件 名：
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */
package com.csdj.crmproject.crmproject.entity;


public class OrderReceiRecord {

  private long pkOrderReceiRecordId;
  private long fkOrderId;
  private long fkReceiRecordId;


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

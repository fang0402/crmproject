/*
 * 文 件 名：
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */
package com.csdj.crmproject.crmproject.entity;


public class OrderReturn {

  private long pkOrderReturnId;
  private long fkOrderId;
  private long fkReturnId;


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

/*
 * 文 件 名：销售机会-合同实体类
 * 版权(c) 2019-雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-28
 */
public class ConSalesopp {
  /**
   * Description ：无参构造函数
   * @param：无
   */
  public ConSalesopp() {
  }

  /**
   *  Description ：有参构造函数
   * @param pkConSalesoppId
   * @param fkSalesoppId
   * @param fkConId
   */
  public ConSalesopp(long pkConSalesoppId, long fkSalesoppId, long fkConId) {
    this.pkConSalesoppId = pkConSalesoppId;
    this.fkSalesoppId = fkSalesoppId;
    this.fkConId = fkConId;
  }

  private long pkConSalesoppId;
  private long fkSalesoppId;
  private long fkConId;


  public long getPkConSalesoppId() {
    return pkConSalesoppId;
  }

  public void setPkConSalesoppId(long pkConSalesoppId) {
    this.pkConSalesoppId = pkConSalesoppId;
  }


  public long getFkSalesoppId() {
    return fkSalesoppId;
  }

  public void setFkSalesoppId(long fkSalesoppId) {
    this.fkSalesoppId = fkSalesoppId;
  }


  public long getFkConId() {
    return fkConId;
  }

  public void setFkConId(long fkConId) {
    this.fkConId = fkConId;
  }

  /**
   * 显示数据
   * @return 显示数据
   */
  @Override
  public String toString() {
    return "ConSalesopp{" +
            "pkConSalesoppId=" + pkConSalesoppId +
            ", fkSalesoppId=" + fkSalesoppId +
            ", fkConId=" + fkConId +
            '}';
  }
}

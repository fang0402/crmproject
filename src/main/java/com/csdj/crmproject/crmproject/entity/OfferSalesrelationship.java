/*
 * 文 件 名：报价单-销售机会关系实体类
 * 版权(c) 雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-27
 */
public class OfferSalesrelationship {
  /**
   * Description ：  无参构造函数
   * @param：  无
   */
  public OfferSalesrelationship() {
  }

  /**
   * Description ：  有参构造函数
   * @param id
   * @param salesId
   * @param offerId
   */
  public OfferSalesrelationship(long id, long salesId, long offerId) {
    this.id = id;
    this.salesId = salesId;
    this.offerId = offerId;
  }

  /**
   * 报价单-销售机会关系id
   */
  private long id;
  /**
   * 销售机会id外键
   */
  private long salesId;
  /**
   * 报价单id外键
   */
  private long offerId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getSalesId() {
    return salesId;
  }

  public void setSalesId(long salesId) {
    this.salesId = salesId;
  }

  public long getOfferId() {
    return offerId;
  }

  public void setOfferId(long offerId) {
    this.offerId = offerId;
  }
  /**
   * 显示数据
   * @return 显示数据
   */
  @Override
  public String toString() {
    return "OfferSalesrelationship{" +
            "id=" + id +
            ", salesId=" + salesId +
            ", offerId=" + offerId +
            '}';
  }
}

/*
 * 文 件 名：销售机会-订单实体类
 * 版权(c) 雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity.priceSheet;


/**
 * @author 刘磊
 * @version 1.0
 * @date 2020-2-12
 */

public class QuoSalesrelation {
  /**
   * Description ：  无参构造函数
   * @param：  无
   */
  public QuoSalesrelation() {
  }

  /**
   * Description ：  有参构造函数
   * @param pkQuoSalesrelationId
   * @param fkSalesId
   * @param fkQuoId
   */
  public QuoSalesrelation(long pkQuoSalesrelationId, long fkSalesId, long fkQuoId) {
    this.pkQuoSalesrelationId = pkQuoSalesrelationId;
    this.fkSalesId = fkSalesId;
    this.fkQuoId = fkQuoId;
  }
  /**
   * 销售机会-订单id
   */
  private long pkQuoSalesrelationId;
  /**
   * 销售机会id
   */
  private long fkSalesId;
  /**
   * 订单id
   */
  private long fkQuoId;


  public long getPkQuoSalesrelationId() {
    return pkQuoSalesrelationId;
  }

  public void setPkQuoSalesrelationId(long pkQuoSalesrelationId) {
    this.pkQuoSalesrelationId = pkQuoSalesrelationId;
  }


  public long getFkSalesId() {
    return fkSalesId;
  }

  public void setFkSalesId(long fkSalesId) {
    this.fkSalesId = fkSalesId;
  }


  public long getFkQuoId() {
    return fkQuoId;
  }

  public void setFkQuoId(long fkQuoId) {
    this.fkQuoId = fkQuoId;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "QuoSalesrelation{" +
            "pkQuoSalesrelationId=" + pkQuoSalesrelationId +
            ", fkSalesId=" + fkSalesId +
            ", fkQuoId=" + fkQuoId +
            '}';
  }
}

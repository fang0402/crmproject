/*
 * 文 件 名：销售机会-合同实体类
 * 版权(c) 雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-27
 */
public class ContractSales {
  /**
   * Description ：无参构造函数
   * @param：无
   */
  public ContractSales() {
  }

  /**
   * Description ：有参构造函数
   * @param idcontractSalesId
   * @param salesId
   * @param contractId
   */
  public ContractSales(long idcontractSalesId, long salesId, long contractId) {
    this.idcontractSalesId = idcontractSalesId;
    this.salesId = salesId;
    this.contractId = contractId;
  }

  /**
   * 销售机会-合同id
   */
  private long idcontractSalesId;
  /**
   * 销售机会id
   */
  private long salesId;
  /**
   * 合同id
   */
  private long contractId;


  public long getIdcontractSalesId() {
    return idcontractSalesId;
  }

  public void setIdcontractSalesId(long idcontractSalesId) {
    this.idcontractSalesId = idcontractSalesId;
  }

  public long getSalesId() {
    return salesId;
  }

  public void setSalesId(long salesId) {
    this.salesId = salesId;
  }

  public long getContractId() {
    return contractId;
  }

  public void setContractId(long contractId) {
    this.contractId = contractId;
  }

  /**
   * 显示数据
   * @return 显示数据
   */
  @Override
  public String toString() {
    return "ContractSales{" +
            "idcontractSalesId=" + idcontractSalesId +
            ", salesId=" + salesId +
            ", contractId=" + contractId +
            '}';
  }
}

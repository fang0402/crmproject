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
 * 合同明细表
 */
public class ContractDetail {
  /**
   * 合同明细表编号
   */
  private long pkContractDetailId;
  /**
   * 客户联系人表编号
   */
  private long fkContractId;
  /**
   * 产品名称
   */
  private String contractDetailName;
  /**
   * 规格型号
   */
  private String contractDetailModelType;
  /**
   * 计量单位
   */
  private String contractDetailMeasurement;
  /**
   * 数量
   */
  private long contractDetailNumber;
  /**
   * 基本单价
   */
  private double contractDetailUnivalence;
  /**
   * 销售单价
   */
  private double contractDetailPrice;
  /**
   * 折前总额
   */
  private double contractDetailTotalSum;
  /**
   * 实际折扣
   */
  private double contractDetailDiscount;
  /**
   * 毛利润
   */
  private double contractDetailGrossProfit;
  /**
   * 税率
   */
  private double contractDetailRate;
  /**
   * 税额
   */
  private double contractDetailRevenue;
  /**
   * 销售额
   */
  private double contractDetailSaleroom;
  /**
   * 创建时间
   */
  private String gmtCreate;
  /**
   * 修改时间
   */
  private String gmtModified;

  /**
   * 无参构造
   */
  public ContractDetail() {
  }

  /**
   * 有参构造
   * @param pkContractDetailId
   * @param fkContractId
   * @param contractDetailName
   * @param contractDetailModelType
   * @param contractDetailMeasurement
   * @param contractDetailNumber
   * @param contractDetailUnivalence
   * @param contractDetailPrice
   * @param contractDetailTotalSum
   * @param contractDetailDiscount
   * @param contractDetailGrossProfit
   * @param contractDetailRate
   * @param contractDetailRevenue
   * @param contractDetailSaleroom
   * @param gmtCreate
   * @param gmtModified
   */
  public ContractDetail(long pkContractDetailId, long fkContractId, String contractDetailName, String contractDetailModelType, String contractDetailMeasurement, long contractDetailNumber, double contractDetailUnivalence, double contractDetailPrice, double contractDetailTotalSum, double contractDetailDiscount, double contractDetailGrossProfit, double contractDetailRate, double contractDetailRevenue, double contractDetailSaleroom, String gmtCreate, String gmtModified) {
    this.pkContractDetailId = pkContractDetailId;
    this.fkContractId = fkContractId;
    this.contractDetailName = contractDetailName;
    this.contractDetailModelType = contractDetailModelType;
    this.contractDetailMeasurement = contractDetailMeasurement;
    this.contractDetailNumber = contractDetailNumber;
    this.contractDetailUnivalence = contractDetailUnivalence;
    this.contractDetailPrice = contractDetailPrice;
    this.contractDetailTotalSum = contractDetailTotalSum;
    this.contractDetailDiscount = contractDetailDiscount;
    this.contractDetailGrossProfit = contractDetailGrossProfit;
    this.contractDetailRate = contractDetailRate;
    this.contractDetailRevenue = contractDetailRevenue;
    this.contractDetailSaleroom = contractDetailSaleroom;
    this.gmtCreate = gmtCreate;
    this.gmtModified = gmtModified;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "ContractDetail{" +
            "pkContractDetailId=" + pkContractDetailId +
            ", fkContractId=" + fkContractId +
            ", contractDetailName='" + contractDetailName + '\'' +
            ", contractDetailModelType='" + contractDetailModelType + '\'' +
            ", contractDetailMeasurement='" + contractDetailMeasurement + '\'' +
            ", contractDetailNumber=" + contractDetailNumber +
            ", contractDetailUnivalence=" + contractDetailUnivalence +
            ", contractDetailPrice=" + contractDetailPrice +
            ", contractDetailTotalSum=" + contractDetailTotalSum +
            ", contractDetailDiscount=" + contractDetailDiscount +
            ", contractDetailGrossProfit=" + contractDetailGrossProfit +
            ", contractDetailRate=" + contractDetailRate +
            ", contractDetailRevenue=" + contractDetailRevenue +
            ", contractDetailSaleroom=" + contractDetailSaleroom +
            ", gmtCreate='" + gmtCreate + '\'' +
            ", gmtModified='" + gmtModified + '\'' +
            '}';
  }

  public long getPkContractDetailId() {
    return pkContractDetailId;
  }

  public void setPkContractDetailId(long pkContractDetailId) {
    this.pkContractDetailId = pkContractDetailId;
  }

  public long getFkContractId() {
    return fkContractId;
  }

  public void setFkContractId(long fkContractId) {
    this.fkContractId = fkContractId;
  }

  public String getContractDetailName() {
    return contractDetailName;
  }

  public void setContractDetailName(String contractDetailName) {
    this.contractDetailName = contractDetailName;
  }

  public String getContractDetailModelType() {
    return contractDetailModelType;
  }

  public void setContractDetailModelType(String contractDetailModelType) {
    this.contractDetailModelType = contractDetailModelType;
  }

  public String getContractDetailMeasurement() {
    return contractDetailMeasurement;
  }

  public void setContractDetailMeasurement(String contractDetailMeasurement) {
    this.contractDetailMeasurement = contractDetailMeasurement;
  }

  public long getContractDetailNumber() {
    return contractDetailNumber;
  }

  public void setContractDetailNumber(long contractDetailNumber) {
    this.contractDetailNumber = contractDetailNumber;
  }

  public double getContractDetailUnivalence() {
    return contractDetailUnivalence;
  }

  public void setContractDetailUnivalence(double contractDetailUnivalence) {
    this.contractDetailUnivalence = contractDetailUnivalence;
  }

  public double getContractDetailPrice() {
    return contractDetailPrice;
  }

  public void setContractDetailPrice(double contractDetailPrice) {
    this.contractDetailPrice = contractDetailPrice;
  }

  public double getContractDetailTotalSum() {
    return contractDetailTotalSum;
  }

  public void setContractDetailTotalSum(double contractDetailTotalSum) {
    this.contractDetailTotalSum = contractDetailTotalSum;
  }

  public double getContractDetailDiscount() {
    return contractDetailDiscount;
  }

  public void setContractDetailDiscount(double contractDetailDiscount) {
    this.contractDetailDiscount = contractDetailDiscount;
  }

  public double getContractDetailGrossProfit() {
    return contractDetailGrossProfit;
  }

  public void setContractDetailGrossProfit(double contractDetailGrossProfit) {
    this.contractDetailGrossProfit = contractDetailGrossProfit;
  }

  public double getContractDetailRate() {
    return contractDetailRate;
  }

  public void setContractDetailRate(double contractDetailRate) {
    this.contractDetailRate = contractDetailRate;
  }

  public double getContractDetailRevenue() {
    return contractDetailRevenue;
  }

  public void setContractDetailRevenue(double contractDetailRevenue) {
    this.contractDetailRevenue = contractDetailRevenue;
  }

  public double getContractDetailSaleroom() {
    return contractDetailSaleroom;
  }

  public void setContractDetailSaleroom(double contractDetailSaleroom) {
    this.contractDetailSaleroom = contractDetailSaleroom;
  }

  public String getGmtCreate() {
    return gmtCreate;
  }

  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }

  public String getGmtModified() {
    return gmtModified;
  }

  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }
}

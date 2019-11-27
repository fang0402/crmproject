/**
 * 文件名
 * 版权(c) 2019-雷升公司 CRM项目组：
 *  * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author 尹嘉丽
 * @date 2019-11-27
 * @version 1.0
 *合同明细
 */
public class ContractDetail {
  /**
   * 合同明细表编号id
   */
  private long contractDetailId;
  /**
   * 合同id
   */
  private long contractId;
  /**
   * 产品名称
   */
  private String contractDetailName;
  /**
   * 型号规格
   */
  private String modelType;
  /**
   * 计量单位
   */
  private String measurement;
  /**
   * 数量
   */
  private long number;
  /**
   * 基本单价
   */
  private double univalence;
  /**
   * 销售价格
   */
  private double price;
  /**
   *折扣总额
   */
  private double totalSum;
  /**
   * 实际折扣
   */
  private double discount;
  /**
   * 毛利润
   */
  private double grossProfit;
  /**
   * 税率
   */
  private double rate;
  /**
   * 税额
   */
  private double revenue;
  /**
   * 销售额
   */
  private double saleroom;


  /**
   * 无参构造函数
   */
  public ContractDetail() {
  }

  /**
   * 有参构造函数
   * @param contractDetailId
   * @param contractId
   * @param contractDetailName
   * @param modelType
   * @param measurement
   * @param number
   * @param univalence
   * @param price
   * @param totalSum
   * @param discount
   * @param grossProfit
   * @param rate
   * @param revenue
   * @param saleroom
   */
  public ContractDetail(long contractDetailId, long contractId, String contractDetailName, String modelType, String measurement, long number, double univalence, double price, double totalSum, double discount, double grossProfit, double rate, double revenue, double saleroom) {
    this.contractDetailId = contractDetailId;
    this.contractId = contractId;
    this.contractDetailName = contractDetailName;
    this.modelType = modelType;
    this.measurement = measurement;
    this.number = number;
    this.univalence = univalence;
    this.price = price;
    this.totalSum = totalSum;
    this.discount = discount;
    this.grossProfit = grossProfit;
    this.rate = rate;
    this.revenue = revenue;
    this.saleroom = saleroom;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "ContractDetail{" +
            "contractDetailId=" + contractDetailId +
            ", contractId=" + contractId +
            ", contractDetailName='" + contractDetailName + '\'' +
            ", modelType='" + modelType + '\'' +
            ", measurement='" + measurement + '\'' +
            ", number=" + number +
            ", univalence=" + univalence +
            ", price=" + price +
            ", totalSum=" + totalSum +
            ", discount=" + discount +
            ", grossProfit=" + grossProfit +
            ", rate=" + rate +
            ", revenue=" + revenue +
            ", saleroom=" + saleroom +
            '}';
  }

  public long getContractDetailId() {
    return contractDetailId;
  }

  public void setContractDetailId(long contractDetailId) {
    this.contractDetailId = contractDetailId;
  }

  public long getContractId() {
    return contractId;
  }

  public void setContractId(long contractId) {
    this.contractId = contractId;
  }

  public String getContractDetailName() {
    return contractDetailName;
  }

  public void setContractDetailName(String contractDetailName) {
    this.contractDetailName = contractDetailName;
  }

  public String getModelType() {
    return modelType;
  }

  public void setModelType(String modelType) {
    this.modelType = modelType;
  }

  public String getMeasurement() {
    return measurement;
  }

  public void setMeasurement(String measurement) {
    this.measurement = measurement;
  }

  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }

  public double getUnivalence() {
    return univalence;
  }

  public void setUnivalence(double univalence) {
    this.univalence = univalence;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getTotalSum() {
    return totalSum;
  }

  public void setTotalSum(double totalSum) {
    this.totalSum = totalSum;
  }

  public double getDiscount() {
    return discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

  public double getGrossProfit() {
    return grossProfit;
  }

  public void setGrossProfit(double grossProfit) {
    this.grossProfit = grossProfit;
  }

  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public double getRevenue() {
    return revenue;
  }

  public void setRevenue(double revenue) {
    this.revenue = revenue;
  }

  public double getSaleroom() {
    return saleroom;
  }

  public void setSaleroom(double saleroom) {
    this.saleroom = saleroom;
  }
}

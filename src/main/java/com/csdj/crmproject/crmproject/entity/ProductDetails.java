/*
 * 文 件 名：产品明显实体类
 * 版权(c) 雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;
/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-27
 */
public class ProductDetails {
  /**
   * Description ：  无参构造函数
   * @param：  无
   */
  public ProductDetails() {
  }

  /**
   *  Description ：  有参构造函数
   * @param productDetailsId
   * @param offerId
   * @param specification
   * @param unitMeasurement
   * @param basicUnit
   * @param number
   * @param formerBudget
   * @param trueDiscount
   * @param discountPrice
   * @param discountSum
   * @param costPrice
   * @param grossMargin
   * @param taxRate
   * @param taxMoney
   * @param saleroom
   * @param filesUpload
   * @param remark
   * @param productId
   */
  public ProductDetails(long productDetailsId, long offerId, String specification, String unitMeasurement, String basicUnit, long number, double formerBudget, double trueDiscount, double discountPrice, double discountSum, double costPrice, double grossMargin, double taxRate, double taxMoney, double saleroom, String filesUpload, String remark, long productId) {
    this.productDetailsId = productDetailsId;
    this.offerId = offerId;
    this.specification = specification;
    this.unitMeasurement = unitMeasurement;
    this.basicUnit = basicUnit;
    this.number = number;
    this.formerBudget = formerBudget;
    this.trueDiscount = trueDiscount;
    this.discountPrice = discountPrice;
    this.discountSum = discountSum;
    this.costPrice = costPrice;
    this.grossMargin = grossMargin;
    this.taxRate = taxRate;
    this.taxMoney = taxMoney;
    this.saleroom = saleroom;
    this.filesUpload = filesUpload;
    this.remark = remark;
    this.productId = productId;
  }

  /**
   * 产品明显id主键
   */
  private long productDetailsId;
  /**
   * 报价单id外键
   */
  private long offerId;
  /**
   * 规格型号
   */
  private String specification;
  /**
   * 计量单位
   */
  private String unitMeasurement;
  /**
   * 基本单位
   */
  private String basicUnit;
  /**
   * 数量
   */
  private long number;
  /**
   * 折前预算
   */
  private double formerBudget;
  /**
   * 实际折扣
   */
  private double trueDiscount;
  /**
   * 折扣单价
   */
  private double discountPrice;
  /**
   * 折扣总额
   */
  private double discountSum;
  /**
   * 成本价
   */
  private double costPrice;
  /**
   * 毛利润
   */
  private double grossMargin;
  /**
   * 利率
   */
  private double taxRate;
  /**
   * 利额
   */
  private double taxMoney;
  /**
   *销售额
   */
  private double saleroom;
  /**
   * 文件上传路径
   */
  private String filesUpload;
  /**
   * 备注
   */
  private String remark;
  /**
   * 产品id外键
   */
  private long productId;


  public long getProductDetailsId() {
    return productDetailsId;
  }

  public void setProductDetailsId(long productDetailsId) {
    this.productDetailsId = productDetailsId;
  }

  public long getOfferId() {
    return offerId;
  }

  public void setOfferId(long offerId) {
    this.offerId = offerId;
  }

  public String getSpecification() {
    return specification;
  }

  public void setSpecification(String specification) {
    this.specification = specification;
  }


  public String getUnitMeasurement() {
    return unitMeasurement;
  }

  public void setUnitMeasurement(String unitMeasurement) {
    this.unitMeasurement = unitMeasurement;
  }


  public String getBasicUnit() {
    return basicUnit;
  }

  public void setBasicUnit(String basicUnit) {
    this.basicUnit = basicUnit;
  }


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }


  public double getFormerBudget() {
    return formerBudget;
  }

  public void setFormerBudget(double formerBudget) {
    this.formerBudget = formerBudget;
  }


  public double getTrueDiscount() {
    return trueDiscount;
  }

  public void setTrueDiscount(double trueDiscount) {
    this.trueDiscount = trueDiscount;
  }


  public double getDiscountPrice() {
    return discountPrice;
  }

  public void setDiscountPrice(double discountPrice) {
    this.discountPrice = discountPrice;
  }


  public double getDiscountSum() {
    return discountSum;
  }

  public void setDiscountSum(double discountSum) {
    this.discountSum = discountSum;
  }


  public double getCostPrice() {
    return costPrice;
  }

  public void setCostPrice(double costPrice) {
    this.costPrice = costPrice;
  }


  public double getGrossMargin() {
    return grossMargin;
  }

  public void setGrossMargin(double grossMargin) {
    this.grossMargin = grossMargin;
  }


  public double getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(double taxRate) {
    this.taxRate = taxRate;
  }


  public double getTaxMoney() {
    return taxMoney;
  }

  public void setTaxMoney(double taxMoney) {
    this.taxMoney = taxMoney;
  }


  public double getSaleroom() {
    return saleroom;
  }

  public void setSaleroom(double saleroom) {
    this.saleroom = saleroom;
  }


  public String getFilesUpload() {
    return filesUpload;
  }

  public void setFilesUpload(String filesUpload) {
    this.filesUpload = filesUpload;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }
  /**
   * 显示数据
   * @return 显示数据
   */
  @Override
  public String toString() {
    return "ProductDetails{" +
            "productDetailsId=" + productDetailsId +
            ", offerId=" + offerId +
            ", specification='" + specification + '\'' +
            ", unitMeasurement='" + unitMeasurement + '\'' +
            ", basicUnit='" + basicUnit + '\'' +
            ", number=" + number +
            ", formerBudget=" + formerBudget +
            ", trueDiscount=" + trueDiscount +
            ", discountPrice=" + discountPrice +
            ", discountSum=" + discountSum +
            ", costPrice=" + costPrice +
            ", grossMargin=" + grossMargin +
            ", taxRate=" + taxRate +
            ", taxMoney=" + taxMoney +
            ", saleroom=" + saleroom +
            ", filesUpload='" + filesUpload + '\'' +
            ", remark='" + remark + '\'' +
            ", productId=" + productId +
            '}';
  }
}

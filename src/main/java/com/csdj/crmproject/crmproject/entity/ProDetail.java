/*
 * 文 件 名：产品明细实体类
 * 版权(c) 2019-雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;


/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-27
 */
public class ProDetail {
  /**
   * Description ：  无参构造函数
   * @param：  无
   */
  public ProDetail() {
  }

  /**
   * Description ：  有参构造函数
   * @param pkProDetailId
   * @param fkQuoId
   * @param proDeSpecification
   * @param proDeUnitMeasurement
   * @param proDeBasicUnit
   * @param proDeNumber
   * @param proDeFormerBudget
   * @param proDeTrueDiscount
   * @param proDeDiscountPrice
   * @param proDeDiscountSum
   * @param proDeCostPrice
   * @param proDeGrossMargin
   * @param proDeTaxRate
   * @param proDeTaxMoney
   * @param proDeSaleroom
   * @param proDeFilesUpload
   * @param proDeProDetailRemark
   * @param fkProId
   * @param proDeGmtCreate
   * @param proDeGmtModified
   */
  public ProDetail(long pkProDetailId, long fkQuoId, String proDeSpecification, String proDeUnitMeasurement, String proDeBasicUnit, long proDeNumber, double proDeFormerBudget, double proDeTrueDiscount, double proDeDiscountPrice, double proDeDiscountSum, double proDeCostPrice, double proDeGrossMargin, double proDeTaxRate, double proDeTaxMoney, double proDeSaleroom, String proDeFilesUpload, String proDeProDetailRemark, long fkProId, String proDeGmtCreate, String proDeGmtModified) {
    this.pkProDetailId = pkProDetailId;
    this.fkQuoId = fkQuoId;
    this.proDeSpecification = proDeSpecification;
    this.proDeUnitMeasurement = proDeUnitMeasurement;
    this.proDeBasicUnit = proDeBasicUnit;
    this.proDeNumber = proDeNumber;
    this.proDeFormerBudget = proDeFormerBudget;
    this.proDeTrueDiscount = proDeTrueDiscount;
    this.proDeDiscountPrice = proDeDiscountPrice;
    this.proDeDiscountSum = proDeDiscountSum;
    this.proDeCostPrice = proDeCostPrice;
    this.proDeGrossMargin = proDeGrossMargin;
    this.proDeTaxRate = proDeTaxRate;
    this.proDeTaxMoney = proDeTaxMoney;
    this.proDeSaleroom = proDeSaleroom;
    this.proDeFilesUpload = proDeFilesUpload;
    this.proDeProDetailRemark = proDeProDetailRemark;
    this.fkProId = fkProId;
    this.proDeGmtCreate = proDeGmtCreate;
    this.proDeGmtModified = proDeGmtModified;
  }

  private long pkProDetailId;
  private long fkQuoId;
  private String proDeSpecification;
  private String proDeUnitMeasurement;
  private String proDeBasicUnit;
  private long proDeNumber;
  private double proDeFormerBudget;
  private double proDeTrueDiscount;
  private double proDeDiscountPrice;
  private double proDeDiscountSum;
  private double proDeCostPrice;
  private double proDeGrossMargin;
  private double proDeTaxRate;
  private double proDeTaxMoney;
  private double proDeSaleroom;
  private String proDeFilesUpload;
  private String proDeProDetailRemark;
  private long fkProId;
  private String proDeGmtCreate;
  private String proDeGmtModified;


  public long getPkProDetailId() {
    return pkProDetailId;
  }

  public void setPkProDetailId(long pkProDetailId) {
    this.pkProDetailId = pkProDetailId;
  }


  public long getFkQuoId() {
    return fkQuoId;
  }

  public void setFkQuoId(long fkQuoId) {
    this.fkQuoId = fkQuoId;
  }


  public String getProDeSpecification() {
    return proDeSpecification;
  }

  public void setProDeSpecification(String proDeSpecification) {
    this.proDeSpecification = proDeSpecification;
  }


  public String getProDeUnitMeasurement() {
    return proDeUnitMeasurement;
  }

  public void setProDeUnitMeasurement(String proDeUnitMeasurement) {
    this.proDeUnitMeasurement = proDeUnitMeasurement;
  }


  public String getProDeBasicUnit() {
    return proDeBasicUnit;
  }

  public void setProDeBasicUnit(String proDeBasicUnit) {
    this.proDeBasicUnit = proDeBasicUnit;
  }


  public long getProDeNumber() {
    return proDeNumber;
  }

  public void setProDeNumber(long proDeNumber) {
    this.proDeNumber = proDeNumber;
  }


  public double getProDeFormerBudget() {
    return proDeFormerBudget;
  }

  public void setProDeFormerBudget(double proDeFormerBudget) {
    this.proDeFormerBudget = proDeFormerBudget;
  }


  public double getProDeTrueDiscount() {
    return proDeTrueDiscount;
  }

  public void setProDeTrueDiscount(double proDeTrueDiscount) {
    this.proDeTrueDiscount = proDeTrueDiscount;
  }


  public double getProDeDiscountPrice() {
    return proDeDiscountPrice;
  }

  public void setProDeDiscountPrice(double proDeDiscountPrice) {
    this.proDeDiscountPrice = proDeDiscountPrice;
  }


  public double getProDeDiscountSum() {
    return proDeDiscountSum;
  }

  public void setProDeDiscountSum(double proDeDiscountSum) {
    this.proDeDiscountSum = proDeDiscountSum;
  }


  public double getProDeCostPrice() {
    return proDeCostPrice;
  }

  public void setProDeCostPrice(double proDeCostPrice) {
    this.proDeCostPrice = proDeCostPrice;
  }


  public double getProDeGrossMargin() {
    return proDeGrossMargin;
  }

  public void setProDeGrossMargin(double proDeGrossMargin) {
    this.proDeGrossMargin = proDeGrossMargin;
  }


  public double getProDeTaxRate() {
    return proDeTaxRate;
  }

  public void setProDeTaxRate(double proDeTaxRate) {
    this.proDeTaxRate = proDeTaxRate;
  }


  public double getProDeTaxMoney() {
    return proDeTaxMoney;
  }

  public void setProDeTaxMoney(double proDeTaxMoney) {
    this.proDeTaxMoney = proDeTaxMoney;
  }


  public double getProDeSaleroom() {
    return proDeSaleroom;
  }

  public void setProDeSaleroom(double proDeSaleroom) {
    this.proDeSaleroom = proDeSaleroom;
  }


  public String getProDeFilesUpload() {
    return proDeFilesUpload;
  }

  public void setProDeFilesUpload(String proDeFilesUpload) {
    this.proDeFilesUpload = proDeFilesUpload;
  }


  public String getProDeProDetailRemark() {
    return proDeProDetailRemark;
  }

  public void setProDeProDetailRemark(String proDeProDetailRemark) {
    this.proDeProDetailRemark = proDeProDetailRemark;
  }


  public long getFkProId() {
    return fkProId;
  }

  public void setFkProId(long fkProId) {
    this.fkProId = fkProId;
  }

  public String getProDeGmtCreate() {
    return proDeGmtCreate;
  }

  public void setProDeGmtCreate(String proDeGmtCreate) {
    this.proDeGmtCreate = proDeGmtCreate;
  }

  public String getProDeGmtModified() {
    return proDeGmtModified;
  }

  public void setProDeGmtModified(String proDeGmtModified) {
    this.proDeGmtModified = proDeGmtModified;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "ProDetail{" +
            "pkProDetailId=" + pkProDetailId +
            ", fkQuoId=" + fkQuoId +
            ", proDeSpecification='" + proDeSpecification + '\'' +
            ", proDeUnitMeasurement='" + proDeUnitMeasurement + '\'' +
            ", proDeBasicUnit='" + proDeBasicUnit + '\'' +
            ", proDeNumber=" + proDeNumber +
            ", proDeFormerBudget=" + proDeFormerBudget +
            ", proDeTrueDiscount=" + proDeTrueDiscount +
            ", proDeDiscountPrice=" + proDeDiscountPrice +
            ", proDeDiscountSum=" + proDeDiscountSum +
            ", proDeCostPrice=" + proDeCostPrice +
            ", proDeGrossMargin=" + proDeGrossMargin +
            ", proDeTaxRate=" + proDeTaxRate +
            ", proDeTaxMoney=" + proDeTaxMoney +
            ", proDeSaleroom=" + proDeSaleroom +
            ", proDeFilesUpload='" + proDeFilesUpload + '\'' +
            ", proDeProDetailRemark='" + proDeProDetailRemark + '\'' +
            ", fkProId=" + fkProId +
            ", proDeGmtCreate='" + proDeGmtCreate + '\'' +
            ", proDeGmtModified='" + proDeGmtModified + '\'' +
            '}';
  }
}

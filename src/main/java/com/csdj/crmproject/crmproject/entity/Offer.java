/*
 * 文 件 名：报价单实体类
 * 版权(c) 雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-27
 */
public class Offer {
  /**
   * Description ：  无参构造函数
   * @param：  无
   */
  public Offer() {
  }

  /**
   * Description ：  有参构造函数
   * @param offerId
   * @param name
   * @param notTaxAmount
   * @param grossProfit
   * @param taxAmount
   * @param salesAmount
   * @param freight
   * @param offerTime
   * @param periodValidity
   * @param offerUser
   * @param approvalStatus
   * @param approvalTime
   * @param approverResults
   * @param payment
   * @param modeTransport
   * @param remark
   * @param customerType
   * @param customerId
   * @param customerName
   * @param updateCustomer
   * @param updateTime
   * @param creator
   * @param creatorTime
   */
  public Offer(long offerId, String name, double notTaxAmount, double grossProfit, double taxAmount, double salesAmount, double freight, String offerTime, String periodValidity, String offerUser, String approvalStatus, String approvalTime, String approverResults, String payment, String modeTransport, String remark, String customerType, long customerId, String customerName, String updateCustomer, String updateTime, String creator, String creatorTime) {
    this.offerId = offerId;
    this.name = name;
    this.notTaxAmount = notTaxAmount;
    this.grossProfit = grossProfit;
    this.taxAmount = taxAmount;
    this.salesAmount = salesAmount;
    this.freight = freight;
    this.offerTime = offerTime;
    this.periodValidity = periodValidity;
    this.offerUser = offerUser;
    this.approvalStatus = approvalStatus;
    this.approvalTime = approvalTime;
    this.approverResults = approverResults;
    this.payment = payment;
    this.modeTransport = modeTransport;
    this.remark = remark;
    this.customerType = customerType;
    this.customerId = customerId;
    this.customerName = customerName;
    this.updateCustomer = updateCustomer;
    this.updateTime = updateTime;
    this.creator = creator;
    this.creatorTime = creatorTime;
  }

  private long offerId;
  private String name;
  private double notTaxAmount;
  private double grossProfit;
  private double taxAmount;
  private double salesAmount;
  private double freight;
  private String offerTime;
  private String periodValidity;
  private String offerUser;
  private String approvalStatus;
  private String approvalTime;
  private String approverResults;
  private String payment;
  private String modeTransport;
  private String remark;
  private String customerType;
  private long customerId;
  private String customerName;
  private String updateCustomer;
  private String updateTime;
  private String creator;
  private String creatorTime;


  public long getOfferId() {
    return offerId;
  }

  public void setOfferId(long offerId) {
    this.offerId = offerId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public double getNotTaxAmount() {
    return notTaxAmount;
  }

  public void setNotTaxAmount(double notTaxAmount) {
    this.notTaxAmount = notTaxAmount;
  }


  public double getGrossProfit() {
    return grossProfit;
  }

  public void setGrossProfit(double grossProfit) {
    this.grossProfit = grossProfit;
  }


  public double getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(double taxAmount) {
    this.taxAmount = taxAmount;
  }


  public double getSalesAmount() {
    return salesAmount;
  }

  public void setSalesAmount(double salesAmount) {
    this.salesAmount = salesAmount;
  }


  public double getFreight() {
    return freight;
  }

  public void setFreight(double freight) {
    this.freight = freight;
  }





  public String getOfferUser() {
    return offerUser;
  }

  public void setOfferUser(String offerUser) {
    this.offerUser = offerUser;
  }


  public String getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(String approvalStatus) {
    this.approvalStatus = approvalStatus;
  }


  public String getApproverResults() {
    return approverResults;
  }

  public void setApproverResults(String approverResults) {
    this.approverResults = approverResults;
  }


  public String getPayment() {
    return payment;
  }

  public void setPayment(String payment) {
    this.payment = payment;
  }


  public String getModeTransport() {
    return modeTransport;
  }

  public void setModeTransport(String modeTransport) {
    this.modeTransport = modeTransport;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getCustomerType() {
    return customerType;
  }

  public void setCustomerType(String customerType) {
    this.customerType = customerType;
  }


  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  public String getUpdateCustomer() {
    return updateCustomer;
  }

  public void setUpdateCustomer(String updateCustomer) {
    this.updateCustomer = updateCustomer;
  }

  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public String getOfferTime() {
    return offerTime;
  }

  public void setOfferTime(String offerTime) {
    this.offerTime = offerTime;
  }

  public String getPeriodValidity() {
    return periodValidity;
  }

  public void setPeriodValidity(String periodValidity) {
    this.periodValidity = periodValidity;
  }

  public String getApprovalTime() {
    return approvalTime;
  }

  public void setApprovalTime(String approvalTime) {
    this.approvalTime = approvalTime;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public String getCreatorTime() {
    return creatorTime;
  }

  public void setCreatorTime(String creatorTime) {
    this.creatorTime = creatorTime;
  }
  /**
   * 显示数据
   * @return 显示数据
   */
  @Override
  public String toString() {
    return "Offer{" +
            "offerId=" + offerId +
            ", name='" + name + '\'' +
            ", notTaxAmount=" + notTaxAmount +
            ", grossProfit=" + grossProfit +
            ", taxAmount=" + taxAmount +
            ", salesAmount=" + salesAmount +
            ", freight=" + freight +
            ", offerTime='" + offerTime + '\'' +
            ", periodValidity='" + periodValidity + '\'' +
            ", offerUser='" + offerUser + '\'' +
            ", approvalStatus='" + approvalStatus + '\'' +
            ", approvalTime='" + approvalTime + '\'' +
            ", approverResults='" + approverResults + '\'' +
            ", payment='" + payment + '\'' +
            ", modeTransport='" + modeTransport + '\'' +
            ", remark='" + remark + '\'' +
            ", customerType='" + customerType + '\'' +
            ", customerId=" + customerId +
            ", customerName='" + customerName + '\'' +
            ", updateCustomer='" + updateCustomer + '\'' +
            ", updateTime='" + updateTime + '\'' +
            ", creator='" + creator + '\'' +
            ", creatorTime='" + creatorTime + '\'' +
            '}';
  }
}

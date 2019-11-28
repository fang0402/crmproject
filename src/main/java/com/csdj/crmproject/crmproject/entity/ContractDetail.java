/*
 * 文 件 名：
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */
package com.csdj.crmproject.crmproject.entity;


public class ContractDetail {

  private long pkContractDetailId;
  private long fkContractId;
  private String contractDetailName;
  private String contractAccessoryModeltype;
  private String contractAccessoryMeasurement;
  private long contractAccessoryNumber;
  private double contractAccessoryUnivalence;
  private double contractAccessoryPrice;
  private double contractAccessoryTotalsum;
  private double contractAccessoryDiscount;
  private double contractAccessoryGrossProfit;
  private double contractAccessoryRate;
  private double contractAccessoryRevenue;
  private double contractAccessorySaleroom;
  private java.sql.Timestamp gmtCreate;
  private java.sql.Timestamp gmtModified;
  private String sa;
  private String sb;
  private String sc;


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


  public String getContractAccessoryModeltype() {
    return contractAccessoryModeltype;
  }

  public void setContractAccessoryModeltype(String contractAccessoryModeltype) {
    this.contractAccessoryModeltype = contractAccessoryModeltype;
  }


  public String getContractAccessoryMeasurement() {
    return contractAccessoryMeasurement;
  }

  public void setContractAccessoryMeasurement(String contractAccessoryMeasurement) {
    this.contractAccessoryMeasurement = contractAccessoryMeasurement;
  }


  public long getContractAccessoryNumber() {
    return contractAccessoryNumber;
  }

  public void setContractAccessoryNumber(long contractAccessoryNumber) {
    this.contractAccessoryNumber = contractAccessoryNumber;
  }


  public double getContractAccessoryUnivalence() {
    return contractAccessoryUnivalence;
  }

  public void setContractAccessoryUnivalence(double contractAccessoryUnivalence) {
    this.contractAccessoryUnivalence = contractAccessoryUnivalence;
  }


  public double getContractAccessoryPrice() {
    return contractAccessoryPrice;
  }

  public void setContractAccessoryPrice(double contractAccessoryPrice) {
    this.contractAccessoryPrice = contractAccessoryPrice;
  }


  public double getContractAccessoryTotalsum() {
    return contractAccessoryTotalsum;
  }

  public void setContractAccessoryTotalsum(double contractAccessoryTotalsum) {
    this.contractAccessoryTotalsum = contractAccessoryTotalsum;
  }


  public double getContractAccessoryDiscount() {
    return contractAccessoryDiscount;
  }

  public void setContractAccessoryDiscount(double contractAccessoryDiscount) {
    this.contractAccessoryDiscount = contractAccessoryDiscount;
  }


  public double getContractAccessoryGrossProfit() {
    return contractAccessoryGrossProfit;
  }

  public void setContractAccessoryGrossProfit(double contractAccessoryGrossProfit) {
    this.contractAccessoryGrossProfit = contractAccessoryGrossProfit;
  }


  public double getContractAccessoryRate() {
    return contractAccessoryRate;
  }

  public void setContractAccessoryRate(double contractAccessoryRate) {
    this.contractAccessoryRate = contractAccessoryRate;
  }


  public double getContractAccessoryRevenue() {
    return contractAccessoryRevenue;
  }

  public void setContractAccessoryRevenue(double contractAccessoryRevenue) {
    this.contractAccessoryRevenue = contractAccessoryRevenue;
  }


  public double getContractAccessorySaleroom() {
    return contractAccessorySaleroom;
  }

  public void setContractAccessorySaleroom(double contractAccessorySaleroom) {
    this.contractAccessorySaleroom = contractAccessorySaleroom;
  }


  public java.sql.Timestamp getGmtCreate() {
    return gmtCreate;
  }

  public void setGmtCreate(java.sql.Timestamp gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public java.sql.Timestamp getGmtModified() {
    return gmtModified;
  }

  public void setGmtModified(java.sql.Timestamp gmtModified) {
    this.gmtModified = gmtModified;
  }


  public String getSa() {
    return sa;
  }

  public void setSa(String sa) {
    this.sa = sa;
  }


  public String getSb() {
    return sb;
  }

  public void setSb(String sb) {
    this.sb = sb;
  }


  public String getSc() {
    return sc;
  }

  public void setSc(String sc) {
    this.sc = sc;
  }

}

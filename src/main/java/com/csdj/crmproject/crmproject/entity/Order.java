/*
 * 文 件 名：
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */
package com.csdj.crmproject.crmproject.entity;


public class Order {

  private long orderId;
  private String orderName;
  private long fkCusTypeId;
  private long fkCusId;
  private String fkCusName;
  private long fkObjectTypeId;
  private long fkObjectId;
  private String fkObjectName;
  private String orderType;
  private double orderTotalsum;
  private double orderGrossProfit;
  private double orderRevenue;
  private double orderSaleroom;
  private String fkContactsId;
  private String orderPayment;
  private java.sql.Timestamp orderStartTime;
  private java.sql.Timestamp orderEndTime;
  private String orderConsigneeName;
  private String orderConsigneePhone;
  private String orderConsigneeEmail;
  private String orderConsigneeAddress;
  private double orderAmountRemitted;
  private double orderInvoiceAmount;
  private String orderApprovalStatus;
  private String orderApprovalResult;
  private java.sql.Timestamp orderApprovalTime;
  private java.sql.Timestamp gmtCreate;
  private String creator;
  private java.sql.Timestamp gmtModified;
  private String modifier;
  private String orderTransportation;
  private String orderSettlement;
  private String orderContext;
  private String sa;
  private String sb;
  private String sc;
  private String sd;
  private String se;


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public String getOrderName() {
    return orderName;
  }

  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }


  public long getFkCusTypeId() {
    return fkCusTypeId;
  }

  public void setFkCusTypeId(long fkCusTypeId) {
    this.fkCusTypeId = fkCusTypeId;
  }


  public long getFkCusId() {
    return fkCusId;
  }

  public void setFkCusId(long fkCusId) {
    this.fkCusId = fkCusId;
  }


  public String getFkCusName() {
    return fkCusName;
  }

  public void setFkCusName(String fkCusName) {
    this.fkCusName = fkCusName;
  }


  public long getFkObjectTypeId() {
    return fkObjectTypeId;
  }

  public void setFkObjectTypeId(long fkObjectTypeId) {
    this.fkObjectTypeId = fkObjectTypeId;
  }


  public long getFkObjectId() {
    return fkObjectId;
  }

  public void setFkObjectId(long fkObjectId) {
    this.fkObjectId = fkObjectId;
  }


  public String getFkObjectName() {
    return fkObjectName;
  }

  public void setFkObjectName(String fkObjectName) {
    this.fkObjectName = fkObjectName;
  }


  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }


  public double getOrderTotalsum() {
    return orderTotalsum;
  }

  public void setOrderTotalsum(double orderTotalsum) {
    this.orderTotalsum = orderTotalsum;
  }


  public double getOrderGrossProfit() {
    return orderGrossProfit;
  }

  public void setOrderGrossProfit(double orderGrossProfit) {
    this.orderGrossProfit = orderGrossProfit;
  }


  public double getOrderRevenue() {
    return orderRevenue;
  }

  public void setOrderRevenue(double orderRevenue) {
    this.orderRevenue = orderRevenue;
  }


  public double getOrderSaleroom() {
    return orderSaleroom;
  }

  public void setOrderSaleroom(double orderSaleroom) {
    this.orderSaleroom = orderSaleroom;
  }


  public String getFkContactsId() {
    return fkContactsId;
  }

  public void setFkContactsId(String fkContactsId) {
    this.fkContactsId = fkContactsId;
  }


  public String getOrderPayment() {
    return orderPayment;
  }

  public void setOrderPayment(String orderPayment) {
    this.orderPayment = orderPayment;
  }


  public java.sql.Timestamp getOrderStartTime() {
    return orderStartTime;
  }

  public void setOrderStartTime(java.sql.Timestamp orderStartTime) {
    this.orderStartTime = orderStartTime;
  }


  public java.sql.Timestamp getOrderEndTime() {
    return orderEndTime;
  }

  public void setOrderEndTime(java.sql.Timestamp orderEndTime) {
    this.orderEndTime = orderEndTime;
  }


  public String getOrderConsigneeName() {
    return orderConsigneeName;
  }

  public void setOrderConsigneeName(String orderConsigneeName) {
    this.orderConsigneeName = orderConsigneeName;
  }


  public String getOrderConsigneePhone() {
    return orderConsigneePhone;
  }

  public void setOrderConsigneePhone(String orderConsigneePhone) {
    this.orderConsigneePhone = orderConsigneePhone;
  }


  public String getOrderConsigneeEmail() {
    return orderConsigneeEmail;
  }

  public void setOrderConsigneeEmail(String orderConsigneeEmail) {
    this.orderConsigneeEmail = orderConsigneeEmail;
  }


  public String getOrderConsigneeAddress() {
    return orderConsigneeAddress;
  }

  public void setOrderConsigneeAddress(String orderConsigneeAddress) {
    this.orderConsigneeAddress = orderConsigneeAddress;
  }


  public double getOrderAmountRemitted() {
    return orderAmountRemitted;
  }

  public void setOrderAmountRemitted(double orderAmountRemitted) {
    this.orderAmountRemitted = orderAmountRemitted;
  }


  public double getOrderInvoiceAmount() {
    return orderInvoiceAmount;
  }

  public void setOrderInvoiceAmount(double orderInvoiceAmount) {
    this.orderInvoiceAmount = orderInvoiceAmount;
  }


  public String getOrderApprovalStatus() {
    return orderApprovalStatus;
  }

  public void setOrderApprovalStatus(String orderApprovalStatus) {
    this.orderApprovalStatus = orderApprovalStatus;
  }


  public String getOrderApprovalResult() {
    return orderApprovalResult;
  }

  public void setOrderApprovalResult(String orderApprovalResult) {
    this.orderApprovalResult = orderApprovalResult;
  }


  public java.sql.Timestamp getOrderApprovalTime() {
    return orderApprovalTime;
  }

  public void setOrderApprovalTime(java.sql.Timestamp orderApprovalTime) {
    this.orderApprovalTime = orderApprovalTime;
  }


  public java.sql.Timestamp getGmtCreate() {
    return gmtCreate;
  }

  public void setGmtCreate(java.sql.Timestamp gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }


  public java.sql.Timestamp getGmtModified() {
    return gmtModified;
  }

  public void setGmtModified(java.sql.Timestamp gmtModified) {
    this.gmtModified = gmtModified;
  }


  public String getModifier() {
    return modifier;
  }

  public void setModifier(String modifier) {
    this.modifier = modifier;
  }


  public String getOrderTransportation() {
    return orderTransportation;
  }

  public void setOrderTransportation(String orderTransportation) {
    this.orderTransportation = orderTransportation;
  }


  public String getOrderSettlement() {
    return orderSettlement;
  }

  public void setOrderSettlement(String orderSettlement) {
    this.orderSettlement = orderSettlement;
  }


  public String getOrderContext() {
    return orderContext;
  }

  public void setOrderContext(String orderContext) {
    this.orderContext = orderContext;
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


  public String getSd() {
    return sd;
  }

  public void setSd(String sd) {
    this.sd = sd;
  }


  public String getSe() {
    return se;
  }

  public void setSe(String se) {
    this.se = se;
  }

}

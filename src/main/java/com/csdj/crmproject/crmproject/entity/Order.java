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
 * 订单
 */
public class Order {
  /**
   * 订单编号
   */
  private long orderId;
  /**
   * 订单名称
   */
  private String orderName;
  /**
   * 用户类型编号
   */
  private long fkCusTypeId;
  /**
   * 用户编号
   */
  private long fkCusId;
  /**
   * 用户姓名
   */
  private String fkCusName;
  /**
   * 所属对象类型编号
   */
  private long fkObjectTypeId;
  /**
   * 所属对象编号
   */
  private long fkObjectId;
  /**
   * 所属对象姓名
   */
  private String fkObjectName;
  /**
   * 订单类型
   */
  private String orderType;
  /**
   * 不含税总额
   */
  private double orderTotalSum;
  /**
   * 毛利润
   */
  private double orderGrossProfit;
  /**
   * 税收
   */
  private double orderRevenue;
  /**
   * 销售额
   */
  private double orderSaleroom;
  /**
   * 签约人 联系人编号
   */
  private String fkContactsId;
  /**
   * 支付方式
   */
  private String orderPayment;
  /**
   * 开始时间
   */
  private String orderStartTime;
  /**
   * 结束时间
   */
  private String orderEndTime;
  /**
   * 收货人姓名
   */
  private String orderConsigneeName;
  /**
   * 收货人手机号
   */
  private String orderConsigneePhone;
  /**
   * 收货人email
   */
  private String orderConsigneeEmail;
  /**
   * 收货人地址
   */
  private String orderConsigneeAddress;
  /**
   * 已收款金额
   */
  private double orderAmountRemitted;
  /**
   * 已开票金额
   */
  private double orderInvoiceAmount;
  /**
   * 审批状态
   */
  private String orderApprovalStatus;
  /**
   * 审批结果
   */
  private String orderApprovalResult;
  /**
   * 审批时间
   */
  private String orderApprovalTime;
  /**
   * 创建时间
   */
  private String gmtCreate;
  /**
   * 创建人
   */
  private String creator;
  /**
   * 修改时间
   */
  private String gmtModified;
  /**
   * 修改人
   */
  private String modifier;
  /**
   * 运输方式
   */
  private String orderTransportation;
  /**
   * 结算方式
   */
  private String orderSettlement;
  /**
   * 备注
   */
  private String orderContext;

  /**
   * 用户id
   */
  private Integer fkUserId;
  /**
   * 无参构造
   */
  public Order() {
  }

  /**
   * 有参构造
   * @param orderId
   * @param orderName
   * @param fkCusTypeId
   * @param fkCusId
   * @param fkCusName
   * @param fkObjectTypeId
   * @param fkObjectId
   * @param fkObjectName
   * @param orderType
   * @param orderTotalSum
   * @param orderGrossProfit
   * @param orderRevenue
   * @param orderSaleroom
   * @param fkContactsId
   * @param orderPayment
   * @param orderStartTime
   * @param orderEndTime
   * @param orderConsigneeName
   * @param orderConsigneePhone
   * @param orderConsigneeEmail
   * @param orderConsigneeAddress
   * @param orderAmountRemitted
   * @param orderInvoiceAmount
   * @param orderApprovalStatus
   * @param orderApprovalResult
   * @param orderApprovalTime
   * @param gmtCreate
   * @param creator
   * @param gmtModified
   * @param modifier
   * @param orderTransportation
   * @param orderSettlement
   * @param orderContext
   */
  public Order(long orderId, String orderName, long fkCusTypeId, long fkCusId, String fkCusName, long fkObjectTypeId, long fkObjectId, String fkObjectName, String orderType, double orderTotalSum, double orderGrossProfit, double orderRevenue, double orderSaleroom, String fkContactsId, String orderPayment, String orderStartTime, String orderEndTime, String orderConsigneeName, String orderConsigneePhone, String orderConsigneeEmail, String orderConsigneeAddress, double orderAmountRemitted, double orderInvoiceAmount, String orderApprovalStatus, String orderApprovalResult, String orderApprovalTime, String gmtCreate, String creator, String gmtModified, String modifier, String orderTransportation, String orderSettlement, String orderContext, Integer fkUserId) {
    this.orderId = orderId;
    this.orderName = orderName;
    this.fkCusTypeId = fkCusTypeId;
    this.fkCusId = fkCusId;
    this.fkCusName = fkCusName;
    this.fkObjectTypeId = fkObjectTypeId;
    this.fkObjectId = fkObjectId;
    this.fkObjectName = fkObjectName;
    this.orderType = orderType;
    this.orderTotalSum = orderTotalSum;
    this.orderGrossProfit = orderGrossProfit;
    this.orderRevenue = orderRevenue;
    this.orderSaleroom = orderSaleroom;
    this.fkContactsId = fkContactsId;
    this.orderPayment = orderPayment;
    this.orderStartTime = orderStartTime;
    this.orderEndTime = orderEndTime;
    this.orderConsigneeName = orderConsigneeName;
    this.orderConsigneePhone = orderConsigneePhone;
    this.orderConsigneeEmail = orderConsigneeEmail;
    this.orderConsigneeAddress = orderConsigneeAddress;
    this.orderAmountRemitted = orderAmountRemitted;
    this.orderInvoiceAmount = orderInvoiceAmount;
    this.orderApprovalStatus = orderApprovalStatus;
    this.orderApprovalResult = orderApprovalResult;
    this.orderApprovalTime = orderApprovalTime;
    this.gmtCreate = gmtCreate;
    this.creator = creator;
    this.gmtModified = gmtModified;
    this.modifier = modifier;
    this.orderTransportation = orderTransportation;
    this.orderSettlement = orderSettlement;
    this.orderContext = orderContext;
    this.fkUserId = fkUserId;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "Order{" +
            "orderId=" + orderId +
            ", orderName='" + orderName + '\'' +
            ", fkCusTypeId=" + fkCusTypeId +
            ", fkCusId=" + fkCusId +
            ", fkCusName='" + fkCusName + '\'' +
            ", fkObjectTypeId=" + fkObjectTypeId +
            ", fkObjectId=" + fkObjectId +
            ", fkObjectName='" + fkObjectName + '\'' +
            ", orderType='" + orderType + '\'' +
            ", orderTotalSum=" + orderTotalSum +
            ", orderGrossProfit=" + orderGrossProfit +
            ", orderRevenue=" + orderRevenue +
            ", orderSaleroom=" + orderSaleroom +
            ", fkContactsId='" + fkContactsId + '\'' +
            ", orderPayment='" + orderPayment + '\'' +
            ", orderStartTime='" + orderStartTime + '\'' +
            ", orderEndTime='" + orderEndTime + '\'' +
            ", orderConsigneeName='" + orderConsigneeName + '\'' +
            ", orderConsigneePhone='" + orderConsigneePhone + '\'' +
            ", orderConsigneeEmail='" + orderConsigneeEmail + '\'' +
            ", orderConsigneeAddress='" + orderConsigneeAddress + '\'' +
            ", orderAmountRemitted=" + orderAmountRemitted +
            ", orderInvoiceAmount=" + orderInvoiceAmount +
            ", orderApprovalStatus='" + orderApprovalStatus + '\'' +
            ", orderApprovalResult='" + orderApprovalResult + '\'' +
            ", orderApprovalTime='" + orderApprovalTime + '\'' +
            ", gmtCreate='" + gmtCreate + '\'' +
            ", creator='" + creator + '\'' +
            ", gmtModified='" + gmtModified + '\'' +
            ", modifier='" + modifier + '\'' +
            ", orderTransportation='" + orderTransportation + '\'' +
            ", orderSettlement='" + orderSettlement + '\'' +
            ", orderContext='" + orderContext + '\'' +
            '}';
  }

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


  public double getOrderTotalSum() {
    return orderTotalSum;
  }

  public void setOrderTotalSum(double orderTotalSum) {
    this.orderTotalSum = orderTotalSum;
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


  public String getOrderStartTime() {
    return orderStartTime;
  }

  public void setOrderStartTime(String orderStartTime) {
    this.orderStartTime = orderStartTime;
  }


  public String getOrderEndTime() {
    return orderEndTime;
  }

  public void setOrderEndTime(String orderEndTime) {
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


  public String getOrderApprovalTime() {
    return orderApprovalTime;
  }

  public void setOrderApprovalTime(String orderApprovalTime) {
    this.orderApprovalTime = orderApprovalTime;
  }


  public String getGmtCreate() {
    return gmtCreate;
  }

  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }


  public String getGmtModified() {
    return gmtModified;
  }

  public void setGmtModified(String gmtModified) {
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



}

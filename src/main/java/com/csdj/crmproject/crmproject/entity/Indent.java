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
 *订单
 */
public class Indent {
  /**
   * 订单id
   */
  private long indentId;
  /**
   * 订单名称
   */
  private String indentName;
  /**
   * 客户类型编号
   */
  private long clientTypeId;
  /**
   * 客户编号
   */
  private long clientId;
  /**
   * 客户名称
   */
  private String clientName;
  /**
   * 所属对象类型编号
   */
  private long objectTypeId;
  /**
   * 所属对象编号
   */
  private long objectId;
  /**
   * 所属对象名称
   */
  private String objectName;
  /**
   * 分类
   */
  private String type;
  /**
   * 不含税总额
   */
  private double totalSum;
  /**
   * 毛利润
   */
  private double grossProfit;
  /**
   * 税额
   */
  private double revenue;
  /**
   * 销售额
   */
  private double saleroom;
  /**
   * 客户签约人
   */
  private String signPerson;
  /**
   * 付款方式
   */
  private String payment;
  /**
   * 开始时间
   */
  private String startTime;
  /**
   * 结束时间
   */
  private String endTime;
  /**
   * 收货人姓名
   */
  private String consigneeName;
  /**
   * 收货人电话
   */
  private String consigneePhone;
  /**
   * 收货人手机
   */
  private String consigneeEmail;
  /**
   * 收货人地址
   */
  private String consigneeAddress;
  /**
   * 已收款金额
   */
  private double amountRemitted;
  /**
   * 已开票金额
   */
  private double invoiceAmount;
  /**
   * 审批状态
   */
  private String approvalStatus;
  /**
   * 审批结果
   */
  private String approvalResult;
  /**
   * 审批时间
   */
  private String approvalTime;
  /**
   * 创建时间
   */
  private String createTime;
  /**
   * 创建人
   */
  private String creator;
  /**
   * 最后修改时间
   */
  private String modifyTime;
  /**
   * 最后修改人
   */
  private String modifier;
  /**
   * 运输方式
   */
  private String transportation;
  /**
   * 结算方式
   */
  private String settlement;
  /**
   * 备注
   */
  private String context;

  /**
   * 无参构造
   */
  public Indent() {
  }

  /**
   * 有参构造
   * @param indentId
   * @param indentName
   * @param clientTypeId
   * @param clientId
   * @param clientName
   * @param objectTypeId
   * @param objectId
   * @param objectName
   * @param type
   * @param totalSum
   * @param grossProfit
   * @param revenue
   * @param saleroom
   * @param signPerson
   * @param payment
   * @param startTime
   * @param endTime
   * @param consigneeName
   * @param consigneePhone
   * @param consigneeEmail
   * @param consigneeAddress
   * @param amountRemitted
   * @param invoiceAmount
   * @param approvalStatus
   * @param approvalResult
   * @param approvalTime
   * @param createTime
   * @param creator
   * @param modifyTime
   * @param modifier
   * @param transportation
   * @param settlement
   * @param context
   */
  public Indent(long indentId, String indentName, long clientTypeId, long clientId, String clientName, long objectTypeId, long objectId, String objectName, String type, double totalSum, double grossProfit, double revenue, double saleroom, String signPerson, String payment, String startTime, String endTime, String consigneeName, String consigneePhone, String consigneeEmail, String consigneeAddress, double amountRemitted, double invoiceAmount, String approvalStatus, String approvalResult, String approvalTime, String createTime, String creator, String modifyTime, String modifier, String transportation, String settlement, String context) {
    this.indentId = indentId;
    this.indentName = indentName;
    this.clientTypeId = clientTypeId;
    this.clientId = clientId;
    this.clientName = clientName;
    this.objectTypeId = objectTypeId;
    this.objectId = objectId;
    this.objectName = objectName;
    this.type = type;
    this.totalSum = totalSum;
    this.grossProfit = grossProfit;
    this.revenue = revenue;
    this.saleroom = saleroom;
    this.signPerson = signPerson;
    this.payment = payment;
    this.startTime = startTime;
    this.endTime = endTime;
    this.consigneeName = consigneeName;
    this.consigneePhone = consigneePhone;
    this.consigneeEmail = consigneeEmail;
    this.consigneeAddress = consigneeAddress;
    this.amountRemitted = amountRemitted;
    this.invoiceAmount = invoiceAmount;
    this.approvalStatus = approvalStatus;
    this.approvalResult = approvalResult;
    this.approvalTime = approvalTime;
    this.createTime = createTime;
    this.creator = creator;
    this.modifyTime = modifyTime;
    this.modifier = modifier;
    this.transportation = transportation;
    this.settlement = settlement;
    this.context = context;
  }

  /**
   * 显示方法
   * @return
   */
  @Override
  public String toString() {
    return "Indent{" +
            "indentId=" + indentId +
            ", indentName='" + indentName + '\'' +
            ", clientTypeId=" + clientTypeId +
            ", clientId=" + clientId +
            ", clientName='" + clientName + '\'' +
            ", objectTypeId=" + objectTypeId +
            ", objectId=" + objectId +
            ", objectName='" + objectName + '\'' +
            ", type='" + type + '\'' +
            ", totalSum=" + totalSum +
            ", grossProfit=" + grossProfit +
            ", revenue=" + revenue +
            ", saleroom=" + saleroom +
            ", signPerson='" + signPerson + '\'' +
            ", payment='" + payment + '\'' +
            ", startTime='" + startTime + '\'' +
            ", endTime='" + endTime + '\'' +
            ", consigneeName='" + consigneeName + '\'' +
            ", consigneePhone='" + consigneePhone + '\'' +
            ", consigneeEmail='" + consigneeEmail + '\'' +
            ", consigneeAddress='" + consigneeAddress + '\'' +
            ", amountRemitted=" + amountRemitted +
            ", invoiceAmount=" + invoiceAmount +
            ", approvalStatus='" + approvalStatus + '\'' +
            ", approvalResult='" + approvalResult + '\'' +
            ", approvalTime='" + approvalTime + '\'' +
            ", createTime='" + createTime + '\'' +
            ", creator='" + creator + '\'' +
            ", modifyTime='" + modifyTime + '\'' +
            ", modifier='" + modifier + '\'' +
            ", transportation='" + transportation + '\'' +
            ", settlement='" + settlement + '\'' +
            ", context='" + context + '\'' +
            '}';
  }

  public long getIndentId() {
    return indentId;
  }

  public void setIndentId(long indentId) {
    this.indentId = indentId;
  }

  public String getIndentName() {
    return indentName;
  }

  public void setIndentName(String indentName) {
    this.indentName = indentName;
  }

  public long getClientTypeId() {
    return clientTypeId;
  }

  public void setClientTypeId(long clientTypeId) {
    this.clientTypeId = clientTypeId;
  }

  public long getClientId() {
    return clientId;
  }

  public void setClientId(long clientId) {
    this.clientId = clientId;
  }

  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public long getObjectTypeId() {
    return objectTypeId;
  }

  public void setObjectTypeId(long objectTypeId) {
    this.objectTypeId = objectTypeId;
  }

  public long getObjectId() {
    return objectId;
  }

  public void setObjectId(long objectId) {
    this.objectId = objectId;
  }

  public String getObjectName() {
    return objectName;
  }

  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getTotalSum() {
    return totalSum;
  }

  public void setTotalSum(double totalSum) {
    this.totalSum = totalSum;
  }

  public double getGrossProfit() {
    return grossProfit;
  }

  public void setGrossProfit(double grossProfit) {
    this.grossProfit = grossProfit;
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

  public String getSignPerson() {
    return signPerson;
  }

  public void setSignPerson(String signPerson) {
    this.signPerson = signPerson;
  }

  public String getPayment() {
    return payment;
  }

  public void setPayment(String payment) {
    this.payment = payment;
  }

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public String getConsigneeName() {
    return consigneeName;
  }

  public void setConsigneeName(String consigneeName) {
    this.consigneeName = consigneeName;
  }

  public String getConsigneePhone() {
    return consigneePhone;
  }

  public void setConsigneePhone(String consigneePhone) {
    this.consigneePhone = consigneePhone;
  }

  public String getConsigneeEmail() {
    return consigneeEmail;
  }

  public void setConsigneeEmail(String consigneeEmail) {
    this.consigneeEmail = consigneeEmail;
  }

  public String getConsigneeAddress() {
    return consigneeAddress;
  }

  public void setConsigneeAddress(String consigneeAddress) {
    this.consigneeAddress = consigneeAddress;
  }

  public double getAmountRemitted() {
    return amountRemitted;
  }

  public void setAmountRemitted(double amountRemitted) {
    this.amountRemitted = amountRemitted;
  }

  public double getInvoiceAmount() {
    return invoiceAmount;
  }

  public void setInvoiceAmount(double invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }

  public String getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(String approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public String getApprovalResult() {
    return approvalResult;
  }

  public void setApprovalResult(String approvalResult) {
    this.approvalResult = approvalResult;
  }

  public String getApprovalTime() {
    return approvalTime;
  }

  public void setApprovalTime(String approvalTime) {
    this.approvalTime = approvalTime;
  }

  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public String getModifyTime() {
    return modifyTime;
  }

  public void setModifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
  }

  public String getModifier() {
    return modifier;
  }

  public void setModifier(String modifier) {
    this.modifier = modifier;
  }

  public String getTransportation() {
    return transportation;
  }

  public void setTransportation(String transportation) {
    this.transportation = transportation;
  }

  public String getSettlement() {
    return settlement;
  }

  public void setSettlement(String settlement) {
    this.settlement = settlement;
  }

  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }
}

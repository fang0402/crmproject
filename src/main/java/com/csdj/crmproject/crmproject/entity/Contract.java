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
 *合同
 */
public class Contract {
  /**
   *合同编号
   */
  private long contractId;
  /**
   *合同名称
   */
  private String contractName;
  /**
   *不含税总额
   */
  private double totalSum;
  /**
   *毛利润
   */
  private double grossProfit;
  /**
   *税收
   */
  private double revenue;
  /**
   *销售额
   */
  private double saleroom;
  /**
   *已汇款金额
   */
  private double amountRemitted;
  /**
   *已开票金额
   */
  private double invoiceAmount;
  /**
   *审批状态
   */
  private String approvalStatus;
  /**
   *审批结果
   */
  private String approvalResult;
  /**
   *审批时间
   */
  private String approvalTime;
  /**
   *合同类型
   */
  private String contractType;
  /**
   *关联客户类型id
   */
  private long clientTypeId;
  /**
   *关联客户id
   */
  private long clientId;
  /**
   *关联客户名称
   */
  private String clientName;
  /**
   *关联对象类型id
   */
  private long objectTypeId;
  /**
   *关联对象id
   */
  private long objectId;
  /**
   *关联对象姓名
   */
  private String objectName;
  /**
   *开始时间
   */
  private String startTime;
  /**
   *结束时间
   */
  private String endTime;
  /**
   *客户签约人
   */
  private String signPerson;
  /**
   *负责人
   */
  private String principal;
  /**
   *支付方式
   */
  private String payment;
  /**
   *备注
   */
  private String context;
  /**
   *创建人
   */
  private String creator;
  /**
   *创建时间
   */
  private String createTime;
  /**
   *修改人
   */
  private String modifier;
  /**
   *修改时间
   */
  private String modifyTime;




  /**
   * 无参构造
   */
  public Contract() {
  }

  /**
   * 有参构造
   * @param contractId
   * @param contractName
   * @param totalSum
   * @param grossProfit
   * @param revenue
   * @param saleroom
   * @param amountRemitted
   * @param invoiceAmount
   * @param approvalStatus
   * @param approvalResult
   * @param approvalTime
   * @param contractType
   * @param clientTypeId
   * @param clientId
   * @param clientName
   * @param objectTypeId
   * @param objectId
   * @param objectName
   * @param startTime
   * @param endTime
   * @param signPerson
   * @param principal
   * @param payment
   * @param context
   * @param creator
   * @param createTime
   * @param modifier
   * @param modifyTime
   */
  public Contract(long contractId, String contractName, double totalSum, double grossProfit, double revenue, double saleroom, double amountRemitted, double invoiceAmount, String approvalStatus, String approvalResult, String approvalTime, String contractType, long clientTypeId, long clientId, String clientName, long objectTypeId, long objectId, String objectName, String startTime, String endTime, String signPerson, String principal, String payment, String context, String creator, String createTime, String modifier, String modifyTime) {
    this.contractId = contractId;
    this.contractName = contractName;
    this.totalSum = totalSum;
    this.grossProfit = grossProfit;
    this.revenue = revenue;
    this.saleroom = saleroom;
    this.amountRemitted = amountRemitted;
    this.invoiceAmount = invoiceAmount;
    this.approvalStatus = approvalStatus;
    this.approvalResult = approvalResult;
    this.approvalTime = approvalTime;
    this.contractType = contractType;
    this.clientTypeId = clientTypeId;
    this.clientId = clientId;
    this.clientName = clientName;
    this.objectTypeId = objectTypeId;
    this.objectId = objectId;
    this.objectName = objectName;
    this.startTime = startTime;
    this.endTime = endTime;
    this.signPerson = signPerson;
    this.principal = principal;
    this.payment = payment;
    this.context = context;
    this.creator = creator;
    this.createTime = createTime;
    this.modifier = modifier;
    this.modifyTime = modifyTime;

  }

  /**
   * 显示数据方法
   * @return
   */
  @Override
  public String toString() {
    return "Contract{" +
            "contractId=" + contractId +
            ", contractName='" + contractName + '\'' +
            ", totalSum=" + totalSum +
            ", grossProfit=" + grossProfit +
            ", revenue=" + revenue +
            ", saleroom=" + saleroom +
            ", amountRemitted=" + amountRemitted +
            ", invoiceAmount=" + invoiceAmount +
            ", approvalStatus='" + approvalStatus + '\'' +
            ", approvalResult='" + approvalResult + '\'' +
            ", approvalTime='" + approvalTime + '\'' +
            ", contractType='" + contractType + '\'' +
            ", clientTypeId=" + clientTypeId +
            ", clientId=" + clientId +
            ", clientName='" + clientName + '\'' +
            ", objectTypeId=" + objectTypeId +
            ", objectId=" + objectId +
            ", objectName='" + objectName + '\'' +
            ", startTime='" + startTime + '\'' +
            ", endTime='" + endTime + '\'' +
            ", signPerson='" + signPerson + '\'' +
            ", principal='" + principal + '\'' +
            ", payment='" + payment + '\'' +
            ", context='" + context + '\'' +
            ", creator='" + creator + '\'' +
            ", createTime='" + createTime + '\'' +
            ", modifier='" + modifier + '\'' +
            ", modifyTime='" + modifyTime + '\'' +
            '}';
  }

  public long getContractId() {
    return contractId;
  }

  public void setContractId(long contractId) {
    this.contractId = contractId;
  }


  public String getContractName() {
    return contractName;
  }

  public void setContractName(String contractName) {
    this.contractName = contractName;
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


  public String getContractType() {
    return contractType;
  }

  public void setContractType(String contractType) {
    this.contractType = contractType;
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


  public long getObjectid() {
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


  public String getSignPerson() {
    return signPerson;
  }

  public void setSignPerson(String signPerson) {
    this.signPerson = signPerson;
  }


  public String getPrincipal() {
    return principal;
  }

  public void setPrincipal(String principal) {
    this.principal = principal;
  }


  public String getPayment() {
    return payment;
  }

  public void setPayment(String payment) {
    this.payment = payment;
  }


  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }


  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }


  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public String getModifier() {
    return modifier;
  }

  public void setModifier(String modifier) {
    this.modifier = modifier;
  }


  public String getModifyTime() {
    return modifyTime;
  }

  public void setModifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
  }


}

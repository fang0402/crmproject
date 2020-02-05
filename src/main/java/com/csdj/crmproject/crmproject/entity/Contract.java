/*
 * 文 件 名：
 * 版权(c) 2019-雷升公司  crm项目组：
 * 版 本 号： 1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author 尹嘉丽
 * @version 1.0
 * @date 2019-11-28
 * 合同
 */
public class Contract {
  /**
   * 合同编号
   */
  private long pkContractId;
  /**
   * 合同名称
   */
  private String contractName;
  /**
   * 不含税总额
   */
  private double contractTotalSum;
  /**
   * 毛利润
   */
  private double contractGrossProfit;
  /**
   * 税收
   */
  private double contractRevenue;
  /**
   * 销售额
   */
  private double contractSaleroom;
  /**
   * 已汇款金额
   */
  private double contractAmountRemitted;
  /**
   * 已开票金额
   */
  private double contractInvoiceAmount;
  /**
   * 审批状态
   */
  private String contractApprovalStatus;
  /**
   * 审批结果
   */
  private String contractApprovalResult;
  /**
   * 审批时间
   */
  private String contractApprovalTime;
  /**
   * 合同类型
   */
  private String contractType;
  /**
   * 关联客户类型编号
   */
  private long fkCusTypeId;
  /**
   * 客户编号
   */
  private long fkCusId;
  /**
   * 客户名称
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
   * 开始时间
   */
  private String startTime;
  /**
   * 结束时间
   */
  private String endTime;
  /**
   * 签约人编号 关联联系人表
   */
  private String fkContactsId;
  /**
   * 负责人 关联用户表
   */
  private String fkUserId;
  /**
   * 支付方式
   */
  private String contractPayment;
  /**
   * 备注
   */
  private String contractContext;
  /**
   * 创建人
   */
  private String creator;
  /**
   * 创建时间
   */
  private String gmtCreate;
  /**
   * 修改人
   */
  private String modifier;
  /**
   * 修改时间
   */
  private String gmtModified;

  /**
   * 无参构造
   */
  public Contract() {
  }

  /**
   * 有参构造
   * @param pkContractId
   * @param contractName
   * @param contractTotalSum
   * @param contractGrossProfit
   * @param contractRevenue
   * @param contractSaleroom
   * @param contractAmountRemitted
   * @param contractInvoiceAmount
   * @param contractApprovalStatus
   * @param contractApprovalResult
   * @param contractApprovalTime
   * @param contractType
   * @param fkCusTypeId
   * @param fkCusId
   * @param fkCusName
   * @param fkObjectTypeId
   * @param fkObjectId
   * @param fkObjectName
   * @param startTime
   * @param endTime
   * @param fkContactsId
   * @param fkUserId
   * @param contractPayment
   * @param contractContext
   * @param creator
   * @param gmtCreate
   * @param modifier
   * @param gmtModified
   */
  public Contract(long pkContractId, String contractName, double contractTotalSum, double contractGrossProfit, double contractRevenue, double contractSaleroom, double contractAmountRemitted, double contractInvoiceAmount, String contractApprovalStatus, String contractApprovalResult, String contractApprovalTime, String contractType, long fkCusTypeId, long fkCusId, String fkCusName, long fkObjectTypeId, long fkObjectId, String fkObjectName, String startTime, String endTime, String fkContactsId, String fkUserId, String contractPayment, String contractContext, String creator, String gmtCreate, String modifier, String gmtModified) {
    this.pkContractId = pkContractId;
    this.contractName = contractName;
    this.contractTotalSum = contractTotalSum;
    this.contractGrossProfit = contractGrossProfit;
    this.contractRevenue = contractRevenue;
    this.contractSaleroom = contractSaleroom;
    this.contractAmountRemitted = contractAmountRemitted;
    this.contractInvoiceAmount = contractInvoiceAmount;
    this.contractApprovalStatus = contractApprovalStatus;
    this.contractApprovalResult = contractApprovalResult;
    this.contractApprovalTime = contractApprovalTime;
    this.contractType = contractType;
    this.fkCusTypeId = fkCusTypeId;
    this.fkCusId = fkCusId;
    this.fkCusName = fkCusName;
    this.fkObjectTypeId = fkObjectTypeId;
    this.fkObjectId = fkObjectId;
    this.fkObjectName = fkObjectName;
    this.startTime = startTime;
    this.endTime = endTime;
    this.fkContactsId = fkContactsId;
    this.fkUserId = fkUserId;
    this.contractPayment = contractPayment;
    this.contractContext = contractContext;
    this.creator = creator;
    this.gmtCreate = gmtCreate;
    this.modifier = modifier;
    this.gmtModified = gmtModified;
  }

  /**
   * 显示数据方法
   * @return
   */
  @Override
  public String toString() {
    return "Contract{" +
            "pkContractId=" + pkContractId +
            ", contractName='" + contractName + '\'' +
            ", contractTotalSum=" + contractTotalSum +
            ", contractGrossProfit=" + contractGrossProfit +
            ", contractRevenue=" + contractRevenue +
            ", contractSaleroom=" + contractSaleroom +
            ", contractAmountRemitted=" + contractAmountRemitted +
            ", contractInvoiceAmount=" + contractInvoiceAmount +
            ", contractApprovalStatus='" + contractApprovalStatus + '\'' +
            ", contractApprovalResult='" + contractApprovalResult + '\'' +
            ", contractApprovalTime='" + contractApprovalTime + '\'' +
            ", contractType='" + contractType + '\'' +
            ", fkCusTypeId=" + fkCusTypeId +
            ", fkCusId=" + fkCusId +
            ", fkCusName='" + fkCusName + '\'' +
            ", fkObjectTypeId=" + fkObjectTypeId +
            ", fkObjectId=" + fkObjectId +
            ", fkObjectName='" + fkObjectName + '\'' +
            ", startTime='" + startTime + '\'' +
            ", endTime='" + endTime + '\'' +
            ", fkContactsId='" + fkContactsId + '\'' +
            ", fkUserId='" + fkUserId + '\'' +
            ", contractPayment='" + contractPayment + '\'' +
            ", contractContext='" + contractContext + '\'' +
            ", creator='" + creator + '\'' +
            ", gmtCreate='" + gmtCreate + '\'' +
            ", modifier='" + modifier + '\'' +
            ", gmtModified='" + gmtModified + '\'' +
            '}';
  }

  public long getPkContractId() {
    return pkContractId;
  }

  public void setPkContractId(long pkContractId) {
    this.pkContractId = pkContractId;
  }

  public String getContractName() {
    return contractName;
  }

  public void setContractName(String contractName) {
    this.contractName = contractName;
  }

  public double getContractTotalSum() {
    return contractTotalSum;
  }

  public void setContractTotalSum(double contractTotalSum) {
    this.contractTotalSum = contractTotalSum;
  }

  public double getContractGrossProfit() {
    return contractGrossProfit;
  }

  public void setContractGrossProfit(double contractGrossProfit) {
    this.contractGrossProfit = contractGrossProfit;
  }

  public double getContractRevenue() {
    return contractRevenue;
  }

  public void setContractRevenue(double contractRevenue) {
    this.contractRevenue = contractRevenue;
  }

  public double getContractSaleroom() {
    return contractSaleroom;
  }

  public void setContractSaleroom(double contractSaleroom) {
    this.contractSaleroom = contractSaleroom;
  }

  public double getContractAmountRemitted() {
    return contractAmountRemitted;
  }

  public void setContractAmountRemitted(double contractAmountRemitted) {
    this.contractAmountRemitted = contractAmountRemitted;
  }

  public double getContractInvoiceAmount() {
    return contractInvoiceAmount;
  }

  public void setContractInvoiceAmount(double contractInvoiceAmount) {
    this.contractInvoiceAmount = contractInvoiceAmount;
  }

  public String getContractApprovalStatus() {
    return contractApprovalStatus;
  }

  public void setContractApprovalStatus(String contractApprovalStatus) {
    this.contractApprovalStatus = contractApprovalStatus;
  }

  public String getContractApprovalResult() {
    return contractApprovalResult;
  }

  public void setContractApprovalResult(String contractApprovalResult) {
    this.contractApprovalResult = contractApprovalResult;
  }

  public String getContractApprovalTime() {
    return contractApprovalTime;
  }

  public void setContractApprovalTime(String contractApprovalTime) {
    this.contractApprovalTime = contractApprovalTime;
  }

  public String getContractType() {
    return contractType;
  }

  public void setContractType(String contractType) {
    this.contractType = contractType;
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

  public String getFkContactsId() {
    return fkContactsId;
  }

  public void setFkContactsId(String fkContactsId) {
    this.fkContactsId = fkContactsId;
  }

  public String getFkUserId() {
    return fkUserId;
  }

  public void setFkUserId(String fkUserId) {
    this.fkUserId = fkUserId;
  }

  public String getContractPayment() {
    return contractPayment;
  }

  public void setContractPayment(String contractPayment) {
    this.contractPayment = contractPayment;
  }

  public String getContractContext() {
    return contractContext;
  }

  public void setContractContext(String contractContext) {
    this.contractContext = contractContext;
  }

  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public String getGmtCreate() {
    return gmtCreate;
  }

  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }

  public String getModifier() {
    return modifier;
  }

  public void setModifier(String modifier) {
    this.modifier = modifier;
  }

  public String getGmtModified() {
    return gmtModified;
  }

  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }
}

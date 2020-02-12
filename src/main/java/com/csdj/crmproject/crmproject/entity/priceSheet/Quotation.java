/*
 * 文 件 名：报价单实体类
 * 版权(c) 2019-雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject. priceSheet.entity;


/**
 * @author 刘磊
 * @version 1.0
 * @date 2020-2-12
 */
public class Quotation {
  /**
   * Description ：  无参构造函数
   * @param：  无
   */
  public Quotation() {
  }

  /**
   * Description ：  有参构造函数
   * @param pkQuoId
   * @param quoName
   * @param quoNotTaxAmount
   * @param quoGrossProfit
   * @param quoTaxAmount
   * @param quoSalesAmount
   * @param quoFreight
   * @param quoTime
   * @param quoPeriodValidity
   * @param quoUser
   * @param quoApprovalStatus
   * @param quoApprovalTime
   * @param quoApproverResults
   * @param quoPayment
   * @param quoModeTransport
   * @param quoRemark
   * @param quoCusType
   * @param fkCusId
   * @param quoCusName
   * @param quoUpdateCustomer
   * @param quoGmtModified
   * @param quoCreator
   * @param quoGmtCreate
   */
  public Quotation(long pkQuoId, String quoName, double quoNotTaxAmount, double quoGrossProfit, double quoTaxAmount, double quoSalesAmount, double quoFreight, String quoTime, String quoPeriodValidity, String quoUser, String quoApprovalStatus, String quoApprovalTime, String quoApproverResults, String quoPayment, String quoModeTransport, String quoRemark, String quoCusType, long fkCusId, String quoCusName, String quoUpdateCustomer, String quoGmtModified, String quoCreator, String quoGmtCreate) {
    this.pkQuoId = pkQuoId;
    this.quoName = quoName;
    this.quoNotTaxAmount = quoNotTaxAmount;
    this.quoGrossProfit = quoGrossProfit;
    this.quoTaxAmount = quoTaxAmount;
    this.quoSalesAmount = quoSalesAmount;
    this.quoFreight = quoFreight;
    this.quoTime = quoTime;
    this.quoPeriodValidity = quoPeriodValidity;
    this.quoUser = quoUser;
    this.quoApprovalStatus = quoApprovalStatus;
    this.quoApprovalTime = quoApprovalTime;
    this.quoApproverResults = quoApproverResults;
    this.quoPayment = quoPayment;
    this.quoModeTransport = quoModeTransport;
    this.quoRemark = quoRemark;
    this.quoCusType = quoCusType;
    this.fkCusId = fkCusId;
    this.quoCusName = quoCusName;
    this.quoUpdateCustomer = quoUpdateCustomer;
    this.quoGmtModified = quoGmtModified;
    this.quoCreator = quoCreator;
    this.quoGmtCreate = quoGmtCreate;
  }

  /**
   *报价单id
   */
  private long pkQuoId;
  /**
   *名称
   */
  private String quoName;
  /**
   *不含税总额
   */
  private double quoNotTaxAmount;
  /**
   *毛利润
   */
  private double quoGrossProfit;
  /**
   *税额
   */
  private double quoTaxAmount;
  /**
   *销售额
   */
  private double quoSalesAmount;
  /**
   *运费
   */
  private double quoFreight;
  /**
   *报价日期
   */
  private String quoTime;
  /**
   *有效期
   */
  private String quoPeriodValidity;
  /**
   *报价人
   */
  private String quoUser;
  /**
   *审批状态
   */
  private String quoApprovalStatus;
  /**
   *审批时间
   */
  private String quoApprovalTime;
  /**
   *审批结果
   */
  private String quoApproverResults;
  /**
   *付款方式
   */
  private String quoPayment;
  /**
   *运输方式
   */
  private String quoModeTransport;
  /**
   *备注
   */
  private String quoRemark;
  /**
   *所属客户类型
   */
  private String quoCusType;
  /**
   *所属客户id
   */
  private long fkCusId;
  /**
   *所属客户名称
   */
  private String quoCusName;
  /**
   *最后修改人
   */
  private String quoUpdateCustomer;
  /**
   *最后修改时间
   */
  private String quoGmtModified;
  /**
   *创建人
   */
  private String quoCreator;
  /**
   *创建时间
   */
  private String quoGmtCreate;



  public long getPkQuoId() {
    return pkQuoId;
  }

  public void setPkQuoId(long pkQuoId) {
    this.pkQuoId = pkQuoId;
  }


  public String getQuoName() {
    return quoName;
  }

  public void setQuoName(String quoName) {
    this.quoName = quoName;
  }


  public double getQuoNotTaxAmount() {
    return quoNotTaxAmount;
  }

  public void setQuoNotTaxAmount(double quoNotTaxAmount) {
    this.quoNotTaxAmount = quoNotTaxAmount;
  }


  public double getQuoGrossProfit() {
    return quoGrossProfit;
  }

  public void setQuoGrossProfit(double quoGrossProfit) {
    this.quoGrossProfit = quoGrossProfit;
  }


  public double getQuoTaxAmount() {
    return quoTaxAmount;
  }

  public void setQuoTaxAmount(double quoTaxAmount) {
    this.quoTaxAmount = quoTaxAmount;
  }


  public double getQuoSalesAmount() {
    return quoSalesAmount;
  }

  public void setQuoSalesAmount(double quoSalesAmount) {
    this.quoSalesAmount = quoSalesAmount;
  }


  public double getQuoFreight() {
    return quoFreight;
  }

  public void setQuoFreight(double quoFreight) {
    this.quoFreight = quoFreight;
  }

  public String getQuoTime() {
    return quoTime;
  }

  public void setQuoTime(String quoTime) {
    this.quoTime = quoTime;
  }

  public String getQuoPeriodValidity() {
    return quoPeriodValidity;
  }

  public void setQuoPeriodValidity(String quoPeriodValidity) {
    this.quoPeriodValidity = quoPeriodValidity;
  }

  public String getQuoUser() {
    return quoUser;
  }

  public void setQuoUser(String quoUser) {
    this.quoUser = quoUser;
  }

  public String getQuoApprovalStatus() {
    return quoApprovalStatus;
  }

  public void setQuoApprovalStatus(String quoApprovalStatus) {
    this.quoApprovalStatus = quoApprovalStatus;
  }

  public String getQuoApprovalTime() {
    return quoApprovalTime;
  }

  public void setQuoApprovalTime(String quoApprovalTime) {
    this.quoApprovalTime = quoApprovalTime;
  }

  public String getQuoApproverResults() {
    return quoApproverResults;
  }

  public void setQuoApproverResults(String quoApproverResults) {
    this.quoApproverResults = quoApproverResults;
  }

  public String getQuoPayment() {
    return quoPayment;
  }

  public void setQuoPayment(String quoPayment) {
    this.quoPayment = quoPayment;
  }

  public String getQuoModeTransport() {
    return quoModeTransport;
  }

  public void setQuoModeTransport(String quoModeTransport) {
    this.quoModeTransport = quoModeTransport;
  }

  public String getQuoRemark() {
    return quoRemark;
  }

  public void setQuoRemark(String quoRemark) {
    this.quoRemark = quoRemark;
  }

  public String getQuoCusType() {
    return quoCusType;
  }

  public void setQuoCusType(String quoCusType) {
    this.quoCusType = quoCusType;
  }

  public long getFkCusId() {
    return fkCusId;
  }

  public void setFkCusId(long fkCusId) {
    this.fkCusId = fkCusId;
  }

  public String getQuoCusName() {
    return quoCusName;
  }

  public void setQuoCusName(String quoCusName) {
    this.quoCusName = quoCusName;
  }

  public String getQuoUpdateCustomer() {
    return quoUpdateCustomer;
  }

  public void setQuoUpdateCustomer(String quoUpdateCustomer) {
    this.quoUpdateCustomer = quoUpdateCustomer;
  }

  public String getQuoGmtModified() {
    return quoGmtModified;
  }

  public void setQuoGmtModified(String quoGmtModified) {
    this.quoGmtModified = quoGmtModified;
  }

  public String getQuoCreator() {
    return quoCreator;
  }

  public void setQuoCreator(String quoCreator) {
    this.quoCreator = quoCreator;
  }

  public String getQuoGmtCreate() {
    return quoGmtCreate;
  }

  public void setQuoGmtCreate(String quoGmtCreate) {
    this.quoGmtCreate = quoGmtCreate;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "Quotation{" +
            "pkQuoId=" + pkQuoId +
            ", quoName='" + quoName + '\'' +
            ", quoNotTaxAmount=" + quoNotTaxAmount +
            ", quoGrossProfit=" + quoGrossProfit +
            ", quoTaxAmount=" + quoTaxAmount +
            ", quoSalesAmount=" + quoSalesAmount +
            ", quoFreight=" + quoFreight +
            ", quoTime='" + quoTime + '\'' +
            ", quoPeriodValidity='" + quoPeriodValidity + '\'' +
            ", quoUser='" + quoUser + '\'' +
            ", quoApprovalStatus='" + quoApprovalStatus + '\'' +
            ", quoApprovalTime='" + quoApprovalTime + '\'' +
            ", quoApproverResults='" + quoApproverResults + '\'' +
            ", quoPayment='" + quoPayment + '\'' +
            ", quoModeTransport='" + quoModeTransport + '\'' +
            ", quoRemark='" + quoRemark + '\'' +
            ", quoCusType='" + quoCusType + '\'' +
            ", fkCusId=" + fkCusId +
            ", quoCusName='" + quoCusName + '\'' +
            ", quoUpdateCustomer='" + quoUpdateCustomer + '\'' +
            ", quoGmtModified='" + quoGmtModified + '\'' +
            ", quoCreator='" + quoCreator + '\'' +
            ", quoGmtCreate='" + quoGmtCreate + '\'' +
            '}';
  }
}

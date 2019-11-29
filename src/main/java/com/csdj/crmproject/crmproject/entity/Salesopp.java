/*
 * 文 件 名：销售机会实体类
 * 版权(c) 2019-雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;



/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-27
 */
public class Salesopp {
  /**
   * Description ：  无参构造函数
   * @param：  无
   */
  public Salesopp() {
  }

  /**
   * Description ：  有参构造函数
   * @param pkSalesoppId
   * @param salesoppName
   * @param cusType
   * @param fkCusId
   * @param salesoppCusName
   * @param fkUserId
   * @param salesoppDistime
   * @param salesoppExpectedSigningTime
   * @param salesoppExpectedSigningMoney
   * @param salesoppAnticipatedProfit
   * @param salesoppSource
   * @param fkCurrentGenerationId
   * @param salesoppStatus
   * @param salesoppStateProcessingTime
   * @param salesoppCusDemand
   * @param salesoppCreator
   * @param salesoppGmtCreate
   * @param salesoppRemark
   * @param salesoppGmtModified
   */
  public Salesopp(long pkSalesoppId, String salesoppName, String cusType, long fkCusId, String salesoppCusName, long fkUserId, String salesoppDistime, String salesoppExpectedSigningTime, double salesoppExpectedSigningMoney, double salesoppAnticipatedProfit, String salesoppSource, long fkCurrentGenerationId, long salesoppStatus, String salesoppStateProcessingTime, String salesoppCusDemand, String salesoppCreator, String salesoppGmtCreate, String salesoppRemark, String salesoppGmtModified) {
    this.pkSalesoppId = pkSalesoppId;
    this.salesoppName = salesoppName;
    this.cusType = cusType;
    this.fkCusId = fkCusId;
    this.salesoppCusName = salesoppCusName;
    this.fkUserId = fkUserId;
    this.salesoppDistime = salesoppDistime;
    this.salesoppExpectedSigningTime = salesoppExpectedSigningTime;
    this.salesoppExpectedSigningMoney = salesoppExpectedSigningMoney;
    this.salesoppAnticipatedProfit = salesoppAnticipatedProfit;
    this.salesoppSource = salesoppSource;
    this.fkCurrentGenerationId = fkCurrentGenerationId;
    this.salesoppStatus = salesoppStatus;
    this.salesoppStateProcessingTime = salesoppStateProcessingTime;
    this.salesoppCusDemand = salesoppCusDemand;
    this.salesoppCreator = salesoppCreator;
    this.salesoppGmtCreate = salesoppGmtCreate;
    this.salesoppRemark = salesoppRemark;
    this.salesoppGmtModified = salesoppGmtModified;
  }
  /**
   *销售机会id
   */
  private long pkSalesoppId;
  /**
   * 销售机会名称
   */
  private String salesoppName;
  /**
   * 所属客户类型
   */
  private String cusType;
  /**
   * 所属客户id外键
   */
  private long fkCusId;
  /**
   * 所属客户名称
   */
  private String salesoppCusName;
  /**
   * 负责人id
   */
  private long fkUserId;
  /**
   * 分派时间
   */
  private String salesoppDistime;
  /**
   * 预计签单时间
   */
  private String salesoppExpectedSigningTime;
  /**
   * 预计签单金额
   */
  private double salesoppExpectedSigningMoney;
  /**
   * 预计利润
   */
  private double salesoppAnticipatedProfit;
  /**
   * 来源
   */
  private String salesoppSource;
  /**
   * 当前阶段id
   */
  private long fkCurrentGenerationId;
  /**
   * 销售机会状态
   */
  private long salesoppStatus;
  /**
   * 状态处理时间
   */
  private String salesoppStateProcessingTime;
  /**
   * 客户需求
   */
  private String salesoppCusDemand;
  /**
   * 创建人
   */
  private String salesoppCreator;
  /**
   * 创建时间
   */
  private String salesoppGmtCreate;
  /**
   * 备注
   */
  private String salesoppRemark;
  /**
   * 修改时间
   */
  private String salesoppGmtModified;


  public long getPkSalesoppId() {
    return pkSalesoppId;
  }

  public void setPkSalesoppId(long pkSalesoppId) {
    this.pkSalesoppId = pkSalesoppId;
  }


  public String getSalesoppName() {
    return salesoppName;
  }

  public void setSalesoppName(String salesoppName) {
    this.salesoppName = salesoppName;
  }


  public String getCusType() {
    return cusType;
  }

  public void setCusType(String cusType) {
    this.cusType = cusType;
  }


  public long getFkCusId() {
    return fkCusId;
  }

  public void setFkCusId(long fkCusId) {
    this.fkCusId = fkCusId;
  }


  public String getSalesoppCusName() {
    return salesoppCusName;
  }

  public void setSalesoppCusName(String salesoppCusName) {
    this.salesoppCusName = salesoppCusName;
  }


  public long getFkUserId() {
    return fkUserId;
  }

  public void setFkUserId(long fkUserId) {
    this.fkUserId = fkUserId;
  }

  public String getSalesoppDistime() {
    return salesoppDistime;
  }

  public void setSalesoppDistime(String salesoppDistime) {
    this.salesoppDistime = salesoppDistime;
  }

  public String getSalesoppExpectedSigningTime() {
    return salesoppExpectedSigningTime;
  }

  public void setSalesoppExpectedSigningTime(String salesoppExpectedSigningTime) {
    this.salesoppExpectedSigningTime = salesoppExpectedSigningTime;
  }

  public double getSalesoppExpectedSigningMoney() {
    return salesoppExpectedSigningMoney;
  }

  public void setSalesoppExpectedSigningMoney(double salesoppExpectedSigningMoney) {
    this.salesoppExpectedSigningMoney = salesoppExpectedSigningMoney;
  }

  public double getSalesoppAnticipatedProfit() {
    return salesoppAnticipatedProfit;
  }

  public void setSalesoppAnticipatedProfit(double salesoppAnticipatedProfit) {
    this.salesoppAnticipatedProfit = salesoppAnticipatedProfit;
  }

  public String getSalesoppSource() {
    return salesoppSource;
  }

  public void setSalesoppSource(String salesoppSource) {
    this.salesoppSource = salesoppSource;
  }

  public long getFkCurrentGenerationId() {
    return fkCurrentGenerationId;
  }

  public void setFkCurrentGenerationId(long fkCurrentGenerationId) {
    this.fkCurrentGenerationId = fkCurrentGenerationId;
  }

  public long getSalesoppStatus() {
    return salesoppStatus;
  }

  public void setSalesoppStatus(long salesoppStatus) {
    this.salesoppStatus = salesoppStatus;
  }

  public String getSalesoppStateProcessingTime() {
    return salesoppStateProcessingTime;
  }

  public void setSalesoppStateProcessingTime(String salesoppStateProcessingTime) {
    this.salesoppStateProcessingTime = salesoppStateProcessingTime;
  }

  public String getSalesoppCusDemand() {
    return salesoppCusDemand;
  }

  public void setSalesoppCusDemand(String salesoppCusDemand) {
    this.salesoppCusDemand = salesoppCusDemand;
  }

  public String getSalesoppCreator() {
    return salesoppCreator;
  }

  public void setSalesoppCreator(String salesoppCreator) {
    this.salesoppCreator = salesoppCreator;
  }

  public String getSalesoppGmtCreate() {
    return salesoppGmtCreate;
  }

  public void setSalesoppGmtCreate(String salesoppGmtCreate) {
    this.salesoppGmtCreate = salesoppGmtCreate;
  }

  public String getSalesoppRemark() {
    return salesoppRemark;
  }

  public void setSalesoppRemark(String salesoppRemark) {
    this.salesoppRemark = salesoppRemark;
  }

  public String getSalesoppGmtModified() {
    return salesoppGmtModified;
  }

  public void setSalesoppGmtModified(String salesoppGmtModified) {
    this.salesoppGmtModified = salesoppGmtModified;
  }

  /**
   * 显示数据
   * @return 显示数据
   */
  @Override
  public String toString() {
    return "Salesopp{" +
            "pkSalesoppId=" + pkSalesoppId +
            ", salesoppName='" + salesoppName + '\'' +
            ", cusType='" + cusType + '\'' +
            ", fkCusId=" + fkCusId +
            ", salesoppCusName='" + salesoppCusName + '\'' +
            ", fkUserId=" + fkUserId +
            ", salesoppDistime='" + salesoppDistime + '\'' +
            ", salesoppExpectedSigningTime='" + salesoppExpectedSigningTime + '\'' +
            ", salesoppExpectedSigningMoney=" + salesoppExpectedSigningMoney +
            ", salesoppAnticipatedProfit=" + salesoppAnticipatedProfit +
            ", salesoppSource='" + salesoppSource + '\'' +
            ", fkCurrentGenerationId=" + fkCurrentGenerationId +
            ", salesoppStatus=" + salesoppStatus +
            ", salesoppStateProcessingTime='" + salesoppStateProcessingTime + '\'' +
            ", salesoppCusDemand='" + salesoppCusDemand + '\'' +
            ", salesoppCreator='" + salesoppCreator + '\'' +
            ", salesoppGmtCreate='" + salesoppGmtCreate + '\'' +
            ", salesoppRemark='" + salesoppRemark + '\'' +
            ", salesoppGmtModified='" + salesoppGmtModified + '\'' +
            '}';
  }
}

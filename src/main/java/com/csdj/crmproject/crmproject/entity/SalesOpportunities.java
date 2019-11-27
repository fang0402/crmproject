/*
 * 文 件 名：销售机会实体类
 * 版权(c) 雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;
/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-27
 */
public class SalesOpportunities {
  /**
   * Description ：  无参构造函数
   * @param：  无
   */
  public SalesOpportunities() {
  }

  /**
   * Description ：  有参构造函数
   * @param salesOpportunitiesId
   * @param salesOpportunitiesName
   * @param customerType
   * @param customerId
   * @param customerName
   * @param principal
   * @param dispatch_Time
   * @param expectedSigningTime
   * @param expectedSigningMoney
   * @param anticipatedProfit
   * @param source
   * @param currentGenerationId
   * @param salesOpportunityStatus
   * @param stateProcessingTime
   * @param customerDemand
   * @param creator
   * @param creatorTime
   * @param remark
   */
  public SalesOpportunities(long salesOpportunitiesId, String salesOpportunitiesName, String customerType, long customerId, String customerName, String principal, String dispatch_Time, String expectedSigningTime, double expectedSigningMoney, double anticipatedProfit, String source, long currentGenerationId, long salesOpportunityStatus, String stateProcessingTime, String customerDemand, String creator, String creatorTime, String remark) {
    this.salesOpportunitiesId = salesOpportunitiesId;
    this.salesOpportunitiesName = salesOpportunitiesName;
    this.customerType = customerType;
    this.customerId = customerId;
    this.customerName = customerName;
    this.principal = principal;
    this.dispatch_Time = dispatch_Time;
    this.expectedSigningTime = expectedSigningTime;
    this.expectedSigningMoney = expectedSigningMoney;
    this.anticipatedProfit = anticipatedProfit;
    this.source = source;
    this.currentGenerationId = currentGenerationId;
    this.salesOpportunityStatus = salesOpportunityStatus;
    this.stateProcessingTime = stateProcessingTime;
    this.customerDemand = customerDemand;
    this.creator = creator;
    this.creatorTime = creatorTime;
    this.remark = remark;
  }

  /**
   *销售机会id主键
   */
  private long salesOpportunitiesId;
  /**
   * 销售机会名称
   */
  private String salesOpportunitiesName;
  /**
   * 所属客户类型
   */
  private String customerType;
  /**
   * 所属客户id外键
   */
  private long customerId;
  /**
   * 所属客户名称
   */
  private String customerName;
  /**
   * 负责人
   */
  private String principal;
  /**
   * 分派时间
   */
  private String dispatch_Time;
  /**
   * 预计签单时间
   */
  private  String expectedSigningTime;
  /**
   * 预计签单金额
   */
  private double expectedSigningMoney;
  /**
   * 预计利润
   */
  private double anticipatedProfit;
  /**
   * 来源
   */
  private String source;
  /**
   * 当前阶段id
   */
  private long currentGenerationId;
  /**
   * 销售机会状态
   */
  private long salesOpportunityStatus;
  /**
   * 状态处理时间
   */
  private  String stateProcessingTime;
  /**
   * 客户需求
   */
  private String customerDemand;
  /**
   * 创建人
   */
  private String creator;
  /**
   * 创建时间
   */
  private  String creatorTime;
  /**
   * 备注
   */
  private String remark;

  public long getSalesOpportunitiesId() {
    return salesOpportunitiesId;
  }

  public void setSalesOpportunitiesId(long salesOpportunitiesId) {
    this.salesOpportunitiesId = salesOpportunitiesId;
  }


  public String getSalesOpportunitiesName() {
    return salesOpportunitiesName;
  }

  public void setSalesOpportunitiesName(String salesOpportunitiesName) {
    this.salesOpportunitiesName = salesOpportunitiesName;
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


  public String getPrincipal() {
    return principal;
  }

  public void setPrincipal(String principal) {
    this.principal = principal;
  }

  public double getExpectedSigningMoney() {
    return expectedSigningMoney;
  }

  public void setExpectedSigningMoney(double expectedSigningMoney) {
    this.expectedSigningMoney = expectedSigningMoney;
  }


  public double getAnticipatedProfit() {
    return anticipatedProfit;
  }

  public void setAnticipatedProfit(double anticipatedProfit) {
    this.anticipatedProfit = anticipatedProfit;
  }


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  public long getCurrentGenerationId() {
    return currentGenerationId;
  }

  public void setCurrentGenerationId(long currentGenerationId) {
    this.currentGenerationId = currentGenerationId;
  }


  public long getSalesOpportunityStatus() {
    return salesOpportunityStatus;
  }

  public void setSalesOpportunityStatus(long salesOpportunityStatus) {
    this.salesOpportunityStatus = salesOpportunityStatus;
  }


  public String getCustomerDemand() {
    return customerDemand;
  }

  public void setCustomerDemand(String customerDemand) {
    this.customerDemand = customerDemand;
  }


  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public String getDispatch_Time() {
    return dispatch_Time;
  }

  public void setDispatch_Time(String dispatch_Time) {
    this.dispatch_Time = dispatch_Time;
  }

  public String getExpectedSigningTime() {
    return expectedSigningTime;
  }

  public void setExpectedSigningTime(String expectedSigningTime) {
    this.expectedSigningTime = expectedSigningTime;
  }

  public String getStateProcessingTime() {
    return stateProcessingTime;
  }

  public void setStateProcessingTime(String stateProcessingTime) {
    this.stateProcessingTime = stateProcessingTime;
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
    return "SalesOpportunities{" +
            "salesOpportunitiesId=" + salesOpportunitiesId +
            ", salesOpportunitiesName='" + salesOpportunitiesName + '\'' +
            ", customerType='" + customerType + '\'' +
            ", customerId=" + customerId +
            ", customerName='" + customerName + '\'' +
            ", principal='" + principal + '\'' +
            ", dispatch_Time='" + dispatch_Time + '\'' +
            ", expectedSigningTime='" + expectedSigningTime + '\'' +
            ", expectedSigningMoney=" + expectedSigningMoney +
            ", anticipatedProfit=" + anticipatedProfit +
            ", source='" + source + '\'' +
            ", currentGenerationId=" + currentGenerationId +
            ", salesOpportunityStatus=" + salesOpportunityStatus +
            ", stateProcessingTime='" + stateProcessingTime + '\'' +
            ", customerDemand='" + customerDemand + '\'' +
            ", creator='" + creator + '\'' +
            ", creatorTime='" + creatorTime + '\'' +
            ", remark='" + remark + '\'' +
            '}';
  }
}

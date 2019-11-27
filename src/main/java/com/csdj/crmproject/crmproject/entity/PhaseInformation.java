/*
 * 文 件 名：阶段信息实体类
 * 版权(c) 雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;
/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-27
 */
public class PhaseInformation {
  /**
   * Description ：  无参构造函数
   * @param：  无
   */
  public PhaseInformation() {
  }

  /**
   *  Description ：  有参构造函数
   * @param phaseInformationId
   * @param phaseTypeId
   * @param startTime
   * @param endTime
   * @param stageShow
   * @param remark
   */
  public PhaseInformation(long phaseInformationId, long phaseTypeId, String startTime, String endTime, String stageShow, String remark) {
    this.phaseInformationId = phaseInformationId;
    this.phaseTypeId = phaseTypeId;
    this.startTime = startTime;
    this.endTime = endTime;
    this.stageShow = stageShow;
    this.remark = remark;
  }

  /**
   * 阶段信息id主键
   */
  private long phaseInformationId;
  /**
   * 阶段类型id外键
   */
  private long phaseTypeId;
  /**
   * 开始时间
   */
  private String startTime;
  /**
   * 结束时间
   */
  private String endTime;
  /**
   * 阶段说明
   */
  private String stageShow;
  /**
   * 备注
   */
  private String remark;



  public long getPhaseInformationId() {
    return phaseInformationId;
  }

  public void setPhaseInformationId(long phaseInformationId) {
    this.phaseInformationId = phaseInformationId;
  }


  public long getPhaseTypeId() {
    return phaseTypeId;
  }

  public void setPhaseTypeId(long phaseTypeId) {
    this.phaseTypeId = phaseTypeId;
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

  public String getStageShow() {
    return stageShow;
  }

  public void setStageShow(String stageShow) {
    this.stageShow = stageShow;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }
  /**
   * 显示数据
   * @return 显示数据
   */
  @Override
  public String toString() {
    return "PhaseInformation{" +
            "phaseInformationId=" + phaseInformationId +
            ", phaseTypeId=" + phaseTypeId +
            ", startTime=" + startTime +
            ", endTime=" + endTime +
            ", stageShow='" + stageShow + '\'' +
            ", remark='" + remark + '\'' +
            '}';
  }
}

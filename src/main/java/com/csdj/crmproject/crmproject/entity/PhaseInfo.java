/*
 * 文 件 名：阶段信息实体类
 * 版权(c) 雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;

import java.sql.Timestamp;

/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-27
 */
public class PhaseInfo {
  /**
   * Description ：  无参构造函数
   * @param：  无
   */
  public PhaseInfo() {
  }

  /**
   * Description ：  有参构造函数
   * @param pkPhaseInfoId
   * @param fkPhaseTypeId
   * @param phaseInfoStartTime
   * @param phaseInfoEndTime
   * @param phaseInfoShow
   * @param phaseInfoRemark
   * @param phaseInfoGmtCreate
   * @param phaseInfoGmtModified
   */
  public PhaseInfo(long pkPhaseInfoId, long fkPhaseTypeId, String phaseInfoStartTime, String phaseInfoEndTime, String phaseInfoShow, String phaseInfoRemark, String phaseInfoGmtCreate, String phaseInfoGmtModified) {
    this.pkPhaseInfoId = pkPhaseInfoId;
    this.fkPhaseTypeId = fkPhaseTypeId;
    this.phaseInfoStartTime = phaseInfoStartTime;
    this.phaseInfoEndTime = phaseInfoEndTime;
    this.phaseInfoShow = phaseInfoShow;
    this.phaseInfoRemark = phaseInfoRemark;
    this.phaseInfoGmtCreate = phaseInfoGmtCreate;
    this.phaseInfoGmtModified = phaseInfoGmtModified;
  }

  private long pkPhaseInfoId;
  private long fkPhaseTypeId;
  private String phaseInfoStartTime;
  private String phaseInfoEndTime;
  private String phaseInfoShow;
  private String phaseInfoRemark;
  private String phaseInfoGmtCreate;
  private String phaseInfoGmtModified;

  public long getPkPhaseInfoId() {
    return pkPhaseInfoId;
  }

  public void setPkPhaseInfoId(long pkPhaseInfoId) {
    this.pkPhaseInfoId = pkPhaseInfoId;
  }


  public long getFkPhaseTypeId() {
    return fkPhaseTypeId;
  }

  public void setFkPhaseTypeId(long fkPhaseTypeId) {
    this.fkPhaseTypeId = fkPhaseTypeId;
  }


  public String getPhaseInfoStartTime() {
    return phaseInfoStartTime;
  }

  public String getPhaseInfoEndTime() {
    return phaseInfoEndTime;
  }

  public String getPhaseInfoShow() {
    return phaseInfoShow;
  }

  public void setPhaseInfoShow(String phaseInfoShow) {
    this.phaseInfoShow = phaseInfoShow;
  }


  public String getPhaseInfoRemark() {
    return phaseInfoRemark;
  }

  public void setPhaseInfoRemark(String phaseInfoRemark) {
    this.phaseInfoRemark = phaseInfoRemark;
  }

  public void setPhaseInfoStartTime(String phaseInfoStartTime) {
    this.phaseInfoStartTime = phaseInfoStartTime;
  }

  public void setPhaseInfoEndTime(String phaseInfoEndTime) {
    this.phaseInfoEndTime = phaseInfoEndTime;
  }

  public String getPhaseInfoGmtCreate() {
    return phaseInfoGmtCreate;
  }

  public void setPhaseInfoGmtCreate(String phaseInfoGmtCreate) {
    this.phaseInfoGmtCreate = phaseInfoGmtCreate;
  }

  public String getPhaseInfoGmtModified() {
    return phaseInfoGmtModified;
  }

  public void setPhaseInfoGmtModified(String phaseInfoGmtModified) {
    this.phaseInfoGmtModified = phaseInfoGmtModified;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "PhaseInfo{" +
            "pkPhaseInfoId=" + pkPhaseInfoId +
            ", fkPhaseTypeId=" + fkPhaseTypeId +
            ", phaseInfoStartTime='" + phaseInfoStartTime + '\'' +
            ", phaseInfoEndTime='" + phaseInfoEndTime + '\'' +
            ", phaseInfoShow='" + phaseInfoShow + '\'' +
            ", phaseInfoRemark='" + phaseInfoRemark + '\'' +
            ", phaseInfoGmtCreate='" + phaseInfoGmtCreate + '\'' +
            ", phaseInfoGmtModified='" + phaseInfoGmtModified + '\'' +
            '}';
  }
}

/*
 * 文 件 名：阶段类型实体类
 * 版权(c) 雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;


/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-27
 */
public class PhaseType {
  /**
   * Description ：  无参构造函数
   * @param：  无
   */
  public PhaseType() {
  }

  /**
   * Description ：  有参构造函数
   * @param pkPhaseTypeId
   * @param phaseTypeSequence
   * @param phaseTypeName
   */
  public PhaseType(long pkPhaseTypeId, String phaseTypeSequence, String phaseTypeName) {
    this.pkPhaseTypeId = pkPhaseTypeId;
    this.phaseTypeSequence = phaseTypeSequence;
    this.phaseTypeName = phaseTypeName;
  }

  /**
   * 阶段类型id
   */
  private long pkPhaseTypeId;
  /**
   * 阶段顺序
   */
  private String phaseTypeSequence;
  /**
   * 阶段名称
   */
  private String phaseTypeName;


  public long getPkPhaseTypeId() {
    return pkPhaseTypeId;
  }

  public void setPkPhaseTypeId(long pkPhaseTypeId) {
    this.pkPhaseTypeId = pkPhaseTypeId;
  }


  public String getPhaseTypeSequence() {
    return phaseTypeSequence;
  }

  public void setPhaseTypeSequence(String phaseTypeSequence) {
    this.phaseTypeSequence = phaseTypeSequence;
  }


  public String getPhaseTypeName() {
    return phaseTypeName;
  }

  public void setPhaseTypeName(String phaseTypeName) {
    this.phaseTypeName = phaseTypeName;
  }

  /**
   * 显示数据
   * @return 显示数据
   */
  @Override
  public String toString() {
    return "PhaseType{" +
            "pkPhaseTypeId=" + pkPhaseTypeId +
            ", phaseTypeSequence='" + phaseTypeSequence + '\'' +
            ", phaseTypeName='" + phaseTypeName + '\'' +
            '}';
  }
}

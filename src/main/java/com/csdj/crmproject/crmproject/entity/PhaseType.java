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
   * @param phaseTypeId
   * @param phaseSequence
   * @param phaseName
   */
  public PhaseType(long phaseTypeId, String phaseSequence, String phaseName) {
    this.phaseTypeId = phaseTypeId;
    this.phaseSequence = phaseSequence;
    this.phaseName = phaseName;
  }

  /**
   * 阶段类型id主键
   */
  private long phaseTypeId;
  /**
   * 阶段顺序
   */
  private String phaseSequence;
  /**
   * 阶段名称
   */
  private String phaseName;

  public long getPhaseTypeId() {
    return phaseTypeId;
  }

  public void setPhaseTypeId(long phaseTypeId) {
    this.phaseTypeId = phaseTypeId;
  }


  public String getPhaseSequence() {
    return phaseSequence;
  }

  public void setPhaseSequence(String phaseSequence) {
    this.phaseSequence = phaseSequence;
  }


  public String getPhaseName() {
    return phaseName;
  }

  public void setPhaseName(String phaseName) {
    this.phaseName = phaseName;
  }
  /**
   * 显示数据
   * @return 显示数据
   */
  @Override
  public String toString() {
    return "PhaseType{" +
            "phaseTypeId=" + phaseTypeId +
            ", phaseSequence='" + phaseSequence + '\'' +
            ", phaseName='" + phaseName + '\'' +
            '}';
  }
}

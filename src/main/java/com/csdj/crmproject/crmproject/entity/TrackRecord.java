/*
 * 文 件 名：跟踪记录实体类
 * 版权(c) 2019-雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-27
 */
public class TrackRecord {
  /**
   * Description ：  无参构造函数
   * @param：  无
   */
  public TrackRecord() {
  }

  /**
   * Description ：  有参构造函数
   * @param pkTrack_RecordId
   * @param fkSalesoppId
   * @param traRecordTaskName
   * @param traRecordTaskDefinition
   * @param traRecordStatus
   * @param traRecordPriority
   * @param traRecordStarttime
   * @param traRecordEndtime
   * @param fkUserId
   * @param traRecordParticipant
   * @param fkAssociatedTypeId
   * @param traRecordAssociateTypeName
   * @param traRecordGmtModified
   * @param traRecordPerson
   * @param traRecordGmtCreate
   * @param traRecordCreator
   */
  public TrackRecord(long pkTrack_RecordId, long fkSalesoppId, String traRecordTaskName, String traRecordTaskDefinition, String traRecordStatus, String traRecordPriority, String traRecordStarttime, String traRecordEndtime, long fkUserId, String traRecordParticipant, long fkAssociatedTypeId, String traRecordAssociateTypeName, String traRecordGmtModified, String traRecordPerson, String traRecordGmtCreate, String traRecordCreator) {
    this.pkTrack_RecordId = pkTrack_RecordId;
    this.fkSalesoppId = fkSalesoppId;
    this.traRecordTaskName = traRecordTaskName;
    this.traRecordTaskDefinition = traRecordTaskDefinition;
    this.traRecordStatus = traRecordStatus;
    this.traRecordPriority = traRecordPriority;
    this.traRecordStarttime = traRecordStarttime;
    this.traRecordEndtime = traRecordEndtime;
    this.fkUserId = fkUserId;
    this.traRecordParticipant = traRecordParticipant;
    this.fkAssociatedTypeId = fkAssociatedTypeId;
    this.traRecordAssociateTypeName = traRecordAssociateTypeName;
    this.traRecordGmtModified = traRecordGmtModified;
    this.traRecordPerson = traRecordPerson;
    this.traRecordGmtCreate = traRecordGmtCreate;
    this.traRecordCreator = traRecordCreator;
  }

  /**
   * 跟踪记录id
   */
  private long pkTrack_RecordId;
  /**
   * 销售机会id
   */
  private long fkSalesoppId;
  /**
   * 任务名称
   */
  private String traRecordTaskName;
  /**
   * 任务内容
   */
  private String traRecordTaskDefinition;
  /**
   * 状态
   */
  private String traRecordStatus;
  /**
   * 优先级
   */
  private String traRecordPriority;
  /**
   * 开始时间
   */
  private String traRecordStarttime;
  /**
   * 完成时间
   */
  private String traRecordEndtime;
  /**
   * 负责人id
   */
  private long fkUserId;
  /**
   * 参与者
   */
  private String traRecordParticipant;
  /**
   * 关联对象类型id
   */
  private long fkAssociatedTypeId;
  /**
   * 关联对象id
   */
  private long fkAssociatedId;
  /**
   * 关联对象名称
   */
  private String traRecordAssociateTypeName;
  /**
   * 修改时间
   */
  private String traRecordGmtModified;
  /**
   * 修改人
   */
  private String traRecordPerson;
  /**
   * 创建时间
   */
  private String traRecordGmtCreate;
  /**
   * 创建人
   */
  private String traRecordCreator;


  public long getPkTrack_RecordId() {
    return pkTrack_RecordId;
  }

  public void setPkTrack_RecordId(long pkTrack_RecordId) {
    this.pkTrack_RecordId = pkTrack_RecordId;
  }


  public long getFkSalesoppId() {
    return fkSalesoppId;
  }

  public void setFkSalesoppId(long fkSalesoppId) {
    this.fkSalesoppId = fkSalesoppId;
  }


  public String getTraRecordTaskName() {
    return traRecordTaskName;
  }

  public void setTraRecordTaskName(String traRecordTaskName) {
    this.traRecordTaskName = traRecordTaskName;
  }


  public String getTraRecordTaskDefinition() {
    return traRecordTaskDefinition;
  }

  public void setTraRecordTaskDefinition(String traRecordTaskDefinition) {
    this.traRecordTaskDefinition = traRecordTaskDefinition;
  }


  public String getTraRecordStatus() {
    return traRecordStatus;
  }

  public void setTraRecordStatus(String traRecordStatus) {
    this.traRecordStatus = traRecordStatus;
  }


  public String getTraRecordPriority() {
    return traRecordPriority;
  }

  public void setTraRecordPriority(String traRecordPriority) {
    this.traRecordPriority = traRecordPriority;
  }


  public String getTraRecordStarttime() {
    return traRecordStarttime;
  }

  public void setTraRecordStarttime(String traRecordStarttime) {
    this.traRecordStarttime = traRecordStarttime;
  }

  public String getTraRecordEndtime() {
    return traRecordEndtime;
  }

  public void setTraRecordEndtime(String traRecordEndtime) {
    this.traRecordEndtime = traRecordEndtime;
  }

  public long getFkUserId() {
    return fkUserId;
  }

  public void setFkUserId(long fkUserId) {
    this.fkUserId = fkUserId;
  }

  public String getTraRecordParticipant() {
    return traRecordParticipant;
  }

  public void setTraRecordParticipant(String traRecordParticipant) {
    this.traRecordParticipant = traRecordParticipant;
  }

  public long getFkAssociatedTypeId() {
    return fkAssociatedTypeId;
  }

  public void setFkAssociatedTypeId(long fkAssociatedTypeId) {
    this.fkAssociatedTypeId = fkAssociatedTypeId;
  }

  public String getTraRecordAssociateTypeName() {
    return traRecordAssociateTypeName;
  }

  public void setTraRecordAssociateTypeName(String traRecordAssociateTypeName) {
    this.traRecordAssociateTypeName = traRecordAssociateTypeName;
  }

  public String getTraRecordGmtModified() {
    return traRecordGmtModified;
  }

  public void setTraRecordGmtModified(String traRecordGmtModified) {
    this.traRecordGmtModified = traRecordGmtModified;
  }

  public String getTraRecordPerson() {
    return traRecordPerson;
  }

  public void setTraRecordPerson(String traRecordPerson) {
    this.traRecordPerson = traRecordPerson;
  }

  public String getTraRecordGmtCreate() {
    return traRecordGmtCreate;
  }

  public void setTraRecordGmtCreate(String traRecordGmtCreate) {
    this.traRecordGmtCreate = traRecordGmtCreate;
  }

  public String getTraRecordCreator() {
    return traRecordCreator;
  }

  public void setTraRecordCreator(String traRecordCreator) {
    this.traRecordCreator = traRecordCreator;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "TrackRecord{" +
            "pkTrack_RecordId=" + pkTrack_RecordId +
            ", fkSalesoppId=" + fkSalesoppId +
            ", traRecordTaskName='" + traRecordTaskName + '\'' +
            ", traRecordTaskDefinition='" + traRecordTaskDefinition + '\'' +
            ", traRecordStatus='" + traRecordStatus + '\'' +
            ", traRecordPriority='" + traRecordPriority + '\'' +
            ", traRecordStarttime='" + traRecordStarttime + '\'' +
            ", traRecordEndtime='" + traRecordEndtime + '\'' +
            ", fkUserId=" + fkUserId +
            ", traRecordParticipant='" + traRecordParticipant + '\'' +
            ", fkAssociatedTypeId=" + fkAssociatedTypeId +
            ", traRecordAssociateTypeName='" + traRecordAssociateTypeName + '\'' +
            ", traRecordGmtModified='" + traRecordGmtModified + '\'' +
            ", traRecordPerson='" + traRecordPerson + '\'' +
            ", traRecordGmtCreate='" + traRecordGmtCreate + '\'' +
            ", traRecordCreator='" + traRecordCreator + '\'' +
            '}';
  }
}

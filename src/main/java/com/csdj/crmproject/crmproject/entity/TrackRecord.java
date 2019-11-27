/*
 * 文 件 名：跟踪记录实体类
 * 版权(c) 雷升公司 CRM项目组：
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
   * @param track_RecordId
   * @param salesOpportunitiesId
   * @param taskName
   * @param taskDefinition
   * @param status
   * @param priority
   * @param starttime
   * @param endtime
   * @param principalId
   * @param participant
   * @param associatedObjectTypeId
   * @param associatedObjectName
   * @param lastModifiedTime
   * @param lastModifiedPerson
   * @param creationTime
   * @param creator
   */
  public TrackRecord(long track_RecordId, long salesOpportunitiesId, String taskName, String taskDefinition, String status, String priority,  String starttime,  String endtime, long principalId, String participant, long associatedObjectTypeId, String associatedObjectName,  String lastModifiedTime, String lastModifiedPerson, String creationTime, String creator) {
    this.track_RecordId = track_RecordId;
    this.salesOpportunitiesId = salesOpportunitiesId;
    this.taskName = taskName;
    this.taskDefinition = taskDefinition;
    this.status = status;
    this.priority = priority;
    this.starttime = starttime;
    this.endtime = endtime;
    this.principalId = principalId;
    this.participant = participant;
    this.associatedObjectTypeId = associatedObjectTypeId;
    this.associatedObjectName = associatedObjectName;
    this.lastModifiedTime = lastModifiedTime;
    this.lastModifiedPerson = lastModifiedPerson;
    this.creationTime = creationTime;
    this.creator = creator;
  }

  /**
   * 跟踪记录id
   */
  private long track_RecordId;
  /**
   * 销售机会id
   */
  private long salesOpportunitiesId;
  /**
   * 任务名称
   */
  private String taskName;
  /**
   * 任务内容
   */
  private String taskDefinition;
  /**
   * 状态
   */
  private String status;
  /**
   * 优先级
   */
  private String priority;
  /**
   * 开始时间
   */
  private String starttime;
  /**
   * 结束时间
   */
  private String endtime;
  /**
   * 负责人id
   */
  private long principalId;
  /**
   * 参与者
   */
  private String participant;
  /**
   * 关联对象类型id
   */
  private long associatedObjectTypeId;
  /**
   * 关联对象id
   */
  private String associatedObjectName;
  /**
   * 最后修改时间
   */
  private String lastModifiedTime;
  /**
   * 最后修改人
   */
  private String lastModifiedPerson;
  /**
   * 创建时间
   */
  private String creationTime;
  /**
   * 创建人
   */
  private String creator;


  public long getTrack_RecordId() {
    return track_RecordId;
  }

  public void setTrack_RecordId(long track_RecordId) {
    this.track_RecordId = track_RecordId;
  }


  public long getSalesOpportunitiesId() {
    return salesOpportunitiesId;
  }

  public void setSalesOpportunitiesId(long salesOpportunitiesId) {
    this.salesOpportunitiesId = salesOpportunitiesId;
  }


  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }


  public String getTaskDefinition() {
    return taskDefinition;
  }

  public void setTaskDefinition(String taskDefinition) {
    this.taskDefinition = taskDefinition;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public long getPrincipalId() {
    return principalId;
  }

  public void setPrincipalId(long principalId) {
    this.principalId = principalId;
  }

  public String getParticipant() {
    return participant;
  }

  public void setParticipant(String participant) {
    this.participant = participant;
  }


  public long getAssociatedObjectTypeId() {
    return associatedObjectTypeId;
  }

  public void setAssociatedObjectTypeId(long associatedObjectTypeId) {
    this.associatedObjectTypeId = associatedObjectTypeId;
  }


  public String getAssociatedObjectName() {
    return associatedObjectName;
  }

  public void setAssociatedObjectName(String associatedObjectName) {
    this.associatedObjectName = associatedObjectName;
  }

  public String getLastModifiedPerson() {
    return lastModifiedPerson;
  }

  public void setLastModifiedPerson(String lastModifiedPerson) {
    this.lastModifiedPerson = lastModifiedPerson;
  }


  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public String getStarttime() {
    return starttime;
  }

  public void setStarttime(String starttime) {
    this.starttime = starttime;
  }

  public String getEndtime() {
    return endtime;
  }

  public void setEndtime(String endtime) {
    this.endtime = endtime;
  }

  public String getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }
  /**
   * 显示数据
   * @return 显示数据
   */
  @Override
  public String toString() {
    return "TrackRecord{" +
            "track_RecordId=" + track_RecordId +
            ", salesOpportunitiesId=" + salesOpportunitiesId +
            ", taskName='" + taskName + '\'' +
            ", taskDefinition='" + taskDefinition + '\'' +
            ", status='" + status + '\'' +
            ", priority='" + priority + '\'' +
            ", starttime='" + starttime + '\'' +
            ", endtime='" + endtime + '\'' +
            ", principalId=" + principalId +
            ", participant='" + participant + '\'' +
            ", associatedObjectTypeId=" + associatedObjectTypeId +
            ", associatedObjectName='" + associatedObjectName + '\'' +
            ", lastModifiedTime='" + lastModifiedTime + '\'' +
            ", lastModifiedPerson='" + lastModifiedPerson + '\'' +
            ", creationTime='" + creationTime + '\'' +
            ", creator='" + creator + '\'' +
            '}';
  }
}

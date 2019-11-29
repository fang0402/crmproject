/*
 * 文 件 名：CluesTrack
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author lxj
 * @version 1.0.0
 * @date 2019/11/27
 */
public class CluesTrack {
    /**
     * 主键
     */
    private int pkTrackId;
    /**
     * 线索管理id
     */
    private int fkClueId;
    /**
     * 任务名称
     */
    private String taskName;
    /**
     *任务内容
     */
    private String taskContent;
    /**
     *状态
     */
    private String trackState;
    /**
     *优先级
     */
    private String trackPriority;
    /**
     *开始时间
     */
    private String trackStartdate;
    /**
     *结束时间
     */
    private String trackEnddate;
    /**
     *负责人
     */
    private String trackHead;
    /**
     * 参与者
     */
    private String trackParticipants;
    /**
     * 对象类型id
     */
    private int fkObjectTypeId;
    /**
     * 对象id
     */
    private int fkObjectId;
    /**
     * 对象名称
     */
    private String trackObjectName;
    /**
     * 最后修改时间
     */
    private String trackLastUpddate;
    /**
     * 最后修改人
     */
    private String trackLastUpd;
    /**
     * 创建时间
     */
    private String trackGmtCreate;
    /**
     * 创建人
     */
    private String trackFounder;

    public int getPkTrackId() {
        return pkTrackId;
    }

    public void setPkTrackId(int pkTrackId) {
        this.pkTrackId = pkTrackId;
    }

    public int getFkClueId() {
        return fkClueId;
    }

    public void setFkClueId(int fkClueId) {
        this.fkClueId = fkClueId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent;
    }

    public String getTrackState() {
        return trackState;
    }

    public void setTrackState(String trackState) {
        this.trackState = trackState;
    }

    public String getTrackPriority() {
        return trackPriority;
    }

    public void setTrackPriority(String trackPriority) {
        this.trackPriority = trackPriority;
    }

    public String getTrackStartdate() {
        return trackStartdate;
    }

    public void setTrackStartdate(String trackStartdate) {
        this.trackStartdate = trackStartdate;
    }

    public String getTrackEnddate() {
        return trackEnddate;
    }

    public void setTrackEnddate(String trackEnddate) {
        this.trackEnddate = trackEnddate;
    }

    public String getTrackHead() {
        return trackHead;
    }

    public void setTrackHead(String trackHead) {
        this.trackHead = trackHead;
    }

    public String getTrackParticipants() {
        return trackParticipants;
    }

    public void setTrackParticipants(String trackParticipants) {
        this.trackParticipants = trackParticipants;
    }

    public int getFkObjectTypeId() {
        return fkObjectTypeId;
    }

    public void setFkObjectTypeId(int fkObjectTypeId) {
        this.fkObjectTypeId = fkObjectTypeId;
    }

    public int getFkObjectId() {
        return fkObjectId;
    }

    public void setFkObjectId(int fkObjectId) {
        this.fkObjectId = fkObjectId;
    }

    public String getTrackObjectName() {
        return trackObjectName;
    }

    public void setTrackObjectName(String trackObjectName) {
        this.trackObjectName = trackObjectName;
    }

    public String getTrackLastUpddate() {
        return trackLastUpddate;
    }

    public void setTrackLastUpddate(String trackLastUpddate) {
        this.trackLastUpddate = trackLastUpddate;
    }

    public String getTrackLastUpd() {
        return trackLastUpd;
    }

    public void setTrackLastUpd(String trackLastUpd) {
        this.trackLastUpd = trackLastUpd;
    }

    public String getTrackGmtCreate() {
        return trackGmtCreate;
    }

    public void setTrackGmtCreate(String trackGmtCreate) {
        this.trackGmtCreate = trackGmtCreate;
    }

    public String getTrackFounder() {
        return trackFounder;
    }

    public void setTrackFounder(String trackFounder) {
        this.trackFounder = trackFounder;
    }

    /**
     * 无参构造
     */
    public CluesTrack() {
    }

    /**
     * 带参构造
     * @param pkTrackId
     * @param fkClueId
     * @param taskName
     * @param taskContent
     * @param trackState
     * @param trackPriority
     * @param trackStartdate
     * @param trackEnddate
     * @param trackHead
     * @param trackParticipants
     * @param fkObjectTypeId
     * @param fkObjectId
     * @param trackObjectName
     * @param trackLastUpddate
     * @param trackLastUpd
     * @param trackGmtCreate
     * @param trackFounder
     */
    public CluesTrack(int pkTrackId, int fkClueId, String taskName, String taskContent, String trackState, String trackPriority, String trackStartdate, String trackEnddate, String trackHead, String trackParticipants, int fkObjectTypeId, int fkObjectId, String trackObjectName, String trackLastUpddate, String trackLastUpd, String trackGmtCreate, String trackFounder) {
        this.pkTrackId = pkTrackId;
        this.fkClueId = fkClueId;
        this.taskName = taskName;
        this.taskContent = taskContent;
        this.trackState = trackState;
        this.trackPriority = trackPriority;
        this.trackStartdate = trackStartdate;
        this.trackEnddate = trackEnddate;
        this.trackHead = trackHead;
        this.trackParticipants = trackParticipants;
        this.fkObjectTypeId = fkObjectTypeId;
        this.fkObjectId = fkObjectId;
        this.trackObjectName = trackObjectName;
        this.trackLastUpddate = trackLastUpddate;
        this.trackLastUpd = trackLastUpd;
        this.trackGmtCreate = trackGmtCreate;
        this.trackFounder = trackFounder;
    }

    /**
     * 显示信息
     * @return String
     */
    @Override
    public String toString() {
        return "CluesTrack{" +
                "pkTrackId=" + pkTrackId +
                ", fkClueId=" + fkClueId +
                ", taskName='" + taskName + '\'' +
                ", taskContent='" + taskContent + '\'' +
                ", trackState='" + trackState + '\'' +
                ", trackPriority='" + trackPriority + '\'' +
                ", trackStartdate='" + trackStartdate + '\'' +
                ", trackEnddate='" + trackEnddate + '\'' +
                ", trackHead='" + trackHead + '\'' +
                ", trackParticipants='" + trackParticipants + '\'' +
                ", fkObjectTypeId=" + fkObjectTypeId +
                ", fkObjectId=" + fkObjectId +
                ", trackObjectName='" + trackObjectName + '\'' +
                ", trackLastUpddate='" + trackLastUpddate + '\'' +
                ", trackLastUpd='" + trackLastUpd + '\'' +
                ", trackGmtCreate='" + trackGmtCreate + '\'' +
                ", trackFounder='" + trackFounder + '\'' +
                '}';
    }
}

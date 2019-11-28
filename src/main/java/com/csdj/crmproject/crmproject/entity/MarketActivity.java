/*
 * 文 件 名：MarketActivity
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author lxj
 * @version 1.0.0
 * @date 2019/11/27
 */
public class MarketActivity {
    /**
     * 主键
     */
    private int pkMarkActivityId;
    /**
     *  活动名称
     */
    private String activityName;
    /**
     * 负责人
     */
    private String activityHead;
    /**
     * 类型
     */
    private String activityType;
    /**
     * 预算
     */
    private Double activityBudget;
    /**
     * 实际参加人数
     */
    private int activityActualNumber;
    /**
     * 活动目标
     */
    private String activityGoal;
    /**
     * 活动地点
     */
    private String activityPlace;
    /**
     * 计划开始时间
     */
    private String activityPlannedStartdate;
    /**
     * 计划结束时间
     */
    private String activityPlannedEnddate;
    /**
     * 实际开始时间
     */
    private String activityActualStartdate;
    /**
     * 实际结束时间
     */
    private String activityActualEnddate;
    /**
     * 目标客户群id
     */
    private int fkTargetCusId;
    /**
     * 效果
     */
    private String activityEffect;
    /**
     * 主办方
     */
    private String activityOrganizers;
    /**
     * 协办方
     */
    private String activityCoOrganizer;
    /**
     * 审批流程
     */
    private String activityApprovalProcess;
    /**
     * 流转时间
     */
    private String activityCirculationdate;
    /**
     * 审批结果
     */
    private String activityApprovalResult;
    /**
     * 创建人
     */
    private String activityFounder;
    /**
     * 创建时间
     */
    private String activityGmtCreate;

    public int getPkMarkActivityId() {
        return pkMarkActivityId;
    }

    public void setPkMarkActivityId(int pkMarkActivityId) {
        this.pkMarkActivityId = pkMarkActivityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityHead() {
        return activityHead;
    }

    public void setActivityHead(String activityHead) {
        this.activityHead = activityHead;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public Double getActivityBudget() {
        return activityBudget;
    }

    public void setActivityBudget(Double activityBudget) {
        this.activityBudget = activityBudget;
    }

    public int getActivityActualNumber() {
        return activityActualNumber;
    }

    public void setActivityActualNumber(int activityActualNumber) {
        this.activityActualNumber = activityActualNumber;
    }

    public String getActivityGoal() {
        return activityGoal;
    }

    public void setActivityGoal(String activityGoal) {
        this.activityGoal = activityGoal;
    }

    public String getActivityPlace() {
        return activityPlace;
    }

    public void setActivityPlace(String activityPlace) {
        this.activityPlace = activityPlace;
    }

    public String getActivityPlannedStartdate() {
        return activityPlannedStartdate;
    }

    public void setActivityPlannedStartdate(String activityPlannedStartdate) {
        this.activityPlannedStartdate = activityPlannedStartdate;
    }

    public String getActivityPlannedEnddate() {
        return activityPlannedEnddate;
    }

    public void setActivityPlannedEnddate(String activityPlannedEnddate) {
        this.activityPlannedEnddate = activityPlannedEnddate;
    }

    public String getActivityActualStartdate() {
        return activityActualStartdate;
    }

    public void setActivityActualStartdate(String activityActualStartdate) {
        this.activityActualStartdate = activityActualStartdate;
    }

    public String getActivityActualEnddate() {
        return activityActualEnddate;
    }

    public void setActivityActualEnddate(String activityActualEnddate) {
        this.activityActualEnddate = activityActualEnddate;
    }

    public int getFkTargetCusId() {
        return fkTargetCusId;
    }

    public void setFkTargetCusId(int fkTargetCusId) {
        this.fkTargetCusId = fkTargetCusId;
    }

    public String getActivityEffect() {
        return activityEffect;
    }

    public void setActivityEffect(String activityEffect) {
        this.activityEffect = activityEffect;
    }

    public String getActivityOrganizers() {
        return activityOrganizers;
    }

    public void setActivityOrganizers(String activityOrganizers) {
        this.activityOrganizers = activityOrganizers;
    }

    public String getActivityCoOrganizer() {
        return activityCoOrganizer;
    }

    public void setActivityCoOrganizer(String activityCoOrganizer) {
        this.activityCoOrganizer = activityCoOrganizer;
    }

    public String getActivityApprovalProcess() {
        return activityApprovalProcess;
    }

    public void setActivityApprovalProcess(String activityApprovalProcess) {
        this.activityApprovalProcess = activityApprovalProcess;
    }

    public String getActivityCirculationdate() {
        return activityCirculationdate;
    }

    public void setActivityCirculationdate(String activityCirculationdate) {
        this.activityCirculationdate = activityCirculationdate;
    }

    public String getActivityApprovalResult() {
        return activityApprovalResult;
    }

    public void setActivityApprovalResult(String activityApprovalResult) {
        this.activityApprovalResult = activityApprovalResult;
    }

    public String getActivityFounder() {
        return activityFounder;
    }

    public void setActivityFounder(String activityFounder) {
        this.activityFounder = activityFounder;
    }

    public String getActivityGmtCreate() {
        return activityGmtCreate;
    }

    public void setActivityGmtCreate(String activityGmtCreate) {
        this.activityGmtCreate = activityGmtCreate;
    }

    /**
     * 无参构造
     */
    public MarketActivity() {
    }

    /**
     * 带参构造
     * @param pkMarkActivityId
     * @param activityName
     * @param activityHead
     * @param activityType
     * @param activityBudget
     * @param activityActualNumber
     * @param activityGoal
     * @param activityPlace
     * @param activityPlannedStartdate
     * @param activityPlannedEnddate
     * @param activityActualStartdate
     * @param activityActualEnddate
     * @param fkTargetCusId
     * @param activityEffect
     * @param activityOrganizers
     * @param activityCoOrganizer
     * @param activityApprovalProcess
     * @param activityCirculationdate
     * @param activityApprovalResult
     * @param activityFounder
     * @param activityGmtCreate
     */
    public MarketActivity(int pkMarkActivityId, String activityName, String activityHead, String activityType, Double activityBudget, int activityActualNumber, String activityGoal, String activityPlace, String activityPlannedStartdate, String activityPlannedEnddate, String activityActualStartdate, String activityActualEnddate, int fkTargetCusId, String activityEffect, String activityOrganizers, String activityCoOrganizer, String activityApprovalProcess, String activityCirculationdate, String activityApprovalResult, String activityFounder, String activityGmtCreate) {
        this.pkMarkActivityId = pkMarkActivityId;
        this.activityName = activityName;
        this.activityHead = activityHead;
        this.activityType = activityType;
        this.activityBudget = activityBudget;
        this.activityActualNumber = activityActualNumber;
        this.activityGoal = activityGoal;
        this.activityPlace = activityPlace;
        this.activityPlannedStartdate = activityPlannedStartdate;
        this.activityPlannedEnddate = activityPlannedEnddate;
        this.activityActualStartdate = activityActualStartdate;
        this.activityActualEnddate = activityActualEnddate;
        this.fkTargetCusId = fkTargetCusId;
        this.activityEffect = activityEffect;
        this.activityOrganizers = activityOrganizers;
        this.activityCoOrganizer = activityCoOrganizer;
        this.activityApprovalProcess = activityApprovalProcess;
        this.activityCirculationdate = activityCirculationdate;
        this.activityApprovalResult = activityApprovalResult;
        this.activityFounder = activityFounder;
        this.activityGmtCreate = activityGmtCreate;
    }

    /**
     * 显示数据
     * @return String
     */
    @Override
    public String toString() {
        return "MarketActivity{" +
                "pkMarkActivityId=" + pkMarkActivityId +
                ", activityName='" + activityName + '\'' +
                ", activityHead='" + activityHead + '\'' +
                ", activityType='" + activityType + '\'' +
                ", activityBudget=" + activityBudget +
                ", activityActualNumber=" + activityActualNumber +
                ", activityGoal='" + activityGoal + '\'' +
                ", activityPlace='" + activityPlace + '\'' +
                ", activityPlannedStartdate='" + activityPlannedStartdate + '\'' +
                ", activityPlannedEnddate='" + activityPlannedEnddate + '\'' +
                ", activityActualStartdate='" + activityActualStartdate + '\'' +
                ", activityActualEnddate='" + activityActualEnddate + '\'' +
                ", fkTargetCusId=" + fkTargetCusId +
                ", activityEffect='" + activityEffect + '\'' +
                ", activityOrganizers='" + activityOrganizers + '\'' +
                ", activityCoOrganizer='" + activityCoOrganizer + '\'' +
                ", activityApprovalProcess='" + activityApprovalProcess + '\'' +
                ", activityCirculationdate='" + activityCirculationdate + '\'' +
                ", activityApprovalResult='" + activityApprovalResult + '\'' +
                ", activityFounder='" + activityFounder + '\'' +
                ", activityGmtCreate='" + activityGmtCreate + '\'' +
                '}';
    }
}

package com.csdj.crmproject.crmproject.entity;

/**
 * @version 1.0
 * @ClassName FaultRepairs
 * @Author 熊志涛
 * @Date 2019/11/26
 * @Describe 故障报修表
 **/

public class FaultWar {


    /**
     * id
     */
    private int pkFaultWarId;
    /**
     * 保修编号
     */
    private int fkWarId;
    /**
     * 名称
     */
    private String faultWarName;
    /**
     * 紧张程度
     */
    private String faultWarTensionLevel;
    /**
     * 故障发生时间
     */
    private String faultWarFaultHappenTime;
    /**
     * 故障报修描述
     */
    private String faultWarFaultRepairsDescribe;
    /**
     * 处理方式
     */
    private String faultWarDisposeWay;
    /**
     * 关联客户类型id
     */
    private int fkCusTypeId;
    /**
     * 关联客户id
     */
    private int fkCusId;
    /**
     * 客户联系人id
     */
    private int fkCusPopulation;
    /**
     * 回访确认
     */
    private int faultWarIsCallbackAffirm;
    /**
     * 备注
     */
    private String faultWarRemark;
    /**
     * 审批状态
     */
    private String faultWarAccraditationState;
    /**
     * 审批时间
     */
    private String faultWarAccraditationTime;
    /**
     * 审批结果
     */
    private String faultWarAccraditationResult;
    /**
     * 录单人
     */
    private String faultWarRecordTheSingle;
    /**
     * 录单时间
     */
    private String faultWarRecordTheSingleTime;

    public int getPkFaultWarId() {
        return pkFaultWarId;
    }

    public void setPkFaultWarId(int pkFaultWarId) {
        this.pkFaultWarId = pkFaultWarId;
    }

    public int getFkWarId() {
        return fkWarId;
    }

    public void setFkWarId(int fkWarId) {
        this.fkWarId = fkWarId;
    }

    public String getFaultWarName() {
        return faultWarName;
    }

    public void setFaultWarName(String faultWarName) {
        this.faultWarName = faultWarName;
    }

    public String getFaultWarTensionLevel() {
        return faultWarTensionLevel;
    }

    public void setFaultWarTensionLevel(String faultWarTensionLevel) {
        this.faultWarTensionLevel = faultWarTensionLevel;
    }

    public String getFaultWarFaultHappenTime() {
        return faultWarFaultHappenTime;
    }

    public void setFaultWarFaultHappenTime(String faultWarFaultHappenTime) {
        this.faultWarFaultHappenTime = faultWarFaultHappenTime;
    }

    public String getFaultWarFaultRepairsDescribe() {
        return faultWarFaultRepairsDescribe;
    }

    public void setFaultWarFaultRepairsDescribe(String faultWarFaultRepairsDescribe) {
        this.faultWarFaultRepairsDescribe = faultWarFaultRepairsDescribe;
    }

    public String getFaultWarDisposeWay() {
        return faultWarDisposeWay;
    }

    public void setFaultWarDisposeWay(String faultWarDisposeWay) {
        this.faultWarDisposeWay = faultWarDisposeWay;
    }

    public int getFkCusTypeId() {
        return fkCusTypeId;
    }

    public void setFkCusTypeId(int fkCusTypeId) {
        this.fkCusTypeId = fkCusTypeId;
    }

    public int getFkCusId() {
        return fkCusId;
    }

    public void setFkCusId(int fkCusId) {
        this.fkCusId = fkCusId;
    }

    public int getFkCusPopulation() {
        return fkCusPopulation;
    }

    public void setFkCusPopulation(int fkCusPopulation) {
        this.fkCusPopulation = fkCusPopulation;
    }

    public int getFaultWarIsCallbackAffirm() {
        return faultWarIsCallbackAffirm;
    }

    public void setFaultWarIsCallbackAffirm(int faultWarIsCallbackAffirm) {
        this.faultWarIsCallbackAffirm = faultWarIsCallbackAffirm;
    }

    public String getFaultWarRemark() {
        return faultWarRemark;
    }

    public void setFaultWarRemark(String faultWarRemark) {
        this.faultWarRemark = faultWarRemark;
    }

    public String getFaultWarAccraditationState() {
        return faultWarAccraditationState;
    }

    public void setFaultWarAccraditationState(String faultWarAccraditationState) {
        this.faultWarAccraditationState = faultWarAccraditationState;
    }

    public String getFaultWarAccraditationTime() {
        return faultWarAccraditationTime;
    }

    public void setFaultWarAccraditationTime(String faultWarAccraditationTime) {
        this.faultWarAccraditationTime = faultWarAccraditationTime;
    }

    public String getFaultWarAccraditationResult() {
        return faultWarAccraditationResult;
    }

    public void setFaultWarAccraditationResult(String faultWarAccraditationResult) {
        this.faultWarAccraditationResult = faultWarAccraditationResult;
    }

    public String getFaultWarRecordTheSingle() {
        return faultWarRecordTheSingle;
    }

    public void setFaultWarRecordTheSingle(String faultWarRecordTheSingle) {
        this.faultWarRecordTheSingle = faultWarRecordTheSingle;
    }

    public String getFaultWarRecordTheSingleTime() {
        return faultWarRecordTheSingleTime;
    }

    public void setFaultWarRecordTheSingleTime(String faultWarRecordTheSingleTime) {
        this.faultWarRecordTheSingleTime = faultWarRecordTheSingleTime;
    }

    /**
     * 默认的构造方法
     */
    public FaultWar() {
    }

    /**
     * 带参构造方法
     *
     * @param pkFaultWarId
     * @param fkWarId
     * @param faultWarName
     * @param faultWarTensionLevel
     * @param faultWarFaultHappenTime
     * @param faultWarFaultRepairsDescribe
     * @param faultWarDisposeWay
     * @param fkCusTypeId
     * @param fkCusId
     * @param fkCusPopulation
     * @param faultWarIsCallbackAffirm
     * @param faultWarRemark
     * @param faultWarAccraditationState
     * @param faultWarAccraditationTime
     * @param faultWarAccraditationResult
     * @param faultWarRecordTheSingle
     * @param faultWarRecordTheSingleTime
     */
    public FaultWar(int pkFaultWarId, int fkWarId, String faultWarName, String faultWarTensionLevel, String faultWarFaultHappenTime, String faultWarFaultRepairsDescribe, String faultWarDisposeWay, int fkCusTypeId, int fkCusId, int fkCusPopulation, int faultWarIsCallbackAffirm, String faultWarRemark, String faultWarAccraditationState, String faultWarAccraditationTime, String faultWarAccraditationResult, String faultWarRecordTheSingle, String faultWarRecordTheSingleTime) {
        this.pkFaultWarId = pkFaultWarId;
        this.fkWarId = fkWarId;
        this.faultWarName = faultWarName;
        this.faultWarTensionLevel = faultWarTensionLevel;
        this.faultWarFaultHappenTime = faultWarFaultHappenTime;
        this.faultWarFaultRepairsDescribe = faultWarFaultRepairsDescribe;
        this.faultWarDisposeWay = faultWarDisposeWay;
        this.fkCusTypeId = fkCusTypeId;
        this.fkCusId = fkCusId;
        this.fkCusPopulation = fkCusPopulation;
        this.faultWarIsCallbackAffirm = faultWarIsCallbackAffirm;
        this.faultWarRemark = faultWarRemark;
        this.faultWarAccraditationState = faultWarAccraditationState;
        this.faultWarAccraditationTime = faultWarAccraditationTime;
        this.faultWarAccraditationResult = faultWarAccraditationResult;
        this.faultWarRecordTheSingle = faultWarRecordTheSingle;
        this.faultWarRecordTheSingleTime = faultWarRecordTheSingleTime;
    }

    /**
     * 打印数据
     *
     * @return
     */
    @Override
    public String toString() {
        return "FaultWar{" +
                "pkFaultWarId=" + pkFaultWarId +
                ", fkWarId=" + fkWarId +
                ", faultWarName='" + faultWarName + '\'' +
                ", faultWarTensionLevel='" + faultWarTensionLevel + '\'' +
                ", faultWarFaultHappenTime='" + faultWarFaultHappenTime + '\'' +
                ", faultWarFaultRepairsDescribe='" + faultWarFaultRepairsDescribe + '\'' +
                ", faultWarDisposeWay='" + faultWarDisposeWay + '\'' +
                ", fkCusTypeId=" + fkCusTypeId +
                ", fkCusId=" + fkCusId +
                ", fkCusPopulation=" + fkCusPopulation +
                ", faultWarIsCallbackAffirm=" + faultWarIsCallbackAffirm +
                ", faultWarRemark='" + faultWarRemark + '\'' +
                ", faultWarAccraditationState='" + faultWarAccraditationState + '\'' +
                ", faultWarAccraditationTime='" + faultWarAccraditationTime + '\'' +
                ", faultWarAccraditationResult='" + faultWarAccraditationResult + '\'' +
                ", faultWarRecordTheSingle='" + faultWarRecordTheSingle + '\'' +
                ", faultWarRecordTheSingleTime='" + faultWarRecordTheSingleTime + '\'' +
                '}';
    }
}

/*
 * 文 件 名：客户拜访
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 *客户投诉实体类
 * @author xsy
 * @date 2019/11/27 0027 下午 2:35
 * @version crm1.0
 */
public class Com {
    /**
     * 投诉编号   111111112111111
     */
    private Integer pkComId;
    /**
     * 投诉标题
     */
    private String comTitle;
    /**
     * 投诉人
     */
    private String comPeople;
    /**
     * 投诉人电话
     */
    private String comPhone;
    /**
     * 沟通记录情况
     */
    private String comCommunication;
    /**
     * 相关附件
     */
    private String comAccessory;
    /**
     * 相关产品
     */
    private String comProducts;
    /**
     * 投诉客户类型
     */
    private Integer comPlaintType;
    /**
     * 投诉客户编号
     */
    private Integer fkCusId;

    /**
     * 损失
     */
    private double comLoss;
    /**
     * 投诉态度
     */
    private String comAttitude;
    /**
     * 投诉时间
     */
    private String comTime;
    /**
     * 分类
     */
    private String comType;
    /**
     * 紧急程度
     */
    private String comDegree;
    /**
     * 备注
     */
    private String comRemark;
    /**
     * 处理方式
     */
    private String comDisposeMode;
    /**
     * 处理意见
     */
    private String comDisposeSuggestion;
    /**
     * 处理结果
     */
    private String comDisposeResult;
    /**
     * 通知情况记录
     */
    private String comNotRecord;
    /**
     * 回访确认
     */
    private String comReturnConfirm;
    /**
     * 审批状态
     */
    private String comApprovalStatus;
    /**
     * 审批时间
     */
    private String comApprovalTime;
    /**
     * 审批结果
     */
    private String comApprovalResult;

    /**
     * 审批人
     */
    private String comApprolvalPeople;

    private String comGmtCreate;

    private String comGmtModified;

    /**
     * 无参构造函数
     */
    public Com() {
    }



    /**
     * 有参构造方法
     * @param pkComId
     * @param comTitle
     * @param comPeople
     * @param comPhone
     * @param comCommunication
     * @param comAccessory
     * @param comProducts
     * @param comPlaintType
     * @param fkCusId
     * @param comLoss
     * @param comAttitude
     * @param comTime
     * @param comType
     * @param comDegree
     * @param comRemark
     * @param comDisposeMode
     * @param comDisposeSuggestion
     * @param comDisposeResult
     * @param comNotRecord
     * @param comReturnConfirm
     * @param comApprovalStatus
     * @param comApprovalTime
     * @param comApprovalResult
     * @param comApprolvalPeople
     */
    public Com(Integer pkComId, String comTitle, String comPeople, String comPhone, String comCommunication, String comAccessory, String comProducts, Integer comPlaintType, Integer fkCusId, double comLoss, String comAttitude, String comTime, String comType, String comDegree, String comRemark, String comDisposeMode, String comDisposeSuggestion, String comDisposeResult, String comNotRecord, String comReturnConfirm, String comApprovalStatus, String comApprovalTime, String comApprovalResult, String comApprolvalPeople,String comGmtCreate,String comGmtModified) {
        this.pkComId = pkComId;
        this.comTitle = comTitle;
        this.comPeople = comPeople;
        this.comPhone = comPhone;
        this.comCommunication = comCommunication;
        this.comAccessory = comAccessory;
        this.comProducts = comProducts;
        this.comPlaintType = comPlaintType;
        this.fkCusId = fkCusId;
        this.comLoss = comLoss;
        this.comAttitude = comAttitude;
        this.comTime = comTime;
        this.comType = comType;
        this.comDegree = comDegree;
        this.comRemark = comRemark;
        this.comDisposeMode = comDisposeMode;
        this.comDisposeSuggestion = comDisposeSuggestion;
        this.comDisposeResult = comDisposeResult;
        this.comNotRecord = comNotRecord;
        this.comReturnConfirm = comReturnConfirm;
        this.comApprovalStatus = comApprovalStatus;
        this.comApprovalTime = comApprovalTime;
        this.comApprovalResult = comApprovalResult;
        this.comApprolvalPeople = comApprolvalPeople;
        this.comGmtCreate=comGmtCreate;
        this.comGmtModified=comGmtModified;
    }


    public Integer getPkComId() {
        return pkComId;
    }

    public String getComTitle() {
        return comTitle;
    }

    public String getComPeople() {
        return comPeople;
    }

    public String getComPhone() {
        return comPhone;
    }

    public String getComCommunication() {
        return comCommunication;
    }

    public String getComAccessory() {
        return comAccessory;
    }

    public String getComProducts() {
        return comProducts;
    }

    public Integer getComPlaintType() {
        return comPlaintType;
    }

    public Integer getFkCusId() {
        return fkCusId;
    }

    public double getComLoss() {
        return comLoss;
    }

    public String getComAttitude() {
        return comAttitude;
    }

    public String getComTime() {
        return comTime;
    }

    public String getComType() {
        return comType;
    }

    public String getComDegree() {
        return comDegree;
    }

    public String getComRemark() {
        return comRemark;
    }

    public String getComDisposeMode() {
        return comDisposeMode;
    }

    public String getComDisposeSuggestion() {
        return comDisposeSuggestion;
    }

    public String getComDisposeResult() {
        return comDisposeResult;
    }

    public String getComNotRecord() {
        return comNotRecord;
    }

    public String getComReturnConfirm() {
        return comReturnConfirm;
    }

    public String getComApprovalStatus() {
        return comApprovalStatus;
    }

    public String getComApprovalTime() {
        return comApprovalTime;
    }

    public String getComApprovalResult() {
        return comApprovalResult;
    }

    public String getComApprolvalPeople() {
        return comApprolvalPeople;
    }

    public void setPkComId(Integer pkComId) {
        this.pkComId = pkComId;
    }

    public void setComTitle(String comTitle) {
        this.comTitle = comTitle;
    }

    public void setComPeople(String comPeople) {
        this.comPeople = comPeople;
    }

    public void setComPhone(String comPhone) {
        this.comPhone = comPhone;
    }

    public void setComCommunication(String comCommunication) {
        this.comCommunication = comCommunication;
    }

    public void setComAccessory(String comAccessory) {
        this.comAccessory = comAccessory;
    }

    public void setComProducts(String comProducts) {
        this.comProducts = comProducts;
    }

    public void setComPlaintType(Integer comPlaintType) {
        this.comPlaintType = comPlaintType;
    }

    public void setFkCusId(Integer fkCusId) {
        this.fkCusId = fkCusId;
    }

    public void setComLoss(double comLoss) {
        this.comLoss = comLoss;
    }

    public void setComAttitude(String comAttitude) {
        this.comAttitude = comAttitude;
    }

    public void setComTime(String comTime) {
        this.comTime = comTime;
    }

    public void setComType(String comType) {
        this.comType = comType;
    }

    public void setComDegree(String comDegree) {
        this.comDegree = comDegree;
    }

    public void setComRemark(String comRemark) {
        this.comRemark = comRemark;
    }

    public void setComDisposeMode(String comDisposeMode) {
        this.comDisposeMode = comDisposeMode;
    }

    public void setComDisposeSuggestion(String comDisposeSuggestion) {
        this.comDisposeSuggestion = comDisposeSuggestion;
    }

    public void setComDisposeResult(String comDisposeResult) {
        this.comDisposeResult = comDisposeResult;
    }

    public void setComNotRecord(String comNotRecord) {
        this.comNotRecord = comNotRecord;
    }

    public void setComReturnConfirm(String comReturnConfirm) {
        this.comReturnConfirm = comReturnConfirm;
    }

    public void setComApprovalStatus(String comApprovalStatus) {
        this.comApprovalStatus = comApprovalStatus;
    }

    public void setComApprovalTime(String comApprovalTime) {
        this.comApprovalTime = comApprovalTime;
    }

    public void setComApprovalResult(String comApprovalResult) {
        this.comApprovalResult = comApprovalResult;
    }

    public void setComApprolvalPeople(String comApprolvalPeople) {
        this.comApprolvalPeople = comApprolvalPeople;
    }

    public String getComGmtCreate() {
        return comGmtCreate;
    }

    public String getComGmtModified() {
        return comGmtModified;
    }

    public void setComGmtCreate(String comGmtCreate) {
        this.comGmtCreate = comGmtCreate;
    }

    public void setComGmtModified(String comGmtModified) {
        this.comGmtModified = comGmtModified;
    }


    /**
     * 打印数据
     * @return
     */
    @Override
    public String toString() {
        return "Com{" +
                "pkComId=" + pkComId +
                ", comTitle='" + comTitle + '\'' +
                ", comPeople='" + comPeople + '\'' +
                ", comPhone='" + comPhone + '\'' +
                ", comCommunication='" + comCommunication + '\'' +
                ", comAccessory='" + comAccessory + '\'' +
                ", comProducts='" + comProducts + '\'' +
                ", comPlaintType=" + comPlaintType +
                ", fkCusId=" + fkCusId +
                ", comLoss=" + comLoss +
                ", comAttitude='" + comAttitude + '\'' +
                ", comTime='" + comTime + '\'' +
                ", comType='" + comType + '\'' +
                ", comDegree='" + comDegree + '\'' +
                ", comRemark='" + comRemark + '\'' +
                ", comDisposeMode='" + comDisposeMode + '\'' +
                ", comDisposeSuggestion='" + comDisposeSuggestion + '\'' +
                ", comDisposeResult='" + comDisposeResult + '\'' +
                ", comNotRecord='" + comNotRecord + '\'' +
                ", comReturnConfirm='" + comReturnConfirm + '\'' +
                ", comApprovalStatus='" + comApprovalStatus + '\'' +
                ", comApprovalTime='" + comApprovalTime + '\'' +
                ", comApprovalResult='" + comApprovalResult + '\'' +
                ", comApprolvalPeople='" + comApprolvalPeople + '\'' +
                ", comGmtCreate='" + comGmtCreate + '\'' +
                ", comGmtModified='" + comGmtModified + '\'' +
                '}';
    }
}

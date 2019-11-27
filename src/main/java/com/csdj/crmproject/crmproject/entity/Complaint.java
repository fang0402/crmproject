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
public class Complaint {
    /**
     * 投诉编号
     */
    private Integer complaintId;
    /**
     * 投诉标题
     */
    private String complaintsTitle;
    /**
     * 投诉人
     */
    private String complainant;
    /**
     * 投诉人电话
     */
    private String complainantPhone;
    /**
     * 沟通记录情况
     */
    private String communicationRecord;
    /**
     * 相关附件
     */
    private String relatedAccessory;
    /**
     * 相关产品
     */
    private String relatedProducts;
    /**
     * 投诉客户类型
     */
    private Integer customerTypeId;
    /**
     * 投诉客户编号
     */
    private Integer clientTableId;



    /**
     * 损失
     */
    private double loss;
    /**
     * 投诉态度
     */
    private String complaintsAttitude;
    /**
     * 投诉时间
     */
    private String complaintsTime;
    /**
     * 分类
     */
    private String type;
    /**
     * 紧急程度
     */
    private String emergencyDegree;
    /**
     * 备注
     */
    private String remark;
    /**
     * 处理方式
     */
    private String processMode;
    /**
     * 处理意见
     */
    private String handlingSuggestion;
    /**
     * 处理结果
     */
    private String resultHandling;
    /**
     * 通知情况记录
     */
    private String notificationRecord;
    /**
     * 回访确认
     */
    private String returnConfirm;
    /**
     * 审批状态
     */
    private String approvalStatus;
    /**
     * 审批时间
     */
    private String approvalTime;
    /**
     * 审批结果
     */
    private String approvalResult;


    /**
     * 无参构造函数
     */
    public Complaint() {
    }

    /**
     * 有参构造函数
     * @param complaintId
     * @param complaintsTitle
     * @param complainant
     * @param complainantPhone
     * @param communicationRecord
     * @param relatedAccessory
     * @param relatedProducts
     * @param customerTypeId
     * @param clientTableId
     * @param loss
     * @param complaintsAttitude
     * @param complaintsTime
     * @param type
     * @param emergencyDegree
     * @param remark
     * @param processMode
     * @param handlingSuggestion
     * @param resultHandling
     * @param notificationRecord
     * @param returnConfirm
     * @param approvalStatus
     * @param approvalTime
     * @param approvalResult
     */
    public Complaint(Integer complaintId, String complaintsTitle, String complainant, String complainantPhone, String communicationRecord, String relatedAccessory, String relatedProducts, Integer customerTypeId, Integer clientTableId, double loss, String complaintsAttitude, String complaintsTime, String type, String emergencyDegree, String remark, String processMode, String handlingSuggestion, String resultHandling, String notificationRecord, String returnConfirm, String approvalStatus, String approvalTime, String approvalResult) {
        this.complaintId = complaintId;
        this.complaintsTitle = complaintsTitle;
        this.complainant = complainant;
        this.complainantPhone = complainantPhone;
        this.communicationRecord = communicationRecord;
        this.relatedAccessory = relatedAccessory;
        this.relatedProducts = relatedProducts;
        this.customerTypeId = customerTypeId;
        this.clientTableId = clientTableId;
        this.loss = loss;
        this.complaintsAttitude = complaintsAttitude;
        this.complaintsTime = complaintsTime;
        this.type = type;
        this.emergencyDegree = emergencyDegree;
        this.remark = remark;
        this.processMode = processMode;
        this.handlingSuggestion = handlingSuggestion;
        this.resultHandling = resultHandling;
        this.notificationRecord = notificationRecord;
        this.returnConfirm = returnConfirm;
        this.approvalStatus = approvalStatus;
        this.approvalTime = approvalTime;
        this.approvalResult = approvalResult;
    }


    public Integer getComplaintId() {
        return complaintId;
    }

    public String getComplaintsTitle() {
        return complaintsTitle;
    }

    public String getComplainant() {
        return complainant;
    }

    public String getComplainantPhone() {
        return complainantPhone;
    }

    public String getCommunicationRecord() {
        return communicationRecord;
    }

    public String getRelatedAccessory() {
        return relatedAccessory;
    }

    public String getRelatedProducts() {
        return relatedProducts;
    }

    public Integer getCustomerTypeId() {
        return customerTypeId;
    }

    public Integer getClientTableId() {
        return clientTableId;
    }

    public double getLoss() {
        return loss;
    }

    public String getComplaintsAttitude() {
        return complaintsAttitude;
    }

    public String getComplaintsTime() {
        return complaintsTime;
    }

    public String getType() {
        return type;
    }

    public String getEmergencyDegree() {
        return emergencyDegree;
    }

    public String getRemark() {
        return remark;
    }

    public String getProcessMode() {
        return processMode;
    }

    public String getHandlingSuggestion() {
        return handlingSuggestion;
    }

    public String getResultHandling() {
        return resultHandling;
    }

    public String getNotificationRecord() {
        return notificationRecord;
    }

    public String getReturnConfirm() {
        return returnConfirm;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public String getApprovalTime() {
        return approvalTime;
    }

    public String getApprovalResult() {
        return approvalResult;
    }

    public void setComplaintId(Integer complaintId) {
        this.complaintId = complaintId;
    }

    public void setComplaintsTitle(String complaintsTitle) {
        this.complaintsTitle = complaintsTitle;
    }

    public void setComplainant(String complainant) {
        this.complainant = complainant;
    }

    public void setComplainantPhone(String complainantPhone) {
        this.complainantPhone = complainantPhone;
    }

    public void setCommunicationRecord(String communicationRecord) {
        this.communicationRecord = communicationRecord;
    }

    public void setRelatedAccessory(String relatedAccessory) {
        this.relatedAccessory = relatedAccessory;
    }

    public void setRelatedProducts(String relatedProducts) {
        this.relatedProducts = relatedProducts;
    }

    public void setCustomerTypeId(Integer customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public void setClientTableId(Integer clientTableId) {
        this.clientTableId = clientTableId;
    }

    public void setLoss(double loss) {
        this.loss = loss;
    }

    public void setComplaintsAttitude(String complaintsAttitude) {
        this.complaintsAttitude = complaintsAttitude;
    }

    public void setComplaintsTime(String complaintsTime) {
        this.complaintsTime = complaintsTime;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEmergencyDegree(String emergencyDegree) {
        this.emergencyDegree = emergencyDegree;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setProcessMode(String processMode) {
        this.processMode = processMode;
    }

    public void setHandlingSuggestion(String handlingSuggestion) {
        this.handlingSuggestion = handlingSuggestion;
    }

    public void setResultHandling(String resultHandling) {
        this.resultHandling = resultHandling;
    }

    public void setNotificationRecord(String notificationRecord) {
        this.notificationRecord = notificationRecord;
    }

    public void setReturnConfirm(String returnConfirm) {
        this.returnConfirm = returnConfirm;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public void setApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime;
    }

    public void setApprovalResult(String approvalResult) {
        this.approvalResult = approvalResult;
    }


    /**
     * 打印数据
     * @return
     */
    @Override
    public String toString() {
        return "Complaint{" +
                "complaintId=" + complaintId +
                ", complaintsTitle='" + complaintsTitle + '\'' +
                ", complainant='" + complainant + '\'' +
                ", complainantPhone='" + complainantPhone + '\'' +
                ", communicationRecord='" + communicationRecord + '\'' +
                ", relatedAccessory='" + relatedAccessory + '\'' +
                ", relatedProducts='" + relatedProducts + '\'' +
                ", customerTypeId=" + customerTypeId +
                ", clientTableId=" + clientTableId +
                ", loss=" + loss +
                ", complaintsAttitude='" + complaintsAttitude + '\'' +
                ", complaintsTime='" + complaintsTime + '\'' +
                ", type='" + type + '\'' +
                ", emergencyDegree='" + emergencyDegree + '\'' +
                ", remark='" + remark + '\'' +
                ", processMode='" + processMode + '\'' +
                ", handlingSuggestion='" + handlingSuggestion + '\'' +
                ", resultHandling='" + resultHandling + '\'' +
                ", notificationRecord='" + notificationRecord + '\'' +
                ", returnConfirm='" + returnConfirm + '\'' +
                ", approvalStatus='" + approvalStatus + '\'' +
                ", approvalTime='" + approvalTime + '\'' +
                ", approvalResult='" + approvalResult + '\'' +
                '}';
    }
}

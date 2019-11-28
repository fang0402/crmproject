/*
 * 文 件 名： 收款记录表
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author 易富军
 * @version 1.0
 * @date 2019/11/26 22:59
 */
public class ReCeiRecord {
    /**
     *收款记录id
     */
    private int pkRerecordId;
    /**
     * 收款金额
     */
    private double reRecordMount;
    /**
     * 客户类型id
     */
    private int fkUserTypeId;
    /**
     * 客户id（关联客户表）
     */
    private int fkCusId;
    /**
     *客户名称
     */
    private String reReCorDrName;
    /**
     *  订单/合同id（关联订单/合同表）
     */
    private int fkOrderConId;
    /**
     * 订单/合同名称
     */
    private String reReCordName;
    /**
     *订单/合同额类型
     */
    private int fkOrderConTypeId ;
    /**
     * 收款日期
     */
    private String reRecordTime;
    /**
     * 经手人id（关联用户表）
     */
    private int fkUserId;
    /**
     * 负责人
     */
    private String reReCordPrincipal;
    /**
     * 备注
     */
    private String reRecordRemark;

    /**
     * 有参构造
     */
    public ReCeiRecord() {
    }

    /**
     * 无参构造
     * @param pkRerecordId
     * @param reRecordMount
     * @param fkUserTypeId
     * @param fkCusId
     * @param reReCorDrName
     * @param fkOrderConId
     * @param reReCordName
     * @param fkOrderConTypeId
     * @param reRecordTime
     * @param fkUserId
     * @param reReCordPrincipal
     * @param reRecordRemark
     */
    public ReCeiRecord(int pkRerecordId, double reRecordMount, int fkUserTypeId, int fkCusId, String reReCorDrName, int fkOrderConId, String reReCordName, int fkOrderConTypeId, String reRecordTime, int fkUserId, String reReCordPrincipal, String reRecordRemark) {
        this.pkRerecordId = pkRerecordId;
        this.reRecordMount = reRecordMount;
        this.fkUserTypeId = fkUserTypeId;
        this.fkCusId = fkCusId;
        this.reReCorDrName = reReCorDrName;
        this.fkOrderConId = fkOrderConId;
        this.reReCordName = reReCordName;
        this.fkOrderConTypeId = fkOrderConTypeId;
        this.reRecordTime = reRecordTime;
        this.fkUserId = fkUserId;
        this.reReCordPrincipal = reReCordPrincipal;
        this.reRecordRemark = reRecordRemark;
    }

    /**
     * 显示数据
     * @return
     */
    @Override
    public String toString() {
        return "ReCeiRecord{" +
                "pkRerecordId=" + pkRerecordId +
                ", reRecordMount=" + reRecordMount +
                ", fkUserTypeId=" + fkUserTypeId +
                ", fkCusId=" + fkCusId +
                ", reReCorDrName='" + reReCorDrName + '\'' +
                ", fkOrderConId=" + fkOrderConId +
                ", reReCordName='" + reReCordName + '\'' +
                ", fkOrderConTypeId=" + fkOrderConTypeId +
                ", reRecordTime='" + reRecordTime + '\'' +
                ", fkUserId=" + fkUserId +
                ", reReCordPrincipal='" + reReCordPrincipal + '\'' +
                ", reRecordRemark='" + reRecordRemark + '\'' +
                '}';
    }

    public int getPkRerecordId() {
        return pkRerecordId;
    }

    public void setPkRerecordId(int pkRerecordId) {
        this.pkRerecordId = pkRerecordId;
    }

    public double getReRecordMount() {
        return reRecordMount;
    }

    public void setReRecordMount(double reRecordMount) {
        this.reRecordMount = reRecordMount;
    }

    public int getFkUserTypeId() {
        return fkUserTypeId;
    }

    public void setFkUserTypeId(int fkUserTypeId) {
        this.fkUserTypeId = fkUserTypeId;
    }

    public int getFkCusId() {
        return fkCusId;
    }

    public void setFkCusId(int fkCusId) {
        this.fkCusId = fkCusId;
    }

    public String getReReCorDrName() {
        return reReCorDrName;
    }

    public void setReReCorDrName(String reReCorDrName) {
        this.reReCorDrName = reReCorDrName;
    }

    public int getFkOrderConId() {
        return fkOrderConId;
    }

    public void setFkOrderConId(int fkOrderConId) {
        this.fkOrderConId = fkOrderConId;
    }

    public String getReReCordName() {
        return reReCordName;
    }

    public void setReReCordName(String reReCordName) {
        this.reReCordName = reReCordName;
    }

    public int getFkOrderConTypeId() {
        return fkOrderConTypeId;
    }

    public void setFkOrderConTypeId(int fkOrderConTypeId) {
        this.fkOrderConTypeId = fkOrderConTypeId;
    }

    public String getReRecordTime() {
        return reRecordTime;
    }

    public void setReRecordTime(String reRecordTime) {
        this.reRecordTime = reRecordTime;
    }

    public int getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(int fkUserId) {
        this.fkUserId = fkUserId;
    }

    public String getReReCordPrincipal() {
        return reReCordPrincipal;
    }

    public void setReReCordPrincipal(String reReCordPrincipal) {
        this.reReCordPrincipal = reReCordPrincipal;
    }

    public String getReRecordRemark() {
        return reRecordRemark;
    }

    public void setReRecordRemark(String reRecordRemark) {
        this.reRecordRemark = reRecordRemark;
    }
}

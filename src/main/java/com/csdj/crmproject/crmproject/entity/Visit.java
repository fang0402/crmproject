/*
 * 文 件 名：客户拜访
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号：1.0
 */
package com.csls.layuidemo.entity;



/**
 *  客户拜访实体类1111111
 * @date  2019-11-27
 * @author wjn
 * @version crm1.0
 */

public class Visit implements java.io.Serializable {
    /** 唯一编号 */
    private Long pkVisitId;

    /** 客户类型编号 */

    private Long fkCtpId;

    /** 客户编号 */

    private Long fkCusId;

    /** 主题 */

    private String visitTheme;

    /** 类型(未开始、进行中、暂停中、已完成、已取消) */

    private String visitType;

    /** 拜访总结 */

    private String visitSummary;

    /** 开始时间 */

    private String visitStartTime;

    /** 结束时间 */

    private String visitEndTime;

    /** 拜访地址 */

    private String visitAddress;

    /** 创建时间 */

    private String gmtCreate;
    /** 修改时间 */
    private String gmtModified;
    /** 创建人 */

    private String creator;

    /**
     * 无参构造函数
     */
    public Visit() { }

    /**
     * 带参构造函数
     * @param pkVisitId
     * @param fkCtpId
     * @param fkCusId
     * @param visitTheme
     * @param visitType
     * @param visitSummary
     * @param visitStartTime
     * @param visitEndTime
     * @param visitAddress
     * @param gmtCreate
     * @param gmtModified
     * @param creator
     */
    public Visit(Long pkVisitId, Long fkCtpId, Long fkCusId, String visitTheme, String visitType,
                 String visitSummary, String visitStartTime, String visitEndTime, String visitAddress,
                 String gmtCreate,String gmtModified, String creator) {
        this.pkVisitId = pkVisitId;
        this.fkCtpId = fkCtpId;
        this.fkCusId = fkCusId;
        this.visitTheme = visitTheme;
        this.visitType = visitType;
        this.visitSummary = visitSummary;
        this.visitStartTime = visitStartTime;
        this.visitEndTime = visitEndTime;
        this.visitAddress = visitAddress;
        this.gmtCreate = gmtCreate;
        this.gmtModified=gmtModified;
        this.creator = creator;
    }

    /**
     * toString方法
     * @return
     */
    @Override
    public String toString() {
        return "VisitEntity{" +
                "pkVisitId=" + pkVisitId +
                ", fkCtpId=" + fkCtpId +
                ", fkCusId=" + fkCusId +
                ", visitTheme='" + visitTheme + '\'' +
                ", visitType='" + visitType + '\'' +
                ", visitSummary='" + visitSummary + '\'' +
                ", visitStartTime='" + visitStartTime + '\'' +
                ", visitEndTime='" + visitEndTime + '\'' +
                ", visitAddress='" + visitAddress + '\'' +
                ", gmtCreate='" + gmtCreate + '\'' +
                ", gmtModified='" + gmtModified + '\'' +
                ", creator='" + creator + '\'' +
                '}';
    }

    public Long getPkVisitId() {
        return pkVisitId;
    }

    public void setPkVisitId(Long pkVisitId) {
        this.pkVisitId = pkVisitId;
    }

    public Long getFkCtpId() {
        return fkCtpId;
    }

    public void setFkCtpId(Long fkCtpId) {
        this.fkCtpId = fkCtpId;
    }

    public Long getFkCusId() {
        return fkCusId;
    }

    public void setFkCusId(Long fkCusId) {
        this.fkCusId = fkCusId;
    }

    public String getVisitTheme() {
        return visitTheme;
    }

    public void setVisitTheme(String visitTheme) {
        this.visitTheme = visitTheme;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    public String getVisitSummary() {
        return visitSummary;
    }

    public void setVisitSummary(String visitSummary) {
        this.visitSummary = visitSummary;
    }

    public String getVisitStartTime() {
        return visitStartTime;
    }

    public void setVisitStartTime(String visitStartTime) {
        this.visitStartTime = visitStartTime;
    }

    public String getVisitEndTime() {
        return visitEndTime;
    }

    public void setVisitEndTime(String visitEndTime) {
        this.visitEndTime = visitEndTime;
    }

    public String getVisitAddress() {
        return visitAddress;
    }

    public void setVisitAddress(String visitAddress) {
        this.visitAddress = visitAddress;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
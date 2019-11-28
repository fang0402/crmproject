/*
 * 文 件 名：
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号：1.0
 */
package com.csls.layuidemo.entity;



/**
 *  客户关怀实体类
 * @date  2019-11-27
 * @author wjn
 * @version crm1.0
 */
public class Care implements java.io.Serializable {

    /** 唯一编号 */
    private Long pkCareId;

    /** 客户类型编号 */
    private Long fkCtpId;

    /** 客户编号 */
    private Long fkCusId;

    /** 联系人编号 */
    private Long fkContactsId;

    /** 负责人编号 */
    private Long fkUserId;

    /** 关怀内容 */
    private String careContent;

    /** 备注 */
    private String careRemark;

    /** 创建者 */
    private String creator;

    /** 修改时间 */
    private String gmtModified;

    /** 创建时间 */
    private String gmtCreate;

    /**
     * 无参构造函数
     */
    public Care() {
    }

    /**
     * 带参构造函数
     * @param pkCareId
     * @param fkCtpId
     * @param fkCusId
     * @param fkContactsId
     * @param fkUserId
     * @param careContent
     * @param careRemark
     * @param careCreator
     * @param creator
     * @param gmtModified
     * @param gmtCreate
     */
    public Care(Long pkCareId, Long fkCtpId, Long fkCusId, Long fkContactsId, Long fkUserId, String careContent,
                String careRemark, String careCreator,String creator,String gmtModified,String gmtCreate) {
        this.pkCareId = pkCareId;
        this.fkCtpId = fkCtpId;
        this.fkCusId = fkCusId;
        this.fkContactsId = fkContactsId;
        this.fkUserId = fkUserId;
        this.careContent = careContent;
        this.careRemark = careRemark;
        this.creator=creator;
        this.gmtModified = careCreator;
        this.gmtCreate = gmtCreate;
    }

    /**
     * toString方法
     * @return
     */
    @Override
    public String toString() {
        return "Care{" +
                "pkCareId=" + pkCareId +
                ", fkCtpId=" + fkCtpId +
                ", fkCusId=" + fkCusId +
                ", fkContactsId=" + fkContactsId +
                ", fkUserId=" + fkUserId +
                ", careContent='" + careContent + '\'' +
                ", careRemark='" + careRemark + '\'' +
                ", creator='" + creator + '\'' +
                ", gmtModified='" + gmtModified + '\'' +
                ", gmtCreate='" + gmtCreate + '\'' +
                '}';
    }

    public Long getPkCareId() {
        return pkCareId;
    }

    public void setPkCareId(Long pkCareId) {
        this.pkCareId = pkCareId;
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

    public Long getFkContactsId() {
        return fkContactsId;
    }

    public void setFkContactsId(Long fkContactsId) {
        this.fkContactsId = fkContactsId;
    }

    public Long getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(Long fkUserId) {
        this.fkUserId = fkUserId;
    }

    public String getCareContent() {
        return careContent;
    }

    public void setCareContent(String careContent) {
        this.careContent = careContent;
    }

    public String getCareRemark() {
        return careRemark;
    }

    public void setCareRemark(String careRemark) {
        this.careRemark = careRemark;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
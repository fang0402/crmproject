/*
 * 文 件 名：客户拜访
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;


/**
 *  客户拜访实体类
 * @date  2019-11-27
 * @author wjn
 * @version crm1.0
 */

public class CustomerVisitEntity{

    /** 唯一编号 */
    private Long onlyId;
    /** 客户类型编号 */
    private Long customerTypeId;
    /** 客户编号 */
    private Long clientId;
    /** 主题 */
    private String theme;
    /** 类型(未开始、进行中、暂停中、已完成、已取消) */
    private String type;
    /** 拜访总结 */
    private String visitSummary;
    /** 开始时间 */
    private String startingTime;
    /** 结束时间 */
    private String endTime;
    /** 拜访地址 */
    private String visitingAddress;
    /** 创建时间 */
    private String creationTime;
    /** 创建人 */
    private String founder;

    /**
     * 获取唯一编号
     * 
     * @return 唯一编号
     */
    public Long getOnlyId() {
        return this.onlyId;
    }

    /**
     * 设置唯一编号
     * 
     * @param onlyId
     *          唯一编号
     */
    public void setOnlyId(Long onlyId) {
        this.onlyId = onlyId;
    }

    /**
     * 获取客户类型编号
     * 
     * @return 客户类型编号
     */
    public Long getCustomerTypeId() {
        return this.customerTypeId;
    }

    /**
     * 设置客户类型编号
     * 
     * @param customerTypeId
     *          客户类型编号
     */
    public void setCustomerTypeId(Long customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    /**
     * 获取客户编号
     * 
     * @return 客户编号
     */
    public Long getClientId() {
        return this.clientId;
    }

    /**
     * 设置客户编号
     * 
     * @param clientId
     *          客户编号
     */
    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    /**
     * 获取主题
     * 
     * @return 主题
     */
    public String getTheme() {
        return this.theme;
    }

    /**
     * 设置主题
     * 
     * @param theme
     *          主题
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * 获取类型(未开始、进行中、暂停中、已完成、已取消)
     * 
     * @return 类型(未开始、进行中、暂停中、已完成、已取消)
     */
    public String getType() {
        return this.type;
    }

    /**
     * 设置类型(未开始、进行中、暂停中、已完成、已取消)
     * 
     * @param type
     *          类型(未开始、进行中、暂停中、已完成、已取消)
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取拜访总结
     * 
     * @return 拜访总结
     */
    public String getVisitSummary() {
        return this.visitSummary;
    }

    /**
     * 设置拜访总结
     * 
     * @param visitSummary
     *          拜访总结
     */
    public void setVisitSummary(String visitSummary) {
        this.visitSummary = visitSummary;
    }

    /**
     * 获取开始时间
     * 
     * @return 开始时间
     */
    public String getStartingTime() {
        return this.startingTime;
    }

    /**
     * 设置开始时间
     * 
     * @param startingTime
     *          开始时间
     */
    public void setStartingTime(String startingTime) {
        this.startingTime = startingTime;
    }

    /**
     * 获取结束时间
     * 
     * @return 结束时间
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * 设置结束时间
     * 
     * @param endTime
     *          结束时间
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取拜访地址
     * 
     * @return 拜访地址
     */
    public String getVisitingAddress() {
        return this.visitingAddress;
    }

    /**
     * 设置拜访地址
     * 
     * @param visitingAddress
     *          拜访地址
     */
    public void setVisitingAddress(String visitingAddress) {
        this.visitingAddress = visitingAddress;
    }

    /**
     * 获取创建时间
     * 
     * @return 创建时间
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * 设置创建时间
     * 
     * @param creationTime
     *          创建时间
     */
    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * 获取创建人
     * 
     * @return 创建人
     */
    public String getFounder() {
        return this.founder;
    }

    /**
     * 设置创建人
     * 
     * @param founder
     *          创建人
     */
    public void setFounder(String founder) {
        this.founder = founder;
    }

    /**
     * 带参构造方法
     * @param onlyId
     * @param customerTypeId
     * @param clientId
     * @param theme
     * @param type
     * @param visitSummary
     * @param startingTime
     * @param endTime
     * @param visitingAddress
     * @param creationTime
     * @param founder
     */
    public CustomerVisitEntity(Long onlyId, Long customerTypeId, Long clientId, String theme, String type,
                               String visitSummary, String startingTime, String endTime, String visitingAddress,
                               String creationTime, String founder) {
        this.onlyId = onlyId;
        this.customerTypeId = customerTypeId;
        this.clientId = clientId;
        this.theme = theme;
        this.type = type;
        this.visitSummary = visitSummary;
        this.startingTime = startingTime;
        this.endTime = endTime;
        this.visitingAddress = visitingAddress;
        this.creationTime = creationTime;
        this.founder = founder;
    }

    /**
     * 无参构造方法
     */
    public CustomerVisitEntity() { }

    /**
     * toString方法
     * @return
     */
    @Override
    public String toString() {
        return "CustomerVisitEntity{" +
                "onlyId=" + onlyId +
                ", customerTypeId=" + customerTypeId +
                ", clientId=" + clientId +
                ", theme='" + theme + '\'' +
                ", type='" + type + '\'' +
                ", visitSummary='" + visitSummary + '\'' +
                ", startingTime='" + startingTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", visitingAddress='" + visitingAddress + '\'' +
                ", creationTime='" + creationTime + '\'' +
                ", founder='" + founder + '\'' +
                '}';
    }
}
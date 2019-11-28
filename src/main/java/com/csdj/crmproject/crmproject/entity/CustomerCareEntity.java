/*
 * 文 件 名：
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;


/**
 *  客户关怀实体类
 * @date  2019-11-27
 * @author wjn
 * @version crm1.0
 */
public class CustomerCareEntity{

    /** 唯一编号 */
    private Long onlyId;
    /** 客户类型编号 */
    private Long customerType;
    /** 客户编号 */
    private Long clientId;
    /** 联系人编号 */
    private Long contactPersonId;
    /** 负责人编号 */
    private Long principalId;
    /** 关怀内容 */
    private String caringContent;
    /** 备注 */
    private String remark;
    /** 创建者 */
    private String creator;
    /** 创建时间 */
    private String creationTime;

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
    public Long getCustomerType() {
        return this.customerType;
    }

    /**
     * 设置客户类型编号
     * 
     * @param customerType
     *          客户类型编号
     */
    public void setCustomerType(Long customerType) {
        this.customerType = customerType;
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
     * 获取联系人编号
     * 
     * @return 联系人编号
     */
    public Long getContactPersonId() {
        return this.contactPersonId;
    }

    /**
     * 设置联系人编号
     * 
     * @param contactPersonId
     *          联系人编号
     */
    public void setContactPersonId(Long contactPersonId) {
        this.contactPersonId = contactPersonId;
    }

    /**
     * 获取负责人编号
     * 
     * @return 负责人编号
     */
    public Long getPrincipalId() {
        return this.principalId;
    }

    /**
     * 设置负责人编号
     * 
     * @param principalId
     *          负责人编号
     */
    public void setPrincipalId(Long principalId) {
        this.principalId = principalId;
    }

    /**
     * 获取关怀内容
     * 
     * @return 关怀内容
     */
    public String getCaringContent() {
        return this.caringContent;
    }

    /**
     * 设置关怀内容
     * 
     * @param caringContent
     *          关怀内容
     */
    public void setCaringContent(String caringContent) {
        this.caringContent = caringContent;
    }

    /**
     * 获取备注
     * 
     * @return 备注
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * 设置备注
     * 
     * @param remark
     *          备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取创建者
     * 
     * @return 创建者
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * 设置创建者
     * 
     * @param creator
     *          创建者
     */
    public void setCreator(String creator) {
        this.creator = creator;
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
     * 带参构造函数
     * @param onlyId
     * @param customerType
     * @param clientId
     * @param contactPersonId
     * @param principalId
     * @param caringContent
     * @param remark
     * @param creator
     * @param creationTime
     */
    public CustomerCareEntity(Long onlyId, Long customerType, Long clientId, Long contactPersonId, Long principalId,
                              String caringContent, String remark, String creator, String creationTime) {
        this.onlyId = onlyId;
        this.customerType = customerType;
        this.clientId = clientId;
        this.contactPersonId = contactPersonId;
        this.principalId = principalId;
        this.caringContent = caringContent;
        this.remark = remark;
        this.creator = creator;
        this.creationTime = creationTime;
    }

    /**
     * 无参构造函数
     */
    public CustomerCareEntity() {};

    /**
     * toString方法
     * @return
     */
    @Override
    public String toString() {
        return "CustomerCareEntity{" +
                "onlyId=" + onlyId +
                ", customerType=" + customerType +
                ", clientId=" + clientId +
                ", contactPersonId=" + contactPersonId +
                ", principalId=" + principalId +
                ", caringContent='" + caringContent + '\'' +
                ", remark='" + remark + '\'' +
                ", creator='" + creator + '\'' +
                ", creationTime='" + creationTime + '\'' +
                '}';
    }
}
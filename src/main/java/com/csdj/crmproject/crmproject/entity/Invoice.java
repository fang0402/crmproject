/**
 * 文 件 名：发货单
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */
package com.csdj.crmproject.crmproject.entity;
/**
 * @author wanghao
 * @date 2019/11/28
 */
public class Invoice {
    /**
     * 发货单ID
     */
    private int pkInvoiceId;
    /**
     * 主题
     */
    private String invoiceTheme;
    /**
     * 发货人ID
     */
    private int fkConsignorId;
    /**
     * 发货时间
     */
    private String invoiceDeliveryTime;
    /**
     * 收货客户类型ID
     */
    private int fkTorCustomerId;
    /**
     * 收货客户ID 关联客户表
     */
    private int fkReceivingCustomerId;
    /**
     * 收货客户名称
     */
    private String invoiceRcName;
    /**
     * 订单或者合同额类型
     */
    private int fkInvoiceOoCaTypeId;
    /**
     * 订单或者合同id
     */
    private int fkOrderContractId;
    /**
     * 订单或者合同名称
     */
    private String invoiceOrderContractName;
    /**
     * 收货方式
     */
    private String invoiceDeliveryMethod;
    /**
     * 发货状态
     */
    private String invoiceDeliveryStatus;
    /**
     * 快递单编号
     */
    private int invoiceCourierNumberId;
    /**
     * 收货联系人
     */
    private String invoiceReceivingContact;
    /**
     * 收货人工作电话
     */
    private String invoiceCwTelephone;
    /**
     * 收货人手机
     */
    private String invoiceCmPhone;
    /**
     * 收货人地址
     */
    private String invoiceShippingAddress;
    /**
     * 说明
     */
    private String invoiceInstructions;

    public int getPkInvoiceId() {
        return pkInvoiceId;
    }

    public void setPkInvoiceId(int pkInvoiceId) {
        this.pkInvoiceId = pkInvoiceId;
    }

    public String getInvoiceTheme() {
        return invoiceTheme;
    }

    public void setInvoiceTheme(String invoiceTheme) {
        this.invoiceTheme = invoiceTheme;
    }

    public int getFkConsignorId() {
        return fkConsignorId;
    }

    public void setFkConsignorId(int fkConsignorId) {
        this.fkConsignorId = fkConsignorId;
    }

    public String getInvoiceDeliveryTime() {
        return invoiceDeliveryTime;
    }

    public void setInvoiceDeliveryTime(String invoiceDeliveryTime) {
        this.invoiceDeliveryTime = invoiceDeliveryTime;
    }

    public int getFkTorCustomerId() {
        return fkTorCustomerId;
    }

    public void setFkTorCustomerId(int fkTorCustomerId) {
        this.fkTorCustomerId = fkTorCustomerId;
    }

    public int getFkReceivingCustomerId() {
        return fkReceivingCustomerId;
    }

    public void setFkReceivingCustomerId(int fkReceivingCustomerId) {
        this.fkReceivingCustomerId = fkReceivingCustomerId;
    }

    public String getInvoiceRcName() {
        return invoiceRcName;
    }

    public void setInvoiceRcName(String invoiceRcName) {
        this.invoiceRcName = invoiceRcName;
    }

    public int getFkInvoiceOoCaTypeId() {
        return fkInvoiceOoCaTypeId;
    }

    public void setFkInvoiceOoCaTypeId(int fkInvoiceOoCaTypeId) {
        this.fkInvoiceOoCaTypeId = fkInvoiceOoCaTypeId;
    }

    public int getFkOrderContractId() {
        return fkOrderContractId;
    }

    public void setFkOrderContractId(int fkOrderContractId) {
        this.fkOrderContractId = fkOrderContractId;
    }

    public String getInvoiceOrderContractName() {
        return invoiceOrderContractName;
    }

    public void setInvoiceOrderContractName(String invoiceOrderContractName) {
        this.invoiceOrderContractName = invoiceOrderContractName;
    }

    public String getInvoiceDeliveryMethod() {
        return invoiceDeliveryMethod;
    }

    public void setInvoiceDeliveryMethod(String invoiceDeliveryMethod) {
        this.invoiceDeliveryMethod = invoiceDeliveryMethod;
    }

    public String getInvoiceDeliveryStatus() {
        return invoiceDeliveryStatus;
    }

    public void setInvoiceDeliveryStatus(String invoiceDeliveryStatus) {
        this.invoiceDeliveryStatus = invoiceDeliveryStatus;
    }

    public int getInvoiceCourierNumberId() {
        return invoiceCourierNumberId;
    }

    public void setInvoiceCourierNumberId(int invoiceCourierNumberId) {
        this.invoiceCourierNumberId = invoiceCourierNumberId;
    }

    public String getInvoiceReceivingContact() {
        return invoiceReceivingContact;
    }

    public void setInvoiceReceivingContact(String invoiceReceivingContact) {
        this.invoiceReceivingContact = invoiceReceivingContact;
    }

    public String getInvoiceCwTelephone() {
        return invoiceCwTelephone;
    }

    public void setInvoiceCwTelephone(String invoiceCwTelephone) {
        this.invoiceCwTelephone = invoiceCwTelephone;
    }

    public String getInvoiceCmPhone() {
        return invoiceCmPhone;
    }

    public void setInvoiceCmPhone(String invoiceCmPhone) {
        this.invoiceCmPhone = invoiceCmPhone;
    }

    public String getInvoiceShippingAddress() {
        return invoiceShippingAddress;
    }

    public void setInvoiceShippingAddress(String invoiceShippingAddress) {
        this.invoiceShippingAddress = invoiceShippingAddress;
    }

    public String getInvoiceInstructions() {
        return invoiceInstructions;
    }

    public void setInvoiceInstructions(String invoiceInstructions) {
        this.invoiceInstructions = invoiceInstructions;
    }
    /**
     * 显示数据
     * @return String
     */
    @Override
    public String toString() {
        return "Invoice{" +
                "pkInvoiceId=" + pkInvoiceId +
                ", invoiceTheme='" + invoiceTheme + '\'' +
                ", fkConsignorId=" + fkConsignorId +
                ", invoiceDeliveryTime='" + invoiceDeliveryTime + '\'' +
                ", fkTorCustomerId=" + fkTorCustomerId +
                ", fkReceivingCustomerId=" + fkReceivingCustomerId +
                ", invoiceRcName='" + invoiceRcName + '\'' +
                ", fkInvoiceOoCaTypeId=" + fkInvoiceOoCaTypeId +
                ", fkOrderContractId=" + fkOrderContractId +
                ", invoiceOrderContractName='" + invoiceOrderContractName + '\'' +
                ", invoiceDeliveryMethod='" + invoiceDeliveryMethod + '\'' +
                ", invoiceDeliveryStatus='" + invoiceDeliveryStatus + '\'' +
                ", invoiceCourierNumberId=" + invoiceCourierNumberId +
                ", invoiceReceivingContact='" + invoiceReceivingContact + '\'' +
                ", invoiceCwTelephone='" + invoiceCwTelephone + '\'' +
                ", invoiceCmPhone='" + invoiceCmPhone + '\'' +
                ", invoiceShippingAddress='" + invoiceShippingAddress + '\'' +
                ", invoiceInstructions='" + invoiceInstructions + '\'' +
                '}';
    }

    /**
     *有参构造
     * @param pkInvoiceId
     * @param invoiceTheme
     * @param fkConsignorId
     * @param invoiceDeliveryTime
     * @param fkTorCustomerId
     * @param fkReceivingCustomerId
     * @param invoiceRcName
     * @param fkInvoiceOoCaTypeId
     * @param fkOrderContractId
     * @param invoiceOrderContractName
     * @param invoiceDeliveryMethod
     * @param invoiceDeliveryStatus
     * @param invoiceCourierNumberId
     * @param invoiceReceivingContact
     * @param invoiceCwTelephone
     * @param invoiceCmPhone
     * @param invoiceShippingAddress
     * @param invoiceInstructions
     */
    public Invoice(int pkInvoiceId, String invoiceTheme, int fkConsignorId, String invoiceDeliveryTime, int fkTorCustomerId, int fkReceivingCustomerId, String invoiceRcName, int fkInvoiceOoCaTypeId, int fkOrderContractId, String invoiceOrderContractName, String invoiceDeliveryMethod, String invoiceDeliveryStatus, int invoiceCourierNumberId, String invoiceReceivingContact, String invoiceCwTelephone, String invoiceCmPhone, String invoiceShippingAddress, String invoiceInstructions) {
        this.pkInvoiceId = pkInvoiceId;
        this.invoiceTheme = invoiceTheme;
        this.fkConsignorId = fkConsignorId;
        this.invoiceDeliveryTime = invoiceDeliveryTime;
        this.fkTorCustomerId = fkTorCustomerId;
        this.fkReceivingCustomerId = fkReceivingCustomerId;
        this.invoiceRcName = invoiceRcName;
        this.fkInvoiceOoCaTypeId = fkInvoiceOoCaTypeId;
        this.fkOrderContractId = fkOrderContractId;
        this.invoiceOrderContractName = invoiceOrderContractName;
        this.invoiceDeliveryMethod = invoiceDeliveryMethod;
        this.invoiceDeliveryStatus = invoiceDeliveryStatus;
        this.invoiceCourierNumberId = invoiceCourierNumberId;
        this.invoiceReceivingContact = invoiceReceivingContact;
        this.invoiceCwTelephone = invoiceCwTelephone;
        this.invoiceCmPhone = invoiceCmPhone;
        this.invoiceShippingAddress = invoiceShippingAddress;
        this.invoiceInstructions = invoiceInstructions;
    }

    /**
     * 无参构造
     */
    public Invoice() {
    }
}


/**
 * 文 件 名：退货信息
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */
package com.csdj.crmproject.crmproject.entity;
/**
 * @author wanghao
 * 文 件 名：
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */
public class ReturnGoods {
    /**
     * 退货id
     */
    private int pkReturnId;
    /**
     * 名称
     */
    private String returnName;
    /**
     * 退货客户类型id
     */
    private int fkRtoCustomerId;
    /**
     * 退货客户id
     */
    private int fkCustomerReturnsId;
    /**
     * 退货客户名称
     */
    private String returnCustomerReturnsName;
    /**
     * 退货合同或订单类型id
     */
    private int fkRcoOrderTypeId;
    /**
     * 退货订单或者合同id
     */
    private int fkRcoOrderId;
    /**
     * 退货名称
     */
    private String returnSalesName;
    /**
     * 销售员
     */
    private String returnSalesman;
    /**
     * 分类
     */
    private String returnClassify;
    /**
     * 退货不含税总额
     */
    private Double returnRdNitTax;
    /**
     * 毛利润
     */
    private Double returnNetProfit;
    /**
     * 税额
     */
    private Double returnTaoTtbPaId;
    /**
     * 退款额
     */
    private Double returnRefundAmounts;
    /**
     * 客户联系人id 关联联系人表
     */
    private int fkCustomerContactId;
    /**
     * 开始时间
     */
    private String returnStartTime;
    /**
     * 收款人
     */
    private String returnPayee;
    /**
     * 收款方式
     */
    private String returnPaymentTerm;
    /**
     * 收款账号单位名称
     */
    private String returnNameOfAccount⁬;
    /**
     * 收款人账号
     */
    private String returnBeneficiaryAo;
    /**
     * 收款人座机
     */
    private String returnReceiverLandLine;
    /**
     * 收款人手机号
     */
    private String returnRcPhone;
    /**
     * 收款人地址
     */
    private String returnPayeeAddress;
    /**
     * 收款人邮编
     */
    private String returnPayeeEmail;
    /**
     * 当前状态
     */
    private String returnCurrentState;
    /**
     * 审批时间
     */
    private String returnExaminationTime;
    /**
     * 创建时间
     */
    private String returnCreationTime;
    /**
     * 创建人
     */
    private String returnFounder;
    /**
     * 最后修改时间
     */
    private String returnGmtModified;
    /**
     * 最后修改人
     */
    private String returnLastModifier;
    /**
     * 备注
     */
    private String returnNote;

    public int getPkReturnId() {
        return pkReturnId;
    }

    public void setPkReturnId(int pkReturnId) {
        this.pkReturnId = pkReturnId;
    }

    public String getReturnName() {
        return returnName;
    }

    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    public int getFkRtoCustomerId() {
        return fkRtoCustomerId;
    }

    public void setFkRtoCustomerId(int fkRtoCustomerId) {
        this.fkRtoCustomerId = fkRtoCustomerId;
    }

    public int getFkCustomerReturnsId() {
        return fkCustomerReturnsId;
    }

    public void setFkCustomerReturnsId(int fkCustomerReturnsId) {
        this.fkCustomerReturnsId = fkCustomerReturnsId;
    }

    public String getReturnCustomerReturnsName() {
        return returnCustomerReturnsName;
    }

    public void setReturnCustomerReturnsName(String returnCustomerReturnsName) {
        this.returnCustomerReturnsName = returnCustomerReturnsName;
    }

    public int getFkRcoOrderTypeId() {
        return fkRcoOrderTypeId;
    }

    public void setFkRcoOrderTypeId(int fkRcoOrderTypeId) {
        this.fkRcoOrderTypeId = fkRcoOrderTypeId;
    }

    public int getFkRcoOrderId() {
        return fkRcoOrderId;
    }

    public void setFkRcoOrderId(int fkRcoOrderId) {
        this.fkRcoOrderId = fkRcoOrderId;
    }

    public String getReturnSalesName() {
        return returnSalesName;
    }

    public void setReturnSalesName(String returnSalesName) {
        this.returnSalesName = returnSalesName;
    }

    public String getReturnSalesman() {
        return returnSalesman;
    }

    public void setReturnSalesman(String returnSalesman) {
        this.returnSalesman = returnSalesman;
    }

    public String getReturnClassify() {
        return returnClassify;
    }

    public void setReturnClassify(String returnClassify) {
        this.returnClassify = returnClassify;
    }

    public Double getReturnRdNitTax() {
        return returnRdNitTax;
    }

    public void setReturnRdNitTax(Double returnRdNitTax) {
        this.returnRdNitTax = returnRdNitTax;
    }

    public Double getReturnNetProfit() {
        return returnNetProfit;
    }

    public void setReturnNetProfit(Double returnNetProfit) {
        this.returnNetProfit = returnNetProfit;
    }

    public Double getReturnTaoTtbPaId() {
        return returnTaoTtbPaId;
    }

    public void setReturnTaoTtbPaId(Double returnTaoTtbPaId) {
        this.returnTaoTtbPaId = returnTaoTtbPaId;
    }

    public Double getReturnRefundAmounts() {
        return returnRefundAmounts;
    }

    public void setReturnRefundAmounts(Double returnRefundAmounts) {
        this.returnRefundAmounts = returnRefundAmounts;
    }

    public int getFkCustomerContactId() {
        return fkCustomerContactId;
    }

    public void setFkCustomerContactId(int fkCustomerContactId) {
        this.fkCustomerContactId = fkCustomerContactId;
    }

    public String getReturnStartTime() {
        return returnStartTime;
    }

    public void setReturnStartTime(String returnStartTime) {
        this.returnStartTime = returnStartTime;
    }

    public String getReturnPayee() {
        return returnPayee;
    }

    public void setReturnPayee(String returnPayee) {
        this.returnPayee = returnPayee;
    }

    public String getReturnPaymentTerm() {
        return returnPaymentTerm;
    }

    public void setReturnPaymentTerm(String returnPaymentTerm) {
        this.returnPaymentTerm = returnPaymentTerm;
    }

    public String getReturnNameOfAccount⁬() {
        return returnNameOfAccount⁬;
    }

    public void setReturnNameOfAccount⁬(String returnNameOfAccount⁬) {
        this.returnNameOfAccount⁬ = returnNameOfAccount⁬;
    }

    public String getReturnBeneficiaryAo() {
        return returnBeneficiaryAo;
    }

    public void setReturnBeneficiaryAo(String returnBeneficiaryAo) {
        this.returnBeneficiaryAo = returnBeneficiaryAo;
    }

    public String getReturnReceiverLandLine() {
        return returnReceiverLandLine;
    }

    public void setReturnReceiverLandLine(String returnReceiverLandLine) {
        this.returnReceiverLandLine = returnReceiverLandLine;
    }

    public String getReturnRcPhone() {
        return returnRcPhone;
    }

    public void setReturnRcPhone(String returnRcPhone) {
        this.returnRcPhone = returnRcPhone;
    }

    public String getReturnPayeeAddress() {
        return returnPayeeAddress;
    }

    public void setReturnPayeeAddress(String returnPayeeAddress) {
        this.returnPayeeAddress = returnPayeeAddress;
    }

    public String getReturnPayeeEmail() {
        return returnPayeeEmail;
    }

    public void setReturnPayeeEmail(String returnPayeeEmail) {
        this.returnPayeeEmail = returnPayeeEmail;
    }

    public String getReturnCurrentState() {
        return returnCurrentState;
    }

    public void setReturnCurrentState(String returnCurrentState) {
        this.returnCurrentState = returnCurrentState;
    }

    public String getReturnExaminationTime() {
        return returnExaminationTime;
    }

    public void setReturnExaminationTime(String returnExaminationTime) {
        this.returnExaminationTime = returnExaminationTime;
    }

    public String getReturnCreationTime() {
        return returnCreationTime;
    }

    public void setReturnCreationTime(String returnCreationTime) {
        this.returnCreationTime = returnCreationTime;
    }

    public String getReturnFounder() {
        return returnFounder;
    }

    public void setReturnFounder(String returnFounder) {
        this.returnFounder = returnFounder;
    }

    public String getReturnGmtModified() {
        return returnGmtModified;
    }

    public void setReturnGmtModified(String returnGmtModified) {
        this.returnGmtModified = returnGmtModified;
    }

    public String getReturnLastModifier() {
        return returnLastModifier;
    }

    public void setReturnLastModifier(String returnLastModifier) {
        this.returnLastModifier = returnLastModifier;
    }

    public String getReturnNote() {
        return returnNote;
    }

    public void setReturnNote(String returnNote) {
        this.returnNote = returnNote;
    }
    /**
     * 显示数据
     * @return String
     */
    @Override
    public String toString() {
        return "ReturnGoods{" +
                "pkReturnId=" + pkReturnId +
                ", returnName='" + returnName + '\'' +
                ", fkRtoCustomerId=" + fkRtoCustomerId +
                ", fkCustomerReturnsId=" + fkCustomerReturnsId +
                ", returnCustomerReturnsName='" + returnCustomerReturnsName + '\'' +
                ", fkRcoOrderTypeId=" + fkRcoOrderTypeId +
                ", fkRcoOrderId=" + fkRcoOrderId +
                ", returnSalesName='" + returnSalesName + '\'' +
                ", returnSalesman='" + returnSalesman + '\'' +
                ", returnClassify='" + returnClassify + '\'' +
                ", returnRdNitTax=" + returnRdNitTax +
                ", returnNetProfit=" + returnNetProfit +
                ", returnTaoTtbPaId=" + returnTaoTtbPaId +
                ", returnRefundAmounts=" + returnRefundAmounts +
                ", fkCustomerContactId=" + fkCustomerContactId +
                ", returnStartTime='" + returnStartTime + '\'' +
                ", returnPayee='" + returnPayee + '\'' +
                ", returnPaymentTerm='" + returnPaymentTerm + '\'' +
                ", returnNameOfAccount⁬='" + returnNameOfAccount⁬ + '\'' +
                ", returnBeneficiaryAo='" + returnBeneficiaryAo + '\'' +
                ", returnReceiverLandLine='" + returnReceiverLandLine + '\'' +
                ", returnRcPhone='" + returnRcPhone + '\'' +
                ", returnPayeeAddress='" + returnPayeeAddress + '\'' +
                ", returnPayeeEmail='" + returnPayeeEmail + '\'' +
                ", returnCurrentState='" + returnCurrentState + '\'' +
                ", returnExaminationTime='" + returnExaminationTime + '\'' +
                ", returnCreationTime='" + returnCreationTime + '\'' +
                ", returnFounder='" + returnFounder + '\'' +
                ", returnGmtModified='" + returnGmtModified + '\'' +
                ", returnLastModifier='" + returnLastModifier + '\'' +
                ", returnNote='" + returnNote + '\'' +
                '}';
    }

    /**
     *有参构造
     * @param pkReturnId
     * @param returnName
     * @param fkRtoCustomerId
     * @param fkCustomerReturnsId
     * @param returnCustomerReturnsName
     * @param fkRcoOrderTypeId
     * @param fkRcoOrderId
     * @param returnSalesName
     * @param returnSalesman
     * @param returnClassify
     * @param returnRdNitTax
     * @param returnNetProfit
     * @param returnTaoTtbPaId
     * @param returnRefundAmounts
     * @param fkCustomerContactId
     * @param returnStartTime
     * @param returnPayee
     * @param returnPaymentTerm
     * @param returnNameOfAccount⁬
     * @param returnBeneficiaryAo
     * @param returnReceiverLandLine
     * @param returnRcPhone
     * @param returnPayeeAddress
     * @param returnPayeeEmail
     * @param returnCurrentState
     * @param returnExaminationTime
     * @param returnCreationTime
     * @param returnFounder
     * @param returnGmtModified
     * @param returnLastModifier
     * @param returnNote
     */
    public ReturnGoods(int pkReturnId, String returnName, int fkRtoCustomerId, int fkCustomerReturnsId, String returnCustomerReturnsName, int fkRcoOrderTypeId, int fkRcoOrderId, String returnSalesName, String returnSalesman, String returnClassify, Double returnRdNitTax, Double returnNetProfit, Double returnTaoTtbPaId, Double returnRefundAmounts, int fkCustomerContactId, String returnStartTime, String returnPayee, String returnPaymentTerm, String returnNameOfAccount⁬, String returnBeneficiaryAo, String returnReceiverLandLine, String returnRcPhone, String returnPayeeAddress, String returnPayeeEmail, String returnCurrentState, String returnExaminationTime, String returnCreationTime, String returnFounder, String returnGmtModified, String returnLastModifier, String returnNote) {
        this.pkReturnId = pkReturnId;
        this.returnName = returnName;
        this.fkRtoCustomerId = fkRtoCustomerId;
        this.fkCustomerReturnsId = fkCustomerReturnsId;
        this.returnCustomerReturnsName = returnCustomerReturnsName;
        this.fkRcoOrderTypeId = fkRcoOrderTypeId;
        this.fkRcoOrderId = fkRcoOrderId;
        this.returnSalesName = returnSalesName;
        this.returnSalesman = returnSalesman;
        this.returnClassify = returnClassify;
        this.returnRdNitTax = returnRdNitTax;
        this.returnNetProfit = returnNetProfit;
        this.returnTaoTtbPaId = returnTaoTtbPaId;
        this.returnRefundAmounts = returnRefundAmounts;
        this.fkCustomerContactId = fkCustomerContactId;
        this.returnStartTime = returnStartTime;
        this.returnPayee = returnPayee;
        this.returnPaymentTerm = returnPaymentTerm;
        this.returnNameOfAccount⁬ = returnNameOfAccount⁬;
        this.returnBeneficiaryAo = returnBeneficiaryAo;
        this.returnReceiverLandLine = returnReceiverLandLine;
        this.returnRcPhone = returnRcPhone;
        this.returnPayeeAddress = returnPayeeAddress;
        this.returnPayeeEmail = returnPayeeEmail;
        this.returnCurrentState = returnCurrentState;
        this.returnExaminationTime = returnExaminationTime;
        this.returnCreationTime = returnCreationTime;
        this.returnFounder = returnFounder;
        this.returnGmtModified = returnGmtModified;
        this.returnLastModifier = returnLastModifier;
        this.returnNote = returnNote;
    }

    /**
     * 无参构造
     */
    public ReturnGoods() {
    }
}

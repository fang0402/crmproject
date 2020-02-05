/*
 * 文 件 名：Clue
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author lxj
 * @version 1.0.0
 * @date 2019/11/27
 */
public class Clue {
    /**
     * 线索管理id
     */
    private int pkClueId;
    /**
     * 线索状态
     */
    private String clueState;
    /**
     * 线索名称
     */
    private String clueName;
    /**
     * 线索负责人
     */
    private String clueHead;
    /**
     * 客户名称
     */
    private String clueCusName;
    /**
     * 客户电话
     */
    private String clueCusCall;
    /**
     * 客户联系人
     */
    private String clueCusContact;
    /**
     * 联系人电话
     */
    private String clueContactNumber;
    /**
     * 联系人职位
     */
    private String clueContactPosition;
    /**
     * 联系人邮件
     */
    private String clueContactEmail;
    /**
     * 客户地址
     */
    private String cusAddress;
    /**
     * 城市
     */
    private String clueCity;
    /**
     * 行业
     */
    private String clueIndustry;
    /**
     *来源
     */
    private String clueSource;
    /**
     * 预期金额
     */
    private String clueExpectedAmount;
    /**
     * 预购产品
     */
    private String cluePurchasedProduct;
    /**
     * 审核时间
     */
    private String clueAuditdate;
    /**
     * 审核人
     */
    private String clueReviewer;
    /**
     * 备注
     */
    private String clueNote;
    /**
     * 分配时间
     */
    private String clueAlloDate;
    /**
     * 分配人
     */
    private String clueAlloPeople;
    /**
     * 关闭时间
     */
    private String clueClosingDate;
    /**
     * 创建时间
     */
    private String clueGmtCreate;
    /**
     * 创建人
     */
    private String clueFounder;

    public int getPkClueId() {
        return pkClueId;
    }

    public void setPkClueId(int pkClueId) {
        this.pkClueId = pkClueId;
    }

    public String getClueState() {
        return clueState;
    }

    public void setClueState(String clueState) {
        this.clueState = clueState;
    }

    public String getClueName() {
        return clueName;
    }

    public void setClueName(String clueName) {
        this.clueName = clueName;
    }

    public String getClueHead() {
        return clueHead;
    }

    public void setClueHead(String clueHead) {
        this.clueHead = clueHead;
    }

    public String getClueCusName() {
        return clueCusName;
    }

    public void setClueCusName(String clueCusName) {
        this.clueCusName = clueCusName;
    }

    public String getClueCusCall() {
        return clueCusCall;
    }

    public void setClueCusCall(String clueCusCall) {
        this.clueCusCall = clueCusCall;
    }

    public String getClueCusContact() {
        return clueCusContact;
    }

    public void setClueCusContact(String clueCusContact) {
        this.clueCusContact = clueCusContact;
    }

    public String getClueContactNumber() {
        return clueContactNumber;
    }

    public void setClueContactNumber(String clueContactNumber) {
        this.clueContactNumber = clueContactNumber;
    }

    public String getClueContactPosition() {
        return clueContactPosition;
    }

    public void setClueContactPosition(String clueContactPosition) {
        this.clueContactPosition = clueContactPosition;
    }

    public String getClueContactEmail() {
        return clueContactEmail;
    }

    public void setClueContactEmail(String clueContactEmail) {
        this.clueContactEmail = clueContactEmail;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public String getClueCity() {
        return clueCity;
    }

    public void setClueCity(String clueCity) {
        this.clueCity = clueCity;
    }

    public String getClueIndustry() {
        return clueIndustry;
    }

    public void setClueIndustry(String clueIndustry) {
        this.clueIndustry = clueIndustry;
    }

    public String getClueSource() {
        return clueSource;
    }

    public void setClueSource(String clueSource) {
        this.clueSource = clueSource;
    }

    public String getClueExpectedAmount() {
        return clueExpectedAmount;
    }

    public void setClueExpectedAmount(String clueExpectedAmount) {
        this.clueExpectedAmount = clueExpectedAmount;
    }

    public String getCluePurchasedProduct() {
        return cluePurchasedProduct;
    }

    public void setCluePurchasedProduct(String cluePurchasedProduct) {
        this.cluePurchasedProduct = cluePurchasedProduct;
    }

    public String getClueAuditdate() {
        return clueAuditdate;
    }

    public void setClueAuditdate(String clueAuditdate) {
        this.clueAuditdate = clueAuditdate;
    }

    public String getClueReviewer() {
        return clueReviewer;
    }

    public void setClueReviewer(String clueReviewer) {
        this.clueReviewer = clueReviewer;
    }

    public String getClueNote() {
        return clueNote;
    }

    public void setClueNote(String clueNote) {
        this.clueNote = clueNote;
    }

    public String getClueAlloDate() {
        return clueAlloDate;
    }

    public void setClueAlloDate(String clueAlloDate) {
        this.clueAlloDate = clueAlloDate;
    }

    public String getClueAlloPeople() {
        return clueAlloPeople;
    }

    public void setClueAlloPeople(String clueAlloPeople) {
        this.clueAlloPeople = clueAlloPeople;
    }

    public String getClueClosingDate() {
        return clueClosingDate;
    }

    public void setClueClosingDate(String clueClosingDate) {
        this.clueClosingDate = clueClosingDate;
    }

    public String getClueGmtCreate() {
        return clueGmtCreate;
    }

    public void setClueGmtCreate(String clueGmtCreate) {
        this.clueGmtCreate = clueGmtCreate;
    }

    public String getClueFounder() {
        return clueFounder;
    }

    public void setClueFounder(String clueFounder) {
        this.clueFounder = clueFounder;
    }

    /**
     * 无参构造
     */
    public Clue() {}

    /**
     * 带参构造
     * @param pkClueId
     * @param clueState
     * @param clueName
     * @param clueHead
     * @param clueCusName
     * @param clueCusCall
     * @param clueCusContact
     * @param clueContactNumber
     * @param clueContactPosition
     * @param clueContactEmail
     * @param cusAddress
     * @param clueCity
     * @param clueIndustry
     * @param clueSource
     * @param clueExpectedAmount
     * @param cluePurchasedProduct
     * @param clueAuditdate
     * @param clueReviewer
     * @param clueNote
     * @param clueAlloDate
     * @param clueAlloPeople
     * @param clueClosingDate
     * @param clueGmtCreate
     * @param clueFounder
     */
    public Clue(int pkClueId, String clueState, String clueName, String clueHead, String clueCusName, String clueCusCall, String clueCusContact, String clueContactNumber, String clueContactPosition, String clueContactEmail, String cusAddress, String clueCity, String clueIndustry, String clueSource, String clueExpectedAmount, String cluePurchasedProduct, String clueAuditdate, String clueReviewer, String clueNote, String clueAlloDate, String clueAlloPeople, String clueClosingDate, String clueGmtCreate, String clueFounder) {
        this.pkClueId = pkClueId;
        this.clueState = clueState;
        this.clueName = clueName;
        this.clueHead = clueHead;
        this.clueCusName = clueCusName;
        this.clueCusCall = clueCusCall;
        this.clueCusContact = clueCusContact;
        this.clueContactNumber = clueContactNumber;
        this.clueContactPosition = clueContactPosition;
        this.clueContactEmail = clueContactEmail;
        this.cusAddress = cusAddress;
        this.clueCity = clueCity;
        this.clueIndustry = clueIndustry;
        this.clueSource = clueSource;
        this.clueExpectedAmount = clueExpectedAmount;
        this.cluePurchasedProduct = cluePurchasedProduct;
        this.clueAuditdate = clueAuditdate;
        this.clueReviewer = clueReviewer;
        this.clueNote = clueNote;
        this.clueAlloDate = clueAlloDate;
        this.clueAlloPeople = clueAlloPeople;
        this.clueClosingDate = clueClosingDate;
        this.clueGmtCreate = clueGmtCreate;
        this.clueFounder = clueFounder;
    }

    /**
     * 显示数据
     * @return String
     */
    @Override
    public String toString() {
        return "Clue{" +
                "pkClueId=" + pkClueId +
                ", clueState='" + clueState + '\'' +
                ", clueName='" + clueName + '\'' +
                ", clueHead='" + clueHead + '\'' +
                ", clueCusName='" + clueCusName + '\'' +
                ", clueCusCall='" + clueCusCall + '\'' +
                ", clueCusContact='" + clueCusContact + '\'' +
                ", clueContactNumber='" + clueContactNumber + '\'' +
                ", clueContactPosition='" + clueContactPosition + '\'' +
                ", clueContactEmail='" + clueContactEmail + '\'' +
                ", cusAddress='" + cusAddress + '\'' +
                ", clueCity='" + clueCity + '\'' +
                ", clueIndustry='" + clueIndustry + '\'' +
                ", clueSource='" + clueSource + '\'' +
                ", clueExpectedAmount='" + clueExpectedAmount + '\'' +
                ", cluePurchasedProduct='" + cluePurchasedProduct + '\'' +
                ", clueAuditdate='" + clueAuditdate + '\'' +
                ", clueReviewer='" + clueReviewer + '\'' +
                ", clueNote='" + clueNote + '\'' +
                ", clueAlloDate='" + clueAlloDate + '\'' +
                ", clueAlloPeople='" + clueAlloPeople + '\'' +
                ", clueClosingDate='" + clueClosingDate + '\'' +
                ", clueGmtCreate='" + clueGmtCreate + '\'' +
                ", clueFounder='" + clueFounder + '\'' +
                '}';
    }
}

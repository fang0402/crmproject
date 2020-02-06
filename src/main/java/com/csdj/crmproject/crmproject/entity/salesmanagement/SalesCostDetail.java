/*
 * 文 件 名： 销售费用报销明细1
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity.salesmanagement;

/**
 * @author 易富军
 * @date 2019/11/26 23:46
 */
public class SalesCostDetail {
    /**
     *id
     */
    private int pkSalesDetailId;
    /**
     * 销售费用报销id
     */
    private double fkSaleConsId;
    /**
     * 用途
     */
    private int saleSdeTailUse;
    /**
     * 分类
     */
    private int saleSdeTailClassIfy;
    /**
     *费用归集
     */
    private String saleDeTailCollection;
    /**
     *  金额
     */
    private double saleSdeTailMoney;
    /**
     * 发生时间
     */
    private String saleSdeTailTime;
    /**
     *状态
     */
    private int saleSdeTailStates;
    /**
     * 关联客户类型id
     */
    private int fkUserTypeId;
    /**
     * 关联客户名称
     */
    private String saleSdeTailAssName;
    /**
     * 关联客户id
     */
    private int fkUserId;
    /**
     * 关联业务对象类型id
     */
    private String fkAssObjectTypeId;
    /**
     * 关联对象id
     */
    private int fkAssObjectId;
    /**
     * 关联对象名称
     */
    private String saleSdeTailName;
    /**
     * 创建人
     */
    private String saleSdeTailCreator;
    /**
     * 创建时间
     */
    private String saleSdeTailGmtCreate;
    /**
     * 备注
     */
    private String saleSdeTailRemarks;

    /**
     * 显示数据
     * @return
     */
    @Override
    public String toString() {
        return "SalesCostDetail{" +
                "pkSalesDetailId=" + pkSalesDetailId +
                ", fkSaleConsId=" + fkSaleConsId +
                ", saleSdeTailUse=" + saleSdeTailUse +
                ", saleSdeTailClassIfy=" + saleSdeTailClassIfy +
                ", saledeTailCollection='" + saleDeTailCollection + '\'' +
                ", saleSdeTailMoney=" + saleSdeTailMoney +
                ", saleSdeTailTime='" + saleSdeTailTime + '\'' +
                ", saleSdeTailStates=" + saleSdeTailStates +
                ", fkUserTypeId=" + fkUserTypeId +
                ", saleSdeTailAssName='" + saleSdeTailAssName + '\'' +
                ", fkUserId=" + fkUserId +
                ", fkAssObjectTypeId='" + fkAssObjectTypeId + '\'' +
                ", fkAssObjectId=" + fkAssObjectId +
                ", saleSdeTailName='" + saleSdeTailName + '\'' +
                ", saleSdeTailCreator='" + saleSdeTailCreator + '\'' +
                ", saleSdeTailGmtCreate='" + saleSdeTailGmtCreate + '\'' +
                ", saleSdeTailRemarks='" + saleSdeTailRemarks + '\'' +
                '}';
    }

    /**
     * 有参构造
     */
    public SalesCostDetail() {
    }

    /**
     * 无参构造
     * @param pkSalesDetailId
     * @param fkSaleConsId
     * @param saleSdeTailUse
     * @param saleSdeTailClassIfy
     * @param saledeTailCollection
     * @param saleSdeTailMoney
     * @param saleSdeTailTime
     * @param saleSdeTailStates
     * @param fkUserTypeId
     * @param saleSdeTailAssName
     * @param fkUserId
     * @param fkAssObjectTypeId
     * @param fkAssObjectId
     * @param saleSdeTailName
     * @param saleSdeTailCreator
     * @param saleSdeTailGmtCreate
     * @param saleSdeTailRemarks
     */
    public SalesCostDetail(int pkSalesDetailId, double fkSaleConsId, int saleSdeTailUse, int saleSdeTailClassIfy, String saledeTailCollection, double saleSdeTailMoney, String saleSdeTailTime, int saleSdeTailStates, int fkUserTypeId, String saleSdeTailAssName, int fkUserId, String fkAssObjectTypeId, int fkAssObjectId, String saleSdeTailName, String saleSdeTailCreator, String saleSdeTailGmtCreate, String saleSdeTailRemarks) {
        this.pkSalesDetailId = pkSalesDetailId;
        this.fkSaleConsId = fkSaleConsId;
        this.saleSdeTailUse = saleSdeTailUse;
        this.saleSdeTailClassIfy = saleSdeTailClassIfy;
        this.saleDeTailCollection = saledeTailCollection;
        this.saleSdeTailMoney = saleSdeTailMoney;
        this.saleSdeTailTime = saleSdeTailTime;
        this.saleSdeTailStates = saleSdeTailStates;
        this.fkUserTypeId = fkUserTypeId;
        this.saleSdeTailAssName = saleSdeTailAssName;
        this.fkUserId = fkUserId;
        this.fkAssObjectTypeId = fkAssObjectTypeId;
        this.fkAssObjectId = fkAssObjectId;
        this.saleSdeTailName = saleSdeTailName;
        this.saleSdeTailCreator = saleSdeTailCreator;
        this.saleSdeTailGmtCreate = saleSdeTailGmtCreate;
        this.saleSdeTailRemarks = saleSdeTailRemarks;
    }

    public String getSaleDeTailCollection() {
        return saleDeTailCollection;
    }

    public void setSaleDeTailCollection(String saleDeTailCollection) {
        this.saleDeTailCollection = saleDeTailCollection;
    }

    public int getPkSalesDetailId() {
        return pkSalesDetailId;
    }

    public void setPkSalesDetailId(int pkSalesDetailId) {
        this.pkSalesDetailId = pkSalesDetailId;
    }

    public double getFkSaleConsId() {
        return fkSaleConsId;
    }

    public void setFkSaleConsId(double fkSaleConsId) {
        this.fkSaleConsId = fkSaleConsId;
    }

    public int getSaleSdeTailUse() {
        return saleSdeTailUse;
    }

    public void setSaleSdeTailUse(int saleSdeTailUse) {
        this.saleSdeTailUse = saleSdeTailUse;
    }

    public int getSaleSdeTailClassIfy() {
        return saleSdeTailClassIfy;
    }

    public void setSaleSdeTailClassIfy(int saleSdeTailClassIfy) {
        this.saleSdeTailClassIfy = saleSdeTailClassIfy;
    }

    public double getSaleSdeTailMoney() {
        return saleSdeTailMoney;
    }

    public void setSaleSdeTailMoney(double saleSdeTailMoney) {
        this.saleSdeTailMoney = saleSdeTailMoney;
    }

    public String getSaleSdeTailTime() {
        return saleSdeTailTime;
    }

    public void setSaleSdeTailTime(String saleSdeTailTime) {
        this.saleSdeTailTime = saleSdeTailTime;
    }

    public int getSaleSdeTailStates() {
        return saleSdeTailStates;
    }

    public void setSaleSdeTailStates(int saleSdeTailStates) {
        this.saleSdeTailStates = saleSdeTailStates;
    }

    public int getFkUserTypeId() {
        return fkUserTypeId;
    }

    public void setFkUserTypeId(int fkUserTypeId) {
        this.fkUserTypeId = fkUserTypeId;
    }

    public String getSaleSdeTailAssName() {
        return saleSdeTailAssName;
    }

    public void setSaleSdeTailAssName(String saleSdeTailAssName) {
        this.saleSdeTailAssName = saleSdeTailAssName;
    }

    public int getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(int fkUserId) {
        this.fkUserId = fkUserId;
    }

    public String getFkAssObjectTypeId() {
        return fkAssObjectTypeId;
    }

    public void setFkAssObjectTypeId(String fkAssObjectTypeId) {
        this.fkAssObjectTypeId = fkAssObjectTypeId;
    }

    public int getFkAssObjectId() {
        return fkAssObjectId;
    }

    public void setFkAssObjectId(int fkAssObjectId) {
        this.fkAssObjectId = fkAssObjectId;
    }

    public String getSaleSdeTailName() {
        return saleSdeTailName;
    }

    public void setSaleSdeTailName(String saleSdeTailName) {
        this.saleSdeTailName = saleSdeTailName;
    }

    public String getSaleSdeTailCreator() {
        return saleSdeTailCreator;
    }

    public void setSaleSdeTailCreator(String saleSdeTailCreator) {
        this.saleSdeTailCreator = saleSdeTailCreator;
    }

    public String getSaleSdeTailGmtCreate() {
        return saleSdeTailGmtCreate;
    }

    public void setSaleSdeTailGmtCreate(String saleSdeTailGmtCreate) {
        this.saleSdeTailGmtCreate = saleSdeTailGmtCreate;
    }

    public String getSaleSdeTailRemarks() {
        return saleSdeTailRemarks;
    }

    public void setSaleSdeTailRemarks(String saleSdeTailRemarks) {
        this.saleSdeTailRemarks = saleSdeTailRemarks;
    }
}

/*
 * 文 件 名：
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 *产品
 *
 * @author 丁丽群
 * @date 2019/11/27
 *@version 1.0
 */
public class Product {
    /**
     * 产品编号
     */
    private Integer pkProId;
    /**
     * 产品名称
     */
    private String proName;
    /**
     * 规格型号
     */
    private String proType;
    /**
     * 状态
     */
    private String proState;
    /**
     * 计量单位
     */
    private String proUnit;
    /**
     * 单价
     */
    private double proPrice;
    /**
     * 最低价
     */
    private double proMiniPrice;
    /**
     * 成本价
     */
    private double proCostPrice;
    /**
     * 数量
     */
    private int proNum;
    /**
     * 质量保证
     */
    private String proGuarantee;
    /**
     * 备注
     */
    private String proRemark;
    /**
     * 产品类型编号
     */
    private Integer fkProTypeId;
    /**
     * 创建时间
     */
    private String gmt_create;
    /**
     * 修改时间
     */
    private String gmt_modified;

    /**
     * 无参构造方法
     */
    public Product() {
    }

    /**
     * 有参构造方法
     */
    public Product(Integer pkProId, String proName, String proType, String proState, String proUnit, double proPrice, double proMiniPrice, double proCostPrice, int proNum, String proGuarantee, String proRemark, Integer fkProTypeId, String gmt_create, String gmt_modified) {
        this.pkProId = pkProId;
        this.proName = proName;
        this.proType = proType;
        this.proState = proState;
        this.proUnit = proUnit;
        this.proPrice = proPrice;
        this.proMiniPrice = proMiniPrice;
        this.proCostPrice = proCostPrice;
        this.proNum = proNum;
        this.proGuarantee = proGuarantee;
        this.proRemark = proRemark;
        this.fkProTypeId = fkProTypeId;
        this.gmt_create = gmt_create;
        this.gmt_modified = gmt_modified;
    }

    /**
     *显示数据
     */
    @Override
    public String toString() {
        return "Product{" +
                "pkProId=" + pkProId +
                ", proName='" + proName + '\'' +
                ", proType='" + proType + '\'' +
                ", proState='" + proState + '\'' +
                ", proUnit='" + proUnit + '\'' +
                ", proPrice=" + proPrice +
                ", proMiniPrice=" + proMiniPrice +
                ", proCostPrice=" + proCostPrice +
                ", proNum=" + proNum +
                ", proGuarantee='" + proGuarantee + '\'' +
                ", proRemark='" + proRemark + '\'' +
                ", fkProTypeId=" + fkProTypeId +
                ", gmt_create='" + gmt_create + '\'' +
                ", gmt_modified='" + gmt_modified + '\'' +
                '}';
    }

    public Integer getPkProId() {
        return pkProId;
    }

    public void setPkProId(Integer pkProId) {
        this.pkProId = pkProId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public String getProState() {
        return proState;
    }

    public void setProState(String proState) {
        this.proState = proState;
    }

    public String getProUnit() {
        return proUnit;
    }

    public void setProUnit(String proUnit) {
        this.proUnit = proUnit;
    }

    public double getProPrice() {
        return proPrice;
    }

    public void setProPrice(double proPrice) {
        this.proPrice = proPrice;
    }

    public double getProMiniPrice() {
        return proMiniPrice;
    }

    public void setProMiniPrice(double proMiniPrice) {
        this.proMiniPrice = proMiniPrice;
    }

    public double getProCostPrice() {
        return proCostPrice;
    }

    public void setProCostPrice(double proCostPrice) {
        this.proCostPrice = proCostPrice;
    }

    public int getProNum() {
        return proNum;
    }

    public void setProNum(int proNum) {
        this.proNum = proNum;
    }

    public String getProGuarantee() {
        return proGuarantee;
    }

    public void setProGuarantee(String proGuarantee) {
        this.proGuarantee = proGuarantee;
    }

    public String getProRemark() {
        return proRemark;
    }

    public void setProRemark(String proRemark) {
        this.proRemark = proRemark;
    }

    public Integer getFkProTypeId() {
        return fkProTypeId;
    }

    public void setFkProTypeId(Integer fkProTypeId) {
        this.fkProTypeId = fkProTypeId;
    }

    public String getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(String gmt_create) {
        this.gmt_create = gmt_create;
    }

    public String getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(String gmt_modified) {
        this.gmt_modified = gmt_modified;
    }
}

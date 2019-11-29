/**
 * 文 件 名：退货明细
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */
package com.csdj.crmproject.crmproject.entity;
/**
 * @author wanghao
 * @date 2019/11/28
 */
public class DoReturnGoods {
    /**
     * id
     */
    private int pkDoReturnId;
    /**
     * 退货管理id
     */
    private int fkSalesId;
    /**
     * 商品名称
     */
    private String doReturnProductName;
    /**
     * 规格
     */
    private String doReturnSpecification;
    /**
     * 单位
     */
    private String doReturnUnit;
    /**
     * 数量
     */
    private String doReturnQuantity;
    /**
     * 实际折扣
     */
    private String doReturnPracticalDiscount;
    /**
     * 成交单价
     */
    private Double doReturnBarAgInUnIaLenCe;
    /**
     * 退货不含税总额
     */
    private Double doReturnRdnItTax;
    /**
     * 成本价
     */
    private Double doReturnCostPrice;
    /**
     * 税率
     */
    private Double doReturnTaxRate;
    /**
     * 税额
     */
    private Double doReturnTaoTtBpaId;
    /**
     * 退款额
     */
    private Double doReturnReFunDaMounts;

    public int getPkDoReturnId() {
        return pkDoReturnId;
    }

    public void setPkDoReturnId(int pkDoReturnId) {
        this.pkDoReturnId = pkDoReturnId;
    }

    public int getFkSalesId() {
        return fkSalesId;
    }

    public void setFkSalesId(int fkSalesId) {
        this.fkSalesId = fkSalesId;
    }

    public String getDoReturnProductName() {
        return doReturnProductName;
    }

    public void setDoReturnProductName(String doReturnProductName) {
        this.doReturnProductName = doReturnProductName;
    }

    public String getDoReturnSpecification() {
        return doReturnSpecification;
    }

    public void setDoReturnSpecification(String doReturnSpecification) {
        this.doReturnSpecification = doReturnSpecification;
    }

    public String getDoReturnUnit() {
        return doReturnUnit;
    }

    public void setDoReturnUnit(String doReturnUnit) {
        this.doReturnUnit = doReturnUnit;
    }

    public String getDoReturnQuantity() {
        return doReturnQuantity;
    }

    public void setDoReturnQuantity(String doReturnQuantity) {
        this.doReturnQuantity = doReturnQuantity;
    }

    public String getDoReturnPracticalDiscount() {
        return doReturnPracticalDiscount;
    }

    public void setDoReturnPracticalDiscount(String doReturnPracticalDiscount) {
        this.doReturnPracticalDiscount = doReturnPracticalDiscount;
    }

    public Double getDoReturnBarAgInUnIaLenCe() {
        return doReturnBarAgInUnIaLenCe;
    }

    public void setDoReturnBarAgInUnIaLenCe(Double doReturnBarAgInUnIaLenCe) {
        this.doReturnBarAgInUnIaLenCe = doReturnBarAgInUnIaLenCe;
    }

    public Double getDoReturnRdnItTax() {
        return doReturnRdnItTax;
    }

    public void setDoReturnRdnItTax(Double doReturnRdnItTax) {
        this.doReturnRdnItTax = doReturnRdnItTax;
    }

    public Double getDoReturnCostPrice() {
        return doReturnCostPrice;
    }

    public void setDoReturnCostPrice(Double doReturnCostPrice) {
        this.doReturnCostPrice = doReturnCostPrice;
    }

    public Double getDoReturnTaxRate() {
        return doReturnTaxRate;
    }

    public void setDoReturnTaxRate(Double doReturnTaxRate) {
        this.doReturnTaxRate = doReturnTaxRate;
    }

    public Double getDoReturnTaoTtBpaId() {
        return doReturnTaoTtBpaId;
    }

    public void setDoReturnTaoTtBpaId(Double doReturnTaoTtBpaId) {
        this.doReturnTaoTtBpaId = doReturnTaoTtBpaId;
    }

    public Double getDoReturnReFunDaMounts() {
        return doReturnReFunDaMounts;
    }

    public void setDoReturnReFunDaMounts(Double doReturnReFunDaMounts) {
        this.doReturnReFunDaMounts = doReturnReFunDaMounts;
    }

    /**
     *有参构造
     * @param pkDoReturnId
     * @param fkSalesId
     * @param doReturnProductName
     * @param doReturnSpecification
     * @param doReturnUnit
     * @param doReturnQuantity
     * @param doReturnPracticalDiscount
     * @param doReturnBarAgInUnIaLenCe
     * @param doReturnRdnItTax
     * @param doReturnCostPrice
     * @param doReturnTaxRate
     * @param doReturnTaoTtBpaId
     * @param doReturnReFunDaMounts
     */
    public DoReturnGoods(int pkDoReturnId, int fkSalesId, String doReturnProductName, String doReturnSpecification, String doReturnUnit, String doReturnQuantity, String doReturnPracticalDiscount, Double doReturnBarAgInUnIaLenCe, Double doReturnRdnItTax, Double doReturnCostPrice, Double doReturnTaxRate, Double doReturnTaoTtBpaId, Double doReturnReFunDaMounts) {
        this.pkDoReturnId = pkDoReturnId;
        this.fkSalesId = fkSalesId;
        this.doReturnProductName = doReturnProductName;
        this.doReturnSpecification = doReturnSpecification;
        this.doReturnUnit = doReturnUnit;
        this.doReturnQuantity = doReturnQuantity;
        this.doReturnPracticalDiscount = doReturnPracticalDiscount;
        this.doReturnBarAgInUnIaLenCe = doReturnBarAgInUnIaLenCe;
        this.doReturnRdnItTax = doReturnRdnItTax;
        this.doReturnCostPrice = doReturnCostPrice;
        this.doReturnTaxRate = doReturnTaxRate;
        this.doReturnTaoTtBpaId = doReturnTaoTtBpaId;
        this.doReturnReFunDaMounts = doReturnReFunDaMounts;
    }

    /**
     * 无参构造
     */
    public DoReturnGoods() {
    }
    /**
     * 显示数据
     * @return String
     */
    @Override
    public String toString() {
        return "DoReturnGoods{" +
                "pkDoReturnId=" + pkDoReturnId +
                ", fkSalesId=" + fkSalesId +
                ", doReturnProductName='" + doReturnProductName + '\'' +
                ", doReturnSpecification='" + doReturnSpecification + '\'' +
                ", doReturnUnit='" + doReturnUnit + '\'' +
                ", doReturnQuantity='" + doReturnQuantity + '\'' +
                ", doReturnPracticalDiscount='" + doReturnPracticalDiscount + '\'' +
                ", doReturnBarAgInUnIaLenCe=" + doReturnBarAgInUnIaLenCe +
                ", doReturnRdnItTax=" + doReturnRdnItTax +
                ", doReturnCostPrice=" + doReturnCostPrice +
                ", doReturnTaxRate=" + doReturnTaxRate +
                ", doReturnTaoTtBpaId=" + doReturnTaoTtBpaId +
                ", doReturnReFunDaMounts=" + doReturnReFunDaMounts +
                '}';
    }
}

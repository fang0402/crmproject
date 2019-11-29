/**
 * 文 件 名：发货单明细
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author wanghao
 * @date 2019/11/28
 */
public class DoInvoice {
    /**
     * id
     */
    private int pkDoInvoiceId;
    /**
     * 发货单ID
     */
    private int fkInvoiceId;
    /**
     * 产品编号
     */
    private int doInvoiceProductId;
    /**
     * 产品名称
     */
    private String doInvoiceProductName;
    /**
     * 规格型号
     */
    private String doInvoiceSpecifications;
    /**
     * 计量单位
     */
    private String doInvoiceMeasuringUnit;
    /**
     * 数量
     */
    private String doInvoiceNumber;

    /**
     * 无参构造方法
     */
    public DoInvoice() {
    }

    public int getPkDoInvoiceId() {
        return pkDoInvoiceId;
    }

    public void setPkDoInvoiceId(int pkDoInvoiceId) {
        this.pkDoInvoiceId = pkDoInvoiceId;
    }

    public int getFkInvoiceId() {
        return fkInvoiceId;
    }

    public void setFkInvoiceId(int fkInvoiceId) {
        this.fkInvoiceId = fkInvoiceId;
    }

    public int getDoInvoiceProductId() {
        return doInvoiceProductId;
    }

    public void setDoInvoiceProductId(int doInvoiceProductId) {
        this.doInvoiceProductId = doInvoiceProductId;
    }

    public String getDoInvoiceProductName() {
        return doInvoiceProductName;
    }

    public void setDoInvoiceProductName(String doInvoiceProductName) {
        this.doInvoiceProductName = doInvoiceProductName;
    }

    public String getDoInvoiceSpecifications() {
        return doInvoiceSpecifications;
    }

    public void setDoInvoiceSpecifications(String doInvoiceSpecifications) {
        this.doInvoiceSpecifications = doInvoiceSpecifications;
    }

    public String getDoInvoiceMeasuringUnit() {
        return doInvoiceMeasuringUnit;
    }

    public void setDoInvoiceMeasuringUnit(String doInvoiceMeasuringUnit) {
        this.doInvoiceMeasuringUnit = doInvoiceMeasuringUnit;
    }

    public String getDoInvoiceNumber() {
        return doInvoiceNumber;
    }

    public void setDoInvoiceNumber(String doInvoiceNumber) {
        this.doInvoiceNumber = doInvoiceNumber;
    }
    /**
     * 显示数据
     * @return String
     */
    @Override
    public String toString() {
        return "DoInvoice{" +
                "pkDoInvoiceId=" + pkDoInvoiceId +
                ", fkInvoiceId=" + fkInvoiceId +
                ", doInvoiceProductId=" + doInvoiceProductId +
                ", doInvoiceProductName='" + doInvoiceProductName + '\'' +
                ", doInvoiceSpecifications='" + doInvoiceSpecifications + '\'' +
                ", doInvoiceMeasuringUnit='" + doInvoiceMeasuringUnit + '\'' +
                ", doInvoiceNumber='" + doInvoiceNumber + '\'' +
                '}';
    }

    /**
     *有参构造
     * @param pkDoInvoiceId
     * @param fkInvoiceId
     * @param doInvoiceProductId
     * @param doInvoiceProductName
     * @param doInvoiceSpecifications
     * @param doInvoiceMeasuringUnit
     * @param doInvoiceNumber
     */
    public DoInvoice(int pkDoInvoiceId, int fkInvoiceId, int doInvoiceProductId, String doInvoiceProductName, String doInvoiceSpecifications, String doInvoiceMeasuringUnit, String doInvoiceNumber) {
        this.pkDoInvoiceId = pkDoInvoiceId;
        this.fkInvoiceId = fkInvoiceId;
        this.doInvoiceProductId = doInvoiceProductId;
        this.doInvoiceProductName = doInvoiceProductName;
        this.doInvoiceSpecifications = doInvoiceSpecifications;
        this.doInvoiceMeasuringUnit = doInvoiceMeasuringUnit;
        this.doInvoiceNumber = doInvoiceNumber;
    }
}

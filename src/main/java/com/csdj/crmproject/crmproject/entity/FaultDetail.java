package com.csdj.crmproject.crmproject.entity;

/**
 * @version 1.0
 * @ClassName FaultRepairs
 * @Author 熊志涛
 * @Date 2019/11/26
 * @Describe 故障明细表
 **/
public class FaultDetail {

    /**
     * id
     */
    private int pkFaultDetailId;

    /**
     * 故障报修id
     */
    private int fkFaultWarId;
    /**
     * 生产日期
     */
    private String faultDetailproductionDate;
    /**
     * 销售日期
     */
    private String faultDetailSellDate;
    /**
     * 是否在保
     */
    private int faultDetailIsIfBartender;
    /**
     * 故障描述
     */
    private String faultDetailFaultDescribe;
    /**
     * 产品现状
     */
    private String faultDetailProductActuality;
    /**
     * 诊断描述
     */
    private String faultDetailDiagnoseDescribe;
    /**
     * 收费表数
     */
    private int faultDetailmMterNumber;


    public int getPkFaultDetailId() {
        return pkFaultDetailId;
    }

    public void setPkFaultDetailId(int pkFaultDetailId) {
        this.pkFaultDetailId = pkFaultDetailId;
    }

    public int getFkFaultWarId() {
        return fkFaultWarId;
    }

    public void setFkFaultWarId(int fkFaultWarId) {
        this.fkFaultWarId = fkFaultWarId;
    }

    public String getFaultDetailproductionDate() {
        return faultDetailproductionDate;
    }

    public void setFaultDetailproductionDate(String faultDetailproductionDate) {
        this.faultDetailproductionDate = faultDetailproductionDate;
    }

    public String getFaultDetailSellDate() {
        return faultDetailSellDate;
    }

    public void setFaultDetailSellDate(String faultDetailSellDate) {
        this.faultDetailSellDate = faultDetailSellDate;
    }

    public int getFaultDetailIsIfBartender() {
        return faultDetailIsIfBartender;
    }

    public void setFaultDetailIsIfBartender(int faultDetailIsIfBartender) {
        this.faultDetailIsIfBartender = faultDetailIsIfBartender;
    }

    public String getFaultDetailFaultDescribe() {
        return faultDetailFaultDescribe;
    }

    public void setFaultDetailFaultDescribe(String faultDetailFaultDescribe) {
        this.faultDetailFaultDescribe = faultDetailFaultDescribe;
    }

    public String getFaultDetailProductActuality() {
        return faultDetailProductActuality;
    }

    public void setFaultDetailProductActuality(String faultDetailProductActuality) {
        this.faultDetailProductActuality = faultDetailProductActuality;
    }

    public String getFaultDetailDiagnoseDescribe() {
        return faultDetailDiagnoseDescribe;
    }

    public void setFaultDetailDiagnoseDescribe(String faultDetailDiagnoseDescribe) {
        this.faultDetailDiagnoseDescribe = faultDetailDiagnoseDescribe;
    }

    public int getFaultDetailmMterNumber() {
        return faultDetailmMterNumber;
    }

    public void setFaultDetailmMterNumber(int faultDetailmMterNumber) {
        this.faultDetailmMterNumber = faultDetailmMterNumber;
    }


    /**
     * 默认构造
     */
    public FaultDetail() {
    }


    /**
     * 带参构造
     *
     * @param pkFaultDetailId
     * @param fkFaultWarId
     * @param faultDetailproductionDate
     * @param faultDetailSellDate
     * @param faultDetailIsIfBartender
     * @param faultDetailFaultDescribe
     * @param faultDetailProductActuality
     * @param faultDetailDiagnoseDescribe
     * @param faultDetailmMterNumber
     */
    public FaultDetail(int pkFaultDetailId, int fkFaultWarId, String faultDetailproductionDate, String faultDetailSellDate, int faultDetailIsIfBartender, String faultDetailFaultDescribe, String faultDetailProductActuality, String faultDetailDiagnoseDescribe, int faultDetailmMterNumber) {
        this.pkFaultDetailId = pkFaultDetailId;
        this.fkFaultWarId = fkFaultWarId;
        this.faultDetailproductionDate = faultDetailproductionDate;
        this.faultDetailSellDate = faultDetailSellDate;
        this.faultDetailIsIfBartender = faultDetailIsIfBartender;
        this.faultDetailFaultDescribe = faultDetailFaultDescribe;
        this.faultDetailProductActuality = faultDetailProductActuality;
        this.faultDetailDiagnoseDescribe = faultDetailDiagnoseDescribe;
        this.faultDetailmMterNumber = faultDetailmMterNumber;
    }

    /**
     * 打印数据
     *
     * @return
     */
    @Override
    public String toString() {
        return "FaultDetail{" +
                "pkFaultDetailId=" + pkFaultDetailId +
                ", fkFaultWarId=" + fkFaultWarId +
                ", faultDetailproductionDate='" + faultDetailproductionDate + '\'' +
                ", faultDetailSellDate='" + faultDetailSellDate + '\'' +
                ", faultDetailIsIfBartender=" + faultDetailIsIfBartender +
                ", faultDetailFaultDescribe='" + faultDetailFaultDescribe + '\'' +
                ", faultDetailProductActuality='" + faultDetailProductActuality + '\'' +
                ", faultDetailDiagnoseDescribe='" + faultDetailDiagnoseDescribe + '\'' +
                ", faultDetailmMterNumber=" + faultDetailmMterNumber +
                '}';
    }
}

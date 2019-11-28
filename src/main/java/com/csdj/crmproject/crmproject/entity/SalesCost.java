/*
 * 文 件 名： 销售费用表
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author 易富军
 * @version 1.0
 * @date 2019/11/27 0:01
 */
public class SalesCost {
    /**
     *销售费用id
     */
    private int pkSaleConsId;
    /**
     * 标题
     */
    private String saleConsTitle;
    /**
     * 是由
     */
    private String saleConsMadeUp;
    /**
     * 报销人（关联用户表）
     */
    private int fkUserId;
    /**
     *部门id（关联部门表）
     */
    private int fkDepId;
    /**
     *  相关人员
     */
    private String saleConReaTed;
    /**
     * 填报时间
     */
    private String saleConsGmtCreate;
    /**
     *总金额
     */
    private double saleConAreGate;
    /**
     * 流转时间
     */
    private String saleConsTheTime;
    /**
     * 流程状态
     */
    private int saleConState;
    /**
     * 审批结果
     */
    private String saleConsExamination;
    /**
     * 备注
     */
    private String saleConSreMark;
    /**
     * 最后修改人
     */
    private int saleConsLastModIf;
    /**
     * 最后修改时间
     */
    private String saleConsLastIf;

    /**
     * 显示数据
     * @return
     */
    @Override
    public String toString() {
        return "SalesCost{" +
                "pkSaleConsId=" + pkSaleConsId +
                ", saleConsTitle='" + saleConsTitle + '\'' +
                ", saleConsMadeUp='" + saleConsMadeUp + '\'' +
                ", fkUserId=" + fkUserId +
                ", fkDepId=" + fkDepId +
                ", saleConReaTed='" + saleConReaTed + '\'' +
                ", saleConsGmtCreate='" + saleConsGmtCreate + '\'' +
                ", saleConAreGate=" + saleConAreGate +
                ", saleConsTheTime='" + saleConsTheTime + '\'' +
                ", saleConState=" + saleConState +
                ", saleConsExamination='" + saleConsExamination + '\'' +
                ", saleConSreMark='" + saleConSreMark + '\'' +
                ", saleConsLastModIf=" + saleConsLastModIf +
                ", saleConsLastIf='" + saleConsLastIf + '\'' +
                '}';
    }

    public int getPkSaleConsId() {
        return pkSaleConsId;
    }

    public void setPkSaleConsId(int pkSaleConsId) {
        this.pkSaleConsId = pkSaleConsId;
    }

    public String getSaleConsTitle() {
        return saleConsTitle;
    }

    public void setSaleConsTitle(String saleConsTitle) {
        this.saleConsTitle = saleConsTitle;
    }

    public String getSaleConsMadeUp() {
        return saleConsMadeUp;
    }

    public void setSaleConsMadeUp(String saleConsMadeUp) {
        this.saleConsMadeUp = saleConsMadeUp;
    }

    public int getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(int fkUserId) {
        this.fkUserId = fkUserId;
    }

    public int getFkDepId() {
        return fkDepId;
    }

    public void setFkDepId(int fkDepId) {
        this.fkDepId = fkDepId;
    }

    public String getSaleConReaTed() {
        return saleConReaTed;
    }

    public void setSaleConReaTed(String saleConReaTed) {
        this.saleConReaTed = saleConReaTed;
    }

    public String getSaleConsGmtCreate() {
        return saleConsGmtCreate;
    }

    public void setSaleConsGmtCreate(String saleConsGmtCreate) {
        this.saleConsGmtCreate = saleConsGmtCreate;
    }

    public double getSaleConAreGate() {
        return saleConAreGate;
    }

    public void setSaleConAreGate(double saleConAreGate) {
        this.saleConAreGate = saleConAreGate;
    }

    public String getSaleConsTheTime() {
        return saleConsTheTime;
    }

    public void setSaleConsTheTime(String saleConsTheTime) {
        this.saleConsTheTime = saleConsTheTime;
    }

    public int getSaleConState() {
        return saleConState;
    }

    public void setSaleConState(int saleConState) {
        this.saleConState = saleConState;
    }

    public String getSaleConsExamination() {
        return saleConsExamination;
    }

    public void setSaleConsExamination(String saleConsExamination) {
        this.saleConsExamination = saleConsExamination;
    }

    public String getSaleConSreMark() {
        return saleConSreMark;
    }

    public void setSaleConSreMark(String saleConSreMark) {
        this.saleConSreMark = saleConSreMark;
    }

    public int getSaleConsLastModIf() {
        return saleConsLastModIf;
    }

    public void setSaleConsLastModIf(int saleConsLastModIf) {
        this.saleConsLastModIf = saleConsLastModIf;
    }

    public String getSaleConsLastIf() {
        return saleConsLastIf;
    }

    public void setSaleConsLastIf(String saleConsLastIf) {
        this.saleConsLastIf = saleConsLastIf;
    }

    /**
     * 无参构造
     */
    public SalesCost() {
    }



    /**
     * 有参构造
     * @param pkSaleConsId
     * @param saleConsTitle
     * @param saleConsMadeUp
     * @param fkUserId
     * @param fkDepId
     * @param saleConReaTed
     * @param saleConsGmtCreate
     * @param saleConAreGate
     * @param saleConsTheTime
     * @param saleConState
     * @param saleConsExamination
     * @param saleConSreMark
     * @param saleConsLastModIf
     * @param saleConsLastIf
     */
    public SalesCost(int pkSaleConsId, String saleConsTitle, String saleConsMadeUp, int fkUserId, int fkDepId, String saleConReaTed, String saleConsGmtCreate, double saleConAreGate, String saleConsTheTime, int saleConState, String saleConsExamination, String saleConSreMark, int saleConsLastModIf, String saleConsLastIf) {
        this.pkSaleConsId = pkSaleConsId;
        this.saleConsTitle = saleConsTitle;
        this.saleConsMadeUp = saleConsMadeUp;
        this.fkUserId = fkUserId;
        this.fkDepId = fkDepId;
        this.saleConReaTed = saleConReaTed;
        this.saleConsGmtCreate = saleConsGmtCreate;
        this.saleConAreGate = saleConAreGate;
        this.saleConsTheTime = saleConsTheTime;
        this.saleConState = saleConState;
        this.saleConsExamination = saleConsExamination;
        this.saleConSreMark = saleConSreMark;
        this.saleConsLastModIf = saleConsLastModIf;
        this.saleConsLastIf = saleConsLastIf;
    }
}

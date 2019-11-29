package com.csdj.crmproject.crmproject.entity;

/**
 * @version 1.0
 * @ClassName FaultRepairs
 * @Author 熊志涛
 * @Date 2019/11/26
 * @Describe 派工明细表
 **/
public class DispatchingDetailRelation {

    /**
     * id
     */
    private int pkDispatchingDetailRelationId;
    /**
     * 派工明细id
     */
    private int fkDispatchingDetailRelationdetailId;
    /**
     * 故障报修id
     */
    private int fkFaultWarId;

    public int getPkDispatchingDetailRelationId() {
        return pkDispatchingDetailRelationId;
    }

    public void setPkDispatchingDetailRelationId(int pkDispatchingDetailRelationId) {
        this.pkDispatchingDetailRelationId = pkDispatchingDetailRelationId;
    }

    public int getFkDispatchingDetailRelationdetailId() {
        return fkDispatchingDetailRelationdetailId;
    }

    public void setFkDispatchingDetailRelationdetailId(int fkDispatchingDetailRelationdetailId) {
        this.fkDispatchingDetailRelationdetailId = fkDispatchingDetailRelationdetailId;
    }

    public int getFkFaultWarId() {
        return fkFaultWarId;
    }

    public void setFkFaultWarId(int fkFaultWarId) {
        this.fkFaultWarId = fkFaultWarId;
    }

    /**
     * 默认构造方法
     */
    public DispatchingDetailRelation() {
    }

    /**
     * 带参构造方法
     *
     * @param pkDispatchingDetailRelationId
     * @param fkDispatchingDetailRelationdetailId
     * @param fkFaultWarId
     */
    public DispatchingDetailRelation(int pkDispatchingDetailRelationId, int fkDispatchingDetailRelationdetailId, int fkFaultWarId) {
        this.pkDispatchingDetailRelationId = pkDispatchingDetailRelationId;
        this.fkDispatchingDetailRelationdetailId = fkDispatchingDetailRelationdetailId;
        this.fkFaultWarId = fkFaultWarId;
    }


    /**
     * 打印方法
     *
     * @return
     */
    @Override
    public String toString() {
        return "DispatchingDetailRelation{" +
                "pkDispatchingDetailRelationId=" + pkDispatchingDetailRelationId +
                ", fkDispatchingDetailRelationdetailId=" + fkDispatchingDetailRelationdetailId +
                ", fkFaultWarId=" + fkFaultWarId +
                '}';
    }
}

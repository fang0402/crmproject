/*
 * 文 件 名：
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;
/**
 *产品编号
 *
 * @author 丁丽群
 * @date 2019/11/27
 *@version 1.0
 */public class ProType {
    /**
     * 产品类型编号
     */
    private Integer pkProTypeId;
    /**
     * 产品类型名称
     */
    private String proTypeName;

    /**
     * 无参构造方法
     */
    public ProType() {
    }

    /**
     * 有参构造方法
     */
    public ProType(Integer pkProTypeId, String proTypeName) {
        this.pkProTypeId = pkProTypeId;
        this.proTypeName = proTypeName;
    }

    /**
     * 显示数据
     */
    @Override
    public String toString() {
        return "ProType{" +
                "pkProTypeId=" + pkProTypeId +
                ", proTypeName='" + proTypeName + '\'' +
                '}';
    }

    public Integer getPkProTypeId() {
        return pkProTypeId;
    }

    public void setPkProTypeId(Integer pkProTypeId) {
        this.pkProTypeId = pkProTypeId;
    }

    public String getProTypeName() {
        return proTypeName;
    }

    public void setProTypeName(String proTypeName) {
        this.proTypeName = proTypeName;
    }
}

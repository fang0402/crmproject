package com.csdj.crmproject.crmproject.entity;

/**
 * 客户类型实体
 * @author 许昊
 * @date 2019/11/27
 * @version 1.0
 */
public class CustomerType {
    /**
     * 类型编号(主键)
     */
    private int pkClassif;
    /**
     * 类型名称
     */
    private String classifName;

    /**
     * 无参构造函数
     */
    public CustomerType(){}

    /**
     * 带参构造函数
     * @param pkClassif
     * @param classifName
     */
    public CustomerType(int pkClassif, String classifName) {
        this.pkClassif = pkClassif;
        this.classifName = classifName;
    }

    /**
     * toString
     * @return
     */
    @Override
    public String toString() {
        return "CustomerType{" +
                "pkClassif=" + pkClassif +
                ", classifName='" + classifName + '\'' +
                '}';
    }

    public int getPkClassif() {
        return pkClassif;
    }

    public void setPkClassif(int pkClassif) {
        this.pkClassif = pkClassif;
    }

    public String getClassifName() {
        return classifName;
    }

    public void setClassifName(String classifName) {
        this.classifName = classifName;
    }
}

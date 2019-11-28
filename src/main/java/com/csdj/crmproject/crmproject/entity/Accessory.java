/*
 * 文 件 名：客户拜访
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * 客户投诉附件实体类
 * @author xsy
 * @date 2019/11/27 0027 下午 3:01
 * @version crm1.0
 */
public class Accessory {
    /**
     * 附件编号
     */
    private Integer pkAccId;
    /**
     * 附件名称
     */
    private String accName;
    /**
     * 文件
     */
    private String accFile;
    /**
     * 创建人
     */
    private String accCreator;
    /**
     * 创建时间
     */
    private String accGmtCreate;

    /**
     * 无参构造函数
     */
    public Accessory() {
    }

    /**
     * 有参构造函数
     * @param pkAccId
     * @param accName
     * @param accFile
     * @param accCreator
     * @param accGmtCreate
     */
    public Accessory(Integer pkAccId, String accName, String accFile, String accCreator, String accGmtCreate) {
        this.pkAccId = pkAccId;
        this.accName = accName;
        this.accFile = accFile;
        this.accCreator = accCreator;
        this.accGmtCreate = accGmtCreate;
    }

    public Integer getPkAccId() {
        return pkAccId;
    }

    public String getAccName() {
        return accName;
    }

    public String getAccFile() {
        return accFile;
    }

    public String getAccCreator() {
        return accCreator;
    }

    public String getAccGmtCreate() {
        return accGmtCreate;
    }


    public void setPkAccId(Integer pkAccId) {
        this.pkAccId = pkAccId;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void setAccFile(String accFile) {
        this.accFile = accFile;
    }

    public void setAccCreator(String accCreator) {
        this.accCreator = accCreator;
    }

    public void setAccGmtCreate(String accGmtCreate) {
        this.accGmtCreate = accGmtCreate;
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "pkAccId=" + pkAccId +
                ", accName='" + accName + '\'' +
                ", accFile='" + accFile + '\'' +
                ", accCreator='" + accCreator + '\'' +
                ", accGmtCreate='" + accGmtCreate + '\'' +
                '}';
    }
}

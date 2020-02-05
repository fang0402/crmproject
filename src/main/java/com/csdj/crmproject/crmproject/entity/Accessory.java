package com.csdj.crmproject.crmproject.entity;

/**
 * @version 1.0
 * @ClassName FaultRepairs
 * @Author 熊志涛
 * @Date 2019/11/26
 * @Describe 附加表
 **/
public class Accessory {

    /**
     * id
     */
    private int pkAccessoryId;
    /**
     * 故障报修id
     */
    private int fkFaultWarId;
    /**
     * 名称
     */
    private String accessoryName;
    /**
     * 简介
     */
    private String accessoryIntro;
    /**
     * 文件url
     */
    private String accessoryFileUrl;
    /**
     * 所属对象类型id
     */
    private String fkObjectTypeId;
    /**
     * 所属对象id
     */
    private int fkSubordinateObjectId;
    /**
     * 所属对象名称
     */
    private int accessorySubordinateObjectName;
    /**
     * 创建人
     */
    private String accessoryCreator;

    public int getPkAccessoryId() {
        return pkAccessoryId;
    }

    public void setPkAccessoryId(int pkAccessoryId) {
        this.pkAccessoryId = pkAccessoryId;
    }

    public int getFkFaultWarId() {
        return fkFaultWarId;
    }

    public void setFkFaultWarId(int fkFaultWarId) {
        this.fkFaultWarId = fkFaultWarId;
    }

    public String getAccessoryName() {
        return accessoryName;
    }

    public void setAccessoryName(String accessoryName) {
        this.accessoryName = accessoryName;
    }

    public String getAccessoryIntro() {
        return accessoryIntro;
    }

    public void setAccessoryIntro(String accessoryIntro) {
        this.accessoryIntro = accessoryIntro;
    }

    public String getAccessoryFileUrl() {
        return accessoryFileUrl;
    }

    public void setAccessoryFileUrl(String accessoryFileUrl) {
        this.accessoryFileUrl = accessoryFileUrl;
    }

    public String getFkObjectTypeId() {
        return fkObjectTypeId;
    }

    public void setFkObjectTypeId(String fkObjectTypeId) {
        this.fkObjectTypeId = fkObjectTypeId;
    }

    public int getFkSubordinateObjectId() {
        return fkSubordinateObjectId;
    }

    public void setFkSubordinateObjectId(int fkSubordinateObjectId) {
        this.fkSubordinateObjectId = fkSubordinateObjectId;
    }

    public int getAccessorySubordinateObjectName() {
        return accessorySubordinateObjectName;
    }

    public void setAccessorySubordinateObjectName(int accessorySubordinateObjectName) {
        this.accessorySubordinateObjectName = accessorySubordinateObjectName;
    }

    public String getAccessoryCreator() {
        return accessoryCreator;
    }

    public void setAccessoryCreator(String accessoryCreator) {
        this.accessoryCreator = accessoryCreator;
    }

    /**
     * 默认构造方法
     */
    public Accessory() {
    }

    /**
     * 带参构造方法
     *
     * @param pkAccessoryId
     * @param fkFaultWarId
     * @param accessoryName
     * @param accessoryIntro
     * @param accessoryFileUrl
     * @param fkObjectTypeId
     * @param fkSubordinateObjectId
     * @param accessorySubordinateObjectName
     * @param accessoryCreator
     */
    public Accessory(int pkAccessoryId, int fkFaultWarId, String accessoryName, String accessoryIntro, String accessoryFileUrl, String fkObjectTypeId, int fkSubordinateObjectId, int accessorySubordinateObjectName, String accessoryCreator) {
        this.pkAccessoryId = pkAccessoryId;
        this.fkFaultWarId = fkFaultWarId;
        this.accessoryName = accessoryName;
        this.accessoryIntro = accessoryIntro;
        this.accessoryFileUrl = accessoryFileUrl;
        this.fkObjectTypeId = fkObjectTypeId;
        this.fkSubordinateObjectId = fkSubordinateObjectId;
        this.accessorySubordinateObjectName = accessorySubordinateObjectName;
        this.accessoryCreator = accessoryCreator;
    }


    /**
     * 打印方法
     *
     * @return
     */
    @Override
    public String toString() {
        return "Accessory{" +
                "pkAccessoryId=" + pkAccessoryId +
                ", fkFaultWarId=" + fkFaultWarId +
                ", accessoryName='" + accessoryName + '\'' +
                ", accessoryIntro='" + accessoryIntro + '\'' +
                ", accessoryFileUrl='" + accessoryFileUrl + '\'' +
                ", fkObjectTypeId='" + fkObjectTypeId + '\'' +
                ", fkSubordinateObjectId=" + fkSubordinateObjectId +
                ", accessorySubordinateObjectName=" + accessorySubordinateObjectName +
                ", accessoryCreator='" + accessoryCreator + '\'' +
                '}';
    }
}

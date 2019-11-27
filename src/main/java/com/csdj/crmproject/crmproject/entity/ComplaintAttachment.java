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
public class ComplaintAttachment {
    /**
     * 附件编号
     */
    private Integer complaint_attachment_id;
    /**
     * 附件名称
     */
    private String attachment_name;
    /**
     * 文件
     */
    private String file;
    /**
     * 创建人
     */
    private String creator;
    /**
     * 创建时间
     */
    private String datetime;

    /**
     * 无参构造函数
     */
    public ComplaintAttachment() {
    }

    /**
     * 有参构造函数
     * @param complaint_attachment_id
     * @param attachment_name
     * @param file
     * @param creator
     * @param datetime
     */
    public ComplaintAttachment(Integer complaint_attachment_id, String attachment_name, String file, String creator, String datetime) {
        this.complaint_attachment_id = complaint_attachment_id;
        this.attachment_name = attachment_name;
        this.file = file;
        this.creator = creator;
        this.datetime = datetime;
    }

    public Integer getComplaint_attachment_id() {
        return complaint_attachment_id;
    }

    public String getAttachment_name() {
        return attachment_name;
    }

    public String getFile() {
        return file;
    }

    public String getCreator() {
        return creator;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setComplaint_attachment_id(Integer complaint_attachment_id) {
        this.complaint_attachment_id = complaint_attachment_id;
    }

    public void setAttachment_name(String attachment_name) {
        this.attachment_name = attachment_name;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }


    /**
     * 打印数据
     * @return
     */
    @Override
    public String toString() {
        return "ComplaintAttachment{" +
                "complaint_attachment_id=" + complaint_attachment_id +
                ", attachment_name='" + attachment_name + '\'' +
                ", file='" + file + '\'' +
                ", creator='" + creator + '\'' +
                ", datetime='" + datetime + '\'' +
                '}';
    }
}

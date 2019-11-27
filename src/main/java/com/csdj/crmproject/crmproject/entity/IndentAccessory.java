/**
 * 文件名
 * 版权(c) 2019-雷升公司 CRM项目组：
 *  版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author 尹嘉丽
 * @date 2019-11-27
 * @version 1.0
 *订单附件
 */
public class IndentAccessory {
  /**
   * 订单附件编号
   */
  private long id;
  /**
   * 附件名称
   */
  private String name;
  /**
   * 附件路径
   */
  private String fileUrl;
  /**
   * 订单编号
   */
  private long indentId;
  /**
   *备注
   */
  private String context;
  /**
   * 创建人
   */
  private String creator;
  /**
   * 创建时间
   */
  private String createTime;

  /*
  *无参构造
   */
  public IndentAccessory() {
  }

  /**
   * 有参构造
   * @param id
   * @param name
   * @param fileUrl
   * @param indentId
   * @param context
   * @param creator
   * @param createTime
   */
  public IndentAccessory(long id, String name, String fileUrl, long indentId, String context, String creator, String createTime) {
    this.id = id;
    this.name = name;
    this.fileUrl = fileUrl;
    this.indentId = indentId;
    this.context = context;
    this.creator = creator;
    this.createTime = createTime;
  }

  /**
   * 显示数据方法
   * @return
   */
  @Override
  public String toString() {
    return "IndentAccessory{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", fileUrl='" + fileUrl + '\'' +
            ", indentId=" + indentId +
            ", context='" + context + '\'' +
            ", creator='" + creator + '\'' +
            ", createTime='" + createTime + '\'' +
            '}';
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFileUrl() {
    return fileUrl;
  }

  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }

  public long getIndentId() {
    return indentId;
  }

  public void setIndentId(long indentId) {
    this.indentId = indentId;
  }

  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }
}

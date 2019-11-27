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
 *订单-收款计划关系表
 */
public class IndentRecord {
  /**
   * 编号
   */
  private long id;
  /**
   * 订单id
   */
  private long indentId;
  /**
   * 收款计划id
   */
  private long recordId;

  /**
   * 无参构造
   */
  public IndentRecord() {
  }

  /**
   * 有参构造
   * @param id
   * @param indentId
   * @param recordId
   */
  public IndentRecord(long id, long indentId, long recordId) {
    this.id = id;
    this.indentId = indentId;
    this.recordId = recordId;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "IndentRecord{" +
            "id=" + id +
            ", indentId=" + indentId +
            ", recordId=" + recordId +
            '}';
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getIndentId() {
    return indentId;
  }

  public void setIndentId(long indentId) {
    this.indentId = indentId;
  }

  public long getRecordId() {
    return recordId;
  }

  public void setRecordId(long recordId) {
    this.recordId = recordId;
  }

}

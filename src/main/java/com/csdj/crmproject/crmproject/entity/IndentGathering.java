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
 *订单-收款记录关系表
 */
public class IndentGathering {
  /**
   * 编号
   */
  private long id;
  /**
   * 订单编号
   */
  private long indentId;
  /**
   * 收款记录关系表
   */
  private long gatheringId;

  /**
   * 无参构造
   */
  public IndentGathering() {
  }

  public IndentGathering(long id, long indentId, long gatheringId) {
    this.id = id;
    this.indentId = indentId;
    this.gatheringId = gatheringId;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "IndentGathering{" +
            "id=" + id +
            ", indentId=" + indentId +
            ", gatheringId=" + gatheringId +
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

  public long getGatheringId() {
    return gatheringId;
  }

  public void setGatheringId(long gatheringId) {
    this.gatheringId = gatheringId;
  }
}

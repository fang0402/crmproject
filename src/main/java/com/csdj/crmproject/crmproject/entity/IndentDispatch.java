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
 *订单-发货单
 */
public class IndentDispatch {
  /**
   * 编号
   */
  private long id;
  /**
   * 订单编号
   */
  private long indentId;
  /**
   * 发货单编号
   */
  private long dispatchId;

  /**
   * 无参构造
   */
  public IndentDispatch() {
  }

  /**
   * 有参构造
   * @param id
   * @param indentId
   * @param dispatchId
   */
  public IndentDispatch(long id, long indentId, long dispatchId) {
    this.id = id;
    this.indentId = indentId;
    this.dispatchId = dispatchId;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "IndentDispatch{" +
            "id=" + id +
            ", indentId=" + indentId +
            ", dispatchId=" + dispatchId +
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

  public long getDispatchId() {
    return dispatchId;
  }

  public void setDispatchId(long dispatchId) {
    this.dispatchId = dispatchId;
  }
}

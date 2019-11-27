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
 *订单-退货单关系表
 */
public class IndentReturn {
  /**
   * 编号
   */
  private long id;
  /**
   * 订单
   */
  private long indentId;
  /**
   * 退货单
   */
  private long returnId;

  /**
   * 无参构造
   */
  public IndentReturn() {
  }

  /**
   * 有参构造
   * @param id
   * @param indentId
   * @param returnId
   */
  public IndentReturn(long id, long indentId, long returnId) {
    this.id = id;
    this.indentId = indentId;
    this.returnId = returnId;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "IndentReturn{" +
            "id=" + id +
            ", indentId=" + indentId +
            ", returnId=" + returnId +
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

  public long getReturnId() {
    return returnId;
  }

  public void setReturnId(long returnId) {
    this.returnId = returnId;
  }
}

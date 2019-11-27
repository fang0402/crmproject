/**
 * 文件名
 * 版权(c) 2019-雷升公司 CRM项目组：
 *  * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author 尹嘉丽
 * @date 2019-11-27
 * @version 1.0
 *合同-退货单关系表
 */
public class ContractReturn {

  /**
   * 编号
   */
  private long id;
  /**
   * 合同编号
   */
  private long contractId;
  /**
   * 退货单编号
   */
  private long returnId;

  /**
   * 无参构造
   */
  public ContractReturn() {
  }

  /**
   * 有参构造
   * @param id
   * @param contractId
   * @param returnId
   */
  public ContractReturn(long id, long contractId, long returnId) {
    this.id = id;
    this.contractId = contractId;
    this.returnId = returnId;
  }

  /**
   * 显示信息
   * @return
   */
  @Override
  public String toString() {
    return "ContractReturn{" +
            "id=" + id +
            ", contractId=" + contractId +
            ", returnId=" + returnId +
            '}';
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getContractId() {
    return contractId;
  }

  public void setContractId(long contractId) {
    this.contractId = contractId;
  }

  public long getReturnId() {
    return returnId;
  }

  public void setReturnId(long returnId) {
    this.returnId = returnId;
  }
}

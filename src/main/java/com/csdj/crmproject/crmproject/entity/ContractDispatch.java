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
 *合同-发货单关系表
 */
public class ContractDispatch {
  /**
   * 编号
   */
  private long id;
  /**
   * 合同表编号
   */
  private long contractId;
  /**
   * 发货单表编号
   */
  private long dispatchId;

  /**
   * 无参构造方法
   */
  public ContractDispatch() {
  }

  /**
   * 有参构造方法
   * @param id
   * @param contractId
   * @param dispatchId
   */
  public ContractDispatch(long id, long contractId, long dispatchId) {
    this.id = id;
    this.contractId = contractId;
    this.dispatchId = dispatchId;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "ContractDispatch{" +
            "id=" + id +
            ", contractId=" + contractId +
            ", dispatchId=" + dispatchId +
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

  public long getDispatchId() {
    return dispatchId;
  }

  public void setDispatchId(long dispatchId) {
    this.dispatchId = dispatchId;
  }
}

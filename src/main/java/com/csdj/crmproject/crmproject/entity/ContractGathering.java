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
 *合同-收款计划关系表
 */
public class ContractGathering {
  /**
   * 编号
   */
  private long id;
  /**
   * 合同编号
   */
  private long contractId;
  /**
   * 收款计划编号
   */
  private long gaheringId;

  /**
   * 有参构造函数
   */
  public ContractGathering() {
  }

  /**
   * 无参构造函数
   * @param id
   * @param contractId
   * @param gaheringId
   */
  public ContractGathering(long id, long contractId, long gaheringId) {
    this.id = id;
    this.contractId = contractId;
    this.gaheringId = gaheringId;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "ContractGathering{" +
            "id=" + id +
            ", contractId=" + contractId +
            ", gaheringId=" + gaheringId +
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

  public long getGaheringId() {
    return gaheringId;
  }

  public void setGaheringId(long gaheringId) {
    this.gaheringId = gaheringId;
  }
}

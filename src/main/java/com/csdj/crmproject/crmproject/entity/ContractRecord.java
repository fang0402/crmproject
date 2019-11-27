/**
 * 文件名
 * 版权(c) 2019-雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author 尹嘉丽
 * @date 2019-11-27
 * @version 1.0
 *合同-收款记录关系表
 */
public class ContractRecord {
  /**
   * 编号
   */
  private long id;
  /**
   * 合同编号
   */
  private long contractId;
  /**
   * 收款记录编号
   */
  private long recordId;

  /**
   * 无参构造
   */
  public ContractRecord() {
  }

  /**
   * 有参构造
   * @param id
   * @param contractId
   * @param recordId
   */
  public ContractRecord(long id, long contractId, long recordId) {
    this.id = id;
    this.contractId = contractId;
    this.recordId = recordId;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "ContractRecord{" +
            "id=" + id +
            ", contractId=" + contractId +
            ", recordId=" + recordId +
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

  public long getRecordId() {
    return recordId;
  }

  public void setRecordId(long recordId) {
    this.recordId = recordId;
  }
}

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
 *合同附件
 */
public class ContractAccessory {
  /**
   * 合同附件id
   */
  private long id;
  /**
   * 合同附件名称
   */
  private String contractAccessoryName;
  /**
   * 合同附件文件路径
   */
  private String fileUrl;
  /**
   * 订单编号id
   */
  private long contractId;
  /**
   * 简介
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


  /**
   * 无参构造方法
   */
  public ContractAccessory() {
  }
  /**
   * 有参构造方法
   * @param id
   * @param contractAccessoryName
   * @param fileUrl
   * @param contractId
   * @param context
   * @param creator
   * @param createTime
   */
  public ContractAccessory(long id, String contractAccessoryName, String fileUrl, long contractId, String context, String creator, String createTime) {
    this.id = id;
    this.contractAccessoryName = contractAccessoryName;
    this.fileUrl = fileUrl;
    this.contractId = contractId;
    this.context = context;
    this.creator = creator;
    this.createTime = createTime;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getContractAccessoryName() {
    return contractAccessoryName;
  }

  public void setContractAccessoryName(String contractAccessoryName) {
    this.contractAccessoryName = contractAccessoryName;
  }

  public String getFileUrl() {
    return fileUrl;
  }

  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }

  public long getContractId() {
    return contractId;
  }

  public void setContractId(long contractId) {
    this.contractId = contractId;
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

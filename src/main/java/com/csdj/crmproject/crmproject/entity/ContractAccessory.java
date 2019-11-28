/*
 * 文 件 名：
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author 尹嘉丽
 * @version 1.0
 * @date 2019-11-28
 * 合同附件
 */
public class ContractAccessory {
  /**
   * 附件id
   */
  private long pkContractAccessoryId;
  /**
   * 附件名称
   */
  private String contractAccessoryName;
  /**
   * 路径
   */
  private String contractAccessoryFileUrl;
  /**
   * 联系人编号
   */
  private long fkContractId;
  /**
   * 附件备注
   */
  private String contractAccessoryContext;
  /**
   * 创建人
   */
  private String creator;
  /**
   * 创建时间
   */
  private String gmtCreate;
  /**
   * 修改时间
   */
  private String gmtModified;

  /**
   * 无参构造
   */
  public ContractAccessory() {
  }

  /**
   * 有参构造
   * @param pkContractAccessoryId
   * @param contractAccessoryName
   * @param contractAccessoryFileUrl
   * @param fkContractId
   * @param contractAccessoryContext
   * @param creator
   * @param gmtCreate
   * @param gmtModified
   */
  public ContractAccessory(long pkContractAccessoryId, String contractAccessoryName, String contractAccessoryFileUrl, long fkContractId, String contractAccessoryContext, String creator, String gmtCreate, String gmtModified) {
    this.pkContractAccessoryId = pkContractAccessoryId;
    this.contractAccessoryName = contractAccessoryName;
    this.contractAccessoryFileUrl = contractAccessoryFileUrl;
    this.fkContractId = fkContractId;
    this.contractAccessoryContext = contractAccessoryContext;
    this.creator = creator;
    this.gmtCreate = gmtCreate;
    this.gmtModified = gmtModified;
  }

  /**
   * 显示信息
   * @return
   */
  @Override
  public String toString() {
    return "ContractAccessory{" +
            "pkContractAccessoryId=" + pkContractAccessoryId +
            ", contractAccessoryName='" + contractAccessoryName + '\'' +
            ", contractAccessoryFileUrl='" + contractAccessoryFileUrl + '\'' +
            ", fkContractId=" + fkContractId +
            ", contractAccessoryContext='" + contractAccessoryContext + '\'' +
            ", creator='" + creator + '\'' +
            ", gmtCreate='" + gmtCreate + '\'' +
            ", gmtModified='" + gmtModified + '\'' +
            '}';
  }

  public long getPkContractAccessoryId() {
    return pkContractAccessoryId;
  }

  public void setPkContractAccessoryId(long pkContractAccessoryId) {
    this.pkContractAccessoryId = pkContractAccessoryId;
  }

  public String getContractAccessoryName() {
    return contractAccessoryName;
  }

  public void setContractAccessoryName(String contractAccessoryName) {
    this.contractAccessoryName = contractAccessoryName;
  }

  public String getContractAccessoryFileUrl() {
    return contractAccessoryFileUrl;
  }

  public void setContractAccessoryFileUrl(String contractAccessoryFileUrl) {
    this.contractAccessoryFileUrl = contractAccessoryFileUrl;
  }

  public long getFkContractId() {
    return fkContractId;
  }

  public void setFkContractId(long fkContractId) {
    this.fkContractId = fkContractId;
  }

  public String getContractAccessoryContext() {
    return contractAccessoryContext;
  }

  public void setContractAccessoryContext(String contractAccessoryContext) {
    this.contractAccessoryContext = contractAccessoryContext;
  }

  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public String getGmtCreate() {
    return gmtCreate;
  }

  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }

  public String getGmtModified() {
    return gmtModified;
  }

  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }
}

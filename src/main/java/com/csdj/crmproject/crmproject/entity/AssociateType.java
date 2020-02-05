/*
 * 文 件 名：对象类型实体类
 * 版权(c) 2019-雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author 李文霞1
 * @version 1.0
 * @date 2019-11-28
 */
public class AssociateType {
  /**
   * Description ：无参构造函数
   * @param：无
   */
  public AssociateType() {
  }

  /**
   * Description ：有参构造函数
   * @param pkAssociateTypeId
   * @param associateTypeName
   */
  public AssociateType(long pkAssociateTypeId, String associateTypeName) {
    this.pkAssociateTypeId = pkAssociateTypeId;
    this.associateTypeName = associateTypeName;
  }

  private long pkAssociateTypeId;
  private String associateTypeName;


  public long getPkAssociateTypeId() {
    return pkAssociateTypeId;
  }

  public void setPkAssociateTypeId(long pkAssociateTypeId) {
    this.pkAssociateTypeId = pkAssociateTypeId;
  }


  public String getAssociateTypeName() {
    return associateTypeName;
  }

  public void setAssociateTypeName(String associateTypeName) {
    this.associateTypeName = associateTypeName;
  }

  /**
   * 显示数据
   * @return 显示数据
   */
  @Override
  public String toString() {
    return "AssociateType{" +
            "pkAssociateTypeId=" + pkAssociateTypeId +
            ", associateTypeName='" + associateTypeName + '\'' +
            '}';
  }
}

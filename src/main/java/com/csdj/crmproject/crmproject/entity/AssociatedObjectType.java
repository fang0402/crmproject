/*
 * 文 件 名：对象类型实体类
 * 版权(c) 雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-27
 */
public class AssociatedObjectType {
  /**
   * Description ：无参构造函数
   * @param：无
   */
  public AssociatedObjectType(){

  }

  /**
   * Description ：有参构造函数
   * @param associatedObjectTypeId
   * @param associatedObjectTypeName
   */
  public AssociatedObjectType(long associatedObjectTypeId, String associatedObjectTypeName) {
    this.associatedObjectTypeId = associatedObjectTypeId;
    this.associatedObjectTypeName = associatedObjectTypeName;
  }

  /**
   * 对象类型id
   */
  private long associatedObjectTypeId;
  /**
   * 类型名称
   */
  private String associatedObjectTypeName;

  public long getAssociatedObjectTypeId() {
    return associatedObjectTypeId;
  }

  public void setAssociatedObjectTypeId(long associatedObjectTypeId) {
    this.associatedObjectTypeId = associatedObjectTypeId;
  }


  public String getAssociatedObjectTypeName() {
    return associatedObjectTypeName;
  }

  public void setAssociatedObjectTypeName(String associatedObjectTypeName) {
    this.associatedObjectTypeName = associatedObjectTypeName;
  }

  /**
   * 显示数据
   * @return 显示数据
   */
  @Override
  public String toString() {
    return "AssociatedObjectType{" +
            "associatedObjectTypeId=" + associatedObjectTypeId +
            ", associatedObjectTypeName='" + associatedObjectTypeName + '\'' +
            '}';
  }

}

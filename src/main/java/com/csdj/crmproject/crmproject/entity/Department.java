/*
 * 文 件 名：部门实体类
 * 版权(c) 雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;

/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-27
 */
public class Department {
  /**
   * Description ：  无参构造函数
   * @param：  无
   */
  public Department() {
  }

  /**
   *  Description ：  有参构造函数
   * @param departmentId
   * @param departmentName
   */
  public Department(long departmentId, String departmentName) {
    this.departmentId = departmentId;
    this.departmentName = departmentName;
  }

  /**
   * 部门id
   */
  private long departmentId;
  /**
   * 部门名称
   */
  private String departmentName;

  public long getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(long departmentId) {
    this.departmentId = departmentId;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }
  /**
   * 显示数据
   * @return 显示数据
   */
  @Override
  public String toString() {
    return "Department{" +
            "departmentId=" + departmentId +
            ", departmentName='" + departmentName + '\'' +
            '}';
  }
}

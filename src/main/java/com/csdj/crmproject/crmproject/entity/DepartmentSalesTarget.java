/*
 * 文 件 名：部门销售目标实体类
 * 版权(c) 2019-雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;


/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-28
 */
public class DepartmentSalesTarget {
  /**
   * Description ：  无参构造函数
   * @param：  无
   */
  public DepartmentSalesTarget() {
  }

  /**
   * Description ：  有参构造函数
   * @param pkDepartmentSalesTargetId
   * @param fkDepartmentId
   * @param deSaTarYear
   * @param salesTargetType
   * @param deSaTarJanuary
   * @param deSaTarFebruary
   * @param deSaTarMarch
   * @param deSaTarApril
   * @param deSaTarMay
   * @param deSaTarJun
   * @param deSaTarJuly
   * @param deSaTarAugust
   * @param deSaTarSeptember
   * @param deSaTarOctober
   * @param deSaTarNovember
   * @param deSaTarDecember
   * @param deSaTarCreator
   * @param deSaTarGmtCreate
   * @param deSaTarGmtModified
   * @param deSaTarLastModified
   * @param fkUserId
   */
  public DepartmentSalesTarget(long pkDepartmentSalesTargetId, long fkDepartmentId, long deSaTarYear, String salesTargetType, double deSaTarJanuary, double deSaTarFebruary, double deSaTarMarch, double deSaTarApril, double deSaTarMay, double deSaTarJun, double deSaTarJuly, double deSaTarAugust, double deSaTarSeptember, double deSaTarOctober, double deSaTarNovember, double deSaTarDecember, String deSaTarCreator, String deSaTarGmtCreate, String deSaTarGmtModified, String deSaTarLastModified, String fkUserId) {
    this.pkDepartmentSalesTargetId = pkDepartmentSalesTargetId;
    this.fkDepartmentId = fkDepartmentId;
    this.deSaTarYear = deSaTarYear;
    this.salesTargetType = salesTargetType;
    this.deSaTarJanuary = deSaTarJanuary;
    this.deSaTarFebruary = deSaTarFebruary;
    this.deSaTarMarch = deSaTarMarch;
    this.deSaTarApril = deSaTarApril;
    this.deSaTarMay = deSaTarMay;
    this.deSaTarJun = deSaTarJun;
    this.deSaTarJuly = deSaTarJuly;
    this.deSaTarAugust = deSaTarAugust;
    this.deSaTarSeptember = deSaTarSeptember;
    this.deSaTarOctober = deSaTarOctober;
    this.deSaTarNovember = deSaTarNovember;
    this.deSaTarDecember = deSaTarDecember;
    this.deSaTarCreator = deSaTarCreator;
    this.deSaTarGmtCreate = deSaTarGmtCreate;
    this.deSaTarGmtModified = deSaTarGmtModified;
    this.deSaTarLastModified = deSaTarLastModified;
    this.fkUserId = fkUserId;
  }

  /**
   * 部门销售目标id
   */
  private long pkDepartmentSalesTargetId;
  /**
   *
   * 部门id
   */
  private long fkDepartmentId;
  /**
   * 年度
   */
  private long deSaTarYear;
  /**
   * 销售目标类型
   */
  private String salesTargetType;
  /**
   * 一月
   */
  private double deSaTarJanuary;
  /**
   * 二月
   */
  private double deSaTarFebruary;
  /**
   * 三月
   */
  private double deSaTarMarch;
  /**
   * 四月
   */
  private double deSaTarApril;
  /**
   * 五月
   */
  private double deSaTarMay;
  /**
   * 六月
   */
  private double deSaTarJun;
  /**
   * 七月
   */
  private double deSaTarJuly;
  /**
   * 八月
   */
  private double deSaTarAugust;
  /**
   * 九月
   */
  private double deSaTarSeptember;
  /**
   * 十月
   */
  private double deSaTarOctober;
  /**
   * 十一月
   */
  private double deSaTarNovember;
  /**
   * 十二月
   */
  private double deSaTarDecember;
  /**
   * 创建人
   */
  private String deSaTarCreator;
  /**
   * 创建时间
   */
  private String deSaTarGmtCreate;
  /**
   * 修改时间
   */
  private String deSaTarGmtModified;
  /**
   * 修改人
   */
  private String deSaTarLastModified;
  /**
   * 负责人
   */
  private String fkUserId;


  public long getPkDepartmentSalesTargetId() {
    return pkDepartmentSalesTargetId;
  }

  public void setPkDepartmentSalesTargetId(long pkDepartmentSalesTargetId) {
    this.pkDepartmentSalesTargetId = pkDepartmentSalesTargetId;
  }


  public long getFkDepartmentId() {
    return fkDepartmentId;
  }

  public void setFkDepartmentId(long fkDepartmentId) {
    this.fkDepartmentId = fkDepartmentId;
  }


  public long getDeSaTarYear() {
    return deSaTarYear;
  }

  public void setDeSaTarYear(long deSaTarYear) {
    this.deSaTarYear = deSaTarYear;
  }


  public String getSalesTargetType() {
    return salesTargetType;
  }

  public void setSalesTargetType(String salesTargetType) {
    this.salesTargetType = salesTargetType;
  }


  public double getDeSaTarJanuary() {
    return deSaTarJanuary;
  }

  public void setDeSaTarJanuary(double deSaTarJanuary) {
    this.deSaTarJanuary = deSaTarJanuary;
  }


  public double getDeSaTarFebruary() {
    return deSaTarFebruary;
  }

  public void setDeSaTarFebruary(double deSaTarFebruary) {
    this.deSaTarFebruary = deSaTarFebruary;
  }


  public double getDeSaTarMarch() {
    return deSaTarMarch;
  }

  public void setDeSaTarMarch(double deSaTarMarch) {
    this.deSaTarMarch = deSaTarMarch;
  }


  public double getDeSaTarApril() {
    return deSaTarApril;
  }

  public void setDeSaTarApril(double deSaTarApril) {
    this.deSaTarApril = deSaTarApril;
  }


  public double getDeSaTarMay() {
    return deSaTarMay;
  }

  public void setDeSaTarMay(double deSaTarMay) {
    this.deSaTarMay = deSaTarMay;
  }


  public double getDeSaTarJun() {
    return deSaTarJun;
  }

  public void setDeSaTarJun(double deSaTarJun) {
    this.deSaTarJun = deSaTarJun;
  }


  public double getDeSaTarJuly() {
    return deSaTarJuly;
  }

  public void setDeSaTarJuly(double deSaTarJuly) {
    this.deSaTarJuly = deSaTarJuly;
  }


  public double getDeSaTarAugust() {
    return deSaTarAugust;
  }

  public void setDeSaTarAugust(double deSaTarAugust) {
    this.deSaTarAugust = deSaTarAugust;
  }


  public double getDeSaTarSeptember() {
    return deSaTarSeptember;
  }

  public void setDeSaTarSeptember(double deSaTarSeptember) {
    this.deSaTarSeptember = deSaTarSeptember;
  }


  public double getDeSaTarOctober() {
    return deSaTarOctober;
  }

  public void setDeSaTarOctober(double deSaTarOctober) {
    this.deSaTarOctober = deSaTarOctober;
  }


  public double getDeSaTarNovember() {
    return deSaTarNovember;
  }

  public void setDeSaTarNovember(double deSaTarNovember) {
    this.deSaTarNovember = deSaTarNovember;
  }


  public double getDeSaTarDecember() {
    return deSaTarDecember;
  }

  public void setDeSaTarDecember(double deSaTarDecember) {
    this.deSaTarDecember = deSaTarDecember;
  }


  public String getDeSaTarCreator() {
    return deSaTarCreator;
  }

  public void setDeSaTarCreator(String deSaTarCreator) {
    this.deSaTarCreator = deSaTarCreator;
  }


  public String getDeSaTarGmtCreate() {
    return deSaTarGmtCreate;
  }

  public void setDeSaTarGmtCreate(String deSaTarGmtCreate) {
    this.deSaTarGmtCreate = deSaTarGmtCreate;
  }

  public String getDeSaTarGmtModified() {
    return deSaTarGmtModified;
  }

  public void setDeSaTarGmtModified(String deSaTarGmtModified) {
    this.deSaTarGmtModified = deSaTarGmtModified;
  }

  public String getDeSaTarLastModified() {
    return deSaTarLastModified;
  }

  public void setDeSaTarLastModified(String deSaTarLastModified) {
    this.deSaTarLastModified = deSaTarLastModified;
  }


  public String getFkUserId() {
    return fkUserId;
  }

  public void setFkUserId(String fkUserId) {
    this.fkUserId = fkUserId;
  }



}

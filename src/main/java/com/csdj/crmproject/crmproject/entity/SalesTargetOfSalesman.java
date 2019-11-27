/*
 * 文 件 名：业务员销售目标实体类
 * 版权(c) 雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;
/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-27
 */
public class SalesTargetOfSalesman {
  /**
   * Description ：  无参构造函数
   * @param：  无
   */
  public SalesTargetOfSalesman() {
  }

  /**
   * Description ：  有参构造函数
   * @param salesTargetOfSalesmanId
   * @param salesmanId
   * @param year
   * @param salesTargetType
   * @param january
   * @param february
   * @param march
   * @param april
   * @param may
   * @param jun
   * @param july
   * @param august
   * @param september
   * @param october
   * @param november
   * @param december
   * @param creator
   * @param creatorTime
   * @param lastModifiedTime
   * @param lastModifier
   * @param principal
   */
  public SalesTargetOfSalesman(long salesTargetOfSalesmanId, long salesmanId, long year, String salesTargetType, double january, double february, double march, double april, double may, double jun, double july, double august, double september, double october, double november, double december, String creator, String creatorTime, String lastModifiedTime, String lastModifier, String principal) {
    this.salesTargetOfSalesmanId = salesTargetOfSalesmanId;
    this.salesmanId = salesmanId;
    this.year = year;
    this.salesTargetType = salesTargetType;
    this.january = january;
    this.february = february;
    this.march = march;
    this.april = april;
    this.may = may;
    this.jun = jun;
    this.july = july;
    this.august = august;
    this.september = september;
    this.october = october;
    this.november = november;
    this.december = december;
    this.creator = creator;
    this.creatorTime = creatorTime;
    this.lastModifiedTime = lastModifiedTime;
    this.lastModifier = lastModifier;
    this.principal = principal;
  }

  /**
   * 业务员销售目标id主键
   */
  private long salesTargetOfSalesmanId;
  /**
   * 业务员id
   */
  private long salesmanId;
  /**
   * 年度
   */
  private long year;
  /**
   * 销售目标类型
   */
  private String salesTargetType;
  /**
   * 一月
   */
  private double january;
  /**
   * 二月
   */
  private double february;
  /**
   * 三月
   */
  private double march;
  /**
   * 四月
   */
  private double april;
  /**
   * 五月
   */
  private double may;
  /**
   * 六月
   */
  private double jun;
  /**
   * 七月
   */
  private double july;
  /**
   * 八月
   */
  private double august;
  /**
   * 九月
   */
  private double september;
  /**
   * 十月
   */
  private double october;
  /**
   * 十一月
   */
  private double november;
  /**
   * 十二月
   */
  private double december;
  /**
   * 创建人
   */
  private String creator;
  /**
   * 创建时间
   */
  private String creatorTime;
  /**
   * 最后修改时间
   */
  private String lastModifiedTime;
  /**
   * 最后修改人
   */
  private String lastModifier;
  /**
   * 负责人
   */
  private String principal;

  public long getSalesTargetOfSalesmanId() {
    return salesTargetOfSalesmanId;
  }

  public void setSalesTargetOfSalesmanId(long salesTargetOfSalesmanId) {
    this.salesTargetOfSalesmanId = salesTargetOfSalesmanId;
  }


  public long getSalesmanId() {
    return salesmanId;
  }

  public void setSalesmanId(long salesmanId) {
    this.salesmanId = salesmanId;
  }

  public String getCreatorTime() {
    return creatorTime;
  }

  public void setCreatorTime(String creatorTime) {
    this.creatorTime = creatorTime;
  }

  public String getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public String getLastModifier() {
    return lastModifier;
  }

  public void setLastModifier(String lastModifier) {
    this.lastModifier = lastModifier;
  }

  public String getPrincipal() {
    return principal;
  }

  public void setPrincipal(String principal) {
    this.principal = principal;
  }

  public long getYear() {
    return year;
  }

  public void setYear(long year) {
    this.year = year;
  }


  public String getSalesTargetType() {
    return salesTargetType;
  }

  public void setSalesTargetType(String salesTargetType) {
    this.salesTargetType = salesTargetType;
  }


  public double getJanuary() {
    return january;
  }

  public void setJanuary(double january) {
    this.january = january;
  }


  public double getFebruary() {
    return february;
  }

  public void setFebruary(double february) {
    this.february = february;
  }


  public double getMarch() {
    return march;
  }

  public void setMarch(double march) {
    this.march = march;
  }


  public double getApril() {
    return april;
  }

  public void setApril(double april) {
    this.april = april;
  }


  public double getMay() {
    return may;
  }

  public void setMay(double may) {
    this.may = may;
  }


  public double getJun() {
    return jun;
  }

  public void setJun(double jun) {
    this.jun = jun;
  }


  public double getJuly() {
    return july;
  }

  public void setJuly(double july) {
    this.july = july;
  }


  public double getAugust() {
    return august;
  }

  public void setAugust(double august) {
    this.august = august;
  }


  public double getSeptember() {
    return september;
  }

  public void setSeptember(double september) {
    this.september = september;
  }


  public double getOctober() {
    return october;
  }

  public void setOctober(double october) {
    this.october = october;
  }


  public double getNovember() {
    return november;
  }

  public void setNovember(double november) {
    this.november = november;
  }


  public double getDecember() {
    return december;
  }

  public void setDecember(double december) {
    this.december = december;
  }


  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }
  /**
   * 显示数据
   * @return 显示数据
   */
  @Override
  public String toString() {
    return "SalesTargetOfSalesman{" +
            "salesTargetOfSalesmanId=" + salesTargetOfSalesmanId +
            ", salesmanId=" + salesmanId +
            ", year=" + year +
            ", salesTargetType='" + salesTargetType + '\'' +
            ", january=" + january +
            ", february=" + february +
            ", march=" + march +
            ", april=" + april +
            ", may=" + may +
            ", jun=" + jun +
            ", july=" + july +
            ", august=" + august +
            ", september=" + september +
            ", october=" + october +
            ", november=" + november +
            ", december=" + december +
            ", creator='" + creator + '\'' +
            ", creatorTime='" + creatorTime + '\'' +
            ", lastModifiedTime='" + lastModifiedTime + '\'' +
            ", lastModifier='" + lastModifier + '\'' +
            ", principal='" + principal + '\'' +
            '}';
  }
}

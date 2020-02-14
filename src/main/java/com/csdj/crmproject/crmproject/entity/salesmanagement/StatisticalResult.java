package com.csdj.crmproject.crmproject.entity.salesmanagement;

/**
 * 业务人员统计展示类
 * @author 唐浪
 */
public class StatisticalResult {
    /**
     *阶段名
     */
    public String phaseTypeName;
    /**
     * 总个数
     */
    public Double opportunitiesNumber;
    /**
     * 合计
     */
    public Double summation;
    /**
     * 完成率
     */
    public Double completion;
    /**
     * 计划值
     */
    public Double plannedValue;

    /**
     * 完成值
     */
    public Double completeValue;
    /**
     * 月份字符串
     */
    public String strMonth;
    /**
     * 季份字符串
     */
    public String strQuarter;
    /**
     * 年份字符串
     */
    public String strYear;
    /**
     *机会跟进数
     */
    public Integer opportunityFollow;

    /**
     *线索跟进数
     */
    public Integer clueFollow;

    /**
     *客户跟进数
     */
    public Integer customerFollow;

    /**
     *机会增加数
     */
    public Integer opportunityAdd;

    /**
     *线索增加数
     */
    public Integer clueAdd;

    /**
     *客户增加数
     */
    public Integer customerAdd;

    public Double getOpportunitiesNumber() {
        return opportunitiesNumber;
    }

    public void setOpportunitiesNumber(Double opportunitiesNumber) {
        this.opportunitiesNumber = opportunitiesNumber;
    }

    public Double getSummation() {
        return summation;
    }

    public void setSummation(Double summation) {
        this.summation = summation;
    }

    public Double getCompletion() {
        return completion;
    }

    public void setCompletion(Double completion) {
        this.completion = completion;
    }

    public Double getPlannedValue() {
        return plannedValue;
    }

    public void setPlannedValue(Double plannedValue) {
        this.plannedValue = plannedValue;
    }

    public Double getCompleteValue() {
        return completeValue;
    }

    public void setCompleteValue(Double completeValue) {
        this.completeValue = completeValue;
    }

    public String getPhaseTypeName() {
        return phaseTypeName;
    }

    public void setPhaseTypeName(String phaseTypeName) {
        this.phaseTypeName = phaseTypeName;
    }

    public Integer getOpportunityFollow() {
        return opportunityFollow;
    }

    public void setOpportunityFollow(Integer opportunityFollow) {
        this.opportunityFollow = opportunityFollow;
    }

    public Integer getClueFollow() {
        return clueFollow;
    }

    public void setClueFollow(Integer clueFollow) {
        this.clueFollow = clueFollow;
    }

    public Integer getCustomerFollow() {
        return customerFollow;
    }

    public void setCustomerFollow(Integer customerFollow) {
        this.customerFollow = customerFollow;
    }

    public Integer getOpportunityAdd() {
        return opportunityAdd;
    }

    public void setOpportunityAdd(Integer opportunityAdd) {
        this.opportunityAdd = opportunityAdd;
    }

    public Integer getClueAdd() {
        return clueAdd;
    }

    public void setClueAdd(Integer clueAdd) {
        this.clueAdd = clueAdd;
    }

    public Integer getCustomerAdd() {
        return customerAdd;
    }

    public void setCustomerAdd(Integer customerAdd) {
        this.customerAdd = customerAdd;
    }
}

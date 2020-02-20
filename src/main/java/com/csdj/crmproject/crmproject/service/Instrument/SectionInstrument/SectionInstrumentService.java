package com.csdj.crmproject.crmproject.service.Instrument.SectionInstrument;

import com.csdj.crmproject.crmproject.entity.Department;
import com.csdj.crmproject.crmproject.entity.salesmanagement.StatisticalResult;

import java.util.List;
import java.util.Map;

/**
 * @Author 刘时钟
 * @Date 2020/2/10
 * @Version 1.0
 */
public interface SectionInstrumentService {
    /**
     * 查询所有部门
     * @return 部门列表
     */
    List<Department> listDepartmentService();
    /**
     * 本月回款业绩完成值
     * @param dip
     * @return 统计结果类
     */
    StatisticalResult countReceivableMonthService(Integer dip);
    /**
     * 本季回款业绩完成值
     * @param dip
     * @return 统计结果类
     */
    StatisticalResult countReceivableQuarterService(Integer dip);
    /**
     * 本年回款业绩完成值
     * @param dip
     * @return 统计结果类
     */
    StatisticalResult countReceivableYearService(Integer dip);
    /**
     * 月度回款额统计图
     * @param dip
     * @return map数据
     */
    Map<String, Object> avgReceivableMonthService(Integer dip);
    /**
     * 月度回款额统计图完成值
     * @param dip
     * @return map数据
     */
    Map<String, Object> avgReceivableMonthOKService(Integer dip);
}

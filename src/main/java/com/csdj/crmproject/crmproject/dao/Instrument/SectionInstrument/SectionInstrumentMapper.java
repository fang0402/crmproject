package com.csdj.crmproject.crmproject.dao.Instrument.SectionInstrument;

import com.csdj.crmproject.crmproject.entity.CusSalesTarget;
import com.csdj.crmproject.crmproject.entity.Department;
import com.csdj.crmproject.crmproject.entity.salesmanagement.StatisticalResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author 刘时钟
 * @Date 2020/2/10
 * @Version 1.0
 */
@Mapper
public interface SectionInstrumentMapper {
    /**
     * 查询所有部门
     * @return 部门列表
     */
    List<Department> listDepartment();
    /**
     * 本月回款业绩完成值
     * @param dip
     * @return 统计结果类
     */
    StatisticalResult countReceivableMonth(@Param("dip")Integer dip);
    /**
     * 本季回款业绩完成值
     * @param dip
     * @return 统计结果类
     */
    StatisticalResult countReceivableQuarter(@Param("dip")Integer dip);
    /**
     * 本年回款业绩完成值
     * @param dip
     * @return 统计结果类
     */
    StatisticalResult countReceivableYear(@Param("dip")Integer dip);
    /**
     * 月度回款额统计图计划值
     * @param dip
     * @return map数据
     */
    Map<String, Object> avgReceivableMonth(@Param("dip")Integer dip);
    /**
     * 月度回款额统计图完成值
     * @param dip
     * @return map数据
     */
    Map<String, Object> avgReceivableMonthOK(@Param("dip")Integer dip);
}

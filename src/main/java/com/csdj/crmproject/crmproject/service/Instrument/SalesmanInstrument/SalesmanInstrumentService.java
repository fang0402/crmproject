package com.csdj.crmproject.crmproject.service.Instrument.SalesmanInstrument;

import com.csdj.crmproject.crmproject.entity.CusSalesTarget;
import com.csdj.crmproject.crmproject.entity.User;
import com.csdj.crmproject.crmproject.entity.salesmanagement.StatisticalResult;

import java.util.List;

/**
 * @ClassName SalesmanInstrumentService
 * @Description: 销售仪表盘业务接口层
 * @Author 唐浪
 * @Date 2019/2/6
 * @Version V1.0
 **/
public interface SalesmanInstrumentService {
    /**
     * 查询所有用户,绑定下拉列表框
     * @return 用户列表
     */
    List<User> listUsers();

    /**
     * 销售预测
     * @return 统计结果类
     */
    List<StatisticalResult> countSaleForecasting();

    /**
     * 本月回顾业绩完成值
     * @return 统计结果类
     */
    StatisticalResult countRetrospectiveMonth();

    /**
     * 本季回顾业绩完成值
     * @return 统计结果类
     */
    StatisticalResult countRetrospectiveQuarter();

    /**
     * 本年回顾业绩完成值
     * @return 统计结果类
     */
    StatisticalResult countRetrospectiveYear();

    /**
     * 本年回顾业绩计划值
     * @return 统计结果类
     */
    CusSalesTarget reviewPerformancePlan();

}

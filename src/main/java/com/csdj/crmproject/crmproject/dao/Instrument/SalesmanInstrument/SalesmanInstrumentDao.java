package com.csdj.crmproject.crmproject.dao.Instrument.SalesmanInstrument;

import com.csdj.crmproject.crmproject.entity.CusSalesTarget;
import com.csdj.crmproject.crmproject.entity.User;
import com.csdj.crmproject.crmproject.entity.salesmanagement.StatisticalResult;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName SalesmanInstrumentDao
 * @Description: 销售仪表盘持久层
 * @Author 唐浪
 * @Date 2019/2/6
 * @Version V1.0
 **/
@Repository
public interface SalesmanInstrumentDao {
    /**
     * 查询所有用户
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

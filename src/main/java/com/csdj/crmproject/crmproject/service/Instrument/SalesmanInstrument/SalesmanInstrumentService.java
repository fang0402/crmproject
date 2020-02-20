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
     *
     * @return 用户列表
     */
    List<User> listUsers();

    /**
     * 销售预测-初步接触
     *
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting1(Integer userId);

    /**
     * 销售预测-需求分析
     *
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting2(Integer userId);

    /**
     * 销售预测-方案制定/报价
     *
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting3(Integer userId);

    /**
     * 销售预测-商务谈判/招投标
     *
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting4(Integer userId);

    /**
     * 销售预测-合同签订
     *
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting5(Integer userId);

    /**
     * 销售预测-成功
     *
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting6(Integer userId);

    /**
     * 本月回款业绩完成值
     *
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countRetrospectiveMonth(Integer userId);

    /**
     * 本季回款业绩完成值
     *
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countRetrospectiveQuarter(Integer userId);

    /**
     * 本年回款业绩完成值
     *
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countRetrospectiveYear(Integer userId);

    /**
     * 本年回款业绩计划值
     *
     * @param userId 业务员id
     * @return 统计结果类
     */
    CusSalesTarget reviewPerformancePlan(Integer userId);

}

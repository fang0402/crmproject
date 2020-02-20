package com.csdj.crmproject.crmproject.dao.Instrument.SalesmanInstrument;

import com.csdj.crmproject.crmproject.entity.CusSalesTarget;
import com.csdj.crmproject.crmproject.entity.User;
import com.csdj.crmproject.crmproject.entity.salesmanagement.StatisticalResult;
import io.lettuce.core.dynamic.annotation.Param;
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
     * 销售预测-初步接触
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting1(@Param("userId") Integer userId);
    /**
     * 销售预测-需求分析
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting2(@Param("userId") Integer userId);
    /**
     * 销售预测-方案制定/报价
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting3(@Param("userId") Integer userId);
    /**
     * 销售预测-商务谈判/招投标
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting4(@Param("userId") Integer userId);
    /**
     * 销售预测-合同签订
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting5(@Param("userId") Integer userId);
    /**
     * 销售预测-成功
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting6(@Param("userId") Integer userId);


    /**
     * 本月回款业绩完成值
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countRetrospectiveMonth(@Param("userId") Integer userId);

    /**
     * 本季回款业绩完成值
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countRetrospectiveQuarter(@Param("userId") Integer userId);

    /**
     * 本年回款业绩完成值
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countRetrospectiveYear(@Param("userId") Integer userId);

    /**
     * 本年回款业绩计划值
     * @param userId 业务员id
     * @return 统计结果类
     */
    CusSalesTarget reviewPerformancePlan(@Param("userId") Integer userId);



}

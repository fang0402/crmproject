package com.csdj.crmproject.crmproject.service.Instrument.MySalesInstrument;

import com.csdj.crmproject.crmproject.entity.CusSalesTarget;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.Map;

public interface MySalesInstrumentService {
    /**
     * 获取销售目标
     *
     * @return
     */
    CusSalesTarget getOrder(String userId, String year);

    /**
     * 本月销售业绩
     *
     * @return 数据
     */
    Map<Object, String> dianasOrder(String userId);

    /**
     * 本季销售业绩
     *
     * @return 数据
     */
    Map<Object, String> seasonOrder(String userId);

    /**
     * 本年销售业绩
     *
     * @return 数据
     */
    Map<Object, String> yearOrder(String userId);
    /**
     * 年度合同完成度
     * @param userId
     * @return
     */
    Map<Object,String> contract(@Param("userId") String userId);
    /**
     * 本月合同销售业绩
     * @param userId
     * @return
     */
    Map<Object,String> dianasContract(@Param("userId") String userId);
    /**
     * 年度订单完成度
     * @return
     */
    Map<Object,String> order(@Param("userId") String userId);
    /**
     * 本季合同销售业绩
     * @param userId
     * @return
     */
    Map<Object,String> seasonContract(@Param("userId") String userId);
    /**
     * 本年合同销售业绩
     * @param userId
     * @return
     */
    Map<Object,String> yearContract(@Param("userId") String userId);


    /**
     * 本月回款完成情况
     * @param userId
     * @return
     */
    Double dianasOrReceiPlan(@Param("userId") String userId);
    /**
     * 本月应回款
     * @param userId
     * @return
     */
    Double dianasRecei_plan(@Param("userId") String userId);

    /**
     * 本季回款完成情况
     * @param userId
     * @return
     */
    Double seasonOrReceiPlan(@Param("userId") String userId);
    /**
     * 本季应回款
     * @param userId
     * @return
     */
    Double seasonRecei_plan(@Param("userId") String userId);

    /**
     * 本年回款完成情况
     * @param userId
     * @return
     */
    Double yearOrReceiPlan(@Param("userId") String userId);
    /**
     * 本年应回款
     * @param userId
     * @return
     */
    Double yearRecei_plan(@Param("userId") String userId);

    /**
     *
     * 本年完成情况
     * @param userId
     * @return
     */
    Map<String,Double> yearAccomplish(@Param("userId") String userId);

    /**
     *
     * 本年应完成
     * @param userId
     * @return
     */
    Map<String,Double> yearAnswerAccomplish(@Param("userId") String userId);
}

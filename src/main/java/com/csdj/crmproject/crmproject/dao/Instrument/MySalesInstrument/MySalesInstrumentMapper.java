package com.csdj.crmproject.crmproject.dao.Instrument.MySalesInstrument;

import com.csdj.crmproject.crmproject.entity.CusSalesTarget;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @ClassName MySalesInstrumentMapper
 * @Description: 我的销售接口
 * @Author 邹捷
 * @Date 2020/2/13
 * @Version V1.0
 **/
@Repository
public interface MySalesInstrumentMapper {
    /**
     * 获取销售目标
     * @return
     */
    CusSalesTarget getOrder(@Param("userId") String userId, @Param("year") String year);
    /**
     * 本月销售业绩
     * @return 数据
     */
    Map<Object,String> dianasOrder(@Param("userId") String userId);
    /**
     * 本季销售业绩
     * @return 数据
     */
    Map<Object,String> seasonOrder(@Param("userId") String userId);
    /**
     * 本年销售业绩
     * @return 数据
     */
    Map<Object,String> yearOrder(@Param("userId") String userId);

    /**
     * 年度订单完成度
     * @return
     */
    Map<Object,String> order(@Param("userId") String userId);

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
     * @param userId 当前用户id
     * @return
     */
    Map<String,Double> yearAccomplish(@Param("userId") String userId);

    /**
     *
     * 本年应完成
     * @param userId 当前用户id
     * @return
     */
    Map<String,Double> yearAnswerAccomplish(@Param("userId") String userId);

}

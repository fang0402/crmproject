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
    CusSalesTarget getOrder(@Param("userId") String userId,@Param("year")String year);
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

}

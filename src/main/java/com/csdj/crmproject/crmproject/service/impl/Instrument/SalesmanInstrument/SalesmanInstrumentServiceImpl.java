package com.csdj.crmproject.crmproject.service.impl.Instrument.SalesmanInstrument;

import com.csdj.crmproject.crmproject.dao.Instrument.SalesmanInstrument.SalesmanInstrumentDao;
import com.csdj.crmproject.crmproject.service.Instrument.SalesmanInstrument.SalesmanInstrumentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName SalesmanInstrumentServiceImpl
 * @Description: 销售仪表盘业务接口实现层
 * @Author 唐浪
 * @Date 2019/2/6
 * @Version V1.0
 **/
@Service
public class SalesmanInstrumentServiceImpl implements SalesmanInstrumentService {

    @Resource
    private SalesmanInstrumentDao salesmanInstrumentDao;
}

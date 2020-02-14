package com.csdj.crmproject.crmproject.service.impl.Instrument.SalesmanInstrument;

import com.csdj.crmproject.crmproject.dao.Instrument.SalesmanInstrument.SalesmanInstrumentDao;
import com.csdj.crmproject.crmproject.entity.CusSalesTarget;
import com.csdj.crmproject.crmproject.entity.User;
import com.csdj.crmproject.crmproject.entity.salesmanagement.StatisticalResult;
import com.csdj.crmproject.crmproject.service.Instrument.SalesmanInstrument.SalesmanInstrumentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public List<User> listUsers() {
        return salesmanInstrumentDao.listUsers();
    }

    @Override
    public List<StatisticalResult> countSaleForecasting() {
        return salesmanInstrumentDao.countSaleForecasting();
    }

    @Override
    public StatisticalResult countRetrospectiveMonth() {
        return salesmanInstrumentDao.countRetrospectiveMonth();
    }

    @Override
    public StatisticalResult countRetrospectiveQuarter() {
        return salesmanInstrumentDao.countRetrospectiveQuarter();
    }

    @Override
    public StatisticalResult countRetrospectiveYear() {
        return salesmanInstrumentDao.countRetrospectiveYear();
    }

    @Override
    public CusSalesTarget reviewPerformancePlan() {
        return salesmanInstrumentDao.reviewPerformancePlan();
    }
}

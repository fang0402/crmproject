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
    public StatisticalResult countSaleForecasting1(Integer userId) {
        return salesmanInstrumentDao.countSaleForecasting1(userId);
    }

    @Override
    public StatisticalResult countSaleForecasting2(Integer userId) {
        return salesmanInstrumentDao.countSaleForecasting2(userId);
    }

    @Override
    public StatisticalResult countSaleForecasting3(Integer userId) {
        return salesmanInstrumentDao.countSaleForecasting3(userId);
    }

    @Override
    public StatisticalResult countSaleForecasting4(Integer userId) {
        return salesmanInstrumentDao.countSaleForecasting4(userId);
    }

    @Override
    public StatisticalResult countSaleForecasting5(Integer userId) {
        return salesmanInstrumentDao.countSaleForecasting5(userId);
    }

    @Override
    public StatisticalResult countSaleForecasting6(Integer userId) {
        return salesmanInstrumentDao.countSaleForecasting6(userId);
    }

    @Override
    public StatisticalResult countRetrospectiveMonth(Integer userId) {
        return salesmanInstrumentDao.countRetrospectiveMonth(userId);
    }

    @Override
    public StatisticalResult countRetrospectiveQuarter(Integer userId) {
        return salesmanInstrumentDao.countRetrospectiveQuarter(userId);
    }

    @Override
    public StatisticalResult countRetrospectiveYear(Integer userId) {
        return salesmanInstrumentDao.countRetrospectiveYear(userId);
    }

    @Override
    public CusSalesTarget reviewPerformancePlan(Integer userId) {
        return salesmanInstrumentDao.reviewPerformancePlan(userId);
    }
}

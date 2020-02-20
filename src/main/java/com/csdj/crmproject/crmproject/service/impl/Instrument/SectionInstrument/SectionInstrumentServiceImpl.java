package com.csdj.crmproject.crmproject.service.impl.Instrument.SectionInstrument;

import com.csdj.crmproject.crmproject.dao.Instrument.SectionInstrument.SectionInstrumentMapper;
import com.csdj.crmproject.crmproject.entity.Department;
import com.csdj.crmproject.crmproject.entity.salesmanagement.StatisticalResult;
import com.csdj.crmproject.crmproject.service.Instrument.SectionInstrument.SectionInstrumentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Author 刘时钟
 * @Date 2020/2/10
 * @Version 1.0
 */
@Service
public class SectionInstrumentServiceImpl implements SectionInstrumentService {
    @Resource
    private SectionInstrumentMapper objMapp;

    @Override
    public List<Department> listDepartmentService() {
        return objMapp.listDepartment();
    }

    @Override
    public StatisticalResult countReceivableMonthService(Integer dip) {
        return objMapp.countReceivableMonth(dip);
    }

    @Override
    public StatisticalResult countReceivableQuarterService(Integer dip) {
        return objMapp.countReceivableQuarter(dip);
    }

    @Override
    public StatisticalResult countReceivableYearService(Integer dip) {
        return objMapp.countReceivableYear(dip);
    }

    @Override
    public Map<String, Object> avgReceivableMonthService(Integer dip) {
        return objMapp.avgReceivableMonth(dip);
    }

    @Override
    public Map<String, Object> avgReceivableMonthOKService(Integer dip) {
        return objMapp.avgReceivableMonthOK(dip);
    }
}


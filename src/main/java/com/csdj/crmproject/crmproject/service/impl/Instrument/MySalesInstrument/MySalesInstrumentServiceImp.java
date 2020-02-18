package com.csdj.crmproject.crmproject.service.impl.Instrument.MySalesInstrument;

import com.csdj.crmproject.crmproject.dao.Instrument.MySalesInstrument.MySalesInstrumentMapper;
import com.csdj.crmproject.crmproject.entity.CusSalesTarget;
import com.csdj.crmproject.crmproject.service.Instrument.MySalesInstrument.MySalesInstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("mySalesInstrumentService")
public class MySalesInstrumentServiceImp implements MySalesInstrumentService {
    @Autowired
    private MySalesInstrumentMapper mySalesInstrumentMapperl;

    @Override
    public CusSalesTarget getOrder(String userId,String year) {
        return mySalesInstrumentMapperl.getOrder(userId,year);
    }

    @Override
    public Map<Object, String> dianasOrder(String userId) {
        return mySalesInstrumentMapperl.dianasOrder(userId);
    }

    @Override
    public Map<Object, String> seasonOrder(String userId) {
        return mySalesInstrumentMapperl.seasonOrder(userId);
    }

    @Override
    public Map<Object, String> yearOrder(String userId) {
        return mySalesInstrumentMapperl.yearOrder(userId);
    }

    @Override
    public Map<Object, String> contract(String userId) {
        return mySalesInstrumentMapperl.contract(userId);
    }

    @Override
    public Map<Object, String> dianasContract(String userId) {
        return mySalesInstrumentMapperl.dianasContract(userId);
    }

    @Override
    public Map<Object, String> order(String userId) {
        return mySalesInstrumentMapperl.order(userId);
    }

    @Override
    public Map<Object, String> seasonContract(String userId) {
        return mySalesInstrumentMapperl.seasonContract(userId);
    }

    @Override
    public Map<Object, String> yearContract(String userId) {
        return mySalesInstrumentMapperl.yearContract(userId);
    }

    @Override
    public Double dianasOrReceiPlan(String userId) {
        return mySalesInstrumentMapperl.dianasOrReceiPlan(userId);
    }

    @Override
    public Double dianasRecei_plan(String userId) {
        return mySalesInstrumentMapperl.dianasRecei_plan(userId);
    }

    @Override
    public Double seasonOrReceiPlan(String userId) {
        return mySalesInstrumentMapperl.seasonOrReceiPlan(userId);
    }

    @Override
    public Double seasonRecei_plan(String userId) {
        return mySalesInstrumentMapperl.seasonRecei_plan(userId);
    }

    @Override
    public Double yearOrReceiPlan(String userId) {
        return mySalesInstrumentMapperl.yearOrReceiPlan(userId);
    }

    @Override
    public Double yearRecei_plan(String userId) {
        return mySalesInstrumentMapperl.yearRecei_plan(userId);
    }

    @Override
    public Map<String, Double> yearAccomplish(String userId) {
        return mySalesInstrumentMapperl.yearAccomplish(userId);
    }

    @Override
    public Map<String, Double> yearAnswerAccomplish(String userId) {
        return mySalesInstrumentMapperl.yearAnswerAccomplish(userId);
    }
}

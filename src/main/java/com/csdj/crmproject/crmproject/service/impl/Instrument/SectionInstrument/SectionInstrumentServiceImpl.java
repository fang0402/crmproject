package com.csdj.crmproject.crmproject.service.impl.Instrument.SectionInstrument;

import com.csdj.crmproject.crmproject.dao.Instrument.SectionInstrument.SectionInstrumentMapper;
import com.csdj.crmproject.crmproject.service.Instrument.SectionInstrument.SectionInstrumentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
 * @Author 刘时钟
 * @Date 2020/2/10
 * @Version 1.0
 */
@Service
public class SectionInstrumentServiceImpl implements SectionInstrumentService {
    @Resource
    private SectionInstrumentMapper objMapp;
}

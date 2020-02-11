package com.csdj.crmproject.crmproject.controller.Instrument.SectionInstrument;

import com.csdj.crmproject.crmproject.service.Instrument.SectionInstrument.SectionInstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sound.midi.Instrument;

/**
 * @ClassName SectionInstrumentController
 * @Description: SectionInstrumentController
 * @Author 刘时钟
 * @Date 2020/2/10
 * @Version V1.0
 **/
@Controller
public class SectionInstrumentController {
    @Autowired
    private SectionInstrumentService service;
    @RequestMapping("/showSectionInstrument")
    public String showSectionInstrument() {
        return "/Instrument/SectionInstrument/SectionInstrument";
    }
}

package com.csdj.crmproject.crmproject.controller.Instrument.MySalesInstrument;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName MySalesInstrumentController
 * @Description: MySalesInstrumentController
 * @Author 邹捷
 * @Date 2020/2/6
 * @Version V1.0
 **/
@Controller
@RequestMapping("MySalesInstrument")
public class MySalesInstrumentController {
    @RequestMapping("selShow")
    public String selShow(){
        return "/Instrument/MySalesInstrument/MySalesInstrumentHtml";
    }
}

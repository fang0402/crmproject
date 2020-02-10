package com.csdj.crmproject.crmproject.controller.Instrument.SalesmanInstrument;

import com.csdj.crmproject.crmproject.service.Instrument.SalesmanInstrument.SalesmanInstrumentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @ClassName SalesmanInstrumentController
 * @Description: 销售仪表盘控制层
 * @Author 唐浪
 * @Date 2019/2/6
 * @Version V1.0
 **/
@Controller
@RequestMapping("salesmanInstrument")
public class SalesmanInstrumentController {
    @Resource
    private SalesmanInstrumentService salesmanInstrumentService;

    @RequestMapping("showSalesmanInstrument")
    public String showSalesmanInstrument() {
        return "/Instrument/SalesmanInstrument/SalesmanInstrument";
    }
}

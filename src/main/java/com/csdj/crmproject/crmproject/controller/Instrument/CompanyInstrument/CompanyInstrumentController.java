package com.csdj.crmproject.crmproject.controller.Instrument.CompanyInstrument;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ Description   :  公司仪表盘控制器层
 * @ Author        :  JY
 * @ CreateDate    :  2020/2/19 12:23
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2020/2/19 12:23
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@Controller
public class CompanyInstrumentController {

    @RequestMapping("/company")
    public String show(){
        return "/Instrument/CompanyInstrument/CompanyInstrumentHtml";
    }
}

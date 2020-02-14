package com.csdj.crmproject.crmproject.controller.Instrument.SalesmanInstrument;

import com.csdj.crmproject.crmproject.entity.User;
import com.csdj.crmproject.crmproject.service.Instrument.SalesmanInstrument.SalesmanInstrumentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     * 展示统计页面
     * @return 页面
     */
    @RequestMapping("showSalesmanInstrument")
    public String showSalesmanInstrument() {
        return "/Instrument/SalesmanInstrument/SalesmanInstrument";
    }

    /**
     * 绑定业务员下拉列表框
     * @return Map
     */
    @RequestMapping("listUsers")
    @ResponseBody
    public Map<String, Object> listUsers() {
        List<User> list = salesmanInstrumentService.listUsers();
        Map<String,Object> map = new HashMap<>(0);
        map.put("data",list);
        return map;
    }
}

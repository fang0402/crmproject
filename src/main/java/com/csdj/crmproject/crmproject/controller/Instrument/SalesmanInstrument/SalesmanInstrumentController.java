package com.csdj.crmproject.crmproject.controller.Instrument.SalesmanInstrument;

import com.csdj.crmproject.crmproject.entity.User;
import com.csdj.crmproject.crmproject.service.Instrument.SalesmanInstrument.SalesmanInstrumentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
     *
     * @return 页面
     */
    @RequestMapping("showSalesmanInstrument")
    public String showSalesmanInstrument() {
        return "/Instrument/SalesmanInstrument/SalesmanInstrument";
    }

    /**
     * 绑定业务员下拉列表框
     *
     * @return Map
     */
    @GetMapping("listUsers")
    @ResponseBody
    public Map<String, Object> listUsers() {
        List<User> list = salesmanInstrumentService.listUsers();
        Map<String, Object> map = new HashMap<>(0);
        map.put("data", list);
        return map;
    }

    /**
     * 返回统计的数据源
     *
     * @return Map
     */
    @PostMapping("staticResult")
    @ResponseBody
    public Map<String, Object> staticResult(@RequestParam(value = "userId", required = false) Integer userId,
                                            @RequestParam(value = "hood", required = false) String hood) {
        Map<String, Object> map = new HashMap<>(0);
        //销售预测数据源
        map.put("saleForecasting1", salesmanInstrumentService.countSaleForecasting1(userId));
        map.put("saleForecasting2", salesmanInstrumentService.countSaleForecasting2(userId));
        map.put("saleForecasting3", salesmanInstrumentService.countSaleForecasting3(userId));
        map.put("saleForecasting4", salesmanInstrumentService.countSaleForecasting4(userId));
        map.put("saleForecasting5", salesmanInstrumentService.countSaleForecasting5(userId));
        map.put("saleForecasting6", salesmanInstrumentService.countSaleForecasting6(userId));

        return map;
    }
}

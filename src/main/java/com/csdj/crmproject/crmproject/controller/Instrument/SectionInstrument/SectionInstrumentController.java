package com.csdj.crmproject.crmproject.controller.Instrument.SectionInstrument;

import com.csdj.crmproject.crmproject.entity.Department;
import com.csdj.crmproject.crmproject.entity.salesmanagement.StatisticalResult;
import com.csdj.crmproject.crmproject.service.Instrument.SectionInstrument.SectionInstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sound.midi.Instrument;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     * 展示部门销售统计页面
     * @return 销售统计页面路径
     */
    @RequestMapping("/showSectionInstrument")
    public String showSectionInstrument() {
        return "/Instrument/SectionInstrument/SectionInstrument";
    }
    /**
     * 绑定部门下拉列表框
     * @return Map集合
     */
    @RequestMapping("/listDepartment")
    @ResponseBody
    public Map<String, Object> listDepartment() {
        List<Department> list = service.listDepartmentService();
        Map<String,Object> map = new HashMap<>(0);
        map.put("data",list);
        return map;
    }
    /**
     * 本月回款业绩完成值
     * @return Map集合
     */
    @RequestMapping("/countReceivableMonth")
    @ResponseBody
    public Map<String, Object> countReceivableMonth(@RequestParam(value = "dip", defaultValue = "0") Integer dip) {
        StatisticalResult count = service.countReceivableMonthService(dip);
        Map<String,Object> map = new HashMap<>(0);
        map.put("data",count);
        return map;
    }
    /**
     * 本季回款业绩完成值
     * @return Map集合
     */
    @RequestMapping("/countReceivableQuarter")
    @ResponseBody
    public Map<String, Object> countReceivableQuarter(@RequestParam(value = "dip", defaultValue = "0") Integer dip) {
        StatisticalResult count = service.countReceivableQuarterService(dip);
        Map<String,Object> map = new HashMap<>(0);
        map.put("data",count);
        return map;
    }
    /**
     * 本年回款业绩完成值
     * @return Map集合
     */
    @RequestMapping("/countReceivableYear")
    @ResponseBody
    public Map<String, Object> countReceivableYear(@RequestParam(value = "dip", defaultValue = "0") Integer dip) {
        StatisticalResult count = service.countReceivableYearService(dip);
        Map<String,Object> map = new HashMap<>(0);
        map.put("data",count);
        return map;
    }
    /**
     * 月度回款额统计图
     * @return Map集合
     */
    @RequestMapping("/avgReceivableMonth")
    @ResponseBody
    public Map<String, Object> avgReceivableMonth(@RequestParam(value = "dip", defaultValue = "0") Integer dip) {
        Map<String,Object> count = service.avgReceivableMonthService(dip);
        Map<String,Object> count1=service.avgReceivableMonthOKService(dip);
        Map<String,Object> map = new HashMap<>(0);
        map.put("data",count);
        map.put("data1",count1);
        return map;
    }
}

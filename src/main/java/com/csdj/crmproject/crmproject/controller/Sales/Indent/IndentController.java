package com.csdj.crmproject.crmproject.controller.Sales.Indent;

import com.alibaba.fastjson.JSON;
import com.csdj.crmproject.crmproject.entity.Order;
import com.csdj.crmproject.crmproject.service.Sales.Indent.IndentService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
/**
 * 订单管理Controller
 * @author 谭芝豪
 */
@Controller
public class IndentController {
    @Resource
    private IndentService indentService;
    @RequestMapping("order_manage.html")
    public String OrderManage(){
        return "sales/Indent/order_manage";
    }

    @RequestMapping("find_order.htmls")
    @ResponseBody
    public String findOrder(@RequestParam(value = "page", required = false, defaultValue = "1") int pageNum,
                            @RequestParam(value = "limit", required = false, defaultValue = "8") int pageSize){
        PageInfo<Order> pageInfo=indentService.findOrder(pageNum, pageSize);
        String jsonString = JSON.toJSONString(pageInfo.getList());
        System.out.println(jsonString);
        String layuiJson = "{\"code\":0,\"msg\":\"\",\"count\":" + 1 + ",\"data\":" + jsonString + "}";// 转换成layui数据表格的值格式
        return layuiJson;
    }
}

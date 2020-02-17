package com.csdj.crmproject.crmproject.controller.Sales.Indent;

import com.alibaba.fastjson.JSON;
import com.csdj.crmproject.crmproject.entity.salesmanagement.Order;
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
    @RequestMapping("add_order.html")
    public String addOrderHtml(){
        return "sales/Indent/add_order";
    }

    /**
     * 查询订单信息
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("find_order.htmls")
    @ResponseBody
    public String findOrder(@RequestParam(value = "page", required = false, defaultValue = "1") int pageNum,
                            @RequestParam(value = "limit", required = false, defaultValue = "4") int pageSize,
                            @RequestParam(value ="orderApprovalStatus",required = false) String orderApprovalStatus){
        PageInfo<Order> pageInfo=indentService.findOrder(pageNum, pageSize,orderApprovalStatus);
        String jsonString = JSON.toJSONString(pageInfo.getList());
        int count=indentService.orderCount(orderApprovalStatus);
        String layuiJson = "{\"code\":0,\"msg\":\"\",\"count\":" + count + ",\"data\":" + jsonString + "}";// 转换成layui数据表格的值格式
        return layuiJson;
    }

    /**
     * 添加订单信息
     * @param order
     * @return 受影响的行数
     */
    @RequestMapping("add_order_htmls")
    @ResponseBody
    public int addOrder(Order order){
        int i=indentService.addOrder(order);
        return i;
    }
}

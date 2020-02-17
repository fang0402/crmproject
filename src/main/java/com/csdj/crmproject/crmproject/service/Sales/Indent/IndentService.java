package com.csdj.crmproject.crmproject.service.Sales.Indent;

import com.csdj.crmproject.crmproject.entity.salesmanagement.Order;
import com.github.pagehelper.PageInfo;

/**
 * 订单管理
 * @author 谭芝豪
 */
public interface IndentService {
    /**
     * 查询订单总记录数
     * @param orderApprovalStatus
     * @return记录数
     */
    public int orderCount(String orderApprovalStatus);
    /**
     * 查询订单
     * @return PageInfo
     */
    public PageInfo<Order> findOrder(int page, int limit,String orderApprovalStatus);
    /**
     * 添加订单
     * @return
     */
    public int addOrder(Order order);
}

package com.csdj.crmproject.crmproject.service.Sales.Indent;

import com.csdj.crmproject.crmproject.entity.Order;
import com.github.pagehelper.PageInfo;

/**
 * 订单管理
 * @author 谭芝豪
 */
public interface IndentService {
    /**
     * 查询订单
     * @return
     */
    public PageInfo<Order> findOrder(int page, int limit);
}

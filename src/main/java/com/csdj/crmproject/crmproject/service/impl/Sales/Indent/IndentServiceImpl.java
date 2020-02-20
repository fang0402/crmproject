package com.csdj.crmproject.crmproject.service.impl.Sales.Indent;

import com.csdj.crmproject.crmproject.dao.Sales.Indent.IndentDao;
import com.csdj.crmproject.crmproject.entity.salesmanagement.Order;
import com.csdj.crmproject.crmproject.service.Sales.Indent.IndentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单管理
 * @author 谭芝豪
 */
@Service
public class IndentServiceImpl implements IndentService {
    @Resource
    private IndentDao indentDao;

    @Override
    public int orderCount(String orderApprovalStatus) {
        return indentDao.orderCount(orderApprovalStatus);
    }

    @Override
    public PageInfo<Order> findOrder(int pageNum, int pageSize,String orderApprovalStatus) {
        PageHelper.startPage(pageNum, pageSize);
        List<Order> list=indentDao.findOrder(orderApprovalStatus);
        PageInfo<Order> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Order findGetOrderId(long orderId) {
        return indentDao.findGetOrderId(orderId);
    }

    @Override
    public int addOrder(Order order) {
        return indentDao.addOrder(order);
    }

    @Override
    public int updateOrder(Order order) {
        return indentDao.updateOrder(order);
    }

    @Override
    public int deleteOrder(int[] array) {
        return indentDao.deleteOrder(array);
    }
}

package com.csdj.crmproject.crmproject.dao.Sales.Indent;
import com.csdj.crmproject.crmproject.entity.salesmanagement.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * 订单管理
 * @author 谭芝豪
 */
@Mapper
public interface IndentDao {
    /**
     * 查询订单总记录数
     * @param orderApprovalStatus 审批状态
     * @return记录数
     */
    public int orderCount(@Param(value = "orderApprovalStatus") String orderApprovalStatus);
    /**
     * 查询订单
     * @return List
     */
    public List<Order> findOrder(@Param(value = "orderApprovalStatus") String orderApprovalStatus);

    /**
     * 添加订单
     * @return
     */
    public int addOrder(Order order);
}

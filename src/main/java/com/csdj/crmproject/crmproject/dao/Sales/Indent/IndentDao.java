package com.csdj.crmproject.crmproject.dao.Sales.Indent;

import com.csdj.crmproject.crmproject.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
 * 订单管理
 * @author 谭芝豪
 */
@Mapper
public interface IndentDao {
    /**
     * 查询订单
     * @return
     */
    public List<Order> findOrder();
}

package com.csdj.crmproject.crmproject.service.impl.Sales.Indent;

import com.csdj.crmproject.crmproject.dao.Sales.Indent.IndentDao;
import com.csdj.crmproject.crmproject.entity.Order;
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
    public PageInfo<Order> findOrder(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Order> list=indentDao.findOrder();
        PageInfo<Order> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }
}

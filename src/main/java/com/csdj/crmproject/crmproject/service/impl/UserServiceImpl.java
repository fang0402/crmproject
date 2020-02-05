package com.csdj.crmproject.crmproject.service.impl;

import com.csdj.crmproject.crmproject.dao.UserMapper;
import com.csdj.crmproject.crmproject.entity.User;
import com.csdj.crmproject.crmproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @BelongsProject: crmproject
 * @BelongsPackage: com.csdj.crmproject.crmproject.service.impl
 * @Author: admin
 * @CreateTime: 2020-02-05 16:13
 * @Description:
 */
@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String userName) {
        return userMapper.login(userName);
    }

    @Override
    public Set<String> selectRole(String userName) {
        return userMapper.selectRole(userName);
    }
}

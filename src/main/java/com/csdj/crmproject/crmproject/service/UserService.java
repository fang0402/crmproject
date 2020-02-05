package com.csdj.crmproject.crmproject.service;

import com.csdj.crmproject.crmproject.entity.User;

import java.util.Set;

/**
 * @BelongsProject: crmproject
 * @BelongsPackage: com.csdj.crmproject.crmproject.service
 * @Author: admin
 * @CreateTime: 2020-02-05 16:11
 * @Description:
 */
public interface UserService {
    User login(String userName);
    Set<String> selectRole(String userName);
}

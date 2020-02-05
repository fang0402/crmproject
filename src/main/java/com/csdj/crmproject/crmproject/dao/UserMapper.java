package com.csdj.crmproject.crmproject.dao;

import com.csdj.crmproject.crmproject.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * @BelongsProject: crmproject
 * @BelongsPackage: com.csdj.crmproject.crmproject.dao
 * @Author: admin
 * @CreateTime: 2020-02-05 16:09
 * @Description:
 */
@Repository
public interface UserMapper {
    User login(String userName);
    Set<String> selectRole(String userName);
}

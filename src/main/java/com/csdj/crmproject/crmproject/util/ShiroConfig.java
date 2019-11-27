package com.csdj.crmproject.crmproject.util;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import com.csdj.activiti.activiti.entity.Resource;
import com.csdj.activiti.activiti.service.UserManagerService;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: shiro_boot
 * @BelongsPackage: com.csdj.shiro_boot.shiro_boot.util
 * @Author: aida
 * @CreateTime: 2019-11-02 11:37
 * @Description: spring boot整合shiro的配置类
 */
@Configuration
public class ShiroConfig {
    @Autowired
    private UserManagerService userManagerService;

    @Bean
    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        advisorAutoProxyCreator.setProxyTargetClass(true);
        return advisorAutoProxyCreator;
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor() {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(getDefaultWebSecurityManager(getRealm()));
        return authorizationAttributeSourceAdvisor;
    }

    /**
     * 创建ShiroFilterFactoryBean
     */
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        //设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        Map<String, String> filterMap = new LinkedHashMap<String, String>();
        List<Resource> list = userManagerService.seResource();
        System.out.println(list.toString());
        for (Resource item : list) {
            filterMap.put(item.getKey(), item.getVal());
        }
        //修改调整的登录页面
        shiroFilterFactoryBean.setLoginUrl("/skipLogin");
        //设置未授权提示页面
        shiroFilterFactoryBean.setUnauthorizedUrl("/noAuth");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
        return shiroFilterFactoryBean;
    }

    /**
     * 创建DefaultWebSecurityManager
     */
    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("shiroRealm") ShiroRealm shiroRealm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //关联realm
        securityManager.setRealm(shiroRealm);
        return securityManager;
    }

    /**
     * 创建Realm
     */
    @Bean(name = "shiroRealm")
    public ShiroRealm getRealm() {
        return new ShiroRealm();
    }

    /**
     * 配置ShiroDialect，用于thymeleaf和shiro标签配合使用
     */
    @Bean
    public ShiroDialect getShiroDialect() {
        return new ShiroDialect();
    }
}

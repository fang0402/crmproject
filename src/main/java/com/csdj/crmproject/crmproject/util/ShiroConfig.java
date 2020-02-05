package com.csdj.crmproject.crmproject.util;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import com.csdj.crmproject.crmproject.util.redis.RedisCacheManager;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

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
        //1
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
     *  创建Realm  身份认证
     */
    @Bean(name = "ShiroRealm")
    public ShiroRealm getReal() {
        ShiroRealm userRealm = new ShiroRealm();
        System.out.println("userRealm 注入成功");
        //// 使用redis缓存器
        userRealm.setCacheManager(shiroRedisCacheManager());
        return userRealm;
    }

    /**
     * 创建DefaultWebSecurityManager
     */
    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("ShiroRealm") ShiroRealm shiroRealm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //关联realm
        securityManager.setRealm(shiroRealm);
        return securityManager;
    }
    /**
     * 配置Shiro生命周期处理器
     *
     * @return
     */
    @Bean(name = "lifecycleBeanPostProcessor")
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    /**
     * 配置ShiroDialect，用于thymeleaf和shiro标签配合使用
     */
    @Bean
    public ShiroDialect getShiroDialect() {
        return new ShiroDialect();
    }


    /**
     * 开启shiro 注解模式
     * 可以在controller中的方法前加上注解
     * 如 @RequiresPermissions("userInfo:add")
     *
     * @param securityManager
     * @return
     */
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(@Qualifier("securityManager") DefaultWebSecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }

    /**
     * 解决： 无权限页面不跳转 shiroFilterFactoryBean.setUnauthorizedUrl("/unauthorized") 无效
     * shiro的源代码ShiroFilterFactoryBean.Java定义的filter必须满足filter instanceof AuthorizationFilter，
     * 只有perms，roles，ssl，rest，port才是属于AuthorizationFilter，而anon，authcBasic，auchc，user是AuthenticationFilter，
     * 所以unauthorizedUrl设置后页面不跳转 Shiro注解模式下，登录失败与没有权限都是通过抛出异常。
     * 并且默认并没有去处理或者捕获这些异常。在SpringMVC下需要配置捕获相应异常来通知用户信息
     *
     * @return
     */
    @Bean
    public SimpleMappingExceptionResolver simpleMappingExceptionResolver() {
        SimpleMappingExceptionResolver simpleMappingExceptionResolver = new SimpleMappingExceptionResolver();
        Properties properties = new Properties();
        /*
          (授权只能在成功的认证之后执行，因为授权数据（角色、权限等）必须总是与已知的标识相关联。这样的已知身份只能在成功登录时获得。)
         */
        //这里的 /unauthorized 是页面，不是访问的路径
        //抛出以指示请求的操作或对请求的资源的访问是不允许的。
        properties.setProperty("org.apache.shiro.authz.UnauthorizedException", "/noAuth");
        //当尚未完成成功认证时，尝试执行授权操作时引发异常。
        properties.setProperty("org.apache.shiro.authz.UnauthenticatedException", "/noAuth");
        simpleMappingExceptionResolver.setExceptionMappings(properties);
        return simpleMappingExceptionResolver;
    }

    /**
     * redis缓存方案
     *
     * @return
     */
    @Bean
    public CacheManager shiroRedisCacheManager() {
        System.out.println("redis缓存方案");
        return new RedisCacheManager();
    }
}

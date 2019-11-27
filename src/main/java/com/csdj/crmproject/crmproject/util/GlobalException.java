package com.csdj.crmproject.crmproject.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

/**
 * @BelongsProject: shiro_boot
 * @BelongsPackage: com.csdj.shiro_boot.shiro_boot.util
 * @Author: aida
 * @CreateTime: 2019-11-03 22:24
 * @Description: 全局异常处理，如有异常请自行定义
 */
@Configuration
public class GlobalException {
    @Bean
    public SimpleMappingExceptionResolver
    getSimpleMappingExceptionResolver() {
        SimpleMappingExceptionResolver resolver = new
                SimpleMappingExceptionResolver();
        Properties mappings = new Properties();
/**
 * 参数一：异常的类型，注意必须是异常类型的全名
 * 参数二：视图名称
 */
        mappings.put("org.apache.shiro.authz.UnauthorizedException", "error");
//设置异常与视图映射信息的
        resolver.setExceptionMappings(mappings);
        return resolver;
    }
}

package com.csdj.crmproject.crmproject.util;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * @ClassName ErrorConfigurar
 * @Description 定义配置类404
 * @Author 孤街
 * @Date 2020/1/21 10:26
 * @Version 1.0
 **/
@Configuration
public class ErrorConfigurar implements ErrorPageRegistrar {
    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        ErrorPage[] errorPages = new ErrorPage[2];
        errorPages[0] = new ErrorPage(HttpStatus.NOT_FOUND, "/skip404");
        errorPages[1] = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");

        registry.addErrorPages(errorPages);
    }
}

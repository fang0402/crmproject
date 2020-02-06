package com.csdj.crmproject.crmproject.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @BelongsProject: crmproject
 * @BelongsPackage: com.csdj.crmproject.crmproject.controller
 * @Author: admin
 * @CreateTime: 2020-02-05 14:53
 * @Description: 用户管理
 */
@Controller
public class UserController {

    @RequestMapping("/skipLogin")
    public String skipLogin(){
        return "login";
    }

    /*@RequestMapping("/skip")
    public String skip(){
        return "fenp";
    }*/

    @RequestMapping("/skip404")
    public String skip404(){
        return "404";
    }

    @RequestMapping("/skipMain")
    public String skipMain(){
        return "index";
    }

    /**
     * 登录逻辑处理
     */
    @RequestMapping("/login")
    @ResponseBody
    public String login(String name, String password) {
        /**
         * 使用Shiro编写认证操作
         */
        //1.获取Subject
        Subject subject = SecurityUtils.getSubject();
        //2.封装用户数据
        UsernamePasswordToken token = new UsernamePasswordToken(name, password);
        //3.执行登录方法
        try {
            subject.login(token);
            //登录成功
            return "1";
        } catch (UnknownAccountException e) {
            //e.printStackTrace();
            //登录失败:用户名不存在
            return "0";
        } catch (IncorrectCredentialsException e) {
            //e.printStackTrace();
            //登录失败:密码错误
            return "0";
        }
    }
}

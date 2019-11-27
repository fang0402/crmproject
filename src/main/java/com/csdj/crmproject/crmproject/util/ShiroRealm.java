package com.csdj.crmproject.crmproject.util;

import com.csdj.activiti.activiti.entity.User;
import com.csdj.activiti.activiti.service.UserManagerService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

/**
 * @BelongsProject: airx
 * @BelongsPackage: com.csdj.util
 * @Author: aida
 * @CreateTime: 2019-10-30 19:00
 * @Description: autnen
 */
public class ShiroRealm extends AuthorizingRealm {
    @Autowired
    private UserManagerService UserManagerService;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //1.从principalcollection中来获取登录用户的信息
        User principal = (User) principalCollection.getPrimaryPrincipal();
        //2.利用登录的用户的信息来用户当前用户的角色或权限(可能需更查询数据库)
        Set<String> roles = new HashSet<>();
        roles = UserManagerService.seRoles(String.valueOf(principal.getUserName()));
        //3.创建simpleAuthorizationInto,并设置其reles属性。
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roles);
        //4.返回simpleAuthorizationInfo对象，
        return info;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //1.把Authenticationtoken转换为UsernamePasswordToken
        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        //2.从UsernamePasswordToken中来获取username
        String username = upToken.getUsername();
        //3.调用数据库的方法，从数据库中查询username对应的用户记录
        User user = UserManagerService.login(username);
        //4.着用户不存在， 则可以抛出 UnknownAccountException异常
        if (user == null) {
            throw new UnknownAccountException("用户不存在!");
        }
        //5.根据用户信息的情况，决定是否需要找出其他的Authenticat ionException异常。
        /*if("monster".equals(username)){
            throw new LockedAccountException("用户被锁定");
        }*/
        //6.根据用户的情况，来构建AuthenticationInfo对象并返回，通常使用的实现类为: simpleAuthenticationInfo
        //以下信息是从数据库中获职的。
        //1). principal:认证的实体信息。 可以是 username,也可以是 数据表对应的用户的实体类对象。
        User principal = user;
        //2)，credentials;密码，从数据库获取。
        String credentials = user.getPassword();
        //3)。 realmName: 当前realm 对象的name. 调用父类的getName () 方法即可
        String realmName = getName();
        //SimpleAuthenticationInfo info =new SimpleAuthenticationInfo(principal, credentials, realmName);
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal, credentials, realmName);
        return info;
    }
}

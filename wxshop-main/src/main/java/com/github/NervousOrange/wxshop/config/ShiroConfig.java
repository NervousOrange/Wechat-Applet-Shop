package com.github.NervousOrange.wxshop.config;

import com.github.NervousOrange.wxshop.service.ShiroRealm;
import com.github.NervousOrange.wxshop.service.UserService;
import com.github.NervousOrange.wxshop.service.VerificationCheckService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.cache.MemoryConstrainedCacheManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.Filter;
import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig implements WebMvcConfigurer {
    @Autowired
    private UserService userService;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor(userService));
    }

    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager, ShiroLoginFilter shiroLoginFilter) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        Map<String, Filter> filterMap = shiroFilterFactoryBean.getFilters();
        filterMap.put("shiroLoginFilter", shiroLoginFilter);
        shiroFilterFactoryBean.setFilters(filterMap);

        Map<String, String> pattern = new LinkedHashMap<>();
        // 登录和获取验证码的接口，可以匿名访问，不设置过滤器
        // 这边需要使用 LinkedHashMap，才能在接口路径匹配时按顺序进行
        pattern.put("/api/v1/logout", "anon");
        pattern.put("/api/v1/login", "anon");
        pattern.put("/api/v1/code", "anon");
        pattern.put("/api/v1/status", "anon");
        pattern.put("/api/v1/**", "authc");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(pattern);
        return shiroFilterFactoryBean;
    }

    @Bean
    public SecurityManager securityManager(ShiroRealm shiroRealm) {
        // WebSecurityManager 提供 cookie 和 session 支持
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(shiroRealm);
        // TODO：内存受限的缓存，未来换成 redis
        securityManager.setCacheManager(new MemoryConstrainedCacheManager());
        securityManager.setSessionManager(new DefaultWebSessionManager());
        SecurityUtils.setSecurityManager(securityManager);
        return securityManager;
    }

    @Bean
    public ShiroRealm shiroRealm(VerificationCheckService verificationCheckService) {
        return new ShiroRealm(verificationCheckService);
    }
}

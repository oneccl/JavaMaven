package com.cc.day1118.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/8
 * Time: 19:37
 * Description:
 */

// 配置加载拦截器
@Configuration
public class InterceptorSupportConf extends WebMvcConfigurationSupport {

    // 注入拦截器类Bean
    @Autowired
    private ControllerInterceptor controllerInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        // 配置多拦截器
        registry.addInterceptor(controllerInterceptor)
                .addPathPatterns("/UserController","/UserController/*");
    }

}

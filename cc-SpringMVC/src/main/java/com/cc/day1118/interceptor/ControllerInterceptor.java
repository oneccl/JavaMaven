package com.cc.day1118.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/8
 * Time: 19:28
 * Description:
 */

// 定义拦截器类，实现HandlerInterceptor接口

// 该类必须受Spring容器控制
@Component
public class ControllerInterceptor implements HandlerInterceptor {

    // 前置增强：原方法调用之前执行的增强内容
    // 返回值：true：放行 false：不允许访问
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("执行前增强的内容!");
        return true;
    }

    // 后置增强：原方法调用后执行的增强内容
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("执行后增强的内容!（出现异常不会执行!）");
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("执行后增强的内容!（即使出现异常也执行!）");
    }

}

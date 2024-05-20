package com.cc.day1118.interceptor;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/8
 * Time: 19:23
 * Description:
 */
public class DemoInterceptor {
    // 拦截器 Interceptor

    // 是一种动态拦截方法调用的机制，在SpringMVC中动态拦截控制器方法的执行
    // 作用：增强，核心原理：AOP思想
    // 1）在指定的方法调用前后执行预先设定的代码
    // 2）阻止原始方法的执行

    // 拦截器(Interceptor) 与 过滤器(Filter) 区别
    /*
    1、归属不同：Filter属于Servlet技术，Interceptor属于SpringMVC技术
    2、拦截内容不同：Filter对所有访问进行增强，Interceptor仅针对SpringMVC的访问进行增强
    */

    // 使用：
    // 1)定义拦截器类ControllerInterceptor.java，实现HandlerInterceptor接口
    // 2)配置加载拦截器: InterceptorSupportConf.java类

}

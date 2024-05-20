package com.cc.day1118;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/18
 * Time: 15:23
 * Description:
 */
@Controller
public class SpringMVC {
    // SpringMVC框架

    // 软件开发架构：C/S(客户端/服务器)架构 和 B/S(浏览器/服务器)架构
    // 三层架构
    /*
    1.表现层：controller
    2.业务层：service
    3.持久层：dao
     */
    // MVC模型
    /*
    MVC：Model View Controller 模型视图控制器
    Model：数据模型，用于数据封装
    View：静态页面，用于展示
    Controller：用于处理请求并响应
     */
    // Struts2 和 SpringMVC 区别
    /*
    1.共同点：都是属于表现层框架，都是基于MVC模型，底层都是Servlet-API
      处理请求的核心机制都是Servlet
    2.不同点：
      1）SpringMVC入口是Servlet；Struts2入口是Filter
      2）SpringMVC是基于方法设计；Struts2是基于类设计
      3）SpringMVC能够处理Ajax请求；Struts2是基于OGNL表达式开发
        效率高于SpringMVC，但没有SpringMVC灵活便捷
     */

    // 入门案例(index.jsp页面)

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("入门程序执行啦!");
        return "success";
    }

    // SpringMVC框架的请求响应原理(流程)
    /*
    1.前台请求(Request)后台，到前端控制器(DispatcherServlet)
    2.前端控制器请求处理器，处理器映射器(HandlerMapping)映射到对应资源名(方法)
      并返回给前端控制器一个执行链(Handler/Controller中hello()方法)
    3.前端控制器请求适配器，处理器适配器(HandlerAdapter)执行Handler(Controller)
      并返回给处理器适配器一个ModelAndView(success.jsp)，适配器将ModelAndView
      返回给前端控制器
    4.前端控制器请求视图解析器(ViewResolver)，视图解析器返回给前端控制器一个View
    5.前端控制器调用静态页面(如jsp)对View渲染，将模型数据填充到Request域中
      并响应(Response)给前台
     */
    // 名词解释
    /*
    1.前端控制器(DispatcherServlet)：控制中心，调用其它组件处理请求
    2.处理器映射器(HandlerMapping)：根据请求URL映射找到Handler处理器(Controller方法)
    3.处理器(Handler)：处理请求的具体业务逻辑(资源方法)
    4.处理器适配器(HandlerAdapter)：执行对应Handler(资源方法)，匹配应用
    5.视图解析器(ViewResolver)：解析到匹配的静态页面，渲染生成View视图
     */
    // SpringMVC三大组件
    // 1）处理器映射器(HandlerMapping)
    // 2）处理器适配器(HandlerAdapter)
    // 3）视图解析器(ViewResolver)

}

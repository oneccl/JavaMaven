package com.cc.day1118.controller;

import com.cc.day1118.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/19
 * Time: 14:38
 * Description:
 */
@Controller
@RequestMapping(value = "/UserController",method = RequestMethod.POST)
public class UserController {

    // 参数绑定2：绑定集合(List,Set,Map)类型

    // 添加用户
    @RequestMapping("/addUser")
    public String addUser(User user){
        System.out.println("添加用户："+user);
        // 返回到success.jsp页面
        return "success";
    }

    // @RequestBody注解
    /*
    作用：用来接收Ajax请求传递的Json格式的字符串数据的
    使用：
    1）使用@RequestBody接收数据时，由于是Ajax的Json格式请求
       所以前台只能使用post方式提交数据，get方式没有请求体
    2）前台在传递参数之前，需要对Json对象使用JSON.stringify()方法
       将一个JS值(对象或数组)转换为一个Json格式的字符串
    3）@RequestBody处理的参数类型contentType为：application/json或application/xml
       Ajax默认发送的参数类型contentType为：application/x-www-form-urlcoded
     */
    // @ResponseBody注解：可作用于类和方法，用于响应json格式的字符串
    @RequestMapping("/ajaxRequestBody")
    public String ajaxRequestBody(@RequestBody List<User> users) throws Exception{
        System.out.println("用户列表："+users);
        return "success";
    }

}

package com.cc.day1118.controller;

import com.cc.day1118.bean.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/18
 * Time: 16:40
 * Description:
 */
@Controller
@RequestMapping("/AccountController")
public class AccountController {

    // @RequestMapping("/资源名")注解
    // 建立请求URL与处理请求方法(资源间的映射关系)
    /*
    1.作用在类上：该资源名作为请求URL根路径(第一访问目录)
    2.作用在方法上：该资源被访问时，如果类上有资源名，需要通过类的资源名/方法资源名访问
     */
    // 部分参数：
    /*
    1）value/path：请求URL的资源名，两者作用相同
    2）method：指定必须的请求方式
    3）params：指定请求中必须包含的参数(name的值key)，多个间用逗号隔开
     */

    // SpringMVC的请求参数绑定
    /*
    1. 前台请求参数格式：默认为key=value，如IP:Port?key1=value1&...
    2. 参数绑定：将请求参数中的value值获取后转换为目标类型(Controller中方法的
    参数类型，如基本类型、pojo类型、集合类型)的过程
     */

    // 参数绑定1：绑定简单/基本类型和pojo实体类类型

    // （1）简单类型

    // 1)直接绑定
    // 2)注解绑定
    // 当请求参数(name属性的值)key和Controller方法的形参不一致时
    // 使用@RequestParam注解绑定，该注解有以下参数：
    // value：请求参数key(name属性的值)，别名映射
    // required：请求参数中是否必须提供此参数
    // defaultValue：当请求参数中没有此参数时，取默认值
    @RequestMapping("getAccIdParam")
    public String getAccIdParam(@RequestParam("id") Integer accId){
        System.out.println("账户ID："+accId);
        // 将返回值success通过配置的视图解析器解析到success.jsp视图
        return "success";
    }

    // （2）pojo实体类型
    // 前台参数(对应name属性的值作为key)必须与实体类的属性名一一对应/匹配

    // 添加账户
    // 格式：属性名.类对应属性(如user.userName)
    @RequestMapping("addAccount")
    public String addAccount(Account account){
        System.out.println("添加账户："+account);
        // 返回到success.jsp页面
        return "success";
    }

}

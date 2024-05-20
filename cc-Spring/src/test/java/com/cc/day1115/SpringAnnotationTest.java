package com.cc.day1115;

import com.cc.day1115.service.UserService;
import com.cc.springConfig.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/15
 * Time: 18:05
 * Description:
 */
public class SpringAnnotationTest {

    // Spring全注解开发
    @Test
    public void useAllAnnotationTest(){
        // 加载Spring配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // 默认获取一个以类名(第一个字母小写)为变量名的实例
        UserService userService = context.getBean(UserService.class);
        userService.serviceMethod();
    }

}

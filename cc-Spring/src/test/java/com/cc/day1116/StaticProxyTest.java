package com.cc.day1116;

import com.cc.day1116.aop.Factory;
import com.cc.day1116.aop.StaticProxy;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/17
 * Time: 13:32
 * Description:
 */
public class StaticProxyTest {

    // 使用注解实现静态代理对象(测试)

    // Spring通知注解的执行顺序(Spring5版本)
    /*
    1.程序正常执行：
      1）环绕通知前
      2）前置通知
      3）源程序
      4）后置通知
      5）最终通知
      6）环绕通知后
    2.原程序异常
      1）环绕通知前
      2）前置通知
      3）异常通知
      4）最终通知
     */
    @Test
    public void informTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("aopBeans.xml");
        Factory factory = context.getBean("factory", Factory.class);
        factory.sell(10000);
    }

}

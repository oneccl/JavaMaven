package com.cc.day1114;

import com.cc.day1114.service.Server;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/14
 * Time: 16:56
 * Description:
 */
public class ServerTest {

    //ApplicationContext context;
    BeanFactory context;

    // 加载beans.xml配置文件
    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("beans.xml");
    }

    // 创建对象,并注入属性(外部bean)
    // service层调用dao层
    @Test
    public void outerBeanTest(){
        Server server = context.getBean("server", Server.class);
        server.serviceMethod();
    }

    // 创建对象,并注入属性(内部bean)
    @Test
    public void innerBeanTest(){
        Server server1 = context.getBean("server1", Server.class);
        server1.serviceMethod();
    }

    // BeanFactory 和 ApplicationContext 区别
    @Test
    public void distinctionTest(){
        Server server2 = context.getBean("server2", Server.class);
        System.out.println(server2);

        Server server3 = context.getBean("server2", Server.class);
        System.out.println(server3);
    }

}

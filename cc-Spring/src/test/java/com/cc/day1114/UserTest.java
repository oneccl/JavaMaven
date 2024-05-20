package com.cc.day1114;

import com.cc.day1114.bean.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/14
 * Time: 15:22
 * Description:
 */
public class UserTest {

    ApplicationContext context;

    // 加载beans.xml配置文件
    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("beans.xml");
    }

    // 创建对象,使用对象访问类的成员方法
    @Test
    public void userTest1(){
        // 1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 2.获取配置中的对象
        User user1 = context.getBean("user1", User.class);
        user1.method();
    }

    // 创建对象,并使用类中set方法注入属性
    @Test
    public void userTest2(){
        User user2 = context.getBean("user2", User.class);
        System.out.println(user2);
    }

    // 创建对象,并使用类的构造器注入属性
    @Test
    public void userTest3(){
        User user3 = context.getBean("user3", User.class);
        System.out.println(user3);
    }

    // 创建对象,并使用p空间注入属性
    @Test
    public void userTest4(){
        User user4 = context.getBean("user4", User.class);
        System.out.println(user4);
    }

    // 创建对象,给属性赋空值null
    @Test
    public void userTest5(){
        User user5 = context.getBean("user5", User.class);
        System.out.println(user5);
    }

}

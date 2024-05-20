package com.cc.day1115;

import com.cc.day1114.bean.User;
import com.cc.day1115.bean.Animal;
import com.cc.day1115.bean.BeanLife;
import com.cc.day1115.bean.Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/15
 * Time: 14:38
 * Description:
 */
public class AllTest {

    ApplicationContext context;

    // 初始化
    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("beans.xml");
    }

    // 注入属性为数组或集合类型
    @Test
    public void personTypeTest(){
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }

    // 工厂Bean返回任意类型的实例
    @Test
    public void myBeanTest(){
        User myBean = context.getBean("myBean", User.class);
        System.out.println(myBean);
    }

    // Spring的自动装配
    // 只要加载beans.xml配置文件，则bean中类构造方法、set方法和初始化就会执行
    // 1. 使用autowire属性自动装配
    @Test
    public void autowireTest(){
        Animal animal1 = context.getBean("animal1", Animal.class);
        animal1.getDog().sound();
        animal1.getCat().sound();

        Animal animal2 = context.getBean("animal2", Animal.class);
        animal2.getDog().sound();
        animal2.getCat().sound();
    }

    // 2. 使用@Autowired和@Resource注解自动装配
    /*
    基于注解：
    1. 在beans.xml头文件中配置：
    xmlns:context="http://www.springframework.org/schema/context"
    http://www.springframework.org/schema/context
    https://www.springframework.org/schema/context/spring-context.xsd
    2. 开启组件扫描(扫描包下全部)：
    <context:component-scan base-package="需要使用注解的包"/>
     */
    @Test
    public void byNameTest(){
        Animal animal3 = context.getBean("animal3", Animal.class);
        System.out.println(animal3);
        animal3.getDog().sound();
        animal3.getCat().sound();
    }

}

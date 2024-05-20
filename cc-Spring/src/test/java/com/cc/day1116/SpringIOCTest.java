package com.cc.day1116;

import com.cc.SpringIOC;
import com.cc.day1115.bean.Cat;
import com.cc.day1115.bean.Dog;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/16
 * Time: 14:30
 * Description:
 */
public class SpringIOCTest {

    // 自定义变量名，初始化ioc容器，获取单例对象(可初始化多个、获取多个)
    @Test
    public void test1() throws Exception {
        SpringIOC ioc = new SpringIOC();
        ioc.initBeans("cat", Cat.class);
        ioc.initBeans("dog", Dog.class);

        Cat cat1 = (Cat) ioc.getBean("cat");
        System.out.println(cat1);

        Cat cat2 = (Cat) ioc.getBean("cat");
        System.out.println(cat2);

        Cat cat3 = ioc.getBean(Cat.class);
        System.out.println(cat3);

        System.out.println("----------------");

        Dog dog1 = (Dog) ioc.getBean("dog");
        System.out.println(dog1);

        Dog dog2 = (Dog) ioc.getBean("dog");
        System.out.println(dog2);

        Dog dog3 = ioc.getBean(Dog.class);
        System.out.println(dog3);
    }

    // 默认类名首字母小写，初始化ioc容器，获取单例对象(可初始化多个、获取多个)
    @Test
    public void test2() throws Exception {
        SpringIOC ioc = new SpringIOC();
        ioc.initBeans(Cat.class);
        ioc.initBeans(Dog.class);

        Cat cat1 = (Cat) ioc.getBean("cat");
        System.out.println(cat1);

        Cat cat2 = (Cat) ioc.getBean("cat");
        System.out.println(cat2);

        Cat cat3 = ioc.getBean(Cat.class);
        System.out.println(cat3);

        System.out.println("----------------");

        Dog dog1 = (Dog) ioc.getBean("dog");
        System.out.println(dog1);

        Dog dog2 = (Dog) ioc.getBean("dog");
        System.out.println(dog2);

        Dog dog3 = ioc.getBean(Dog.class);
        System.out.println(dog3);
    }

}

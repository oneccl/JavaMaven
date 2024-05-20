package com.cc.day1115;

import com.cc.day1115.bean.BeanLife;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/15
 * Time: 16:03
 * Description:
 */
public class BeanLifeTest {

    // Bean的生命周期
    /*
    1. 使用类的构造器创建实例
    2. 使用类的set方法注入属性
    3. 初始化
    4. 执行方法
    5. 销毁
     */
    @Test
    public void beanLifeTest(){
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
        BeanLife beanLife = con.getBean("beanLife", BeanLife.class);
        beanLife.execute();
        con.close();
    }

}

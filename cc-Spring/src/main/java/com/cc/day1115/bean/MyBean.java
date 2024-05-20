package com.cc.day1115.bean;

import com.cc.day1114.bean.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/15
 * Time: 14:55
 * Description:
 */
public class MyBean implements FactoryBean {
    /*
    Spring提供了两种bean：普通bean 和 工厂bean(FactoryBean)
    区别：普通bean只能返回一种类型的实例；工厂Bean可以返回任意类型的实例
    使用步骤：创建工厂类实现FactoryBean接口，重写方法
     */

    // 将类的实例交给Spring容器管理
    @Override
    public User getObject() {
        return new User(100,"nn","111");
    }

    // 设置提供对象的类型
    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    // 设置是否单例(默认是单例)
    @Override
    public boolean isSingleton() {
        return false;
    }

}

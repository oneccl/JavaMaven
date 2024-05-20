package com.cc.day1116;

import com.cc.day1116.aop.Factory;
import com.cc.day1116.aop.JdkDynamicAgency;
import com.cc.day1116.aop.Products;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/22
 * Time: 9:50
 * Description:
 */
public class JdkDynamicAgencyTest {

    // JDK动态代理分开实现测试
    @Test
    public void jdkDynamicAgencyTest(){
        // 被代理的类的对象
        Factory factory = new Factory();
        // InvocationHandler对象
        InvocationHandler invocationHandler = new JdkDynamicAgency(factory);
        // 使用Proxy类创建动态代理
        Products jdkDynamicAgency = (Products) Proxy.newProxyInstance(
                factory.getClass().getClassLoader(),
                new Class[]{Products.class},
                invocationHandler);
        // 使用动态代理调用接口中的方法，会调用InvocationHandler接口中的invoke()方法
        System.out.println("客户购买总价："+jdkDynamicAgency.sell(10000));
    }

}

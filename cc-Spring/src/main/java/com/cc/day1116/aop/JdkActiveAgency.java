package com.cc.day1116.aop;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/16
 * Time: 16:43
 * Description:
 */
// JDK动态代理对象(AOP):横向的
public class JdkActiveAgency{
    // jdk动态代理实现并测试

    @Test
    public void jdkActiveAgencyTest(){
        // 准备创建工厂的代理对象
        Factory factory = new Factory();
        // 当前类的类加载器
        ClassLoader loader = JdkActiveAgency.class.getClassLoader();
        // 目标对象实现的接口(可多个)
        Class<?>[] interfaces = new Class<?>[]{Products.class};

        // 创建目标对象实现的接口的代理对象
        Products jdkActiveAgency = (Products) Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
            // 在invoke()方法中添加增强的功能
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 在源代码前增强
                System.out.println("调用方法前执行的代码!");

                // 源代码执行
                Double sale = (Double)method.invoke(factory, args);
                System.out.println("工厂销售额："+sale);

                // 在源代码后增强
                System.out.println("调用方法后执行的代码!");

                // 添加的功能
                Integer amount = (Integer)args[0];

                if (amount > 10000){
                    sale += 30000;
                }else if(amount > 1000){
                    sale += 5000;
                }else {
                    sale += 1000;
                }

                System.out.println("代理商销售额："+sale);

                // 优惠券
                Double account = 1000d;

                return sale-account;
            }
        });

        System.out.println("客户购买总价："+jdkActiveAgency.sell(10000));

    }

}

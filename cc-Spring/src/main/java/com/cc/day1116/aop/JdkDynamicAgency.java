package com.cc.day1116.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/22
 * Time: 9:39
 * Description:
 */
// JDK动态代理对象(AOP):横向的
public class JdkDynamicAgency implements InvocationHandler {
    // jdk动态代理实现(实现与测试分离)

    // 代理商从目标厂家进货
    private Object target;

    public JdkDynamicAgency(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        // 在源代码前增强
        System.out.println("调用方法前执行的代码!");

        // 源代码执行
        Double sale = (Double)method.invoke(target,args);
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

}

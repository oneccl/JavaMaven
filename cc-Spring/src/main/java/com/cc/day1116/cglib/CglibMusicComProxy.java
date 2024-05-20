package com.cc.day1116.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/22
 * Time: 11:16
 * Description:
 */
public class CglibMusicComProxy implements MethodInterceptor {
    // 被代理的目标类
    private Object target;

    public CglibMusicComProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        // 在源代码前增强
        System.out.println("调用方法前执行的代码!");

        // 源代码执行：可通过method.invoke()或methodProxy.invokeSuper()执行
        method.invoke(target,args);
        //methodProxy.invokeSuper(o,args);

        // 在源代码后增强
        System.out.println("调用方法后执行的代码!");

        return null;
    }

}

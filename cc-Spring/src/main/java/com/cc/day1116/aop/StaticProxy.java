package com.cc.day1116.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/16
 * Time: 20:25
 * Description:
 */
// 使用注解实现静态代理对象
@Component
// 静态代理(使该类为切面类，相当于<aop:aspect ref="staticProxy">)
@Aspect
public class StaticProxy {
    // AOP相关术语
    /*
    1.连接点：被增强的方法称
    2.切入点：实际真正被增强的方法
      @Pointcut(表达式)：可被引用
      切入点表达式：*代表全部或忽略方法返回值；(..)代表忽略方法参数
      1）execution([权限修饰符][返回值类型][包名.类名.方法名(参数列表)])
         控制粒度：方法级别，效率较低
      2）within(包名.类名)
         控制粒度：类级别，不用关心方法、返回值和参数列表
    3.通知：实际增强的逻辑部分(增强的代码)
      1）前置通知 @Before
      2）后置通知 @AfterReturning
      3）环绕通知 @Around
      4）最终通知 @After
      5）异常通知 @AfterThrowing
    4.切面：将通知应用到切入点的过程
    5.目标对象：包含连接点的对象
    6.植入：通过动态代理在目标对象的方法中添加增加逻辑的过程
     */
    // Spring的通知(使用注解)
    /*
    1)配置xml(aopBeans.xml)，添加如下：
    xmlns:context="http://www.springframework.org/schema/context"
    xmlns:aop="http://www.springframework.org/schema/aop"

    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd

    http://www.springframework.org/schema/aop
    http://www.springframework.org/schema/aop/spring-aop.xsd
    2)创建静态代理类，使用@Aspect注解，使用@Component注解实现静态代理对象
    3)开启组件扫描，开启AspectJ静态代理对象配置，指定CGLIB代理
     */

    // 自定义切入点(方法)
    @Pointcut("execution(* com.cc.day1116.aop.Factory.sell(..))")
    public void pointCut(){
    }

    // 前置通知
    @Before("pointCut()")
    public void beforeTest(){
        System.out.println("前置通知：在原方法执行前添加增强代码");
    }
    // 后置通知
    @AfterReturning("pointCut()")
    public void afterReturningTest(){
        System.out.println("后置通知：在原方法执行后添加增强代码");
    }
    // 最终通知
    @After("pointCut()")
    public void afterTest(){
        System.out.println("最终通知：最后执行的增强的代码");
    }
    // 异常通知
    @AfterThrowing("pointCut()")
    public void afterThrowingTest(){
        System.out.println("异常通知：目标方法出现异常执行的代码");
    }
    // 环绕通知
    @Around("pointCut()")
    public Object aroundTest(ProceedingJoinPoint pjp) throws Throwable {
        // 显示的调用目标方法
        Object res = pjp.proceed();
        System.out.println("环绕通知：目标方法执行前后都执行的增强代码");
        return res;
    }

}

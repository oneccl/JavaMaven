package com.cc.day1116;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/16
 * Time: 15:07
 * Description:
 */
public class DemoAOP {
    // AOP：面向切面(方面)编程
    /*
    AOP将业务逻辑的各个模块进行隔离，降低了业务逻辑间的耦合度，提高了程序的可重用性和开发效率
    AOP是对OOP(面向对象)的一个增强，AOP在不改变源代码的前提下，可以对指定模块功能进行增强
     */
    // AOP底层实现：动态代理(基于反射)
    // 代理作用：①功能增强(可添加额外功能)；②控制访问
    // 代理分类：静态代理 和 动态代理

    // 1. 静态代理(以工厂和代理商为例)
    // 步骤：
    /*
    1)制定规则，创建接口(Products)
    2)创建工厂/厂家类(Factory)，并实现Products接口
    3)创建工厂/厂家的代理商类(Agency)，并实现Products接口/继承工厂类，重写目标方法
    4)创建测试类/客户类(Client)，使用工厂对象调用目标方法
     */
    // 2. 动态代理
    // 第1种：源代码通过实现接口(使用JDK的动态代理)
    // 实现原理：
    /*
    1)Proxy类：newProxyInstance()方法：用于创建代理对象
      该方法有3个参数：
      Classloader loader：当前类的类加载器
      Class<?>[] interfaces：目标对象实现的接口
      InvocationHandler h：代理需要增强的功能
    2)InvocationHandler接口：代理实例调用处理程序需实现的接口
      调用处理程序：每个代理实例都有一个关联的调用处理程序
      当使用代理实例调用接口中的方法时，就会调用InvocationHandler接口中的invoke()方法
      代理类需实现InvocationHandler接口，重写invoke()方法，在该方法中添加增强的功能
    3)invoke()方法：该方法有3个参数：
      Object proxy：代理对象
      Method method：代理类正在执行的方法class对象
      Object[] args：代理类正在执行的方法的参数列表
     */
    // 步骤：
    /*
    1)制定规则，创建接口(Products)
    2)创建工厂/厂家类(Factory)，并实现Products接口
    3)创建工厂/厂家的代理商类(JdkDynamicAgency)，并实现InvocationHandler
    (java.lang.reflect)接口，重写invoke()方法
    4)创建测试类/客户类(JdkDynamicAgencyTest)，使用jdk动态代理调用目标方法
     */
    // 静态代理 与 动态代理 区别
    /*
    静态代理(编译时生成)：
    1）冗余：需要实现与目标对象一致的接口，会产生过多的代理类
    2）不易维护：如果接口增加方法，目标对象和代理对象都要修改
    3）需要通过xml/注解获取工厂类对象，由工厂类对象调用目标方法
    动态代理(运行时动态生成)：
    1）动态的构建代理对象，提高了程序的可维护性
    2）必须使用工厂实现的接口的静态代理调用目标方法
     */

    // 第2种：没有接口时使用继承(使用cglib第三方工具库的动态代理)
    // 步骤：
    /*
    1)工厂类的父类(Singer)
    2)创建工厂/厂家类(MusicCom)，并继承Singer类，重写目标方法
    3)创建工厂/厂家的代理商类(CglibMusicComProxy)，并实现MethodInterceptor
    (org.springframework.cglib.proxy)接口，重写intercept()方法
    4)创建测试类/客户类(CglibMusicComProxyTest)，使用cglib动态代理调用目标方法
     */

}

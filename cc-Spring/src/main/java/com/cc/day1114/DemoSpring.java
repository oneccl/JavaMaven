package com.cc.day1114;


/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/14
 * Time: 14:11
 * Description:
 */
public class DemoSpring {
    // Spring框架
    /*
    1.Spring：是一个轻量级、开源的JavaBean框架；是一个用来解决JavaEE应用程序开发的框架
    是一个控制反转(IOC)和面向切面(AOP)的容器框架
    2.Spring的两大核心：IOC(Inversion Of Control)和AOP(Aspect Oriented Programming)
    IOC(控制反转)：将创建对象和对象间的调用过程交给Spring统一管理，降低了对象之间的耦合度(低耦合)
    AOP(面向切面)：在不修改源代码的前提下对程序进行增强，通过分离应用业务逻辑与系统级服务
       进行内聚性开发(高内聚)
    3.Spring特点(优点)：
    1)方便解耦，简化开发
    2)方便程序测试(提供了测试jar包)
    3)方便集成其它框架
     */
    // Spring容器/IOC容器/bean容器
    /*
    Spring框架的核心是Spring容器；容器创建对象，将它们装配在一起，配置它们并管理它们的
    完整生命周期。Spring容器使用依赖注入来管理组成应用程序的组件。容器通过读取提供的配置
    元数据来接收对象进行实例化，配置和组装的指令。该元数据可以通过xml，Java注解或代码提供
     */
    // IOC底层原理
    /*
    1.IOC：表面采用beans.xml文件，就是一个JavaBean，每一个对象都使用一对bean标签
        底层采用工厂/单例模式实现，通过反射动态创建bean标签中class属性对应的类的对象
    2.IOC容器的两种接口：
    1）BeanFactory接口(Spring顶层接口，是IOC容器的核心接口)
    2）ApplicationContext接口(是BeanFactory的子接口)
    3.原理：xml+单例/工厂模式+反射
     */
    // 什么是一个JavaBean?
    /*
    JavaBean是一个遵循特定写法的Java类；具有以下特点：
    1）这个Java类必须有无参构造器；
    2）所有属性必须私有化(private修饰)；
    3）必须提供公共的get()/set()方法(暴露接口)
    4）这个类应该是可序列化的(实现Serializable接口，用于实现bean的持久性)
    JavaBean作用：Javabean是为了简化和前台页面数据交互而产生的
    JavaBean在Java EE开发中，通常用于封装数据，对于遵循以上写法的JavaBean组件
    其它程序可以通过反射机制实例化JavaBean对象（内省机制），并且通过反射那些遵循
    命名规范的方法，从而获知JavaBean的属性，进而调用其属性保存数据。因为这些要求
    主要是靠约定而不是靠实现接口，所以许多开发者把JavaBean看作遵从特定命名约定的POJO
    当一个POJO可序列化，有一个无参构造，使用get/set方法来访问属性时，它就是一个JavaBean
    */
    // BeanFactory 和 ApplicationContext 区别
    // 单例模式下创建对象的时间节点不同
    /*
    ApplicationContext：加载配置文件beans.xml的时候就会创建对应的bean标签中类的对象(默认单例)
    BeanFactory：使用getBean()方法的时候才创建对应的bean标签中类的对象(默认单例)
    （1）BeanFactory是Spring的顶层接口，是IOC的核心，定义了IOC的基本功能，包括
        Bean的定义、加载、实例化、依赖注入和生命周期管理
        1)当调用getBean()方法时，才对Bean实例化(默认单例)
        2)缺点：使用时才创建，程序加载较慢；易出现配置错误
    （2）ApplicationContext是BeanFactory的子接口，除了BeanFactory的功能外
        还提供了更加完整的框架功能：
        1)以声明的方式启动并创建Spring容器，一次性创建所有的Bean实例(默认单例)
        2)载入多个有继承关系的上下文(同时加载多个配置文件)，进行分层
        3)统一的资源文件访问方式，如URL和文件(间接继承了ResourceLoader)
        4)继承了MessageSource，支持国际化
        5)支持AOP事件传播特性，提供在监听器中注册bean的事件
        6)缺点：一次性创建所有实例，占用内存较大
     */
    // IOC操作
    // Bean管理：①创建对象；②注入属性

    // 1.基于beans.xml的方式
    // ①创建对象
    // 方式一：构造方法实例化(默认无参构造)，使用全参构造注入属性
    // 方式二：无参构造实例化，使用set方法注入属性
    // 方式三：使用Spring提供的工厂Bean: 实现FactoryBean接口(day1115/bean/MyBean.java)

    // ②注入属性
    // 方式一：使用类中set方法注入属性
    // 方式二：使用类的构造器注入属性
    // 方式三：使用p空间注入属性

    // 2.基于注解的方式
    // 详见day1115/SpringAnnotation.java和/springConfig/SpringConfig.java


}

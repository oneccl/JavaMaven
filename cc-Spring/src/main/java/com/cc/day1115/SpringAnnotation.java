package com.cc.day1115;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/15
 * Time: 17:45
 * Description:
 */
public class SpringAnnotation {
    // IOC操作Bean管理(基于注解，需要beans.xml文件)

    // 步骤：
    /*
    1. 在beans.xml头文件中配置：
    xmlns:context="http://www.springframework.org/schema/context"
    http://www.springframework.org/schema/context
    https://www.springframework.org/schema/context/spring-context.xsd
    2. 开启组件扫描(扫描包下全部)：
    <context:component-scan base-package="需要使用注解的包"/>
     */
    // 常用注解
    // 1.创建对象的注解(作用于类，功能相同)
    /*
    @Component：用于描述Spring中的Bean，可以作用在任何层次
    @Controller：通常用于标识控制层(controller层)Spring中的Bean
    @Service：通常用于标识业务层(service层)Spring中的Bean
    @Repository：通常用于标识数据访问层(dao层)Spring中的Bean
     */
    // 2.属性注入的注解(作用于属性上)
    /*
    @Autowired：根据类型(byType)自动装配
    @Resource：先根据name名称(byName)自动装配，如果匹配不成功，则根据类型(byType)自动装配
    @Value：基本类型和String类型属性注入自动装配值
     */

    // Spring全注解开发(不需要beans.xml文件)

    // 全注解开发步骤：
    /*
    1. 创建Spring配置类SpringConfig.java
    2. 在该类上使用@Configuration注解，配置Spring容器，用于代替xml文件
    3. 在该类上使用@ComponentScan(basePackages={需要使用注解的包})，开启组件扫描
     */

}

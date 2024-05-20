package com.cc.day1117;


/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/17
 * Time: 15:15
 * Description:
 */
public class DemoJDBCTemplate {
    // SpringJDBC操作数据库

    // JdbcTemplate类(org.springframework.jdbc.core)

    // Spring对JDBC进行了封装，使用JdbcTemplate可以实现数据操作
    // 步骤：
    /*
    1）导入jdbc依赖和druid连接池依赖
    2）在配置文件中配置context
    xmlns:context="http://www.springframework.org/schema/context"
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd
    2）在配置文件中配置数据库连接池(数据源)、配置JdbcTemplate，注入数据源

     */

    // Spring事务管理(运行时异常回滚)
    /*
    事务(transaction)：4个特性
    1）原子性：不可分割
    2）一致性：要么成功，要么失败
    3）隔离性：事务间互相独立，互不影响
    4）持久性：一旦执行成功，会永久保存
     */
    // 1. 分类：
    // 1）编程式事务管理：将事务管理嵌入到业务逻辑中，使用TransactionTemplate对象管理事务
    // 2）声明式事务管理：将事务管理封装，底层使用AOP，使用@Transactional注解管理事务
    // 2. 声明式事务管理：
    // 方式1：基于注解
    // 方式2：基于xml
    // 3. 步骤：
    /*
    1）在xml中配置tx事务
    xmlns:tx="http://www.springframework.org/schema/tx"
    http://www.springframework.org/schema/tx
    http://www.springframework.org/schema/tx/spring-tx.xsd
    2）在xml中配置事务管理器，并注入数据源，开启事务
    3）在业务逻辑层的类或方法上添加注解@Transactional
     */

}

package com.cc.day1109;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/9
 * Time: 18:41
 * Description:
 */
public class DemoMybatis {
    // Mybatis框架

    // 框架(FrameWork)：是整体与部分系统可重用的一个设计思想，表现为一组抽象的结构组件
    // 框架就是一个模板，一个半成品
    /*
    Mybatis：是一个基于JDBC封装起来的持久层框架
    Mybatis通过配置xml文件或注解的方式进行开发
    Mybatis采用ORM(Object Relational Mapping)对象关系映射的思想
    解决了实体类与数据库表的映射问题
     */
    // Mybatis框架环境配置
    /*
    1.下载Mybatis框架组件(依赖jar包)
    2.创建Maven工程，在pom.xml中导入Mybatis依赖jar包
    3.创建JavaBean(实体类)与Dao层的接口
    4.在resource目录下创建Mybatis的主配置文件SqlMapConfig.xml
    5.在resource目录下创建与Dao层接口路径一致的Dao接口映射配置文件DaoMapper.xml
     */
    // 注意事项
    /*
    1.java包下的包路径创建使用.分隔；resource目录下的目录路径创建使用\分隔
    2.Mybatis中Dao接口映射配置文件的路径必须和Dao接口的路径一致
    3.映射配置文件中的mapper标签中的namespace属性值必须是Dao接口的全类名
    4.映射配置文件中sql语句所在标签中的id属性值必须与Dao接口中的方法名一致
    5.在主配置文件中的mappers标签中必须指定映射配置文件的路径(目录间使用/分隔)
     */

}

package com.cc.day1112.dao;

import com.cc.day1109.bean.Student;
import com.cc.day1112.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/12
 * Time: 11:27
 * Description:
 */
// Mybatis使用注解开发：不需要写Dao接口的Mapper.xml配置文件
// 在主配置文件mapper标签中使用class属性直接映射Dao层接口的全类名
/*
   常用注解：
   @Insert：添加(作用范围：方法)
   @Delete：删除(作用范围：方法)
   @Update：修改(作用范围：方法)
   @Select：查询(作用范围：方法)
   @Results、@ResultMap：结果集、引用(作用范围：方法)
   @CacheNamespace：使用二级缓存(作用范围：类)
 */
// 使用注解开发 与 使用xxMapper.xml配置文件 区别
/*
   注解开发：将sql写在注解(代码)中，需要拼接sql
   配置文件：将sql写在xxMapper.xml中，实现sql与Java代码分离
 */

// Mybatis的缓存机制
/*
   分类：一级缓存、二级缓存
   原因：为了减少数据库的访问，提高程序的执行效率
   1.一级缓存(同一个SqlSession不同线程)：SqlSession域(Mybatis默认开启)
     底层使用HashMap(K,V)缓存数据
   原理：1)对于DQL(查询)操作：将查询出来的结果缓存到SqlSession域中，如果其它线程
        查询相同的内容，则直接从SqlSession域中返回数据，不会访问数据库
        2)对于DML(增删改)：Mybatis会清空SqlSession域数据(避免脏读)，需要访问数据库
   2.二级缓存(不同SqlSession共享)：xxMapper.xml中mapper标签中的namespace(基于映射
     文件的缓存，可手动开启)，底层使用HashMap(K,V)缓存数据
   原理：1)对于DQL操作：当SqlSession关闭时，二级缓存将保存查询数据；当其它SqlSession
        查询相同的内容，会直接从二级缓存中返回数据，不会访问数据库
        2)对于DML操作：Mybatis会清空二级缓存数据(避免脏读)，需要访问数据库
 */
// 开启和使用二级缓存：使用二级缓存的实体类要实现Serializable序列化
/*
   1.在Mybatis主配置文件中配置(全局开关，可不配置，默认开启)（SqlMapConfig.xml）
   2.在主配置文件包含的当前映射文件中配置(分开关)（/day1111/DaoMapper.xml）
   3.当前操作使用二级缓存：在select标签中使用属性useCache=True
 */

// 使用注解开启二级缓存: blocking=true: 线程安全的(默认false)
// 执行同一SQL查询时当前线程会先去获取锁，其他执行该查询的线程只能等待当前线程查询完成后才能继续查询
//@CacheNamespace(blocking = true)
public interface Dao {

    /*    表字段与实体类属性名不一致(student表)    */

    // 方法一：对不一致的字段属性使用别名映射
    //@Select("select id stuId,name stuName,sex gender,score from student")

    // 方法二：使用@Results、@Result和@ResultMap注解
    // 查询所有
    @Select("select * from student")
    /*
    @Results注解：使用时需要与@Select注解同时使用
    id属性：表示可以被@ResultMap注解引用(同xxMapper.xml中的resultMap属性)
    value属性：@Result注解映射数组
    */
    // ① 不加属性，直接映射(可在本方法中引用)
//    @Results({
//            @Result(column = "id",property = "stuId"),
//            @Result(column = "name",property = "stuName"),
//            @Result(column = "sex",property = "gender")
//    })
    // ② 添加属性，可以被其它方法的@ResultMap注解引用(不能在本方法中引用)
    @Results(id = "queryStudent",value = {
            // id属性：表示该列为主键
            @Result(column = "id",property = "stuId",id = true),
            @Result(column = "name",property = "stuName"),
            @Result(column = "sex",property = "gender")
    })
    List<Student> findAll();

    // 根据id查询单个
    @Select("select * from student where id=#{id}")
    @ResultMap("queryStudent")
    Student findById(Integer id);

    /*      表字段与实体类属性名一致(user表)      */

    // 查询所有
    @Select("select * from user")
    List<User> queryAll();

    // 根据id查询用户
    @Select("select * from user where userId=#{id}")
    User queryById(Integer id);

    // 根据userName查询用户
    @Select("select * from user where userName=#{name}")
    User queryByName(String name);

    // 添加用户
    @Insert(
            "insert into user(userName,password,birthday) values" +
            "(#{userName},#{password},#{birthday})"
    )
    Boolean insert(User user);

    // 修改用户
    @Update(
            "update user set " +
            "userName=#{userName},password=#{password},birthday=#{birthday} " +
            "where userId=#{userId}"
    )
    Boolean update(User user);

    // 删除用户
    @Delete("delete from user where userId=#{id}")
    Boolean delete(Integer id);

    // 根据关键字模糊查询
    @Select("select * from user where userName like '%${value}%'")
    List<User> queryByKey(String keyWord);

    // 查询总数
    @Select("select count(*) from user")
    Long count();

    // 查询总和
    @Select("select sum(${value}) from user")
    Long sum(String field);

}

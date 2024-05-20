package com.cc.day1112.dao;

import com.cc.MybatisUtil;
import com.cc.day1109.bean.Student;
import com.cc.day1112.bean.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/12
 * Time: 11:29
 * Description:
 */
// Mybatis使用注解开发：在主配置文件mapper标签中使用class属性直接映射Dao层接口的全类名
public class DaoTest {

    Dao dao;

    // 初始化
    @Before
    public void init() throws IOException {
        dao = (Dao)MybatisUtil.init("SqlMapConfig.xml",Dao.class);
    }

    /*    表字段与实体类属性名不一致(student表)    */

    // 查询所有
    @Test
    public void findAllTest(){
        List<Student> students = dao.findAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // 根据id查询用户
    @Test
    public void findByIdTest(){
        System.out.println(dao.findById(12));
    }

    /*      表字段与实体类属性名一致(user表)      */

    // 查询所有
    @Test
    public void queryAllTest(){
        List<User> users = dao.queryAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    // 根据id查询用户
    @Test
    public void queryByIdTest(){
        System.out.println(dao.queryById(2));
    }

    // 根据用户名查询
    @Test
    public void queryByNameTest(){
        System.out.println(dao.queryByName("aa"));
    }

    // 添加用户
    @Test
    public void insertTest(){
        User tom = new User("Tom", "666", new Date());
        System.out.println(dao.insert(tom));
    }

    // 修改用户
    @Test
    public void updateTest(){
        User newUser = new User();
        newUser.setUserId(3);
        newUser.setUserName("newName");
        newUser.setPassword("xxx");
        newUser.setBirthday(new Date());
        System.out.println(dao.update(newUser));
    }

    // 删除用户
    @Test
    public void deleteTest(){
        System.out.println(dao.delete(3));
    }

    // 根据关键字模糊查询
    @Test
    public void queryByKeyTest(){
        List<User> users = dao.queryByKey("c");
        for (User user : users) {
            System.out.println(user);
        }
    }

    // 查询总数
    @Test
    public void countTest(){
        System.out.println(dao.count());
    }

    // 查询总和
    @Test
    public void sumTest(){
        System.out.println(dao.sum("userId"));
    }

    // 释放资源
    @After
    public void destroy() throws IOException {
        MybatisUtil.destroy();
    }

}

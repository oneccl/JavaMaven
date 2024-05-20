package com.cc.day1109.dao;

import com.cc.day1109.bean.Student;
import com.cc.day1109.bean.User;
import com.cc.day1109.bean.UserVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/9
 * Time: 16:47
 * Description:
 */
// 测试Dao接口中的方法
public class DaoTest {
    InputStream resource;
    SqlSession sqlSession;
    Dao dao;

    // 初始化
    @Before
    public void init() throws IOException {
        // 1.读取Mybatis主配置文件
        resource = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(resource);
        // 3.使用工厂生产SqlSession对象
        sqlSession = factory.openSession();

        // 自动提交事务
        //sqlSession = factory.openSession(true);

        // 4.使用SqlSession对象创建Dao接口的代理对象
        dao = this.sqlSession.getMapper(Dao.class);
    }

    /*         User实体类-user表         */
    /*         列名与属性名一一对应         */

    // 查询所有
    @Test
    public void queryAllTest(){
        List<User> users = dao.queryAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    // 根据id查询
    @Test
    public void queryByIdTest(){
        User user = dao.queryById(3);
        System.out.println(user);
    }

    // 根据用户名查询
    @Test
    public void queryByNameTest(){
        User user = dao.queryByName("aa");
        System.out.println(user);
    }

    // 添加用户
    @Test
    public void insertTest(){
        User user = new User("lisa", "235", new Date());
        System.out.println(dao.insert(user));
    }

    // 修改用户
    @Test
    public void updateTest(){
        // 查询用户
        User userLogin = dao.queryById(5);
        userLogin.setPassword("333");
        userLogin.setBirthday(new Date());
        // 修改用户信息
        System.out.println(dao.update(userLogin));
    }

    // 删除用户
    @Test
    public void deleteTest(){
        System.out.println(dao.delete(2));
    }

    // 模糊查询
    @Test
    public void queryByKeyTest(){
        List<User> users = dao.queryByKey("a");
        for (User user : users) {
            System.out.println(user);
        }
    }

    // 模糊查询：传入实体类的UserVO包装对象
    @Test
    public void queryLikeTest(){
        UserVO vo = new UserVO();
        User user = new User();
        user.setUserName("c");
        vo.setUser(user);
        List<User> users = dao.queryLike(vo);
        for (User u : users) {
            System.out.println(u);
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

    /*         Student实体类-student表         */
    /*           列名与属性名非一一对应           */

    // 查询所有
    @Test
    public void queryTest(){
        List<Student> students = dao.query();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // 释放资源
    @After
    public void destroy() throws IOException {
        // 手动提交事务(除查询外都需要提交事务)
        sqlSession.commit();

        sqlSession.close();
        resource.close();
    }

}

package com.cc.day1111.dao;

import com.cc.MybatisUtil;
import com.cc.day1109.bean.StuVO;
import com.cc.day1109.bean.Student;
import com.cc.day1111.bean.Account;
import com.cc.day1111.bean.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/11
 * Time: 12:02
 * Description:
 */
public class DaoTest {

    Dao dao;

    // 初始化
    @Before
    public void init() throws IOException {
        dao = (Dao) MybatisUtil.init("SqlMapConfig.xml", Dao.class);
    }

    /*      动态SQL(动态标签)      */

    // 多条件查询：if标签
    @Test
    public void queryIfTest(){
        Student student = new Student();
        student.setStuName("%四%");
        List<Student> students = dao.queryIf(student);
        for (Student stu : students) {
            System.out.println(stu);
        }
    }

    // 多条件查询：where标签
    @Test
    public void queryWhereTest(){
        Student student = new Student();
        student.setStuName("%四%");
        List<Student> students = dao.queryWhere(student);
        for (Student stu : students) {
            System.out.println(stu);
        }
    }

    // foreach标签：使用sql中in关键字查询
    @Test
    public void queryForeachTest(){
        StuVO stuVO = new StuVO();
        List<Integer> stuIds = Arrays.asList(12,13);
        stuVO.setStuIds(stuIds);
        List<Student> students = dao.queryForeach(stuVO);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    /*       多表查询：一对多       */

    // 查询account表中每个账户对应的用户信息
    @Test
    public void queryAccountTest(){
        List<Account> accounts = dao.queryAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    // 查询user表每个用户对应的账户信息
    @Test
    public void queryUserTest(){
        List<User> users = dao.queryUser();
        for (User user : users) {
            System.out.println(user);
        }
    }

    /*       多表查询：多对多       */

    // 查询每个学生的信息(包括其对应老师及信息)
    @Test
    public void queryStudentTest(){
        List<com.cc.day1111.bean.Student> students = dao.queryStudent();
        for (com.cc.day1111.bean.Student student : students) {
            System.out.println(student);
        }
    }

    // 释放资源
    @After
    public void destroy() throws IOException {
        MybatisUtil.destroy();
    }

}

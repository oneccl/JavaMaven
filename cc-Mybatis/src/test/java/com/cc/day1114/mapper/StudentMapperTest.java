package com.cc.day1114.mapper;

import com.cc.MybatisUtil;
import com.cc.day1114.pojo.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/14
 * Time: 18:51
 * Description:
 */
// 其它使用和Mybatis版本新特性
public class StudentMapperTest {

    StudentMapper studentMapper;

    // 初始化
    @Before
    public void init() throws IOException {
        studentMapper = (StudentMapper) MybatisUtil.init("SqlMapConfig.xml", StudentMapper.class);
    }

    // 根据id查询
    @Test
    public void queryByIdTest(){
        Student student = studentMapper.queryById(13);
        System.out.println(student);
    }

    // 根据id和name查询
    @Test
    public void queryCheckTest(){
        Student student = studentMapper.queryCheck(13, "李华");
        System.out.println(student);
    }

    // 添加
    @Test
    public void insertTest(){
        Student student = new Student(null,"王五","男",82.0);
        System.out.println(studentMapper.insert(student));
    }

    // 根据关键字模糊查询
    @Test
    public void queryByKeyTest(){
        List<Student> students = studentMapper.queryByKey("李");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // 根据id和name查询：
    // 1）可以只根据id查询，也可以只根据name模糊查询
    // 2）可以两个一起查询
    // 3）可以查询所有
    @Test
    public void queryTest(){
        List<Student> students = studentMapper.query(0, "李");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // 释放资源
    @After
    public void destroy() throws IOException {
        MybatisUtil.destroy();
    }

}

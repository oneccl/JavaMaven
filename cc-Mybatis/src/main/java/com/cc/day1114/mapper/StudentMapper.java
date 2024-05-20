package com.cc.day1114.mapper;

import com.cc.day1114.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/14
 * Time: 18:42
 * Description:
 */
// 其它使用和Mybatis版本新特性
public interface StudentMapper {

    // 根据id查询
    Student queryById(Integer id) ;

    // 根据id和name查询
    // @Param注解：填入当前形参的别名
    // 如果不写注解，需使用param1/arg0,param2/arg1,...
    Student queryCheck(@Param("v1") Integer id, @Param("v2") String name);

    // 添加
    Boolean insert(Student stu);

    // 根据关键字模糊查询
    List<Student> queryByKey(String keyWord);

    // 根据id和name查询：
    // 1）可以只根据id查询，也可以只根据name模糊查询
    // 2）可以两个一起查询
    // 3）可以查询所有
    List<Student> query(Integer id, String name);

}

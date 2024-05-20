package com.cc.day1111.dao;

import com.cc.day1109.bean.StuVO;
import com.cc.day1109.bean.Student;
import com.cc.day1111.bean.Account;
import com.cc.day1111.bean.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/11
 * Time: 11:37
 * Description:
 */
public interface Dao {

    /*      动态SQL(动态标签)      */

    List<Student> queryIf(Student stu);

    List<Student> queryWhere(Student stu);

    List<Student> queryForeach(StuVO vo);

    /*       多表查询：一对多       */

    List<Account> queryAccount();

    List<User> queryUser();

    /*       多表查询：多对多       */

    List<com.cc.day1111.bean.Student> queryStudent();

}

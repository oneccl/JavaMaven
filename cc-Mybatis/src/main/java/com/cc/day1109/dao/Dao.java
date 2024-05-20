package com.cc.day1109.dao;

import com.cc.day1109.bean.Student;
import com.cc.day1109.bean.User;
import com.cc.day1109.bean.UserVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/9
 * Time: 16:25
 * Description:
 */
// dao：Data Access Object 数据访问对象(持久层)
public interface Dao {
    // 查询所有
    // 使用注解的方式，Dao层映射配置文件不用写
    //@Select("select * from user")
    List<User> queryAll();

    // 根据id查询用户
    User queryById(Integer id);

    // 根据userName查询用户
    User queryByName(String name);

    // 添加用户
    Boolean insert(User user);

    // 修改用户
    Boolean update(User user);

    // 删除用户
    Boolean delete(Integer id);

    // 根据用户名模糊查询
    List<User> queryByKey(String keyWord);

    // 根据用户名模糊查询
    List<User> queryLike(UserVO userVO);

    // 查询总数
    Long count();

    // 查询总和
    Long sum(String field);

    /*   Student实体类: 列名与属性名非一一对应   */

    // 查询所有
    List<Student> query();


}

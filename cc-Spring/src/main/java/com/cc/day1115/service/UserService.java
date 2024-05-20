package com.cc.day1115.service;

import com.cc.day1115.dao.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/15
 * Time: 18:12
 * Description:
 */
@Service
public class UserService {

    // Spring全注解开发
    @Resource
    private UserDao userDao;

    // service层调用dao层
    public void serviceMethod(){
        System.out.println("service层中的方法执行啦!");
        userDao.daoMethod();
    }

}

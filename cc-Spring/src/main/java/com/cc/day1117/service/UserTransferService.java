package com.cc.day1117.service;

import com.cc.day1117.bean.User;
import com.cc.day1117.dao.UserTransferDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/17
 * Time: 18:08
 * Description:
 */
// @Transactional注解：添加事务
/*
  1）作用在类上：给该类的所有方法都添加事务
  2）作用在方法上：给该方法添加事务
 */
@Transactional
@Service
public class UserTransferService {
    // 声明式事务管理

    // 声明式事务 与 编程式事务 区别
    /*
    1）编程式事务需要使用PlatformTransactionManager对象；
      声明式事务将事务管理封装，使用@Transactional注解
    2）编程式事务可使用try-catch；声明式事务不能使用try-catch(回滚失效)
    3）编程式事务嵌入在代码中，可以精确到代码块；声明式事务的管理粒度是方法级别的
    4）声明式事务作用于非public修饰的方法，回滚失效，但不会报错；
      编程式事务可以作用于非public修饰的方法的代码块
     */

    @Autowired
    private UserTransferDao userTransferDao;

    // 转账的方法
    public boolean transfer(User u1, User u2, Double m){

        Boolean b1 = userTransferDao.reduceMoney(u1, m);

        // 转账出现异常
        Integer i = 1/0;

        Boolean b2 = userTransferDao.addMoney(u2, m);

        return b1 && b2;
    }

}

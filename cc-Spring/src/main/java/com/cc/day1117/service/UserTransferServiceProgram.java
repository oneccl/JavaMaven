package com.cc.day1117.service;

import com.cc.day1117.bean.User;
import com.cc.day1117.dao.UserTransferDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/17
 * Time: 19:26
 * Description:
 */
@Service
public class UserTransferServiceProgram {
    // 编程式事务管理

    @Autowired
    private UserTransferDao userTransferDao;

    // 添加事务管理
    @Autowired
    private PlatformTransactionManager transactionManager;

    // 转账的方法
    public boolean transfer(User u1, User u2, Double m){
        // 给下面的代码块添加事务(异常默认回滚)
        transactionManager.getTransaction(new DefaultTransactionDefinition());
        try {
            Boolean b1 = userTransferDao.reduceMoney(u1, m);

            // 转账出现异常
            Integer i = 1/0;

            Boolean b2 = userTransferDao.addMoney(u2, m);
            return b1 && b2;
        } catch (Exception ignored) {}
        return false;
    }

}

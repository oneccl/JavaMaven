package com.cc.day1117.dao;

import com.cc.day1117.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/17
 * Time: 18:09
 * Description:
 */
@Repository
public class UserTransferDaoImpl implements UserTransferDao{
    // Spring事务管理

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 转账收款
    @Override
    public Boolean addMoney(User user, Double m) {
        String update = "update user set account=account+? where userId=?";
        Object[] values = {m,user.getUserId()};
        return jdbcTemplate.update(update,values) >= 0;
    }

    // 转账转出
    @Override
    public Boolean reduceMoney(User user, Double m) {
        String update = "update user set account=account-? where userId=?";
        Object[] values = {m,user.getUserId()};
        return jdbcTemplate.update(update,values) >= 0;
    }

}

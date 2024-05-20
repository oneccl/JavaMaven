package com.cc.day1117.dao;

import com.cc.day1117.bean.User;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/17
 * Time: 18:08
 * Description:
 */
public interface UserTransferDao {

    Boolean addMoney(User user, Double m);

    Boolean reduceMoney(User user, Double m);

}

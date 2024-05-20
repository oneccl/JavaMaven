package com.cc.day1109.bean;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/10
 * Time: 14:11
 * Description:
 */
// 实体类User再次封装(JavaBean)
public class UserVO {

    private User user;

    public UserVO() {
    }

    public UserVO(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "user=" + user +
                '}';
    }

}

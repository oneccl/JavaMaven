package com.cc.day1109.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/9
 * Time: 16:21
 * Description:
 */
// 用户实体类(单表查询)
public class User implements Serializable {
    private Integer userId;
    private String userName;
    private String password;
    private Date birthday;

    public User() {
    }

    public User(String userName, String password, Date birthday) {
        this.userName = userName;
        this.password = password;
        this.birthday = birthday;
    }

    public User(Integer userId, String userName, String password, Date birthday) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.birthday = birthday;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                '}';
    }

}

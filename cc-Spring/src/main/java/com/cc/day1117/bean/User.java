package com.cc.day1117.bean;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/17
 * Time: 18:16
 * Description:
 */
public class User {
    private Integer userId;
    private String userName;
    private Double account;

    public User() {
    }

    public User(Integer userId, String userName, Double account) {
        this.userId = userId;
        this.userName = userName;
        this.account = account;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getAccount() {
        return account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", account=" + account +
                '}';
    }

}

package com.cc.day1111.bean;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/11
 * Time: 11:34
 * Description:
 */
// 账户实体类(多表查询：一对多)
public class Account {
    private Integer accId;
    private Integer userId;
    private Double balance;
    private User user;

    public Account() {
    }

    public Account(Integer accId, Integer userId, Double balance, User user) {
        this.accId = accId;
        this.userId = userId;
        this.balance = balance;
        this.user = user;
    }

    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accId=" + accId +
                ", userId=" + userId +
                ", balance=" + balance +
                ", user=" + user +
                '}';
    }

}

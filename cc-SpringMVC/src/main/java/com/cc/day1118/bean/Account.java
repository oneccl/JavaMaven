package com.cc.day1118.bean;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/18
 * Time: 15:41
 * Description:
 */
public class Account {
    private Integer accId;
    private Double account;
    private User user;

    public Account() {
    }

    public Account(Integer accId, Double account, User user) {
        this.accId = accId;
        this.account = account;
        this.user = user;
    }

    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    public Double getAccount() {
        return account;
    }

    public void setAccount(Double account) {
        this.account = account;
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
                ", account=" + account +
                ", user=" + user +
                '}';
    }

}

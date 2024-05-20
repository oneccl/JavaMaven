package com.cc.day1118.bean;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/18
 * Time: 15:41
 * Description:
 */
public class User {
    private Integer userId;
    private String userName;
    private String password;
    private List<Address> accAddresses;
    private Map<String,Account> accounts;

    public User() {
    }

    public User(Integer userId, String userName, String password, List<Address> accAddresses, Map<String, Account> accounts) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.accAddresses = accAddresses;
        this.accounts = accounts;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Address> getAccAddresses() {
        return accAddresses;
    }

    public void setAccAddresses(List<Address> accAddresses) {
        this.accAddresses = accAddresses;
    }

    public Map<String, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Map<String, Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", accAddresses=" + accAddresses +
                ", accounts=" + accounts +
                '}';
    }

}

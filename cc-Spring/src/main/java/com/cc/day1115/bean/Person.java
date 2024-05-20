package com.cc.day1115.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/15
 * Time: 14:24
 * Description:
 */
public class Person {

    private String[] relative;
    private List<String> friends;
    private Map<String,String> address;
    private Set<String> hobby;

    public Person() {
    }

    public Person(String[] relative, List<String> friends, Map<String, String> address, Set<String> hobby) {
        this.relative = relative;
        this.friends = friends;
        this.address = address;
        this.hobby = hobby;
    }

    public String[] getRelative() {
        return relative;
    }

    public void setRelative(String[] relative) {
        this.relative = relative;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, String> getAddress() {
        return address;
    }

    public void setAddress(Map<String, String> address) {
        this.address = address;
    }

    public Set<String> getHobby() {
        return hobby;
    }

    public void setHobby(Set<String> hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Person{" +
                "relative=" + Arrays.toString(relative) +
                ", friends=" + friends +
                ", address=" + address +
                ", hobby=" + hobby +
                '}';
    }

}

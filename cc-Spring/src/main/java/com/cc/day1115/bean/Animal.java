package com.cc.day1115.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/15
 * Time: 16:19
 * Description:
 */
public class Animal {
    // 属性注入的注解
    /*
    @Autowired：根据类型(byType)自动装配
    @Resource：先根据name名称(byName)自动装配，如果匹配不成功，则根据类型(byType)自动装配
    @Value：基本类型和String类型属性注入自动装配值
     */
    @Value("classify的值")
    private String classify;
    @Autowired
    private Dog dog;
    @Resource
    private Cat cat;

    public Animal() {
    }

    public Animal(String classify, Dog dog, Cat cat) {
        this.classify = classify;
        this.dog = dog;
        this.cat = cat;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "classify='" + classify + '\'' +
                ", dog=" + dog +
                ", cat=" + cat +
                '}';
    }

}

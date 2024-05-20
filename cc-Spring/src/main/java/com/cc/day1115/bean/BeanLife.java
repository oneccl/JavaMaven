package com.cc.day1115.bean;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/15
 * Time: 15:47
 * Description:
 */
public class BeanLife {

    private String lifeCycle;

    public BeanLife() {
        System.out.println("使用类的构造器创建Bean的实例(诞生)");
    }

    public void setLifeCycle(String lifeCycle) {
        this.lifeCycle = lifeCycle;
        System.out.println("使用类的set方法注入属性");
    }

    public void beanInit(){
        System.out.println("Bean初始化");
    }

    public void execute(){
        System.out.println("Bean执行成员属性和方法");
    }

    public void beanDestroy(){
        System.out.println("Bean销毁");
    }

}

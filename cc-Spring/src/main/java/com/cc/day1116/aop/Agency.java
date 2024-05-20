package com.cc.day1116.aop;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/16
 * Time: 15:40
 * Description:
 */
// 静态代理对象(AspectJ:纵向的)
public class Agency implements Products{
    // 创建工厂/厂家的代理商类(Agency)，并实现Products接口

    // 代理商从厂家进货
    private Factory factory = new Factory();

    // 代理商加价出售
    @Override
    public Double sell(Integer amount) {
        // 在源代码前增强
        System.out.println("调用方法前执行的代码!");

        // 源代码执行
        Double sale = factory.sell(amount);
        System.out.println("工厂销售额："+sale);

        // 在源代码后增强
        System.out.println("调用方法后执行的代码!");

        // 添加的功能
        if (amount > 10000){
            sale += 30000;
        }else if(amount > 1000){
            sale += 5000;
        }else {
            sale += 1000;
        }

        System.out.println("代理商销售额："+sale);

        // 优惠券
        Double account = 1000d;

        return sale-account;
    }

}

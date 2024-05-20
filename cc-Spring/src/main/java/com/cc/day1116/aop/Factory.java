package com.cc.day1116.aop;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/16
 * Time: 15:35
 * Description:
 */
@Component()
public class Factory implements Products{
    // 创建工厂/厂家类(Factory)，并实现Products接口
    // 重写销售方法：厂家每销售amount数量>1万打85折，大于1000打95折

    @Override
    public Double sell(Integer amount) {
        System.out.println("Factory工厂中的sell原方法执行啦");
        if (amount > 10000){
            return amount * 0.85;
        } else if(amount > 1000){
            return amount * 0.95;
        }
        return amount * 1d;
    }

}

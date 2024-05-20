package com.cc.day1116;

import com.cc.day1116.aop.Agency;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/16
 * Time: 15:55
 * Description:
 */
// 静态代理测试(day1116/Factory和Agency类)
public class Client {
    // 客户类(Client)，用于测试静态代理

    @Test
    public void testStaticAOP(){
        // 代理商
        Agency agency = new Agency();
        // 订单10000
        Double price = agency.sell(10000);

        System.out.println("客户购买总价："+price);
    }

}

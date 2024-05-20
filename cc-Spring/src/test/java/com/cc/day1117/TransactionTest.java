package com.cc.day1117;

import com.cc.day1117.bean.User;
import com.cc.day1117.service.UserTransferService;
import com.cc.day1117.service.UserTransferServiceProgram;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/17
 * Time: 18:31
 * Description:
 */
public class TransactionTest {

    // Spring事务：转账案例

    // 声明式事务管理
    @Test
    public void transferTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcBeans.xml");
        UserTransferService transferService = context.getBean(UserTransferService.class);

        User user1 = new User(100, "张三", 1000d);
        User user2 = new User(101, "李四", 1000d);

        System.out.println(transferService.transfer(user1,user2,100d));
    }

    // 编程式事务管理
    @Test
    public void transferProgramTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcBeans.xml");
        UserTransferServiceProgram serviceProgram = context.getBean(UserTransferServiceProgram.class);

        User user1 = new User(100, "张三", 1000d);
        User user2 = new User(101, "李四", 1000d);

        System.out.println(serviceProgram.transfer(user1,user2,100d));
    }

}

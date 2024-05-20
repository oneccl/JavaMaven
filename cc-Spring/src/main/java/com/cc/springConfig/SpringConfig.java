package com.cc.springConfig;

import com.cc.day1115.service.UserService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/15
 * Time: 18:01
 * Description:
 */
// @Configuration/@Configurable：配置Spring容器，用于代替xml文件
//@Configuration
@Configurable
// @ComponentScan(basePackages={需要使用注解的包})：用于组件扫描(扫描包下全部)
@ComponentScan("com.cc.day1115")
public class SpringConfig {

    // @Bean注解(作用于方法)
    /*
    1）用于告诉方法，产生一个Bean对象，并将这个Bean对象交给Spring容器管理
    产生这个Bean对象的方法Spring只会调用一次，随后Spring将这个对象放到自己的IOC容器中
    @Bean明确的指示了一个产生Bean的方法，与xml中的bean标签配置同等效果
    2）@Bean注解的方法可以写在@Configuration/@Configurable标注的Spring配置类中
    也可以写在对象本身所在的类中
    3）@Bean注解和@Component、@Controller、@Service、@Repository等注解类似
    都是用来注册Bean对象的
    4）@Bean注解优点在于可以将第三方库中的实例交给Spring容器管理，和@Import功能相同
    @Component、@Controller、@Service、@Repository等注解具有局限性
     */
//    @Bean
//    public UserService userService(){
//        return new UserService();
//    }

    // @Configuration 和 @Configurable 区别
    /*
    1）@Configuration：用来代替xml文件，该注解标注的类为Spring的配置类
    在配置类中使用@Bean注解标注的方法可以产生一个由Spring容器管理的实例
    2）@Configurable：Spring无法对new出来的对象进行依赖注入，该注解告诉
    Spring在执行构造方法之前将对象进行依赖注入
     */

}

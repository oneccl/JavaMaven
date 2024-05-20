package com.cc.day1116;

import com.cc.day1116.cglib.CglibMusicComProxy;
import com.cc.day1116.cglib.MusicCom;
import com.cc.day1116.cglib.Singer;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/22
 * Time: 11:24
 * Description:
 */
public class CglibMusicComProxyTest {

    // Cglib动态代理
    @Test
    public void cglibProxyTest(){
        // 被代理类的对象
        MusicCom musicCom = new MusicCom();
        // 用来帮助生成代理类对象的
        Enhancer enhancer = new Enhancer();
        // 设置要代理的目标类
        enhancer.setSuperclass(MusicCom.class);
        // 设置执行规则
        enhancer.setCallback(new CglibMusicComProxy(musicCom));
        // 创建Cglib动态代理对象
        MusicCom cglibMusicComProxy = (MusicCom) enhancer.create();
        // 使用动态代理执行方法，会调用MethodInterceptor接口中的intercept()方法
        cglibMusicComProxy.sing();
    }

}

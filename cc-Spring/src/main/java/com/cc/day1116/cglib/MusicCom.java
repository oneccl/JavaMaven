package com.cc.day1116.cglib;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/22
 * Time: 11:15
 * Description:
 */
public class MusicCom extends Singer{

    // 公司的Singer的功能
    @Override
    public void sing() {
        System.out.println("既能唱歌又能跳舞!");
    }

}

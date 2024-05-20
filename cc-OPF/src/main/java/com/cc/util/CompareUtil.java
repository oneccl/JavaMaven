package com.cc.util;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/10
 * Time: 20:20
 * Description:
 */
public class CompareUtil {

    public static void longAsc(List<Long> list){
        list.sort(Long::compare);
    }

}

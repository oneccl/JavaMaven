package com.cc.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/10
 * Time: 19:54
 * Description:
 */
public class StringUtil {

    /**
     * 获取匹配到正则的所有子字符串
     * @param s
     * @param regex
     * @return
     */
    public static List<String> groupAll(String s, String regex){
        List<String> list = new ArrayList<>();
        // 将匹配一个或多个数字的正则表达式编译为Pattern对象
        Pattern pattern = Pattern.compile(regex);
        // pattern对象获取比较器
        Matcher matcher = pattern.matcher(s);
        // 在字符串中查找 如果有匹配正则表达式的
        while (matcher.find()){
            // 输出匹配到的
            String str = matcher.group();
            list.add(str);
        }
        return list;
    }

    /**
     * 获取匹配到正则的第一个子字符串
     * @param s
     * @param regex
     * @return
     */
    public static String groupFirst(String s, String regex){
        // 将匹配一个或多个数字的正则表达式编译为Pattern对象
        Pattern pattern = Pattern.compile(regex);
        // pattern对象获取比较器
        Matcher matcher = pattern.matcher(s);
        // 在字符串中查找 如果有匹配正则表达式的
        if (matcher.find()){
            // 输出匹配到的
            return matcher.group();
        }
        return null;
    }

}

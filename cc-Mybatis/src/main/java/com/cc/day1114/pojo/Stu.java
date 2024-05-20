package com.cc.day1114.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/21
 * Time: 18:01
 * Description:
 */
// get()/set()方法、equals()、toString()方法等
@Data
// 全参构造
@AllArgsConstructor
// 空参构造
@NoArgsConstructor
public class Stu implements Serializable {

    private Integer stuId;
    private String stuName;
    private String gender;
    private Double score;

}

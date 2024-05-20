package com.cc.day1109.bean;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/11
 * Time: 16:00
 * Description:
 */
public class StuVO {

    private Student student;
    private List<Integer> stuIds;

    public StuVO() {
    }

    public StuVO(Student student, List<Integer> stuIds) {
        this.student = student;
        this.stuIds = stuIds;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Integer> getStuIds() {
        return stuIds;
    }

    public void setStuIds(List<Integer> stuIds) {
        this.stuIds = stuIds;
    }

    @Override
    public String toString() {
        return "StuVO{" +
                "student=" + student +
                ", stuIds=" + stuIds +
                '}';
    }

}

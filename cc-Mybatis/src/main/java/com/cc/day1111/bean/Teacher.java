package com.cc.day1111.bean;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/11
 * Time: 19:50
 * Description:
 */
// 老师实体类(多表查询：多对多)
public class Teacher {
    private Integer teaId;
    private String teaName;
    private String teaSex;
    private List<Student> students;

    public Teacher() {
    }

    public Teacher(Integer teaId, String teaName, String teaSex, List<Student> students) {
        this.teaId = teaId;
        this.teaName = teaName;
        this.teaSex = teaSex;
        this.students = students;
    }

    public Integer getTeaId() {
        return teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public String getTeaSex() {
        return teaSex;
    }

    public void setTeaSex(String teaSex) {
        this.teaSex = teaSex;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teaId=" + teaId +
                ", teaName='" + teaName + '\'' +
                ", teaSex='" + teaSex + '\'' +
                ", students=" + students +
                '}';
    }

}

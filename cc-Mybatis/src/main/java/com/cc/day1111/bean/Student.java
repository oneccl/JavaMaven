package com.cc.day1111.bean;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/11
 * Time: 19:49
 * Description:
 */
// 学生实体类(多表查询：多对多)
public class Student {
    private Integer stuId;
    private String stuName;
    private String gender;
    private Double score;
    private List<Teacher> teachers;

    public Student() {
    }

    public Student(Integer stuId, String stuName, String gender, Double score, List<Teacher> teachers) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.gender = gender;
        this.score = score;
        this.teachers = teachers;
    }

    public Integer getStuId() {
        return stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                ", teachers=" + teachers +
                '}';
    }

}

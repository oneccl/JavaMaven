package com.cc.day1109.bean;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/10
 * Time: 14:59
 * Description:
 */
public class Student {
    private Integer stuId;
    private String stuName;
    private String gender;
    private Double score;

    public Student() {
    }

    public Student(Integer stuId, String stuName, String gender, Double score) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.gender = gender;
        this.score = score;
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

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                '}';
    }

}

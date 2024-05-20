package com.cc.day1114.service;

import com.cc.day1114.dao.DaoImpl;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/14
 * Time: 16:48
 * Description:
 */
public class Server {

    private DaoImpl dao;

    public Server() {
    }

    public Server(DaoImpl dao) {
        this.dao = dao;
    }

    public DaoImpl getDao() {
        return dao;
    }

    public void setDao(DaoImpl dao) {
        this.dao = dao;
    }

//    @Override
//    public String toString() {
//        return "Server{" +
//                "dao=" + dao +
//                '}';
//    }

    // service层调用dao层
    public void serviceMethod(){
        System.out.println("service层中的方法执行啦!");
        dao.daoMethod();
    }

}

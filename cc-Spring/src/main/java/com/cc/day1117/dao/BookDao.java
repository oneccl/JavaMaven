package com.cc.day1117.dao;

import com.cc.day1117.bean.Book;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/17
 * Time: 16:14
 * Description:
 */
public interface BookDao {

    Boolean insert(Book book);

    Boolean delete(Integer id);

    Boolean update(Book book);

    List<Book> selectAll();

    Book selectById(Integer id);

}

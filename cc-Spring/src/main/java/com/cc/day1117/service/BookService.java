package com.cc.day1117.service;

import com.cc.day1117.bean.Book;
import com.cc.day1117.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/17
 * Time: 16:23
 * Description:
 */
@Service
public class BookService {
    // Spring对JDBC的封装使用

    // 注入属性
    @Autowired
    private BookDao bookDao;

    public Boolean add(Book book){
        return bookDao.insert(book);
    }

    public Boolean del(Integer id){
        return bookDao.delete(id);
    }

    public Boolean modify(Book book){
        return bookDao.update(book);
    }

    public List<Book> queryAll(){
        return bookDao.selectAll();
    }

    public Book queryById(Integer id){
        return bookDao.selectById(id);
    }

}

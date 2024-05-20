package com.cc.day1117.dao;

import com.cc.day1117.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/17
 * Time: 16:16
 * Description:
 */
@Repository
public class BookDaoImpl implements BookDao{
    // Spring对JDBC的封装使用

    // 注入属性
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 添加
    @Override
    public Boolean insert(Book book) {
        String insert = "insert into book values(?,?,?)";
        Object[] values = {book.getBookId(),book.getBookName(),book.getAuthor()};
        return jdbcTemplate.update(insert,values) >= 0;
    }

    // 删除
    @Override
    public Boolean delete(Integer id) {
        String delete = "delete from book where bookId=?";
        return jdbcTemplate.update(delete,id) >= 0;
    }

    // 修改
    @Override
    public Boolean update(Book book) {
        String update = "update book set bookName=?,author=? where bookId=?";
        Object[] values = {book.getBookName(),book.getAuthor(),book.getBookId()};
        return jdbcTemplate.update(update,values) >= 0;
    }

    // 查询所有
    @Override
    public List<Book> selectAll() {
        String select = "select * from book";
        // queryForList(sql,Class<T> cla)：只能返回基本类型的List集合
        //List<Book> books = jdbcTemplate.queryForList(select, Book.class);
        // query(sql,BeanPropertyRowMapper b)：进行属性映射，返回pojo类型的List集合
        return jdbcTemplate.query(select, new BeanPropertyRowMapper<>(Book.class));
    }

    // 根据id查询单个
    @Override
    public Book selectById(Integer id) {
        String select = "select * from book where bookId=?";
        // queryForObject(sql,Class<T> cla,Object... v)：只能返回基本类型的对象
        //Book book = jdbcTemplate.queryForObject(select, Book.class, id);
        // queryForObject(sql,BeanPropertyRowMapper b,Object... v)：进行属性映射，返回pojo类型的对象
        return jdbcTemplate.queryForObject(select, new BeanPropertyRowMapper<>(Book.class), id);
    }

}

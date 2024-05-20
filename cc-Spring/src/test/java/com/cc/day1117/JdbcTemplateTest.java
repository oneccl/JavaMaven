package com.cc.day1117;

import com.cc.day1117.bean.Book;
import com.cc.day1117.service.BookService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/17
 * Time: 16:28
 * Description:
 */
public class JdbcTemplateTest {

    ApplicationContext context;
    BookService bookService;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("jdbcBeans.xml");
        bookService = context.getBean("bookService", BookService.class);
    }

    // 添加
    @Test
    public void addTest(){
        Book book1 = new Book(1, "Java", "Tom");
        Book book2 = new Book(2, "Web", "Jack");
        //System.out.println(bookService.add(book1));
        System.out.println(bookService.add(book2));
    }

    // 修改
    @Test
    public void modifyTest(){
        Book newBook = new Book(2, "JavaWeb", "李华");
        System.out.println(bookService.modify(newBook));
    }

    // 查询所有
    @Test
    public void queryAllTest(){
        List<Book> books = bookService.queryAll();
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // 删除
    @Test
    public void delTest(){
        System.out.println(bookService.del(2));
    }

    // 根据id查询单个
    @Test
    public void queryByIdTest(){
        Book book = bookService.queryById(1);
        System.out.println(book);
    }

}

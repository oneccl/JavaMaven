package com.cc;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/11
 * Time: 13:34
 * Description:
 */
public class MybatisUtil {

    private static InputStream inputStream;
    private static SqlSession sqlSession;

    // 初始化
    public static Object init(String res, Class<?> cla) throws IOException {
        // 读取Mybatis主配置文件
        inputStream = Resources.getResourceAsStream(res);
        // 创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        // 使用SqlSessionFactory工厂对象生产SqlSession对象，并自动提交事务
        sqlSession = factory.openSession(true);
        // 获取接口的代理对象
        return sqlSession.getMapper(cla);
    }

    // 销毁(释放资源)
    public static void destroy() throws IOException {
        sqlSession.close();
        inputStream.close();
    }

    // 初始化
    public static SqlSession init(String res) throws IOException {
        // 读取Mybatis主配置文件
        inputStream = Resources.getResourceAsStream(res);
        // 创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        // 使用SqlSessionFactory工厂对象生产SqlSession对象，并自动提交事务
        return factory.openSession(true);
    }

    // 销毁(释放资源)
    public static void destroy(SqlSession ss) throws IOException {
        ss.close();
        sqlSession.close();
        inputStream.close();
    }

}

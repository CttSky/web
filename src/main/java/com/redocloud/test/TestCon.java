package com.redocloud.test;

import com.redocloud.dao.UserDao;
import com.redocloud.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class TestCon {
    public static void main(String[] args) throws Exception {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlConfig.xml");
        //2.创建一个SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产一个SqlSession对象
        SqlSession session = factory.openSession();
        //4.动态代理 使用SqlSession创建Dao接口的代理对象
        UserDao userDao = session.getMapper(UserDao.class);
        //5.使用代理对象执行方法
        User user = new User();
        user.setUser_id("33333");
        user.setUser_pwd("3333");
        user.setUser_nickname("3333");
        user.setUser_nickname("你别皱眉");
        System.out.println(user);
        userDao.edit(user);
        session.commit();
        //6.释放资源
        session.close();
        in.close();
    }
}
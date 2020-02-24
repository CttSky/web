package com.redocloud.dao;

import com.redocloud.entity.User;

import java.util.List;

public interface UserDao {
    //查找单个用户
    public User findone(String id);

    //查找所有用户
    public List<User> findAll();

    //修改用户
    public void edit(User user);

    //添加用户
    public void add(User user);

}

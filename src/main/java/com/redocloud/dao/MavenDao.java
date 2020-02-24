package com.redocloud.dao;

import com.redocloud.entity.Maven_test;

import java.util.List;

public interface MavenDao {
    public List<Maven_test> findAll() throws Exception;
}

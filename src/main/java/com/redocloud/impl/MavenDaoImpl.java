package com.redocloud.impl;

import com.redocloud.dao.MavenDao;
import com.redocloud.entity.Maven_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MavenDaoImpl implements MavenDao {
    public List<Maven_test> findAll() throws Exception {
        List<Maven_test> list = new ArrayList<Maven_test>();
        Connection conn =null;
        PreparedStatement pst=null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///redocloud","root","322728");
            pst = conn.prepareCall("select * from maven_test");
            rs = pst.executeQuery();
            while(rs.next()){
                Maven_test mvn = new Maven_test();
                mvn.setUser_name(rs.getString("user_name"));
                mvn.setUser_pwd(rs.getString("user_pwd"));
                list.add(mvn);

            }
        } catch(Exception e){
          e.printStackTrace();
        }finally {
            conn.close();
            pst.close();
            rs.close();
        }

        return list;
    }
}

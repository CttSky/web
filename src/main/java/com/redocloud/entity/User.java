package com.redocloud.entity;

import java.sql.Timestamp;

public class User {
    private String user_id;
    private String user_pwd;
    private String user_area;
    private String user_idnum;
    private String user_name;
    private String user_nickname;
    private String user_des;
    private String user_gender;
    private String user_img;
    private Timestamp time;
    private String user_constellation;
    private Timestamp birthday;

    public String getUser_img(){
        return user_img;
    }

    public void setUser_img(String user_img){
        this.user_img = user_img;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public String getUser_area() {
        return user_area;
    }

    public void setUser_area(String user_area) {
        this.user_area = user_area;
    }

    public String getUser_idnum() {
        return user_idnum;
    }

    public void setUser_idnum(String user_idnum) {
        this.user_idnum = user_idnum;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_nickname() {
        return user_nickname;
    }

    public void setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname;
    }

    public String getUser_des() {
        return user_des;
    }

    public void setUser_des(String user_des) {
        this.user_des = user_des;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getUser_constellation() {
        return user_constellation;
    }

    public void setUser_constellation(String user_constellation) {
        this.user_constellation = user_constellation;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthdat(Timestamp birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", user_pwd='" + user_pwd + '\'' +
                ", user_area='" + user_area + '\'' +
                ", user_idnum='" + user_idnum + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_nickname='" + user_nickname + '\'' +
                ", user_des='" + user_des + '\'' +
                ", user_gender='" + user_gender + '\'' +
                ", time=" + time +
                ", user_constellation='" + user_constellation + '\'' +
                ", birthdat=" + birthday +
                '}';
    }
}

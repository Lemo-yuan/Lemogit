package com.lemo.bean;

import java.sql.Timestamp;
import java.util.List;

public class User {
   private String id;
   private String user_name;
   private String avatarurl;
   private String province;
   private String city;
   private int sex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public User(String id, String user_name, String avatarurl, String province, String city, int sex) {
        this.id = id;
        this.user_name = user_name;
        this.avatarurl = avatarurl;
        this.province = province;
        this.city = city;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", avatarurl='" + avatarurl + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", sex=" + sex +
                '}';
    }
}

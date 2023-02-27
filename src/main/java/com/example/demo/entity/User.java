package com.example.demo.entity;

//用户的实体类
public class User {
    private long uid;
    private String name;

    public User() {
    }

    public User(long uid, String name) {
        this.uid = uid;
        this.name = name;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                '}';
    }
}

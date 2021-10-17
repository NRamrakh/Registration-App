package com.example.inclass03;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    String emailId;
    String dept;
    int user_id;

    public User(String name, String emailId, int user_id, String dept) {
        this.name = name;
        this.emailId = emailId;
        this.user_id = user_id;
        this.dept = dept;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", dept='" + dept + '\'' +
                ", user_id=" + user_id +
                '}';
    }
}


package com.rianomusicskb.skbchat;

public class UserModel {

    String username;
    String email;
    String c_pass;
    String uid;
    public UserModel() {
    }


    public UserModel(String uid,String email,String username,String c_pass) {
        this.uid=uid;
        this.email = email;
        this.username=username;
        this.c_pass=c_pass;
    }
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getC_pass() {
        return c_pass;
    }

    public void setC_pass(String c_pass) {
        this.c_pass = c_pass;
    }
}

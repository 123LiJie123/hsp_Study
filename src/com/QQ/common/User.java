package com.QQ.common;

import java.io.Serializable;

//一个对象如果要能够通过对象处理流的方式读写的话，需要先将此对象的类序列化

public class User implements Serializable {
    //表示用户对象

    private static final long serialVersionUID = 1;
    private String userId;  //用户ID/用户名
    private String passwd;  //用户密码

    public User() {
    }





    public User(String userId, String passwd) {
        this.userId = userId;
        this.passwd = passwd;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }


}

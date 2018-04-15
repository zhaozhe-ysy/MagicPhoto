package com.zhaozhe.magicphoto.model;

/**
 * Created by zhaozhe on 2018/4/15.
 */

public class UserInfo {

    private int userId;
    private String userName;
    private String phoneNumber;

    public UserInfo (int userId,String userName,String phoneNumber) {
        this.userId = userId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

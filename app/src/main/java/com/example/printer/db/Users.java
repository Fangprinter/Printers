package com.example.printer.db;

/**
 * Created by Shelvin on 2018/4/14.
 */

public class Users {
    private int id;
    private String usersName;
    private String usersPassword;
    private String usersPicture;
    private String usersSignature;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsersName() {
        return usersName;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }

    public String getUsersPassword() {
        return usersPassword;
    }

    public void setUsersPassword(String usersPassword) {
        this.usersPassword = usersPassword;
    }

    public String getUsersPicture() {
        return usersPicture;
    }

    public void setUsersPicture(String usersPicture) {
        this.usersPicture = usersPicture;
    }

    public String getUsersSignature() {
        return usersSignature;
    }

    public void setUsersSignature(String usersSignature) {
        this.usersSignature = usersSignature;
    }
}

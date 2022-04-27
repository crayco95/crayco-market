package com.epsprueba.domain;

public class UserPacient {
    private int userPacientId;
    private String userName;
    private String password;

    public int getUserPacientId() {
        return userPacientId;
    }

    public void setUserPacientId(int userPacientId) {
        this.userPacientId = userPacientId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

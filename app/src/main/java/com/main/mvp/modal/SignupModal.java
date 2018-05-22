package com.main.mvp.modal;

/**
 * Created by anjanik on 4/2/2018.
 */

public class SignupModal {

    private String mUserName;
    private String mUserEmail;
    private String mPassword;
    private String mPasswordConf;
    private String mContactNo;

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        this.mUserName = userName;
    }

    public String getUserEmail() {
        return mUserEmail;
    }

    public void setUserEmail(String userEmail) {
        this.mUserEmail = userEmail;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        this.mPassword = password;
    }

    public String getPasswordConf() {
        return mPasswordConf;
    }

    public void setPasswordConf(String passwordConf) {
        this.mPasswordConf = passwordConf;
    }

    public String getContactNo() {
        return mContactNo;
    }

    public void setContactNo(String contactNo) {
        this.mContactNo = contactNo;
    }
}

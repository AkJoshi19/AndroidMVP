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

    public void setUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public String getUserEmail() {
        return mUserEmail;
    }

    public void setUserEmail(String mUserEmail) {
        this.mUserEmail = mUserEmail;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public String getPasswordConf() {
        return mPasswordConf;
    }

    public void setPasswordConf(String mPasswordConf) {
        this.mPasswordConf = mPasswordConf;
    }

    public String getContactNo() {
        return mContactNo;
    }

    public void setContactNo(String mContactNo) {
        this.mContactNo = mContactNo;
    }
}

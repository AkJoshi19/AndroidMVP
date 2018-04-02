package com.main.mvp.signup;

import android.os.Handler;

import com.main.mvp.modal.SignupModal;


/**
 * Created by anjanik on 4/2/2018.
 */

public class SignUpPresenter {

    private SignUpPresenterImpl mSignUpPresenter;

    public SignUpPresenter(SignUpPresenterImpl signUpPresenter){

        mSignUpPresenter = signUpPresenter;
    }

    void initProcess(SignupModal signupModal){

        mSignUpPresenter.showProgressDialog();

        if(isError(signupModal)){

            mSignUpPresenter.hideProgressDialog();

        }
        else{

            //Todo Do Some Network Request Here : Retrofit

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mSignUpPresenter.hideProgressDialog();
                    mSignUpPresenter.completeProcess("User Validation successfully done");
                }
            },2500);
        }
    }

    private boolean isError(SignupModal signupModal) {

        boolean isError = false;

        if(signupModal.getUserName() == null || signupModal.getUserName().length() == 0){

            isError = true;

            mSignUpPresenter.showError("User Name empty");

        }
        else  if(signupModal.getUserEmail() == null || signupModal.getUserEmail().length() == 0){

            isError = true;

            mSignUpPresenter.showError("User Email empty");
        }
        else  if(signupModal.getPassword() == null || signupModal.getPassword().length() == 0){

            isError = true;

            mSignUpPresenter.showError("User Pasword empty");
        }
        else  if(signupModal.getPasswordConf() == null || signupModal.getPasswordConf().length() == 0){

            isError = true;

            mSignUpPresenter.showError("User Conf Pasword empty");
        }
        else  if(signupModal.getContactNo() == null || signupModal.getContactNo().length() == 0){

            isError = true;

            mSignUpPresenter.showError("User Contact No empty");
        }

        // TODO: 4/2/2018
        // Not Included the Password == CpnfirmPassword and Valid Email case
        // Not Included Valid Contact No

        return isError;
    }
}

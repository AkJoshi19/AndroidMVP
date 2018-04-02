package com.main.mvp.main;

import android.os.Handler;

import com.main.mvp.modal.MainModal;

/**
 * Created by anjanik on 4/2/2018.
 */

public class MainPresenter {

    private MainPresenterImpl mMainPresenterImpl;

    public MainPresenter(MainPresenterImpl mainPresenterImpl){

        mMainPresenterImpl = mainPresenterImpl;
    }

    public void initProcess(){

        mMainPresenterImpl.showProgressDialog();

        //Todo Do Some Network Request Here : Retrofit

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                mMainPresenterImpl.hideProgressDialog();

                MainModal mainModal = new MainModal();
                mainModal.setUserName("Test user");
                mainModal.setUserEmail("test@gmail.com");
                mainModal.setContactNo("9988776655");
                mMainPresenterImpl.completeProcess(mainModal , "Process Completed!");
            }
        },2500);
    }

}

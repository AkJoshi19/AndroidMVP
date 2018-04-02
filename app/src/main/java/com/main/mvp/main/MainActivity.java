package com.main.mvp.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.main.mvp.R;
import com.main.mvp.modal.MainModal;

public class MainActivity extends AppCompatActivity implements MainPresenterImpl {

    private TextView txtViewUserName;
    private TextView txtViewUserEmail;
    private TextView txtViewUserContact;

    private ProgressBar progressBar;

    private MainPresenter mMainPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtViewUserName = findViewById(R.id.txt_usr_name);
        txtViewUserEmail = findViewById(R.id.txt_usr_email);
        txtViewUserContact = findViewById(R.id.txt_user_contact);

        progressBar     = findViewById(R.id.progress);

        mMainPresenter = new MainPresenter(this);

        mMainPresenter.initProcess();

    }

    @Override
    public void showProgressDialog() {

        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressDialog() {

        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void completeProcess(MainModal mainModal, String msgStr) {

        Toast.makeText(this, msgStr, Toast.LENGTH_SHORT).show();

        txtViewUserName.setText(mainModal.getUserName());
        txtViewUserEmail.setText(mainModal.getUserEmail());
        txtViewUserContact.setText(mainModal.getContactNo());
    }

    @Override
    public void showError(String erorMsg) {

        Toast.makeText(this, erorMsg, Toast.LENGTH_SHORT).show();
    }
}

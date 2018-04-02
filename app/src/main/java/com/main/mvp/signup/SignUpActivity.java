package com.main.mvp.signup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.main.mvp.R;
import com.main.mvp.main.MainActivity;
import com.main.mvp.modal.SignupModal;

public class SignUpActivity extends AppCompatActivity implements SignUpPresenterImpl, View.OnClickListener {

    private EditText edtTextUserName;
    private EditText edtTextUserEmail;
    private EditText edtTextUserPass;
    private EditText edtTextUserConfPass;
    private EditText edtTextUserContact;
    private Button btnViewSubmit;

    private ProgressBar progressBar;

    private SignUpPresenter mSignUpPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        edtTextUserName     = findViewById(R.id.edt_usr_name);
        edtTextUserEmail    = findViewById(R.id.edt_usr_email);
        edtTextUserPass     = findViewById(R.id.edt_user_password);
        edtTextUserConfPass = findViewById(R.id.edt_user_conf_password);
        edtTextUserContact  = findViewById(R.id.edt_user_contact);

        progressBar         = findViewById(R.id.progress);

        btnViewSubmit = findViewById(R.id.submit_button);

        mSignUpPresenter = new SignUpPresenter(this);

        /**
         *  Initialize Click Listener
         * */
        btnViewSubmit.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        if(view == btnViewSubmit){

            SignupModal signupModal = new SignupModal();

            signupModal.setUserName(edtTextUserName.getText().toString());
            signupModal.setUserEmail(edtTextUserEmail.getText().toString());
            signupModal.setPassword(edtTextUserPass.getText().toString());
            signupModal.setPasswordConf(edtTextUserConfPass.getText().toString());
            signupModal.setContactNo(edtTextUserContact.getText().toString());

            mSignUpPresenter.initProcess(signupModal);
        }
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
    public void completeProcess(String msgStr) {

        Toast.makeText(this , msgStr, Toast.LENGTH_SHORT).show();

        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    public void showError(String erorMsg) {

        Toast.makeText(this , erorMsg, Toast.LENGTH_SHORT).show();
    }
}

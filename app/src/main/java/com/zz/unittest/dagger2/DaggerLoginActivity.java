package com.zz.unittest.dagger2;

import android.os.Bundle;
import android.widget.EditText;

import com.zz.unittest.BaseActivity;
import com.zz.unittest.R;

import javax.inject.Inject;

public class DaggerLoginActivity extends BaseActivity {

    @Inject
    LoginPresenter mLoginPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dagger_login);
        ComponentHolder.getAppComponent().inject(this);
//        mLoginPresenter = ComponentHolder.getAppComponent().loginPresenter();

        findViewById(R.id.activity_dagger_login_btn).setOnClickListener(v -> login());
    }


    public void login() {
        String userName = ((EditText) findViewById(R.id.activity_dagger_login_user_name_ev)).getText().toString();
        String password = ((EditText) findViewById(R.id.activity_dagger_login_password_ev)).getText().toString();
        mLoginPresenter.login(userName, password);
    }

}

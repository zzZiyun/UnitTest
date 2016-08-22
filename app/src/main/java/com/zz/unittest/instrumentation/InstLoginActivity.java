package com.zz.unittest.instrumentation;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.zz.unittest.R;

public class InstLoginActivity extends Activity {
    public static String FirstString = "hello, android!";
    public static String SecondString = "hello, Instrumentation!";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_inst);
        ((TextView)findViewById(R.id.activity_login_inst_show_tv)).setText(FirstString);
        findViewById(R.id.activity_login_inst_login_btn).setOnClickListener((v) -> {
            ((TextView)findViewById(R.id.activity_login_inst_show_tv)).setText(SecondString);
        });
    }



}

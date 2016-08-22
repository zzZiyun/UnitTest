package com.zz.unittest.espresso;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.zz.unittest.R;

public class EspressoLoginActivity extends Activity {
    public static String FirstString = "hello, android!";
    public static String SecondString = "hello, Instrumentation!";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_espresso);
        ((TextView)findViewById(R.id.activity_login_espresso_show_tv)).setText(FirstString);
        findViewById(R.id.activity_login_espresso_login_btn).setOnClickListener((v) -> {
            ((TextView)findViewById(R.id.activity_login_espresso_show_tv)).setText(SecondString);
        });
    }



}

package com.zz.lambdatest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.zz.lambdatest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        findViewById(R.id.activity_main_test_tv).setOnClickListener((v)->
//            Toast.makeText(this, "11111", Toast.LENGTH_SHORT).show()
//        );

        ActivityMainBinding databinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        databinding.activityMainTestTv.setOnClickListener((v -> Toast.makeText(this, "11111", Toast.LENGTH_SHORT)
                .show()));

    }
}

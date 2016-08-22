package com.zz.unittest;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.widget.Toast;

import com.zz.unittest.dagger2.DaggerLoginActivity;
import com.zz.unittest.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    List<User> mUserList = new ArrayList<>(1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        findViewById(R.id.activity_main_test_tv).setOnClickListener((v)->
//            Toast.makeText(this, "11111", Toast.LENGTH_SHORT).show()
//        );

        ActivityMainBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        dataBinding.activityMainTestTv.setOnClickListener((v -> Toast.makeText(this, "11111", Toast.LENGTH_SHORT)
                .show()));
        dataBinding.activityDagger2TestBtn.setOnClickListener(v -> startDagger2TestActivity());

        User user = new User("11");
        mUserList.add(user);

    }

    private void startDagger2TestActivity() {
        Intent intent = new Intent();
        intent.setClass(this, DaggerLoginActivity.class);
        startActivity(intent);
    }


    public static class User {
        private String mUserName;

        public User(String userName) {
            mUserName = userName;
        }
    }
}

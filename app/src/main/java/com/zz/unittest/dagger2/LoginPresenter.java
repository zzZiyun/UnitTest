package com.zz.unittest.dagger2;

import android.text.TextUtils;

import com.zz.unittest.mockito.UserModel;

/**
 * <p>Description: com.zz.lambdatest.mockito</p>
 * <p>Copyright (c) 2016 www.oppo.com Inc. All rights reserved.</p>
 * <p>Company: OPPO</p>
 *
 * @author ZhengZhong
 *         Created at 2016/8/6.
 */
class LoginPresenter {
    private UserModel mUserModel;

    public LoginPresenter(UserModel userModel) {
        mUserModel = userModel;
    }

    public void login(String userName, String password) {
        if (!checkLoginInfo(userName, password)) return;

        mUserModel.performLogin(userName, password);
    }


    public boolean checkLoginInfo(String userName, String password) {
        if (TextUtils.isEmpty(userName) || TextUtils.isEmpty(password))
            return false;
        return true;
    }
}

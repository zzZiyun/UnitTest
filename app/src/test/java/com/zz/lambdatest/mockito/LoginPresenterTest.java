package com.zz.lambdatest.mockito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * <p>Description: com.zz.lambdatest.mockito</p>
 * <p>Copyright (c) 2016 www.oppo.com Inc. All rights reserved.</p>
 * <p>Company: OPPO</p>
 *
 * @author ZhengZhong
 *         Created at 2016/8/6.
 */
public class LoginPresenterTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testLogin() throws Exception {
        UserModel userModel = Mockito.mock(UserModel.class);
        LoginPresenter loginPresenter = new LoginPresenter(userModel);
        loginPresenter.login("xiaochuang", "123456");
        Mockito.verify(userModel).performLogin("xiaochuang", "123456");//验证在loginPresenter.login()中是否调用了performLogin()
    }

//    @Test
//    public void testCheckLoginInfo() throws Exception {
//
//    }
}
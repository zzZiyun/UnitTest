package com.zz.unittest.mockito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

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
        loginPresenter.login("13925240901", "123456");

        //验证在loginPresenter.login()中是否调用了performLogin()
        Mockito.verify(userModel).performLogin("13925240901", "123456");


//        //Mockito一些常用方法
//        TestImpl mockImpl = Mockito.mock(TestImpl.class);
//        System.out.println( "mock testLogin: " +  mockImpl.getCount());
//
//        TestImpl spyImpl = Mockito.spy(new TestImpl());
//        System.out.println("spy testLogin: " +  spyImpl.getCount());
//
//        Mockito.doReturn("value is ok").when(spyImpl).getValue();
//
//        Mockito.reset(spyImpl);
//
//        Mockito.when(spyImpl.getValue()).thenReturn("value is ok");//throw exception
    }

    public class TestImpl {
        List<String> mStringList = new ArrayList<>();

        public int getCount() {
            return 10;
        }

        public String getValue(){
            return mStringList.get(0);
        }
    }
}
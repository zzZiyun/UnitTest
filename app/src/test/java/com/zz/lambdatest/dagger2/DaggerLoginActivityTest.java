package com.zz.lambdatest.dagger2;


import android.widget.EditText;

import com.zz.lambdatest.R;
import com.zz.lambdatest.mockito.LoginPresenter;
import com.zz.lambdatest.mockito.UserModel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

/**
 * <p>Description: com.zz.lambdatest.dagger2</p>
 * <p>Copyright (c) 2016 www.oppo.com Inc. All rights reserved.</p>
 * <p>Company: OPPO</p>
 *
 * @author ZhengZhong
 *         Created at 2016/8/8.
 */

@RunWith(RobolectricGradleTestRunner.class)
@Config(manifest = "src/main/AndroidManifest.xml", sdk = 23)
public class DaggerLoginActivityTest {

    @Test
    public void testLogin() throws Exception {
//        RuntimeEnvironment.application
//        AppModule mockAppModule = Mockito.mock(AppModule.class);
        AppModule spyAppModule = Mockito.spy(new AppModule());
        LoginPresenter loginPresenter = Mockito.mock(LoginPresenter.class);

        AppComponent appComponent = DaggerAppComponent.builder().appModule(spyAppModule).build();
        //用mockAppModule来创建DaggerAppComponent
        ComponentHolder.setAppComponent(appComponent);

        Mockito.when(spyAppModule.provideLoginPresenter(Mockito.any(UserModel.class)))
                .thenReturn(loginPresenter);

        DaggerLoginActivity loginActivity = Robolectric.setupActivity(DaggerLoginActivity.class);
        ((EditText) loginActivity.findViewById(R.id.activity_dagger_login_user_name_ev)).setText("13925240901");
        ((EditText) loginActivity.findViewById(R.id.activity_dagger_login_password_ev)).setText("123456");
        loginActivity.findViewById(R.id.activity_dagger_login_btn).performClick();

        Mockito.verify(loginPresenter).login("13925240901", "123456");


    }



}
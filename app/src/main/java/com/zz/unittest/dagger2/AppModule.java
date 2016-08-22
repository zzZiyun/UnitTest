package com.zz.unittest.dagger2;


import com.zz.unittest.mockito.UserModel;

import dagger.Module;
import dagger.Provides;

/**
 * <p>Description: com.zz.lambdatest.dagger2</p>
 * <p>Copyright (c) 2016 www.oppo.com Inc. All rights reserved.</p>
 * <p>Company: OPPO</p>
 *
 * @author ZhengZhong
 *         Created at 2016/8/8.
 */
@Module
public class AppModule {

    // @Singleton
    @Provides
    public LoginPresenter provideLoginPresenter(UserModel userModel) {
        return new LoginPresenter(userModel);
    }

    @Provides
    public UserModel provideUserModel() {
        return new UserModel();
    }



}

package com.zz.lambdatest.dagger2;

import dagger.Component;

/**
 * <p>Description: com.zz.lambdatest.dagger2</p>
 * <p>Copyright (c) 2016 www.oppo.com Inc. All rights reserved.</p>
 * <p>Company: OPPO</p>
 *
 * @author ZhengZhong
 *         Created at 2016/8/8.
 */
@Component(modules = {AppModule.class})
public interface AppComponent {
//    LoginPresenter loginPresenter();

    void inject(DaggerLoginActivity daggerLoginActivity);
}

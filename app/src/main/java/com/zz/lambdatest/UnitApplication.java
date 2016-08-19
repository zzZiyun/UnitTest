package com.zz.lambdatest;

import android.app.Application;

import com.zz.lambdatest.dagger2.AppComponent;
import com.zz.lambdatest.dagger2.AppModule;
import com.zz.lambdatest.dagger2.ComponentHolder;
import com.zz.lambdatest.dagger2.DaggerAppComponent;

/**
 * <p>Description: com.zz.lambdatest</p>
 * <p>Copyright (c) 2016 www.oppo.com Inc. All rights reserved.</p>
 * <p>Company: OPPO</p>
 *
 * @author ZhengZhong
 *         Created at 2016/8/8.
 */
public class UnitApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
//        CrashReport.initCrashReport(getApplicationContext(), "900045813", true);
        AppComponent appComponent = DaggerAppComponent.builder().appModule(new AppModule()).build();
        ComponentHolder.setAppComponent(appComponent);
    }
}

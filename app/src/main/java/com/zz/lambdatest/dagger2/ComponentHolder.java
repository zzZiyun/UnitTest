package com.zz.lambdatest.dagger2;


/**
 * <p>Description: com.zz.lambdatest.dagger2</p>
 * <p>Copyright (c) 2016 www.oppo.com Inc. All rights reserved.</p>
 * <p>Company: OPPO</p>
 *
 * @author ZhengZhong
 *         Created at 2016/8/8.
 */
public class ComponentHolder {
    private static AppComponent sAppComponent;

    public static void setAppComponent(AppComponent appComponent) {
        sAppComponent = appComponent;
    }

    public static AppComponent getAppComponent() {
//        AppComponent appComponent = null;
//        if (sAppComponent == null){
//            appComponent = DaggerAppComponent.builder().appModule(new AppModule()).build();
//        }
//        Preconditions.checkNotNull(sAppComponent, "sAppComponent is null.");
        return sAppComponent;
    }
}

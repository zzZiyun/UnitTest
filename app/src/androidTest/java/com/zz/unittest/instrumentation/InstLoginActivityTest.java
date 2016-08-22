package com.zz.unittest.instrumentation;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.TextView;

import com.zz.unittest.R;

/**
 * <p>Description: com.zz.unittest.instrumentation</p>
 * <p>Copyright (c) 2016 www.oppo.com Inc. All rights reserved.</p>
 * <p>Company: OPPO</p>
 *
 * @author ZhengZhong
 *         Created at 2016/8/22.
 */
public class InstLoginActivityTest extends ActivityInstrumentationTestCase2<InstLoginActivity> {
    private InstLoginActivity mInstLoginActivity;
    private TextView mShowContentTV;
    private Button mLoginBtn;

    //incorrect
//    public EspressoLoginActivityTest(Class<InstLoginActivity> activityClass) {
//        super(activityClass);
//    }

    //好像必须要一个无参数
    public InstLoginActivityTest() {
        super(InstLoginActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        mInstLoginActivity = this.getActivity();
        mLoginBtn = (Button) mInstLoginActivity.findViewById(R.id.activity_login_inst_login_btn);
        mShowContentTV = (TextView) mInstLoginActivity.findViewById(R.id.activity_login_inst_show_tv);
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }

    //待测试方法必须是public且以test开头
    public void testButton() throws Exception {
        //在UI线程中操作
        mInstLoginActivity.runOnUiThread(() -> mLoginBtn.performClick());

        Thread.sleep(500); //加个延时，否则TextView内容还为更改，就已经做断言了
        assertEquals(InstLoginActivity.SecondString, mShowContentTV.getText().toString());
        //        assertEquals(InstLoginActivity.FirstString, mShowContentTV.getText().toString());
    }
}


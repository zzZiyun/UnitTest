package com.zz.unittest.espresso;

import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.zz.unittest.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.zz.unittest.espresso.EspressoLoginActivity.SecondString;

/**
 * <p>Description: com.zz.unittest.instrumentation</p>
 * <p>Copyright (c) 2016 www.oppo.com Inc. All rights reserved.</p>
 * <p>Company: OPPO</p>
 *
 * @author ZhengZhong
 *         Created at 2016/8/22.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class EspressoLoginActivityTest {

    @Rule
    public ActivityTestRule<EspressoLoginActivity> mActivityRule = new ActivityTestRule<>(
            EspressoLoginActivity.class);

    //待测试方法必须是public且以test开头
    @Test
    public void testButton() throws Exception {
        onView(withId(R.id.activity_login_espresso_login_btn)).perform(ViewActions.click());
        onView(withId(R.id.activity_login_espresso_show_tv)).check(ViewAssertions.matches(withText(SecondString)));
    }
}


package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by pavi on 25/2/17.
 */
@RunWith(AndroidJUnit4.class)
public class AsyncTest {

    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule<>(
            MainActivity.class);
    @Test
    public void testAsaync() {

        MainActivityFragment mainActivityFragment = new MainActivityFragment();

        String result = mainActivityFragment.getJoke(mActivityRule.getActivity());
        Assert.assertTrue(result.length() > 0 && !result.contains("failed"));
    }
}

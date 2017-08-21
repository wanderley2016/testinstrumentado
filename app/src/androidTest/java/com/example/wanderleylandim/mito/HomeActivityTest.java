package com.example.wanderleylandim.mito;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class HomeActivityTest {

    @Rule
    public ActivityTestRule<HomeActivity> mActivityTestRule = new ActivityTestRule<>(HomeActivity.class);

    @Test
    public void validandotituilo() {
        ViewInteraction textView = onView(
                allOf(withText("Apredendo com o mito"),
                        isDisplayed()));
        textView.check(matches(withText("Apredendo com o mito")));
    }


    @Test
    public void validandobotaook() {
        ViewInteraction button = onView(
                allOf(withId(R.id.btn_ok),
                        isDisplayed()));
        button.check(matches(isDisplayed()));

    }


    @Test
    public void validandoimagem() {
        onView(withId(R.id.btn_ok)).perform(click());
        onView(withId(R.id.action_image)).check(matches(isDisplayed()));
    }


    @Test
            public void validandomensagem(){
        ViewInteraction textView2 = onView(
                allOf(withId(R.id.text_home), withText("olá galera toque em Ok para chamar o zord"),
                        isDisplayed()));
        textView2.check(matches(withText("olá galera toque em Ok para chamar o zord")));



    }

}

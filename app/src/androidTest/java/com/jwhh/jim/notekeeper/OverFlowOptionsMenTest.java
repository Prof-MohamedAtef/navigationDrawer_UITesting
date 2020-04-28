package com.jwhh.jim.notekeeper;

import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anyOf;
import static org.junit.Assert.*;

public class OverFlowOptionsMenTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule=
            new ActivityTestRule(MainActivity.class);

    @Test
    public void TestOverFlowMenu(){

        try{
            openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        }catch (Exception e){

        }

        onView(anyOf(withText(R.string.action_settings),withId(R.id.action_settings))).perform(click());
    }

}
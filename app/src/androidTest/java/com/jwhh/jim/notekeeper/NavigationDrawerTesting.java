package com.jwhh.jim.notekeeper;

import android.support.test.espresso.contrib.DrawerActions;
import android.support.test.espresso.contrib.NavigationViewActions;
import android.support.test.rule.ActivityTestRule;
import android.view.Gravity;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.DrawerMatchers.isClosed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class NavigationDrawerTesting {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule=
            new ActivityTestRule(MainActivity.class);

    @Test
    public void clickOnYourNavigationItem_ShowsYourScreen() throws InterruptedException {

        //first open
        onView(withId(R.id.drawer_layout))
                .check(matches(isClosed(Gravity.LEFT)))   // Left Drawer should be closed.
                .perform(DrawerActions.open());  // Open Drawer

        onView(withId(R.id.nav_view))
                .perform(NavigationViewActions.navigateTo(R.id.nav_notes));
        Thread.sleep(1000);

        //second open
        onView(withId(R.id.drawer_layout))
                .check(matches(isClosed(Gravity.LEFT)))   // Left Drawer should be closed.
                .perform(DrawerActions.open());  // Open Drawer

        onView(withId(R.id.nav_view))
                .perform(NavigationViewActions.navigateTo(R.id.nav_courses));
        Thread.sleep(1000);

        //Third open
        onView(withId(R.id.drawer_layout))
                .check(matches(isClosed(Gravity.LEFT)))   // Left Drawer should be closed.
                .perform(DrawerActions.open());  // Open Drawer

        onView(withId(R.id.nav_view))
                .perform(NavigationViewActions.navigateTo(R.id.nav_share));
        Thread.sleep(1000);




    }

}
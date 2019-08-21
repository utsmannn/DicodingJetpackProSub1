package com.utsman.dicoding.jetpacksubmission1

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.utsman.dicoding.jetpacksubmission1.ui.MainActivity
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MyBehaviorTest {

    @Rule
    @JvmField
    var activityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testBehavior() {

        // swipe left
        onView(withId(R.id.main_view_pager)).perform(swipeLeft())

        // click on item 3: Dragon Ball
        onView(allOf(withId(R.id.recycler_view_main), isDisplayed()))
            .perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(2, click()))

        // click back
        onView(isRoot()).perform(pressBack())

        // swipe right
        onView(withId(R.id.main_view_pager)).perform(swipeRight())

        // swipe bottom to position 9: How to train your dragon
        onView(allOf(withId(R.id.recycler_view_main), isDisplayed()))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(8))

        // click on item 9: How to train your dragon
        onView(allOf(withId(R.id.recycler_view_main), isDisplayed()))
            .perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(8, click()))

        // back on main activity
        onView(isRoot()).perform(pressBack())
    }

}
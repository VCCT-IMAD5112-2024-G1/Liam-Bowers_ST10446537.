package com.example.assignmenttwo

class MyUnitTest {
}import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivity2Test {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity2::class.java)

    @Test
    fun testHappyButton() {
        // Click on the happy button
        Espresso.onView(ViewMatchers.withId(R.id.happyBtn)).perform(ViewActions.click())

        // Check if the happy text view displays "Happy!"
        Espresso.onView(ViewMatchers.withId(R.id.happyLvl))
            .check(ViewAssertions.matches(ViewMatchers.withText("Happy!")))
    }

    @Test
    fun testDirtyButton() {
        // Click on the dirty button
        Espresso.onView(ViewMatchers.withId(R.id.dirtyBtn)).perform(ViewActions.click())

        // Check if the dirty text view displays "Clean!"
        Espresso.onView(ViewMatchers.withId(R.id.dirtyLvl))
            .check(ViewAssertions.matches(ViewMatchers.withText("Clean!")))
    }

    @Test
    fun testFeedButton() {
        // Click on the feed button
        Espresso.onView(ViewMatchers.withId(R.id.feedBtn)).perform(ViewActions.click())

        // Check if the feed text view displays "Fed!"
        Espresso.onView(ViewMatchers.withId(R.id.feedLvl))
            .check(ViewAssertions.matches(ViewMatchers.withText("Fed!")))
    }
}

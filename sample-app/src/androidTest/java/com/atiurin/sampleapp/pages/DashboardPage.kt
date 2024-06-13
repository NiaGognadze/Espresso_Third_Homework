package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withClassName
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withParent
import com.atiurin.sampleapp.R
import org.hamcrest.CoreMatchers.endsWith
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object DashboardPage {
    fun getFriendNameByText (text: String): Matcher<View> {
        val monica: Matcher<View> by lazy {
            Matchers.allOf(
                ViewMatchers.withId(R.id.tv_name),
                ViewMatchers.withText(text)
            )
        }
        return monica
    }

    val toolbarMenuButton: Matcher<View> by lazy { Matchers.allOf(
        withParent(withId(R.id.toolbar)),
        withClassName(endsWith("ImageButton"))
    )}
}
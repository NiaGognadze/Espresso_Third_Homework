package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher

object CustomClicksPage {
    val customClickPage: Matcher<View> by lazy { withId(R.id.frameLayout) }
    val circleTopLeft: Matcher<View> by lazy { withId(R.id.rB_top_left) }
    val circleBottomLeft: Matcher<View> by lazy { withId(R.id.rB_bottom_left) }
    val circleTopRight: Matcher<View> by lazy { withId(R.id.rB_top_right) }
    val circleBottomRight: Matcher<View> by lazy { withId(R.id.rB_bottom_right) }
}
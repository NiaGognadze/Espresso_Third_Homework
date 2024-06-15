package com.atiurin.sampleapp.pages


import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
object ElementsPage {
    val simpleBtn: Matcher<View> by lazy { withId(R.id.button1) }
    val EnableBtn: Matcher<View> by lazy { withId(R.id.checkbox_enable) }
    val clickableBtn: Matcher<View> by lazy { withId(R.id.checkbox_clickable) }
    val invisibleElement: Matcher<View> by lazy { withId(R.id.radio_invisible) }
    val lastEventStatus: Matcher<View> by lazy { withId(R.id.last_event_status) }

}
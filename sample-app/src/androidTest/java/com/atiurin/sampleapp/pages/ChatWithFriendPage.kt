package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object ChatWithFriendPage {
    val messageInputField: Matcher<View> by lazy { withId(R.id.message_input_text) }
    val sendButton: Matcher<View> by lazy { withId(R.id.send_button) }

    fun toolbarFriendName(
        friendName: String
    ): Matcher<View> = Matchers.allOf(withId(R.id.toolbar_title), withText(friendName))

    fun messageSent(
        text: String
    ): Matcher<View> = Matchers.allOf(withId(R.id.message_text), withText(text))
}

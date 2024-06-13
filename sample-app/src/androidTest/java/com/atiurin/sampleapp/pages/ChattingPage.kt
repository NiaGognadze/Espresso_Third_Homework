package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.Constants.ConstantData.MESSAGE_TEXT
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object ChattingPage {
    val messageInputText: Matcher<View> by lazy { ViewMatchers.withId(R.id.message_input_text) }
    val sendButton: Matcher<View> by lazy { ViewMatchers.withId(R.id.send_button) }
    val messageText: Matcher<View> by lazy {
        Matchers.allOf(
            ViewMatchers.withId(R.id.message_text),
            ViewMatchers.withText(MESSAGE_TEXT)
        )
    }
    }

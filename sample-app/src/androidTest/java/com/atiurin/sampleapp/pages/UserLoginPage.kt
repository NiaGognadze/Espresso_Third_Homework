package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher

object UserLoginPage {
    val usernameInputField: Matcher<View> by lazy { ViewMatchers.withId(R.id.et_username) }
    val passwordInputField: Matcher<View> by lazy { ViewMatchers.withId(R.id.et_password) }
    val loginButton: Matcher<View> by lazy { ViewMatchers.withId(R.id.login_button) }
}

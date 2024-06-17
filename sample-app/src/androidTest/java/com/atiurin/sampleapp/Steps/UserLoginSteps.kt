package com.atiurin.sampleapp.Steps

import com.atiurin.sampleapp.Constants.ConstantData.TIMEOUT_DURATION
import com.atiurin.sampleapp.data.repositories.CURRENT_USER
import com.atiurin.sampleapp.helper.typeText
import com.atiurin.sampleapp.pages.UserLoginPage
import com.atiurin.ultron.extensions.tap

object UserLoginSteps {
    fun enterDefaultUsername() {
        UserLoginPage.usernameInputField.typeText(CURRENT_USER.login, TIMEOUT_DURATION)
    }

    fun enterDefaultPassword() {
        UserLoginPage.passwordInputField.typeText(CURRENT_USER.password, TIMEOUT_DURATION)
    }

    fun tapLoginButton() {
        UserLoginPage.loginButton.tap()
    }
}

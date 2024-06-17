package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.data.repositories.CURRENT_USER
import com.atiurin.sampleapp.framework.Log
import com.atiurin.sampleapp.managers.AccountManager
import com.atiurin.ultron.testlifecycle.rulesequence.RuleSequence
import com.atiurin.ultron.testlifecycle.setupteardown.SetUpRule
import org.junit.Rule

abstract class BaseTest {
    private val setupRule = SetUpRule().add {
        Log.info("Logging in with valid user credentials")
        loginWithCurrentUser()
    }

    @get:Rule
    open val ruleSequence = RuleSequence(setupRule)

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    private fun loginWithCurrentUser() {
        AccountManager(InstrumentationRegistry.getInstrumentation().targetContext).login(
            CURRENT_USER.login,
            CURRENT_USER.password
        )
    }
}

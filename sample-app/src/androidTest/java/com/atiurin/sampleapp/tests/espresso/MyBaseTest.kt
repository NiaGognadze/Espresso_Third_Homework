package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.atiurin.sampleapp.Steps.UserLoginSteps
import com.atiurin.sampleapp.activity.LoginActivity
import com.atiurin.ultron.testlifecycle.rulesequence.RuleSequence
import com.atiurin.ultron.testlifecycle.setupteardown.SetUpRule
import org.junit.Rule

abstract class MyBaseTest {
    private val setupRule = SetUpRule().add {
        UserLoginSteps.apply {
            enterDefaultUsername()
            enterDefaultPassword()
            tapLoginButton()
        }
    }

    @get:Rule
    val activityTestRule = ActivityScenarioRule(LoginActivity::class.java)

    @get:Rule
    open val ruleSequence = RuleSequence(setupRule)
}

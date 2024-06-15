package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.Constants.ConstantData
import com.atiurin.sampleapp.Constants.ConstantData.MENU_ITEM_TEXT
import com.atiurin.sampleapp.Constants.ConstantData.NUMBER_OF_CLICKS
import com.atiurin.sampleapp.Steps.BurgerMenuPageSteps
import com.atiurin.sampleapp.Steps.DashboardPageSteps
import com.atiurin.sampleapp.Steps.ElementsSteps
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.tests.BaseTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class UIElementsTest : BaseTest() {
    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {
        with(DashboardPageSteps) {
            validateDashboard(ConstantData.DASHBOARD_TEXT)
            openBurgerMenu()
        }
        with(BurgerMenuPageSteps) {
            tapMenuItem(MENU_ITEM_TEXT)
        }
        ElementsSteps.validationUIElementsDisplay()
    }

    @Test
    fun uiElementsTest() {
        with(ElementsSteps) {
            unMarkEnableBtn()
            unMarkClickableBtn()
            validateSimpleBtnIsDisabled()
            validateSimpleBtnIsNotClickable()
        }
    }

    @Test
    fun btnClickTest() {
        with(ElementsSteps) {
            clickOnSimpleButton(NUMBER_OF_CLICKS)
            validateNumberOfClicks(NUMBER_OF_CLICKS)
        }
    }


    @After
    fun tearDown() {
        with(ElementsSteps) {
            tapInvisibleElement()
            validateSimpleBtnIsInvisible()
        }
    }
}

package com.atiurin.sampleapp.tests.espresso

import ChattingSteps
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.Constants.ConstantData.DASHBOARD_TEXT
import com.atiurin.sampleapp.Constants.ConstantData.FRIEND_TEXT
import com.atiurin.sampleapp.Constants.ConstantData.MENU_ITEM_TEXT
import com.atiurin.sampleapp.Constants.ConstantData.MESSAGE_TEXT
import com.atiurin.sampleapp.Steps.BurgerMenuPageSteps
import com.atiurin.sampleapp.Steps.CustomClicksPageSteps
import com.atiurin.sampleapp.Steps.DashboardPageSteps
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.tests.BaseTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class GreetingTests : BaseTest() {

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun chatWithMyFriend(){
            DashboardPageSteps.validateDashboard(DASHBOARD_TEXT)
            DashboardPageSteps.startingChat()
            ChattingSteps
                .validateNameOfAddressee(FRIEND_TEXT)
            .typingMessage(MESSAGE_TEXT)
            .sendingMessage()
            .validationSendMessage()
    }

    @Test
    fun customClickTests() {
        DashboardPageSteps
            .validateDashboard(DASHBOARD_TEXT)
            .openBurgerMenu()
        BurgerMenuPageSteps
            .tapMenuItem(MENU_ITEM_TEXT)
        CustomClicksPageSteps.validationCustomClickDisplay()
        CustomClicksPageSteps
            .tapTopLeftCircle()
        CustomClicksPageSteps.tapBottomLeftCircle()
        CustomClicksPageSteps.tapTopRightCircle()
        CustomClicksPageSteps.tapBottomRightCircle()
        CustomClicksPageSteps.validateTopLeftCircleChecked()
        CustomClicksPageSteps.validateTopRightCircleChecked()
        CustomClicksPageSteps.validateTopRightCircleChecked()
        CustomClicksPageSteps.validateBottomRightCircleChecked()

    }
}
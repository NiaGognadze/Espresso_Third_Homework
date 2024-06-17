package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.Constants.ConstantData
import com.atiurin.sampleapp.Steps.DashboardPageSteps
import com.atiurin.sampleapp.steps.ChatWithFriendSteps
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class WeekendVibeTests : MyBaseTest() {

    @Before
    fun setUp() {
        DashboardPageSteps.apply {
            validateDashboard(ConstantData.DASHBOARD_TEXT)
        }
    }

    @Test
    fun scrollToEmmetTest() {
        with(ConstantData) {
            DashboardPageSteps.apply {
                findFriend(FRIEND_ONE, DashboardPageSteps.ScrollStep.DOWN)
                openFriendChat(FRIEND_ONE)
            }
            ChatWithFriendSteps.apply {
                validateFriendChatPageIsDisplayed(FRIEND_ONE)
                enterTextInInputField(FRIEND_ONE_MESSAGE)
                tapSendButton()
                validateSentMessageIsDisplayed(FRIEND_ONE_MESSAGE)
            }
        }
    }

    @Test
    fun scrollToFriend17Test() {
        with(ConstantData) {
            DashboardPageSteps.apply {
                findFriend(FRIEND_TWO, DashboardPageSteps.ScrollStep.DOWN)
                openFriendChat(FRIEND_TWO)
            }
            ChatWithFriendSteps.apply {
                validateFriendChatPageIsDisplayed(FRIEND_TWO)
                enterTextInInputField(FRIEND_TWO_MESSAGE)
                tapSendButton()
                validateSentMessageIsDisplayed(FRIEND_ONE_MESSAGE)
            }
        }
    }

    @Test
    fun scrollToFriend25Test() {
        with(ConstantData) {
            DashboardPageSteps.apply {
                findFriend(FRIEND_THREE, DashboardPageSteps.ScrollStep.DOWN)
                openFriendChat(FRIEND_THREE)
            }
            ChatWithFriendSteps.apply {
                validateFriendChatPageIsDisplayed(FRIEND_THREE)
                enterTextInInputField(FRIEND_THREE_MESSAGE)
                tapSendButton()
                validateSentMessageIsDisplayed(FRIEND_THREE_MESSAGE)
            }
        }
    }
}

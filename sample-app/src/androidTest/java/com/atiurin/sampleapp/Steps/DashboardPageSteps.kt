package com.atiurin.sampleapp.Steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers.isRoot
import com.atiurin.sampleapp.Constants.ConstantData
import com.atiurin.sampleapp.helper.isTextOnScreen
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.DashboardPage
import com.atiurin.ultron.extensions.tap
import org.junit.Assert



object DashboardPageSteps {
    fun validateDashboard(text: String): DashboardPageSteps {
        Assert.assertTrue(ConstantData.DASHBOARD_VALIDATION_MESSAGE, isTextOnScreen(text))
        return this
    }

    fun startingChat(): DashboardPageSteps {
        DashboardPage.getFriendNameByText(ConstantData.FRIEND_TEXT).tap()
        return this
    }

    fun openBurgerMenu(): DashboardPageSteps {
        DashboardPage.toolbarMenuButton.tap()
        return this
    }

    enum class ScrollStep {
        UP, DOWN
    }

    fun findFriend(name: String, directionToScroll: ScrollStep) {
        var i = 0
        while (!DashboardPage.profileWithName(name).isViewDisplayed() && i <= 10) {
            performScroll(directionToScroll)
            i++
        }
        require(i <= 10) { String.format(ConstantData.FRIEND_PROFILE_FEEDBACK_MESSAGE, name) }
    }

    fun openFriendChat(name: String) {
        DashboardPage.profileWithName(name).tap()
    }

    private fun performScroll(direction: ScrollStep) {
        checkValidDirection(direction)
        executeScroll(direction)
    }

    private fun checkValidDirection(direction: ScrollStep) {
        require(direction in ScrollStep.values()) {
            ConstantData.SCROLL_DIRECTION_MESSAGE
        }
    }

    private fun executeScroll(direction: ScrollStep) {
        when (direction) {
            ScrollStep.UP -> scrollSlowlyUp()
            ScrollStep.DOWN -> scrollSlowlyDown()
        }
    }

    private fun scrollSlowlyUp() {
        onView(isRoot()).perform(ViewActions.swipeUp())
    }

    private fun scrollSlowlyDown() {
        onView(isRoot()).perform(ViewActions.swipeDown())
    }
}

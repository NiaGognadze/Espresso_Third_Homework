package com.atiurin.sampleapp.Steps

import com.atiurin.sampleapp.Constants.ConstantData
import com.atiurin.sampleapp.Constants.ConstantData.DASHBOARD_VALIDATION_MESSAGE
import com.atiurin.sampleapp.helper.isTextOnScreen
import com.atiurin.sampleapp.pages.DashboardPage
import com.atiurin.ultron.extensions.tap
import org.junit.Assert

object DashboardPageSteps {
    fun validateDashboard(text: String): DashboardPageSteps {
        Assert.assertTrue(DASHBOARD_VALIDATION_MESSAGE, isTextOnScreen(text))
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
}
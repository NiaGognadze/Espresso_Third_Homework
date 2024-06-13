package com.atiurin.sampleapp.Steps

import com.atiurin.sampleapp.Constants.ConstantData.CIRCLE_MESSAGE_BOTTOM_LEFT
import com.atiurin.sampleapp.Constants.ConstantData.CIRCLE_MESSAGE_BOTTOM_RIGHT
import com.atiurin.sampleapp.Constants.ConstantData.CIRCLE_MESSAGE_TOP_LEFT
import com.atiurin.sampleapp.Constants.ConstantData.CIRCLE_MESSAGE_TOP_RIGHT
import com.atiurin.sampleapp.Constants.ConstantData.CUSTOM_CLICK_DISPLAY_MESSAGE
import com.atiurin.sampleapp.helper.isChecked
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.ultron.extensions.tap
import com.atiurin.sampleapp.pages.CustomClicksPage
import org.junit.Assert

object CustomClicksPageSteps {
    fun validationCustomClickDisplay() {
        Assert.assertTrue(CUSTOM_CLICK_DISPLAY_MESSAGE,CustomClicksPage.customClickPage.isViewDisplayed())
    }
    fun tapTopLeftCircle() {
        CustomClicksPage.circleTopLeft.tap()
    }

    fun tapBottomLeftCircle() {
        CustomClicksPage.circleBottomLeft.tap()
    }
    fun tapTopRightCircle() {
        CustomClicksPage.circleTopRight.tap()
    }

    fun tapBottomRightCircle() {
        CustomClicksPage.circleBottomRight.tap()
    }
    fun validateTopLeftCircleChecked() {
        Assert.assertTrue(CIRCLE_MESSAGE_TOP_LEFT, CustomClicksPage.circleTopLeft.isChecked())
    }
    fun validateTopRightCircleChecked() {
        Assert.assertTrue(CIRCLE_MESSAGE_TOP_RIGHT, CustomClicksPage.circleTopRight.isChecked())
    }
    fun validateBottomLeftCircleChecked() {
        Assert.assertTrue(CIRCLE_MESSAGE_BOTTOM_LEFT, CustomClicksPage.circleBottomLeft.isChecked())
    }
    fun validateBottomRightCircleChecked() {
        Assert.assertTrue(CIRCLE_MESSAGE_BOTTOM_RIGHT, CustomClicksPage.circleBottomRight.isChecked())
    }
}
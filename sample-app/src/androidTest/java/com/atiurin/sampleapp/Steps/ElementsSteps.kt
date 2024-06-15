package com.atiurin.sampleapp.Steps

import com.atiurin.sampleapp.Constants.ConstantData
import com.atiurin.sampleapp.pages.ElementsPage
import com.atiurin.ultron.custom.espresso.action.getText
import com.atiurin.ultron.extensions.isDisplayed
import com.atiurin.ultron.extensions.isNotClickable
import com.atiurin.ultron.extensions.isNotDisplayed
import com.atiurin.ultron.extensions.isNotEnabled
import com.atiurin.ultron.extensions.tap
import org.junit.After
import org.junit.Assert

object ElementsSteps {
    fun validationUIElementsDisplay() {
        ElementsPage.simpleBtn.isDisplayed()
        ElementsPage.EnableBtn.isDisplayed()
        ElementsPage.clickableBtn.isDisplayed()
        ElementsPage.invisibleElement.isDisplayed()
    }

    fun unMarkEnableBtn() {
        ElementsPage.EnableBtn.tap()
    }

    fun unMarkClickableBtn() {
        ElementsPage.clickableBtn.tap()
    }

    fun validateSimpleBtnIsDisabled() {
        ElementsPage.simpleBtn.isNotEnabled()
    }

    fun validateSimpleBtnIsNotClickable() {
        ElementsPage.simpleBtn.isNotClickable()
    }

    fun tapInvisibleElement() {
        ElementsPage.invisibleElement.tap()
    }

    fun validateSimpleBtnIsInvisible() {
        ElementsPage.simpleBtn.isNotDisplayed()
    }

    fun clickOnSimpleButton(number: Int) {
        repeat(number) {
            ElementsPage.simpleBtn.tap()
        }
    }

    fun validateNumberOfClicks(number: Int) {
        val statusText = ElementsPage.lastEventStatus.getText()
        Assert.assertEquals(
            ConstantData.CLICKS_MESSAGE,
            statusText.split(" ").last().toInt(),
            number
        )
    }
}



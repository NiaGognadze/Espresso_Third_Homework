package com.atiurin.sampleapp.Steps
import com.atiurin.sampleapp.pages.BurgerMenuPage
import com.atiurin.ultron.extensions.tap

object BurgerMenuPageSteps {
    fun tapMenuItem(menuText: String) {
        BurgerMenuPage.getMenuItem(menuText).tap()
    }
}
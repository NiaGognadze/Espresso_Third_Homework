package com.atiurin.sampleapp.pages
import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object BurgerMenuPage {

    fun selectMenuItemByText(text: String): Matcher<View> {
        val customClicks: Matcher<View> by lazy { Matchers.allOf(
            withId(R.id.design_menu_item_text),
            withText(text)
        )}
        return customClicks
    }
    fun getMenuItem(menuText: String): Matcher<View> {
        return selectMenuItemByText(menuText)

    }
}
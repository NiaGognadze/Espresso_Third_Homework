package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.Constants.ConstantData.CHAT_FEEDBACK_MESSAGE
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.ChatWithFriendPage
import com.atiurin.ultron.extensions.tap
import com.atiurin.ultron.extensions.typeText
import org.junit.Assert

object ChatWithFriendSteps {
    fun validateFriendChatPageIsDisplayed(friendName: String) {
        Assert.assertTrue(
            CHAT_FEEDBACK_MESSAGE,
            ChatWithFriendPage.toolbarFriendName(friendName).isViewDisplayed()
        )
    }

    fun tapSendButton() {
        ChatWithFriendPage.sendButton.tap()
    }

    fun enterTextInInputField(text: String) {
        ChatWithFriendPage.messageInputField.typeText(text)
    }

    fun validateSentMessageIsDisplayed(text: String) {
        Assert.assertTrue(ChatWithFriendPage.messageSent(text).isViewDisplayed())
    }
}

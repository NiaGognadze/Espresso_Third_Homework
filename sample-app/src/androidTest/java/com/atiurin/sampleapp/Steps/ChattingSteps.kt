
import com.atiurin.sampleapp.Constants.ConstantData.FRIEND_NAME_ERROR_MESSAGE
import com.atiurin.sampleapp.helper.isTextOnScreen
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.ChattingPage
import com.atiurin.ultron.extensions.tap
import com.atiurin.ultron.extensions.typeText
import org.junit.Assert

object ChattingSteps {
    fun validateNameOfAddressee(text: String): ChattingSteps {
        Assert.assertTrue(FRIEND_NAME_ERROR_MESSAGE,isTextOnScreen(text))
        return this
    }

    fun typingMessage(text: String): ChattingSteps {
        ChattingPage.messageInputText.typeText(text)
        return this
    }

    fun sendingMessage(): ChattingSteps {
        ChattingPage.sendButton.tap()
        return this
    }

    fun validationSendMessage(): ChattingSteps {
        Assert.assertTrue(ChattingPage.messageText.isViewDisplayed())
        return this
    }
}

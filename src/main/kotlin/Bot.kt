import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Update

class Bot : TelegramLongPollingBot() {

    override fun onUpdateReceived(update: Update) {
        execute(SendMessage(update.message.chatId.toString(), "Hello"))

    }

    override fun getBotToken(): String {
        return "5353941591:AAHi5O6bXlAGM5Twm7sqNqs5ecdjcKgKPsQ"
    }

    override fun getBotUsername(): String {
        return "@currencycourse_bot"
    }
}
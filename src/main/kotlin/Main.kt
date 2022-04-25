import org.telegram.telegrambots.meta.TelegramBotsApi
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession

fun main() {
    val bot = Bot()
    TelegramBotsApi(DefaultBotSession::class.java).registerBot(bot)
}
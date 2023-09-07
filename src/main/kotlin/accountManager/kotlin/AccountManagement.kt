package accountManager.kotlin

import java.lang.NumberFormatException

class Account()

object AccountManager {
    val accountList = mutableListOf<Account>()
    fun run() {
        while (true) {
            try {
                when(readln().toInt()) {
                    0 -> { /* 종료 */}
                    1 -> { /* 1번 로직 */}
                    else -> {
                        println("메뉴 번호 제대로 입력")
                        continue
                    }
                }
            } catch (e : NumberFormatException) {
                println("숫자를 입력해주세요")
                continue
            }
        }
    }
}
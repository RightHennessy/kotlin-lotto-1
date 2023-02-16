package lotto.exception

import lotto.controller.Controller

object Validator {
    private const val MONEY_NOT_NUMBER_ERROR = "금액은 숫자여야 합니다."
    private const val MONEY_NEGATIVE_NUMBER_ERROR = "금액은 양수여야 합니다."
    private const val MONEY_UNIT_ERROR = "금액은 1000원 단위여야 합니다."
    private const val BONUS_NOT_NUMBER_ERROR = "보너스 볼은 숫자여야 합니다."

    fun checkInputMoney(input: String) {
        val number = input.toIntOrNull()
        require(number != null) { MONEY_NOT_NUMBER_ERROR }
        require(number > 0) { MONEY_NEGATIVE_NUMBER_ERROR }
        require(number % Controller.MONEY_UNIT == 0) { MONEY_UNIT_ERROR }
    }

    fun checkInputBonusNumber(input: String) {
        require(input.toIntOrNull() != null) { BONUS_NOT_NUMBER_ERROR }
    }
}

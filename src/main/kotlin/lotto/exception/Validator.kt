package lotto.exception

object Validator {
    private const val MONEY_NOT_NUMBER_ERROR = "금액은 숫자여야 합니다."
    private const val MONEY_NEGATIVE_NUMBER_ERROR = "금액은 양수여야 합니다."
    private const val MONEY_UNIT_ERROR = "금액은 1000원 단위여야 합니다."
    private const val BONUS_NOT_NUMBER_ERROR = "보너스 볼은 숫자여야 합니다."
    private const val BONUS_RANGE_ERROR = "보너스 볼은 1과 45 사이여야 합니다."

    fun checkInputMoney(input: String) {
        val number = input.toIntOrNull()
        require(number != null) { MONEY_NOT_NUMBER_ERROR }
        require(number > 0) { MONEY_NEGATIVE_NUMBER_ERROR }
        require(number % 1000 == 0) { MONEY_UNIT_ERROR }
    }

    fun checkInputBonusNumber(input: String) {
        val number = input.toIntOrNull()
        require(number != null) { BONUS_NOT_NUMBER_ERROR }
        require(number in (1..45)) { BONUS_RANGE_ERROR }
    }
}
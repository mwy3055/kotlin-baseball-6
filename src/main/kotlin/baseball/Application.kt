package baseball

import camp.nextstep.edu.missionutils.Randoms

fun main() {
    TODO("프로그램 구현")
}

fun generateAnswer(): String {
    val digits = Randoms.pickUniqueNumbersInRange(1, 9, 3)
    return digits.joinToString(separator = "")
}
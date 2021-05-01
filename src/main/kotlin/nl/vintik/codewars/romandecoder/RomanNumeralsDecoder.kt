package nl.vintik.codewars.romandecoder

fun decode(str: String): Int {
    val mapping = mapOf(
        'M' to 1_000,
        'D' to 500,
        'C' to 100,
        'L' to 50,
        'X' to 10,
        'V' to 5,
        'I' to 1
    )
    var result = 0;
    if (str != null && str.isNotBlank()) {
        val reversedArray = str.toCharArray().reversedArray()
        for ((index, romanLetter) in reversedArray.iterator().withIndex()) {
            if (index == 0) {
                result = mapping[romanLetter]!!
            } else {
                val currentNumber = mapping[romanLetter]!!
                val previousNumber = mapping[reversedArray[index - 1]]!!
                if (currentNumber >= previousNumber) {
                    result += currentNumber
                } else {
                    result -= currentNumber
                }
            }
        }
    }
    return result;
}


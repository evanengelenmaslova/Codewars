package nl.vintik.codewars.circlenumbers

fun circleOfNumbers(n: Int, firstNumber: Int): Int {
    if (n < 4 || n > 1000) {
        return 0
    }
    val half = n / 2

    if (firstNumber == half) {
        return 0
    } else if (firstNumber < half) {
        return firstNumber + half
    } else {
        return firstNumber - half
    }
}
package nl.vintik.codewars.circlenumbers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


internal class CircleOfNumbersTest {

    @Test
    fun basicTests() {
        assertEquals(7, circleOfNumbers(10, 2))
        assertEquals(2, circleOfNumbers(10, 7))
        assertEquals(3, circleOfNumbers(4, 1))
        assertEquals(0, circleOfNumbers(6, 3))
        assertEquals(10, circleOfNumbers(20, 0))
        assertEquals(5, circleOfNumbers(7, 2))
    }
}
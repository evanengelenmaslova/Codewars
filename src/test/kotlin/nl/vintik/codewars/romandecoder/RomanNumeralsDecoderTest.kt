package nl.vintik.codewars.romandecoder

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RomanNumeralsDecoderTest {

    @Test
    fun basicTest() {
        assertEquals(0, decode(""))
        assertEquals(1, decode("I"))
        assertEquals(4, decode("IV"))
        assertEquals(21, decode("XXI"))
        assertEquals(2008, decode("MMVIII"))
        assertEquals(1666, decode("MDCLXVI"))
        assertEquals(3109, decode("MMMCIX"))
    }

}
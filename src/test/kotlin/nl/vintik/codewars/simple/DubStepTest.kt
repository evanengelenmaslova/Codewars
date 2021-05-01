package nl.vintik.codewars.simple

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DubStepTest{
    @Test
    fun test1() {
        assertEquals("ABC", songDecoder("WUBWUBABCWUB"))
    }

    @Test
    fun test2() {
        assertEquals("R L", songDecoder("RWUBWUBWUBLWUB"))
    }
}
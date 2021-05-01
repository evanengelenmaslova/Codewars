package nl.vintik.codewars.simple

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CamelCaseTest{

    @Test
    fun testCamel() {
        assertEquals("theStealthWarrior", toCamelCase("the_Stealth_Warrior"))
    }
}
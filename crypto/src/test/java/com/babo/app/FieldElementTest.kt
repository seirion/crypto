package com.babo.app

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class FieldElementTest {

    @Test
    fun filedEquality() {
        val a = FieldElement(7, 13)
        val b = FieldElement(6, 13)
        assertNotEquals(a, b)
        assertEquals(a, a)
    }
}
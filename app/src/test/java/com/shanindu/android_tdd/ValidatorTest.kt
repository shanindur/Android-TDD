package com.shanindu.android_tdd

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ValidatorTest {

    @Test
    fun whenEmailIsValid() {
        val email = "shanindu@gmail.com"
        val result = Validator.validateEmail(email)
        assertEquals(true, result)
    }

    @Test
    fun whenEmailIsInvalid() {
        val email = "invalid-email"
        val result = Validator.validateEmail(email)
        assertEquals(false, result)
    }

}
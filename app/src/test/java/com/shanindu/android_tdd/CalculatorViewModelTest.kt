package com.shanindu.android_tdd

import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class CalculatorViewModelTest {

    private lateinit var viewModel: CalculatorViewModel

    @Before
    fun setUp() {
        viewModel = CalculatorViewModel()
    }

    @Test
    fun `calculateSum returns correct result`() {
        val result = viewModel.calculateSum(2, 3)
        assertEquals(5, result)
    }
}
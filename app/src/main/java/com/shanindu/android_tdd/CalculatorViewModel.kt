package com.shanindu.android_tdd

import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {
    fun calculateSum(a: Int, b: Int): Int {
        return a + b
    }
}
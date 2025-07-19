package com.masahikokobayashi.androidlab

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTest {
    @Test
    fun calculateTip_20PercentNoRoundup() {
        val amount = 10.0
        val tipPercent = 20.0
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(
            amount = amount,
            tipPercent = tipPercent,
            roundUp = false
        )
        assertEquals(expectedTip, actualTip)
    }
}

package com.github.masx200.nowcoder_test.提取不重复的整数

import com.github.masx200.nowcoder_test.utils.MockTest

import kotlin.test.assertEquals

class MainKtTest {

    @org.junit.jupiter.api.Test
    fun Testmain() {
        val result = MockTest(
            "9876673",
        ) {
            main(arrayOf())
        }
        assertEquals("37689", result[0].trim())
    }

}
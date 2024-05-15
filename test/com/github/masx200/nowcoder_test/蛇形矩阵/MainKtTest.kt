package com.github.masx200.nowcoder_test.蛇形矩阵

import com.github.masx200.nowcoder_test.utils.MockTest
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class MainKtTest {
    @Test
    fun mainTest2() {


        assertContentEquals(
            """1 3 6 10
2 5 9
4 8
7""".trimIndent().split("\n").map { it.trim() },
            MockTest("4" + "\n") { main(arrayOf()) }[0].trimIndent().split("\n").map { it.trim() }
        )
    }

    @Test
    fun mainTest() {


        assertContentEquals(
            """1 3 6 10 15
            2 5 9 14
            4 8 13
            7 12
            11""".trimIndent().split("\n").map { it.trim() },
            MockTest("5" + "\n") { main(arrayOf()) }[0].trimIndent().split("\n").map { it.trim() }
        )
    }
}
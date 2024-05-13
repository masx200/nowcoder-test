package com.github.masx200.nowcoder_test.字符串排序
import com.github.masx200.nowcoder_test.utils.MockTest

import kotlin.test.assertEquals

class MainKtTest {

    @org.junit.jupiter.api.Test
    fun Testmain() {
        val result = MockTest(
            """9
cap
to
cat
card
two
too
up
boat
boot""",
        ) {
            main(arrayOf())
        }
        assertEquals(
            """boat
boot
cap
card
cat
to
too
two
up""".split("\n").map {
                it.trim()
            }, result[0].split("\n").map {
                it.trim()
            }.filter {
                it.isNotBlank()
            }
        )
    }

}
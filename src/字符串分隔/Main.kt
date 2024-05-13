package com.github.masx200.nowcoder_test.字符串分隔

import java.util.Scanner


fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)

    while (`in`.hasNextLine()) {
        val a = `in`.nextLine()

        for (i in stringSeparation(a)) {
            println(i)
        }
    }
}

fun stringSeparation(
    a: String,
): Sequence<String> = sequence {
    if (a.length > 8) {
        yield(a.slice(0..7))
        yieldAll(stringSeparation(a.slice(8..a.lastIndex)))
    } else {
        yield(a + "0".repeat(8 - a.length))
    }
}
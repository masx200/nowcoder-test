package com.github.masx200.nowcoder_test.查找输入整数二进制中1的个数

import java.util.Scanner

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)

    while (`in`.hasNextLine()) {
        val a = `in`.nextLine().toInt()
        println(countOne(a))


    }
}

fun countOne(a: Int): Int {
    return Integer.bitCount(a)
}

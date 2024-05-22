package com.github.masx200.nowcoder_test.求int型正整数在内存中存储时1的个数

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    while (read.hasNextInt()) {
        val a = Integer.toBinaryString(read.nextInt()).count { it == '1' }
        println(a)


    }
}
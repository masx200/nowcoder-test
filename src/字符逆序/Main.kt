package com.github.masx200.nowcoder_test.字符逆序

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    while (read.hasNextLine()) {
        val a = read.nextLine()

        println(a.reversed())
    }
}
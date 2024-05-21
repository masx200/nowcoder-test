package com.github.masx200.nowcoder_test.汽水瓶

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    while (read.hasNextInt()) {
        val a = read.nextInt()

        if (a != 0) println(a / 2)
    }
}
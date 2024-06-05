package com.github.masx200.nowcoder_test.截取字符串

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    while (read.hasNextLine()) {
        val a = read.nextLine()
        val b = read.nextLine().toInt()
        println(a.slice(0..(b - 1)))
    }
}
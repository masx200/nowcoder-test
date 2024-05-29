package com.github.masx200.nowcoder_test.统计大写字母个数

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    while (read.hasNextLine()) {
        val a = read.nextLine().count { it.isUpperCase() }
        println(a)


    }
}
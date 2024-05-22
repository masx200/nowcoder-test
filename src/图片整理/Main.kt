package com.github.masx200.nowcoder_test.图片整理

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    while (read.hasNext()) {
        val a = read.next()
        val b = a.toCharArray()
        b.sort()
        println(b.joinToString(""))
    }
}
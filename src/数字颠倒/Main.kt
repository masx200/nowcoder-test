package com.github.masx200.nowcoder_test.数字颠倒

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    while (read.hasNextInt()) {
        val a = read.nextInt().toString().reversed()
        println(a)


    }
}
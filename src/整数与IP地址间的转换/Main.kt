package com.github.masx200.nowcoder_test.整数与IP地址间的转换

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    while (read.hasNextLine()) {
        val ip = read.nextLine()
        if (ip.contains(".")) {
            val ipArr = ip.split(".").map { it.toLong() }

            println(ipArr.reduce { a, b -> a * 256 + b })
        } else {

            val ipArr = mutableListOf<Long>()
            var iptoInt = ip.toLong()

            while (iptoInt >= 256) {
                val element = iptoInt / 256
                ipArr.add(iptoInt % 256)
                iptoInt = element
            }
            ipArr.add(iptoInt)
            println(ipArr.reversed().joinToString("."))
        }
    }
}
package com.github.masx200.`nowcoder-test`.进制转换

import java.util.Scanner


fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)

    while (`in`.hasNextLine()) {
        val line = `in`.nextLine()

        val num = line.slice(2 until line.length).toLong(16)
        println(num.toString())
    }
}
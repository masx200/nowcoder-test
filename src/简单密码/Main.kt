package com.github.masx200.nowcoder_test.简单密码

import java.util.Scanner

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)

    while (`in`.hasNextLine()) {
        val a = `in`.nextLine()

        val b = a.toCharArray()
        for (i in b.indices) {
            b[i] = when (b[i]) {
                'a', 'b', 'c' -> '2'
                'd', 'e', 'f' -> '3'
                'g', 'h', 'i' -> '4'
                'j', 'k', 'l' -> '5'
                'm', 'n', 'o' -> '6'
                'p', 'q', 'r', 's' -> '7'
                't', 'u', 'v' -> '8'
                'w', 'x', 'y', 'z' -> '9'
                'Z' -> 'a'
                else -> if (b[i].isUpperCase()) b[i].lowercaseChar() + 1 else b[i]
            }
        }
        println(b.joinToString(""))
    }
}
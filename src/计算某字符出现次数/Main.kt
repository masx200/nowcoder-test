package com.github.masx200.nowcoder_test.计算某字符出现次数

import java.util.Scanner


fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    val a = mutableListOf<String>()
    while (`in`.hasNextLine()) {
        a.add(`in`.nextLine())
        if (a.size == 2) {
            val b = a[0]
            val c = a[1]
            println(b.count { it.lowercaseChar() == c[0].lowercaseChar() })
            a.clear()
        }
    }
}
package com.github.masx200.`nowcoder-test`.字符串最后一个单词的长度

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
package com.github.masx200.nowcoder_test.明明的随机数

import java.util.Scanner


fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    var count = 0
    val list = mutableListOf<Int>()
    while (`in`.hasNextLine()) {
        val a = `in`.nextLine()
        if (count == 0) {
            count = a.toInt()
        } else {
            list.add(a.toInt())
        }
        if (count == list.size) {
            list.toSortedSet().forEach {
                println(it)


            }
            list.clear()
            count = 0

        }
    }
}

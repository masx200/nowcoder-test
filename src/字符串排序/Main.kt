package com.github.masx200.`nowcoder-test`.字符串排序

import java.util.Scanner


fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    var count = 0

    val list = mutableListOf<String>()
    while (`in`.hasNextLine()) {
        val a = `in`.nextLine()

        if (count == 0) {

            count = a.toInt()
        } else {
            list.add(a)
        }


        if (count == list.size) {
            list.sort()

            println(list.joinToString("\n"))
            list.clear()
            count = 0

        }
    }
}

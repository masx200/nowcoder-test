package com.github.masx200.nowcoder_test.HJ26字符串排序

import java.util.Scanner

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)

    while (`in`.hasNextLine()) {
        val a = `in`.nextLine()
        val b = a.toCharArray()
        val list = mutableListOf<Pair<Int, Char>>()
        val indexes = mutableListOf<Int>()
        for (i in b.indices) {
            if (b[i].isLetter()) {
                indexes.add(i)
                list.add(Pair(i, b[i]))
            }

        }
        list.sortWith { o1, o2 ->
            val a2 = o1.second.lowercaseChar().compareTo(o2.second.lowercaseChar())
            if (a2 != 0) {


                a2
            } else {
                o1.first.compareTo(o2.first)

            }
        }
        for (i in indexes.indices) {


            b[indexes[i]] = list[(i)].second
        }
        println(String(b))
    }
}

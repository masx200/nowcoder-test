package com.github.masx200.nowcoder_test.整型数组合并

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val list = mutableListOf<String>()
    while (read.hasNextLine()) {

        list.add(read.nextLine())

        if (list.size == 4) {

            val set = sortedSetOf<Int>()

            for (s in arrayOf(list[1], list[3])) {
                for (n in s.split(" ")) {
                    set.add(n.toInt())
                }


            }

            println(set.joinToString(""))
            list.clear()
        }
    }
}
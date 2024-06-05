package com.github.masx200.nowcoder_test.输入整型数组和排序标识_对其元素按照升序或降序进行排序

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    while (read.hasNextLine()) {
        read.nextLine()
        val b = read.nextLine().split(" ").map { it.toInt() }
        val c = read.nextLine().toInt()

        val a = b.sortedWith(if (c == 0) {
            compareBy { it }
        } else compareByDescending { it }
        )
        println(a.joinToString(" "))
    }
}
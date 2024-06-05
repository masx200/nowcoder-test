package com.github.masx200.nowcoder_test.简单错误记录

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)

    val m = linkedMapOf<Pair<String, Int>, Int>()
    while (read.hasNextLine()) {
        val a = read.nextLine().split(" ")

        var key1 = a[0].split("\\").last()
        if (key1.length > 16) {
            key1 = key1.substring(key1.length - 16)
        }
        val key = Pair(key1, a[1].toInt())
        m[key] = m.getOrDefault(key, 0) + 1
    }

    val list = m.toList()
    val lasteight =
        if (list.size > 8) {
            (list.slice(list.size - 8 until list.size))
        } else {
            (list)
        }

    lasteight.forEach { println("${it.first.first} ${it.first.second} ${it.second}") }
}
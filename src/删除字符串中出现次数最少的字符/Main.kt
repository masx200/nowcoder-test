package com.github.masx200.nowcoder_test.删除字符串中出现次数最少的字符

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    while (read.hasNext()) {
        val a = read.next()
        val seen = mutableMapOf<Char, Int>()

        for (c in a) {
            seen[c] = seen.getOrDefault(c, 0) + 1
        }
        val min = seen.minByOrNull { it.value }?.value
        val b = seen.filter { it.value == min }
        println(a.filter { b.contains(it).not() })
    }
}
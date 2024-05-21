package com.github.masx200.nowcoder_test.名字的漂亮度

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    var count = 0
    val names = mutableListOf<String>()
    while (read.hasNext()) {
        if (count == 0) {
            count = read.nextInt()
        } else {
            val name = read.next()
            names.add(name)
        }
        if (count == names.size) {

            for (name in names) {
                val seen = mutableMapOf<Char, Int>()

                for (c in name) {
                    seen[c] = seen.getOrDefault(c, 0) + 1
                }
                val keys = seen.keys.toList().sortedBy { seen[it] ?: 0 }.reversed()
                var sum = 0
                var score = 26
                for (key in keys) {
                    sum += (score * (seen[key] ?: 0))
                    score -= 1
                }
                println(sum)
            }


        }
    }
}
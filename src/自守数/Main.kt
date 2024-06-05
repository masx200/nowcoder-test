package com.github.masx200.nowcoder_test.自守数

import java.util.Scanner


fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)

    while (`in`.hasNextLine()) {
        val line = `in`.nextLine().toInt()

        var count = 0
        for (j in arrayOf(1, 5, 6)) {
            for (i in j.rangeTo(line).step(10)) {
                if ((i * i).toString().endsWith(i.toString())) {
                    count++
                }
            }


        }
        println(count + 1)
    }
}
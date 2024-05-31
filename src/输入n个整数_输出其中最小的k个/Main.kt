package com.github.masx200.nowcoder_test.输入n个整数_输出其中最小的k个

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)

    var n = 0
    var k = 0

    while (read.hasNextLine()) {
        val a = read.nextLine().split(" ").map { it.toInt() }

        if (n == 0 && k == 0) {

            n = a[0]
            k = a[1]
        } else {


            val minList = a.sorted()
            for (i in 0 until k) {
                print(minList[i])
                if (i != k - 1) {
                    print(" ")
                }
            }
            println()

            n = 0
            k = 0
        }
    }
}
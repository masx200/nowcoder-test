package com.github.masx200.nowcoder_test.蛇形矩阵

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    while (read.hasNextInt()) {
        val a = read.nextInt()


        val result = Array(a) {
            IntArray(a - it) { 1 }
        }



        for (i in result.indices) {
            for (j in result[i].indices) {
                if (i == 0) {

                    result[i][j] = if (j == 0) 1 else result[i][j - 1] + 1 + j
                } else {
                    result[i][j] =
                        if (j == 0) result[i - 1][j] + i else result[i][j - 1] + 1 + j + i
                }
            }
        }
        for (i in result) {

            print(i.joinToString(" "))
            println()
        }
    }
}
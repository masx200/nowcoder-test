package com.github.masx200.nowcoder_test.字符串最后一个单词的长度

import java.util.Scanner


fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)

    while (`in`.hasNextLine()) {
        val a = `in`.nextLine()

        println(a.split(" ").last().length)
    }
}

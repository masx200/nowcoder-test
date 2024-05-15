package com.github.masx200.nowcoder_test.统计字符

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    while (read.hasNextLine()) {
        val a = read.nextLine()
        var digits = 0
        var letters = 0
        var others = 0
        var spaces = 0

        for (i in a) {


            if (i.isDigit()) {
                digits++

            } else if (i.isLetter()) {
                letters++

            } else if (i.isWhitespace()) {

                spaces++

            } else {
                others++
            }
        }
        println(letters)
        println(spaces)
        println(digits)
        println(others)
    }
}
package  com.github.masx200.nowcoder_test.取近似值

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    while (read.hasNext()) {
        val a = read.next().toDouble()

        println(Math.round(a).toInt())
    }
}
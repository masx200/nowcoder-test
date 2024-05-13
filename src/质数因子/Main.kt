package  com.github.masx200.nowcoder_test.质数因子

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    while (read.hasNextLine()) {
        var a = read.nextLine().toLong()
        val factors = mutableListOf<Long>()
        var i = 2L
        while (i <= a) {
            if (a % i == 0L) {
                a /= i
                factors.add(i)
            } else {
                if (i > a / i) i = a
                else i++
            }
        }
        println(factors.joinToString(" "))
    }
}
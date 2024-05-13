package  com.github.masx200.`nowcoder-test`.质数因子

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    while (read.hasNextLine()) {
        var a = read.nextLine().toInt()
        val factors = mutableListOf<Int>()
        var i = 2
        while (i <= a) {
            if (a % i == 0) {
                a /= i
                factors.add(i)
            } else {
                i++
            }
        }
        println(factors.joinToString(" "))
    }
}
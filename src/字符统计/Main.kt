package  com.github.masx200.nowcoder_test.字符统计

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)


    while (read.hasNextLine()) {
        val a = read.nextLine()

        val b = a.split("")


        val map = hashMapOf<String, Int>()

        for (i in b) {
            map[i] = (map[i] ?: 0) + 1
        }
        val keys = map.keys.sortedWith(
            compareBy<String> { -(map[it] ?: 0) }.thenBy {
                it
            }
        )
        println(keys.joinToString(""))
    }
}
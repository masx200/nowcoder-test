package  com.github.masx200.`nowcoder-test`.字符个数统计

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    while (read.hasNextLine()) {
        val a = read.nextLine().toHashSet()

        println(a.size)
    }
}
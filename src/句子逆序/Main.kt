package  com.github.masx200.`nowcoder-test`.句子逆序

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    while (read.hasNextLine()) {
        val a = read.nextLine().split(" ").reversed().joinToString(" ")
        println(a)
    }
}
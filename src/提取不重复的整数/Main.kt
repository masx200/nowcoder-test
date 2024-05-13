package  com.github.masx200.`nowcoder-test`.提取不重复的整数

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    while (read.hasNext()) {
        val a = read.next().toInt()
        val s = linkedSetOf<Char>()
        a.toString().reversed().forEach {
            s.add(it)
        }
        println(s.joinToString(""))
    }
}
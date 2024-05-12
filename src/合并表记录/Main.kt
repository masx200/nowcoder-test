package  com.github.masx200.`nowcoder-test`.合并表记录

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)

    var count = 0

    val list = mutableListOf<Pair<Int, Int>>()
    while (read.hasNextLine()) {
        val a = read.nextLine()
        if (count == 0) {
            count = a.toInt()
        } else {
            val (c, d) = a.split(" ").map { it.toInt() }
            list.add(Pair(c, d))
        }
        if (list.size == count) {


            val map = hashMapOf<Int, Int>()

            for (i in list) {
                map[i.first] = (map[i.first] ?: 0) + i.second
            }

            for (i in map.toSortedMap()) {
                println(i.key.toString() + " " + i.value.toString())
            }
            count = 0
            list.clear()
        }
    }
}
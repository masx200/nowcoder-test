package  com.github.masx200.nowcoder_test.坐标移动

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)


    while (read.hasNextLine()) {
        val a = read.nextLine()
        var x = 0
        var y = 0

        for (c in a.split(";")) {
            if (c.length > 1) {

                try {
                    val distance = c.substring(1).toInt()


                    when (c[0]) {
                        'W' -> y += distance
                        'S' -> y -= distance
                        'A' -> x -= distance
                        'D' -> x += distance
                    }

                } catch (e: Exception) {
                    continue


                }
            }
        }


        println("$x,$y")
    }
}
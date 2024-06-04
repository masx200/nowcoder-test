package com.github.masx200.nowcoder_test.密码验证合格程序

import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    while (sc.hasNext()) {
        val str = sc.next()
        if (str.length <= 8) {
            println("NG")
            continue
        }
        if (getMatch(str)) {
            println("NG")
            continue
        }
        if (getString(str, 0, 3)) {
            println("NG")
            continue
        }
        println("OK")
    }
}

// 校验是否有重复子串
tailrec fun getString(str: String, l: Int, r: Int): Boolean {
    return if (r >= str.length) {
        false
    } else if (str.substring(r).contains(str.substring(l, r))) {
        true
    } else {
        getString(str, l + 1, r + 1)
    }
}

// 检查是否满足正则
fun getMatch(str: String): Boolean {
    var count = 0

    if (str.count { it.isUpperCase() } > 0) {
        count++
    }
    if (str.count { it.isLowerCase() } > 0) {
        count++
    }
    if (str.count { it.isDigit() } > 0) {
        count++
    }
    if (str.count { !(it.isDigit() && it.isLowerCase() && it.isUpperCase()) } > 0) {
        count++
    }
    return count < 3
}
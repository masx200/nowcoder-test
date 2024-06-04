package com.github.masx200.nowcoder_test.购物单


import java.util.Scanner
/**
 * 主函数，用于读取输入并计算最大收益。
 * @param args 命令行参数
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    while (sc.hasNextLine()) {
        // 初始化资金和商品数量
        var money = sc.nextInt()
        val m = sc.nextInt()
        sc.nextLine()
        // 调整资金单位为十元
        money /= 10
        // 初始化商品价格和重量数组
        val prices = Array(m + 1) { IntArray(3) }
        val weights = Array(m + 1) { IntArray(3) }
        // 遍历每个商品，读取价格和重量信息
        for (i in 1..m) {
            var a = sc.nextInt()
            var b = sc.nextInt()
            val c = sc.nextInt()
            // 调整价格单位为十元
            a /= 10 // price
            // 计算商品重量
            b *= a // weight
            // 根据商品类型，存储价格和重量
            when (c) {
                0 -> {
                    // 主件
                    prices[i][0] = a
                    weights[i][0] = b
                }

                else -> {
                    if (prices[c][1] == 0) {
                        // 附件1
                        prices[c][1] = a
                        weights[c][1] = b
                    } else {
                        // 附件2
                        prices[c][2] = a
                        weights[c][2] = b
                    }
                }
            }
            sc.nextLine()
        }
        // 初始化动态规划数组
        val dp = Array(m + 1) { IntArray(money + 1) }
        // 动态规划计算最大收益
        for (i in 1..m) {
            for (j in 1..money) {
                val a = prices[i][0]
                val b = weights[i][0]
                val c = prices[i][1]
                val d = weights[i][1]
                val e = prices[i][2]
                val f = weights[i][2]
                // 更新动态规划数组，考虑购买主件、附件1、附件2以及全部购买的情况

                dp[i][j] = if (j - a >= 0) maxOf(dp[i - 1][j], dp[i - 1][j - a] + b) else dp[i - 1][j]
                dp[i][j] = if (j - a - c >= 0) maxOf(dp[i][j], dp[i - 1][j - a - c] + b + d) else dp[i][j]
                dp[i][j] = if (j - a - e >= 0) maxOf(dp[i][j], dp[i - 1][j - a - e] + b + f) else dp[i][j]
                dp[i][j] = if (j - a - c - e >= 0) maxOf(dp[i][j], dp[i - 1][j - a - c - e] + b + d + f) else dp[i][j]
            }
        }
        // 输出最大收益
        println(dp[m][money] * 10)
    }
}
package com.github.masx200.nowcoder_test.输出单向链表中倒数第k个结点


import java.util.Scanner

data class ListNode(var m_nKey: Int, var m_pNext: ListNode? = null)

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    val inputlist = mutableListOf<String>()
    while (`in`.hasNextLine()) {
        val a = `in`.nextLine()

        inputlist.add(a)


        if (inputlist.size == 3) {

            val listnodee = ArrayListToListNode(inputlist[1].split(" ").map { it.toInt() })
            val k = inputlist[2].toInt()


            val output = FindKthToTail(listnodee, k)
            println(output?.m_nKey)
            inputlist.clear()
        }
    }
}

fun FindKthToTail(listnodee: ListNode?, k: Int): ListNode? {
    var count = 0
    var current = listnodee
    while (current != null) {
        count++
        current = current.m_pNext
    }
    if (k > count) {
        return null
    }
    current = listnodee
    for (i in 1..count - k) {
        current = current?.m_pNext
    }
    return current
}

fun ArrayListToListNode(array: List<Int>): ListNode? {


    if (array.isEmpty()) {
        return null

    }

    val head = ListNode(array[0])
    var current = head
    for (i in 1 until array.size) {
        val listNode = ListNode(array[i])
        current.m_pNext = listNode
        current = listNode
    }
    return head

}
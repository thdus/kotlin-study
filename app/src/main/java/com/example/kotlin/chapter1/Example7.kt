package com.example.kotlin.chapter1

fun main() {
    val list = mutableListOf(1,2,3,4,5)
    // collection은 mutable과 inmutable이 있다.
    // 기본적으로 제공하는게 inmutable이기 때문에 변경가능한 collection을 사용하려면 반드시 앞에다가 mutable로 써야한다.

    list.add(6)
    list.addAll(listOf(7,8,9))

    val list1 = listOf(1,2,3,4)
    list1[0]

    println(list1.map{it * 10}.joinToString("/") )

    val diverseList = listOf(1,"안녕",1.78, true)
    println(list.joinToString(","))

    val map = mapOf((1 to "안녕"), (2 to "hello"))
    val map1 = mutableMapOf((1 to "안녕"), (2 to "hello"))
    map1[3]="응"
    map1[100]="호이"
}
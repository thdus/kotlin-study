package com.example.kotlin.chapter2

fun main() {
    // 확장함수 EXtension function
    // 기존에 정의도어 있는 클래스에 함수를 추가하는 기능
    val test = Test()
    Test().hello()
    test.hi()
}

fun Test.hi() = print("하이")

class Test() {
    fun  hello() = println("안녕")
    fun bye() = println("잘가")
}
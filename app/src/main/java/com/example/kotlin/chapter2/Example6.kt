package com.example.kotlin.chapter2

import com.example.kotlin.chapter2.Book.Novel.NAME

fun main() {
// object class는 정의함과 동시에 객체 생성
    println(Counter.count)
    // 싱글톤을 만들어서 countup을 했을 때도 하나의 객체에서 내용이 계속 올라가기 때문에 변경된 값이 잘 반영
    Counter.countUp()
    Counter.countUp()

    println(Counter.count)

    Counter.hello()

    NAME
}

object Counter : Hello() { // 다른 클래스 상속
    // 초기화 블럭, 프로퍼티, 메서드 사용 가능
    init {
        println("카운터 초기화")
    }
    var count = 0
    fun countUp() {
        count++
    }
}

open class Hello() {
    fun hello() = println("Hello")
}

class  Book {
    companion object Novel { // companion object는 자바의 static과 동일한 역할
        //companion object는 클래스 내에서 오직 하나만 생성 가능
        const val NAME = "name" // 클래스 변수
        fun create() = Book() // 클래스 메서드
    }
}
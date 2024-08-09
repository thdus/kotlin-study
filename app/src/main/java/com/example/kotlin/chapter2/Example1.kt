package com.example.kotlin.chapter2

fun main() {
    // 1. 익명함수
    // 2. 변수처럼 사용돼서, 함수의 argument, return이 될 수 있다
    // 3. 한번 사용되고, 재사용되지 않는 함수
    val a = fun(){ println("hello") }
    val c : Int = 10
    val b : (Int) -> Int = { it * 10 }
    // 람다식은 변수처럼 사용 가능해서 변수에 할당
    // 뒤에는 타입이 옴
    // 타입 정보는 입력 값을 괄호에 넣고 괄호 안에는 여러 개의 값이 들어갈 수 있고
    // 화살표를 기점으로 return 값의 타입을 지정해준다
    // =을 쓴 다음에 중괄호 안에 함수의 구현부가 들어간다
    // 지금처럼 입력 값이 하나일 때는 it으로 받을 수 있고 그게 아니면 local variable의 변수명을 선언할 수 있고
    // 이 함수 구현부의 맨 마지막 줄에 오는게 return 값
    val d = {i :Int, j : Int -> i * j }
    val f : (Int, String, Boolean) -> String = { _, b, _ -> b}

    hello(10,b)
}

fun hello(a: Int, b: (Int) -> Int) : (Int) -> Int{
    println(a)
    println(b(20))
    return b
}
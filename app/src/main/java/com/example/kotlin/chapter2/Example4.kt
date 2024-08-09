package com.example.kotlin.chapter2
// 초기화 지연 lateinit, lazy
// 정의 : 변수를 선언할 때 값을 지정하지 않고, 나중에 지정할 수 있는 방법
// 목적 : 메모리 효율적으로 사용하기 위해서, null safe한 value를 사용하기 위해서
// latient, var
lateinit var text :String //변수 타입을 지정해줘야함, primitive 타입은 사용할 수 없음
// lazy, val
val test : Int by lazy { //선언과 동시에 초기화 해야함
    println("초기화 중")
    100
}

fun main() {
    text = "안녕하세요" // 선언 후 나중에 초기화 해줘도 됨
    println("메인 함수 실행")
    println("초기화 한 값 $test") // 호출 시점에 초기화가 이루어짐, 호출되지 않으면 초기화조차 이루어지지 않음
    println("두번째 호출 $test")
// 필요없는 값을 사용하지 않기 때문에 메모리를 더욱 효율적으로 사용할 수 있음
}


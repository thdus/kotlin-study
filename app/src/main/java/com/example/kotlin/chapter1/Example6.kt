package com.example.kotlin.chapter1

fun main() {
    // for (int i=1; i < 11; i++) {
    //
    //}
    for(i in IntRange(1,10)){
        //코틀린도 똑같이 for문 사용
        //꼭 int가 아니어도 range 사용 가능
        print(i)
        print(".")
    }
    println()
    for(i in 1 until 10){
        // until로 범위를 포함하지 않을 수 있고
        print(i)
        print(".")
    }
    println()

    for(i in 10 downTo 1){
        // 역으로 계산할 때는 downto
        print(i)
        print(".")
    }
    println()
    for(i in 10 downTo 1 step(2)) {
        //step으로 숫자가 작아지는 범위 줄 수 있음
        //step안에는 자연수
        print(i)
        print(".")
    }
    println()

    var c = 1
    while(c<11){
        // 똑같이 while문 사용 가능
        print(c)
        print(".")
        c++
    }
}


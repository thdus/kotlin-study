package com.example.kotlin.chapter1

fun main(){
    println(smartcast("안녕"))
    println(smartcast(10))
    println(smartcast(true))
}

fun check(a: Any): String {
    return when (a) { // when문 사용가능
        is String -> { // 코틀린에서 type checking을 할 때 is를 쓴다
            "문자열"
        }

        is Int -> {
            "숫자"
        }

        else -> {
            "몰라요"
        }
    }
}

fun cast(a :Any){
    val result = a as? String ?: "실패"
    // as를 통해서 casting을 할 수 있고 물음표를 붙이면 casting이 안되는 exception 상황에서 null을 내뱉는다
    println(result)

}

fun smartcast(a :Any): Int {
    return if(a is String) {
        a.length
    } else if(a is Int) {
        a.dec()
    } else {
        -1
    }
}
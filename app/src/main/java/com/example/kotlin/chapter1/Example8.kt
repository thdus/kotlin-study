package com.example.kotlin.chapter1

fun main(){
    var name : String = "상아"
    var number : Int = 10

    var nickname: String? = "코코"
    var secondNumber : Int? =null // null이 들어가는 케이스에는 ?로 명시적으로 선언


//    val result = if(nickname == null) {
//        "값이 없음"
//    } else {
//        nickname
//    }

    nickname=null
    val size = nickname?.length
    // null에 safe 하지 않은 변수에 접근해서 뭔가를 호출할 때는 물음표로 null 체크를 한 번 더 할 수 있다.
        nickname?: "없음"
    //엘비스 operator nickname 있으면 nickname 출력 null이면 없음

    println(size)
}
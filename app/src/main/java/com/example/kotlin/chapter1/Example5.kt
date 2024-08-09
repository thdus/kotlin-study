package com.example.kotlin.chapter1

fun main(){
    max(10,3)
    isHoliday("금")
}

fun max(a:Int, b:Int) {
    val result=if(a>b) a else b
    // 코틀린은 삼항연산자 없음
    // if와 else로 자바와 동일하게 사용
    // 자바와 달리 조건문이 아니라 조건식이다(statement가 아니라 expression이다)
    // 이렇게 식을 통해서 return값을 받을 수 있다.
    println(result)
}

// 월 화 수 목 금 토 일
fun isHoliday(dayOfWeek: Any){
when(val day =dayOfWeek) {
    // when 문을 사용하면 좀 더 다양한 조건 사용 가능
    // 숫자 범위가 들어갈 수 도 있고 특정 값이 들어갈 수도 있다.
    // when문도 똑같이 when문이 아니라 when expression
    // 조건식으로 쓰일 때는 반드시 else 구문이 쓰여야 한다. 이건 컴파일 단계에서 확인 가능

        "토" ,
        "일" -> if(day=="토") "좋아" else "너무 좋아"
        in 2..4->{}
        in listOf("월", "화")->{}
        else->"안좋아"
    }
}
package com.example.kotlin.chapter1

fun main() {
    val result = test(1,5)
    test2( id = "소연님", name = "김소연", nickname = "소연")
    println(result)
    println(time1(1,3))
    println(time2(1,3))

}

// 2. 함수
fun test(a: Int, b:Int=3, c:Int=4) : Int{
    //함수를 사용하기 위해서는 앞에 fun 그리고 함수명
    // void = unit(생략가능)
    // 안에 변수들 여러개 들어갈 수 있음(변수명 뒤에 타입)
    // default value값 함수에 추가할 수 있어서 자바에서 쓰는 오버로딩 기능을 따로 만들지 않아도 된다.
    println(a+b)
    return a+b //모든 함수는 return값 존재
}

fun test2(name: String, nickname : String, id: String)= println(name+nickname+id)
// single expression: 한 줄로 코드 구현 가능

fun time1(a:Int, b:Int,):Int { // 뒤에 , 들어가도 컴파일 에러 안난다
    return a*b
}

fun time2(a:Int,b:Int)=a*b



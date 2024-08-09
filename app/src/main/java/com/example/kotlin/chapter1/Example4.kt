package com.example.kotlin.chapter1

fun main() {
    var user= User("채상아")
    println(user.age)
    val kid = Kid("아이", 3, "male")
}

open class User(open val name : String, open var age: Int=100)

class Kid constructor(override val name: String, override var age: Int) : User(name, age){
    //클래스의 가장 큰 특징은 constructor와 property를 한 번에 할 수 있다.
    // default value를 넣을 수 있다.
    //초기화하는 방식이 init block, 부생성자(secondary constuctor 이용 가능)
    // 2개의 순서는 init 후에 부생성자 호출
    var gender: String ="female"

    init {
        println("초기화 중 입니다.")
    }

    constructor(name: String, age: Int, gender: String) : this(name, age){
        this.gender=gender
        println("부생성자 호출")
    }
}
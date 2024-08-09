package com.example.kotlin.chapter2

fun main() {
    val person = Person("수지", 24)
    val dog = Dog("해피", 24)

    println(person.toString())
    println(dog.toString())
    println(dog.copy(age = 3).toString())

    val cat: Cat = BlueCat()
    val result = when(cat) {
        is BlueCat -> "blue"
        is RedCat -> "red"
        is GreenCat -> "green"
        is WhiteCat -> "white"
    }


}
class Person(
    val name : String,
    val age : Int,
)

data class Dog(
// data class에서는 property가 반드시 1개 이상 있어야 함
    // 매개함수가 자동으로 생성됨
    // 오버라이딩해서 직접 구현을 하면 해당 함수가 구현된다.
    // data class는 다른 class에 상속이 불가능하다
    val name: String,
    val age:Int,
)

//sealed class
// 컴파일러가 자식 클래스의 종류를 제한
// 컴파일러가 sealed 클래스의 자식 클래스가 어떤 것인지 암
// when과 함꼐 쓰일 때 장점을 느낄 수 있음
sealed class Cat
class BlueCat : Cat()
class RedCat : Cat()
class GreenCat : Cat()
class WhiteCat :Cat()

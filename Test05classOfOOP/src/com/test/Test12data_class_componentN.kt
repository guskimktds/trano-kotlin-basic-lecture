package com.test

fun main() {
    println("data class component")

    val (name,age) = CCC("kim", 33)  //일반 클래스는 안됨

    println(name)
    println(age)

}//end main

data class CCC(val name:String="admin", val age:Int=0)
package com.test

fun main() {
    println("function")

    val m:Man = Man("kim", 33)
    println(m)
    println(m.adult)
    m.nickName = "lee"
    println(m.nickName)

}//end main

data class Man(val name:String, val age:Int){
    val adult:Boolean get() = age>=20
    var nickName:String = ""
    set(value) {
        field = value+" player"
    }
}
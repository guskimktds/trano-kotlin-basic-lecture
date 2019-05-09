package com.test

fun main() {
    println("data class copy")

    val b1:BBB = BBB("kim", 33)
    val b2 = b1.copy()

    println(b1.hashCode())
    println(b2.hashCode())

    val b3 = b1.copy(age=44)
    println(b3)
    println(b3.hashCode())

}//end main

data class BBB(val name:String="admin", val age:Int=0)
package com.test

fun main(){
    println("array arrayOfNulls")

    println("======start=================================")

    var sus = arrayOfNulls<Int>(5) //null,null,null,null,null
    sus.forEach { print(it) }
    println()
//    sus.forEach { print("$it") }
//    sus.forEach { print("${it}") }  //{}안에 연산을 넣을수 있다

    for (i in 0 until sus.size) {
       sus[i] = i
    }

    sus.forEach { print("$it") }
    println()

    for (i in 0 until sus.size) {
        sus.set(i, (i+1)*10)
    }

    println("======set=================================")

    sus.forEach { print("$it") }
    println()

    println("======String 으로 정적 배열=================================")

    //String 으로 정적 배열

    var name = arrayOfNulls<String>(5) //null,null,null,null,null

    name.forEach { print(it) }
    println()

    for (i in 0 until name.size) {
        name[i] = "kim"+i
    }

    name.forEach { print("$it ") }
    println()

    for (i in 0 until name.size) {
        name.set(i, "kim"+(i+1)*10)
    }

    name.forEach { print("$it ") }
    println()

    println("======start=================================")
    println("======start=================================")
    println("======start=================================")
    println("======start=================================")
    println("======start=================================")
    println("======start=================================")
}
package com.test

fun main() {
    println("array Array constructor")

    var sus:Array<Int> = Array(5, {i -> i})   // -> 왼쪽은 변수, 오른쪽은 반환값

    sus.forEach { print("$it ") }
    println()

    var sus2:Array<Int> = Array(10, {i -> (i+1)*10})   // -> 왼쪽은 변수, 오른쪽은 반환값

    sus2.forEach { print("$it ") }
    println()

    ////
    var names:Array<String> = Array(5, {i -> "kim"+i})
    names.forEach { print("$it ") }
    println()

    println("==============toString===================")
    var names2:Array<String> = Array(5, {i -> i.toString()})
    names2.forEach { print("$it+0 ") }
    println()

    println("==============start===================")
    println("==============start===================")
    println("==============start===================")
    println("==============start===================")

}
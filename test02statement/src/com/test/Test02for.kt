package com.test

fun main() {
    println("for...") //

    for(i in 0..9){
        print("${i} ")
    }
    println()

    //i+=2
    for(i in 0..9 step 2){
        print("${i} ")
    }
    println()

    //9,8,7,6,,,
    for(i in 9 downTo 0){
        print("${i} ")
    }
    println()

    var arrLength = 10
    for(i in 0 until arrLength){
        print("${i} ")
    }
    println()

    println("=========break============")

    for(i in 0..9){
        if(i==5) break
        print("${i} ")
    }
    println()


    println("=========continue============")

    for(i in 0..9){
        if(i==5) continue
        print("${i} ")
    }
    println()

}
package com.test

fun main() {
    println("for.for...") //

    for(x in 0 until 3){
        for(i in 0 until 9){
            print("${i} ")
        }
        println()
    }


    println("===================break=======================")

    for(x in 0 until 3){
        if(x==1) break
        for(i in 0 until 9){
            print("${i} ")
        }
        println()
    }

    //구구단

    for(x in 2..9){
        for(i in 1..9){
            println("${x} * ${i} = "+(x*i))
        }
        println()
    }
}
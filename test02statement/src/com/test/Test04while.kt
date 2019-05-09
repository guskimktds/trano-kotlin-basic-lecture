package com.test

fun main() {
    println("while................")

    var count:Int = 0
    while (true) {
        println("count:"+count)
        count++

        if(count>=5) break
    }

    println("=====do while =========")

    var count2:Int = 0
    do{
        println("count:"+count2)
        count2++

        if(count2>=5) break
    }while (false)
}
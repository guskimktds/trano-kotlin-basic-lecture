package com.test

import java.util.*

fun main() {
    println("arrayOf...")

    //Only Int Array

    var datas:Array<Int> = arrayOf(1,2,3)
    println(datas)

    for (item in datas){
        println(item)
    }

    for (i in datas.size-1 downTo 0) {
        println(datas[i])
    }


    for (i in 0 until datas.size) {
        println(datas[i])
    }

    for (i in datas.size-1 downTo 0) {
        println(datas[i])
    }

    println("======forEach=========")
    datas.forEach{ println(it)}

    println("======deepToString=========")
    println(Arrays.deepToString(datas))

    //Only String Array
    var datas2:Array<String> = arrayOf("kim","lee")
    println(datas2)

    for (item in datas2){
        println(item)
    }

    println("=======================================")

    for (i in 0 until datas2.size) {
        println(datas2[i])
    }

    for (i in datas2.size-1 downTo 0) {
        println(datas2[i])
    }

    println("======forEach=========")
    datas2.forEach{ println(it)}

    println("======deepToString=========")
    println(Arrays.deepToString(datas2))

    //all type item
    println("======all type item Array========")

    var arr:Array<*> = arrayOf(1,2,"kim", arrayOf(4,5,6))
    println(arr)
    for(item in arr){
        if(item is Int) println(item)
        if(item is String) println(item)
        if(item is Array<*>) {
            println(Arrays.deepToString(item))

            for(i in 0 until item.size){
                println(item[i])
            }
        }
    }

}
package com.test

import java.util.*

fun main() {
    println("array multi")

    var sus:Array<Int> = arrayOf(1,2,3)
    var sus2:Array<Int> = arrayOf(11,22,33)
    var suss:Array<Array<Int>> = arrayOf(sus,sus2)

    for(sus in suss){
        //print("$sus ")

        for(item in sus ){
            print("$item ")
        }
        println()
    }

    println("===========forEach=============")
    suss.forEach { it.forEach { println(it) } }

    println("===========Array constructor=============")
    var suss2:Array<Array<Int>> = Array(3, {Array(5, {i -> i})})   // -> 왼쪽은 변수, 오른쪽은 반환값
    println(Arrays.deepToString(suss2))

    println("===========String[2][3]=============")
    var suss3:Array<Array<String>> = Array(2, {Array(3, {i -> "kim"+i})})   // -> 왼쪽은 변수, 오른쪽은 반환값
    println(Arrays.deepToString(suss3))


    var name1:Array<String> = arrayOf("kim","oh","kang")
    var name2:Array<String> = arrayOf("kim2","oh2","kang2")
    var namess:Array<Array<String>> = arrayOf(name1,name2)

    namess.forEach { it.forEach { print("$it ") } }
    println()

    println("===========IntArray Multi=============")


    var suss4:Array<IntArray> = Array<IntArray>(3, {IntArray(3)})
    println(Arrays.deepToString(suss4))

    var suss5:Array<IntArray> = Array<IntArray>(3, {intArrayOf(11,22,33)})
    println(Arrays.deepToString(suss5))


    var dss:Array<DoubleArray> = Array<DoubleArray>(3, {DoubleArray(3)})
    println(Arrays.deepToString(dss))

    var dss1:Array<DoubleArray> = Array<DoubleArray>(3, { doubleArrayOf(11.1,22.2,33.3)})
    println(Arrays.deepToString(dss1))

    println("===========bss=============")

    var bss:Array<BooleanArray> = Array<BooleanArray>(3, {BooleanArray(3)})
    println(Arrays.deepToString(bss))

    var bss1:Array<BooleanArray> = Array<BooleanArray>(3, { booleanArrayOf(true,false,true) })
    println(Arrays.deepToString(bss1))
}
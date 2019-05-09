package com.test

import java.util.*

fun main() {
    println("primitive class")

    var arr:IntArray = IntArray(3)

    arr.forEach { print(it) }
    println()

    for (item in arr) {
        print("$item ")
    }
    println()

    println("==============intArrayOf()===================")

    var sus:IntArray = intArrayOf(11,22,33)
    for (item in sus) {
        print("$item ")
    }
    println()

    ///


    var ds:DoubleArray = DoubleArray(3)
    for (item in ds) {
        print("$item ")
    }
    println()

    var ds2:DoubleArray = doubleArrayOf(3.1, 4.1, 5.2)
    for (item in ds2) {
        print("$item ")
    }
    println()

    var bs:ByteArray = ByteArray(3)
    for (item in bs) {
        print("$item ")
    }
    println()

    var bs2:ByteArray = byteArrayOf(2,3,4)
    for (item in bs2) {
        print("$item ")
    }
    println()

    //var cs:CharArray = charArrayOf(1,2,3)
    var cs:CharArray = CharArray(3)
        for (item in cs) {
        print("$item ")
    }
    println()

    var cs2:CharArray = charArrayOf('ㅁ','ㄴ','ㅇ')
    for (item in cs2) {
        print("$item ")
    }
    println()

    var bls:BooleanArray = BooleanArray(3)
    for (item in bls) {
        print("$item ")
    }
    println()

    var bls2:BooleanArray = booleanArrayOf(true,false,true)
    for (item in bls2) {
        print("$item ")
    }
    println()


    println("==============start===================")
    println("==============start===================")
    println("==============start===================")

}
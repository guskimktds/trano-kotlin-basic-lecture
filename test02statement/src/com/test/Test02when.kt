package com.test

import javax.xml.bind.DatatypeConverter

fun main(){
    println("when -> -> -> else ") // as-is : 'case' and default ,  to-be : '->' and else

    var su:Int = 4
    when(su) {
        0 -> println("su:0")
        1 -> println("su:1")
        2 -> println("su:2")
        3,4,5 -> {
            println("su:3,4,5")
        }
        else -> println("else")
    }

    println("========when String OK")

    var name:String = "kim"
    when(name) {
        "kim" -> println("name:kim")
        "kim1" -> println("name:1")
        "kim2" -> println("name:2")
        "kim3" -> {
            println("kim:3,4,5")
        }
        else -> println("else")
    }

    println("========when in")

    var score:Int = 70
    when(score){
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        in arrayOf(1,2,3) -> println("zzzz")
        else -> println("FFFFF")
    }

    println("========when fun call")
    var score2:Int = 100
    var strSu:String = "100"
    when(score2){
        DatatypeConverter.parseInt(strSu) -> println("aaaaaa")
        else -> println("else")
    }

    var x= 30
    when{
        isOdd(x) -> println("isOdd")
        else -> println("isEven")
    }

    var x2:Int = 31
    when(x2){
        is Int -> println("is Int")
        !is Int -> println("is not Int")
        else -> println("else")
    }

    var x4:Int? = null
    when(x4){
        is Int -> println("is Int")
        !is Int -> println("is not Int")
        else -> println("else")
    }

}

fun isOdd(x:Int):Boolean{
    if(x%2 !=0 ) return true
    else return false
}
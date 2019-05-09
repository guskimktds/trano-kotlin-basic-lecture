package com.test

fun main() {
    println("if() {} else if() {} else {}")

    var result:String? = null
    var point = 80

    result = if(point>=90) "A" else if(point>=80) "B" else "C"
    //result = (point>=90) ? "A" : ((point>=80) ? "B" : "C")

    println(result)

    var su:Int = 3
    su = if(su==1){

        10*su
    }else if (su==2){
        100*su
    }else {
        1000*su
    }

    println(su)

    println("=======type check is !is ")
    if(su is Int) println("Int")
    else println("Not Int")
}
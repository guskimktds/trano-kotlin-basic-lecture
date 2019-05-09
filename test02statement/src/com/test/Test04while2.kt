package com.test

fun main() {
    println("while................")

    val regex = "(\\d+)|-(\\d+)".toRegex()
    println(regex.matches(""))
    println(regex.matches("1"))
    println(regex.matches("-1"))
    println(regex.matches("qq"))

    var strNum:String? = ""
    while(true){
        println("Input Number : ")
        strNum= readLine()

        var num = if(regex.matches(strNum.toString())){
            strNum!!.toInt()
        }else{
            println("Only Number~~")
        }

        if(num == -1) break
    }

}
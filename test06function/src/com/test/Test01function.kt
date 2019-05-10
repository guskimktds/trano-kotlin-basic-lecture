package com.test

fun main() {
    fun fn1(){
        println("fn1()....")

    }
    fn1()

    fun fn2() = println("fn2().....")
    fn2()

    fun fn3(x:Int,y:Int) = x+y
    println(fn3(11,22))

    println("big or small fn4(100,200)")
    fun fn4(x:Int,y:Int) = if(fn3(x,y)>=200) "big" else "small"


    fn4(150, 300)

    fun fn5(rescode:ResponseCode) = when(rescode.code){
        200 -> "OK"

        400,403 -> "Not Found"

        500,501 -> "Error"
        else -> "else"

    }

    fn5(ResponseCode(200))
    //
    //200 ok
    //400,403 not found
    //500,501 Error


}//end main

data class ResponseCode(val code:Int)
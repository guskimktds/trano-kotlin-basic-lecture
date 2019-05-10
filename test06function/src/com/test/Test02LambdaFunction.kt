package com.test

fun main() {
    println("Lambda Function")

    //a. fun
    fun afn1(){
        println("afn1()...")
    }
    afn1()

    fun afn2() = println("afn2()...")
    afn2()

    val afn3 = {println("afn3()...")}   //오른쪽에 {} 하면 왼쪽이 변수가 된다.
    afn3()
    run(afn3)
    ({println("afn33()...")})()

    //no name fun , 교차함수.. 함수를 () 에 넣을수 있고. (10) 값을 받을수 있고 (값)을 배열로 받을수 있다. 이때 x:IntArray
    (fun(x:Int) {
        println("afn33()..."+x)
    })(10)

}
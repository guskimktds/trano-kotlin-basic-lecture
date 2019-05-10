package com.test

fun main(){
    println("Reflection function")

    printFn(::plusFn)  //:: 리플렉션 기호를 사용하여 호출, printFn 내부에서 함수를 콜한다.
    printFn(::minusFn)  //:: 리플렉션 기호를 사용하여 호출


}

fun printFn(fn: (Int,Int) -> Int ) {
    println(fn(100,10))
}

fun plusFn(a:Int, b:Int) = a+b

fun minusFn(a:Int, b:Int) = a-b

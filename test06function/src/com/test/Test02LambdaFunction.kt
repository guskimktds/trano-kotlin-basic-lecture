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

    //b.
    fun bfn1(x:Int)/*:Unit*/{
        println("bfn1()..."+x)
    }
    bfn1(100)

    val bfn2 = { x:Int -> println("bfn2()...$x") }  //왼쪽은 받을값 파라미터:타입, 오른쪽은 실행할 처리함수
    bfn2(300)
    run({bfn2(3000)})
    ({ x:Int -> println("bfn2()...$x") } )(30_000)   //30_000 '_' 로 정수자리수를 끊어서 표기가능함(코틀린 문법)

    //c. 리턴이 있는 함수
    fun cfn1(x:Int):Int{
        println("cfn1()...$x * 10 =${x*10}")
        return x*10
    }
    cfn1(10)

    //lambda -> 왼쪽은 받을값 파라미터:타입, 오른쪽은 반환

//    val cfn2 = { x:Int -> println("cfn2()...$x * 10 =${x*10}") }
    val cfn2 = { x:Int -> x*10 }
    println(cfn2(99))
    cfn2(99)

    fun cfn3(x:Int, y:Int):Int{
        println("cfn3()...$x * $y =${x*y}")
        return x*y
    }
    val result = cfn3(10,20)
    println("result : $result ")


    val cfn4 = { x:Int, y:Int -> x*y }
    val result2 = cfn4(30,40)
    println("result2 : $result2")
}
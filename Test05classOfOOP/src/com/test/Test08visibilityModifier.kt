package com.test

import aaa.bbb.Test09CCC
import aaa.bbb.Test09DDD

fun main(){
    println("Visiblility Modifier")

    val ta:Test09AAA = Test09AAA(11)

    //private X
//    val tb:Test09BBB = Test09BBB()  //Test09BBB 를 private 하면 같은 패키지에서도 불러오지 못함

    val tc:Test09CCC = Test09CCC()  //다른패키지 클래스는 import 해서 쓸수 있다.
    val td:Test09DDD = Test09DDD()  //다른패키지 클래스는 import 해서 쓸수 있다.
    println(td.d3)
    println(td.d4)
    td.test3()
    td.test4()

}// end main()

private class Test09AAA private constructor(){  //생성자에도 private 사용, constructor 에 사용을 부분적으로 제한할수 있음
    constructor(x:Int):this()  //파라미터가 있는 constructor 는 public (default)로 생성
}
package com.test

fun main(){
    println("inner class")
    var out:Outer = Outer()

    var inn: Outer.Inner = out.Inner()

    println(inn.age)
    inn.test()


    //local inner
    var kor = 100

    class LocalOuter{
        var name:String = "kim22"
        fun outTest(){
            kor=300
            println(kor)
        }
        inner class Inner{
            var age = 22
            fun test(){
                println("Local Outer test()...")
            }
        }
    }

    val localOut:LocalOuter = LocalOuter()
    localOut.outTest()
    val localInn:LocalOuter.Inner = localOut.Inner()
    localInn.test()


}//end main()

class Outer{
    var name:String = "kim"

    inner class Inner {
        var age:Int = 33
        fun test(){
            println(name)
            println(age)
        }
    }
}
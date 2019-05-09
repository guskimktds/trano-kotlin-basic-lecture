package com.test

fun main() {
    println("data class")
    println("====PersonVO()====")
    var pvo:PersonVO = PersonVO()
    println(pvo.name)
    println(pvo.age)

    println("-------------------")
    pvo = PersonVO("lee", 44)
    println(pvo.name)
    println(pvo.age)

    println("====PersonVO()====")
    var cvo:CarVO = CarVO()
    println(cvo.name)
    println(cvo.price)
    println("-------------------")
    cvo = CarVO("lee", 50000000)
    println(cvo.name)
    println(cvo.price)


}//end main()

data class PersonVO(var name:String="kim", var age:Int=33)
data class CarVO(var name:String="BMW", var price:Int=300000000)
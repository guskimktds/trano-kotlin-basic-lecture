package com.test

fun main(){
    println("enum class")

    CarName.values().forEach{ print("$it ") }
    println()
    println(CarName.BMW)
    println(CarName.Ray)
    println(CarName.OOOO)

    println("==================")
    Product.values().forEach{ print("$it ") }
    println()
    println(Product.AAA)
    println(Product.CCC)
    println(Product.BBB)
    println("${Product.AAA.price} ${Product.AAA.power}")
    println("${Product.BBB.price} ${Product.BBB.power}")
    println("${Product.CCC.price} ${Product.CCC.power}")

    Product.values().forEach{ print("${it.price} ${it.power} ") }

//    fun getProduct(p:Product) = "notebook"
    fun getProduct(p:Product) = when(p){
        Product.AAA -> "notebook1"
        Product.BBB -> "notebook2"
        Product.CCC -> "notebook3"
//        else -> "aaaaaaaaaa"
    }
    println(getProduct(Product.AAA))
    println(getProduct(Product.BBB))
    println(getProduct(Product.CCC))

    println("==================")
    for(item in Product.values()){
        println(item.power)
        println(item.price)
    }

    Product.values().forEach { println("${it.pp()}") }

    Student.values().forEach { println("${it.ns()}") }

}//end main

enum class CarName {BMW,Ray,OOOO}
enum class Product(var price:Int, var power:Int){
    AAA(1000,500),
    BBB(2000,300),
    CCC(3000,400);   // ; 세미콜론을 쓰면 다음줄부터 함수를 작성할수 있음, 안쓰면 오류

    fun pp() = price * power
}

enum class Student(var num:Int, var score:Int){
    KIM(100, 100),
    LEE(200,200),
    YANG(300,300);

    fun ns() = num + score
}
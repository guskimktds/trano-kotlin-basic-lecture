package com.test

fun main() {
    println("fun overloading")
    var c:Car = Car()
    c.insert(100)
    c.insert("oooo")
    println()
}//end main()

class Car{
    var num:Int = 1
    var title:String = "BMW"

    fun insert(num:Int){
        println("insert(num:Int)...")
        this.num = num
    }

    fun insert(title:String){
        println("insert(title:String)...")
        this.num = num
    }
}


package com.test

fun main(){
    println("singleton object")

    val b1:Bean2 = Bean2()
    val b2:Bean2 = Bean2()

    println(b1.hashCode())
    println(b2.hashCode())

    val b3:Bean = Bean
    val b4:Bean = Bean

    println(b3.hashCode())
    println(b4.hashCode())
    println(Bean.beanName)
    Bean.getBean()

    //companion
}

object Bean{  //object 라고 하면 singleton
    val beanName = "Bean"
    fun getBean(){
        println("getBean()...")
    }
}

class Bean2{
    val beanName = "Bean2"
    fun getBean(){
        println("getBean()...")
    }
}
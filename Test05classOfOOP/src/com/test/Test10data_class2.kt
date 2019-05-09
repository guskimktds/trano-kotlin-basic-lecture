package com.test

import java.util.*

fun main() {
    println("data class2")

    println('A'.hashCode())
    println('a'.hashCode())
    println('Z'.hashCode())
    println('z'.hashCode())

    println(0.hashCode())
    println(10.hashCode())

    println("=========hashCode=================")

    println("kim".hashCode()*31+33)
    println(Objects.hash("kim", 33))
    println(Arrays.hashCode(arrayOf("kim", 33)))

    var a1:AAA = AAA("kim", 33)
    var a2:AAA = AAA("kim", 33)

    println(a1.hashCode())
    println(a2.hashCode())
    println(a1.equals(a2))
    println(a1==a2)

    println("=========AAA2=================")
    var a3:AAA2 = AAA2("kim", 33)
    var a4:AAA2 = AAA2("kim", 33)

    println(a3.hashCode())
    println(a4.hashCode())
    println(a3.equals(a4))
    println(a3==a4)

}//end main()

class AAA2(val name:String, val age:Int){
    override fun equals(other: Any?): Boolean {
        if(other == null || other !is AAA2 ) return false
        return name==other.name && age==other.age
    }

    override fun hashCode(): Int {
        return name.hashCode()*31+age
    }

    override fun toString(): String {
        return "com.test.AAA2(name=$name,age=$age)"
    }
}

data class AAA(val name:String, val age:Int)

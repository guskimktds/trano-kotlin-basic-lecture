package com.test

fun main(){
    println("operator...")


    println(10 + 3)
    println(10 - 3)
    println(10 * 3)
    println(10 / 3)
    println(10 % 3)

    println("+++++++++++++++++++++++++++++++++++++++++")

    println(10.plus(3))
    println(10.minus(3))
    println(10.times(3))
    println(10.div(3))
    println(10.rem(3))

    println("+++++++++++++++++++++++++++++++++++++++++")

    println(10 shl 2) // 10<<2
    println(10 shr 2) // 10>>2
    println(-10 ushr 2) //-10>>>2
    println(15 and 5)  // 15 & 5
    println(15 or 5)  // 15 | 5
    println(15 xor 5)  // 15 ^ 5
    println(14.toUInt().toString(2))
    println(14.inv().toUInt().toString(2)) //~

    println("+++++++++++++++++++++++++++++++++++++++++")

    println(5==5)
    println(5!=5)
    println(5>=5)
    println(5<=5)
    println(5>5)
    println(5<5)
    println(String() == "")  //""
    println(String() == null)  //""

    println("+++++++++++++++++++++++++++++++++++++++++")

    println(String().equals(""))
    println("kim".equals("kim"))
    println("Kim".equals("kim",true))
    println("kim".compareTo("kim") ==0)
    println("KIM".compareTo("kim",true) ==0)

    println("++++++ and, &&, or, ||  +++++++++++++++++++++++++++++++++++++++")

    println((5==4) and (5!=5))
    println((5==4) or (5!=5))
    println((5==4) && (5!=5))
    println((5==4) || (5!=5))

    println("++++++ many, or, >>, in +++++++++++++++++++++++++++++++++++")

    println( (3==1) or (3==2) or (3==3))
    println( 3 in 1..10)
    println( 3 !in 1..10)

    println("+++++++++++++++++++++++++++++++++++++++++")
    println("+++++++++++++++++++++++++++++++++++++++++")
    var sum = 0

    sum += 10
    sum += 10
    sum += 10
//    sum = 10
    println("sum:${sum}")

    println("+++++ ? :  >>> if else if else ++++++++++++++++++++++++++++++++++++")

    println(if(true) "kim" else "lee")
    var point = 80
    println(if(point>=90) "A" else if(point>=80) "B" else "C")

    println("++++++ as casting +++++++++++++++++++++++++++++++++++")
    var obj:Any = "hello"
    var s1:String = obj as String
    var s2:String = "hello"

    println(obj==s1)
    println(obj===s1)
    println(obj==s2)
    println(obj===s2)
    println(s1==s2)
    println(s1===s2)

    var aaa = 1

    println(aaa == 1)

    var a:Int = -129
    var x:Int? = a
    var y:Int? = a

    println(x)
    println(y)

    println("======비교===============")

    println(x==y)
    println(x===y)

    //reference , value compare

    //var, val

//    var x1 = String()
    var x1 = "hhh"
    var x2 = "hhhh"

    //x1= x1+"h"

    println(x1)
    println(x2)

    var x3 = x1
    var x4 = x2

    println(x3==x4)
    println(x3===x4)
    println(x1===x3)
    println(x1===x3)


    var obj1 = "yyyy1"
    var obj2 = "yyyy2"
    var obj3 = "yyyy1"

    println(obj1.hashCode())
    println(obj2.hashCode())
    println(obj3.hashCode())


    var x7 = "111"
    var x8 = "1111"

    var x9 = ""
    var x10 = ""

    x9=x7+"1"
    x10=x8

    println(x9.hashCode())
    println(x10.hashCode())
}
package com.test

fun main() {
    println("create class")

    val p:Person = Person() // 객체생성
    println(p)
    println(p.name)
    println(p.age)
    p.sleep()
    p.sleep2()
    println(p.getColor())
    println(p.getColor2())

    println("=======================================")

    val s:Score = Score(1,"kim", 99, 88, 77)
    println(s.num)
    println(s.name)
    println(s.kor)
    println(s.eng)
    println(s.math)

    s.kor = 11
    s.eng = 22
    s.math = 33

    println(s.kor)
    println(s.eng)
    println(s.math)
    println(s.total)

    s.nickName = "lee"
    println(s.nickName)

}//end main()

class Score constructor(
    var num:Int,
    var name:String,
    var kor:Int,
    var eng:Int,
    var math:Int)
{  //constructor 에 변수파라미터 var 를 지정하면 data class 생성조건을 만족한다.
    val total: Int get() = kor+eng+math   //get() 은 val 만 받는다. var(x)
    //var nickName:String = name + " st"

    var nickName:String = ""
        set(value){
            field = value + " st"
        }

    init{
        println("init{}")
    }
}




class Person{   // default public, final, 상속허용선택
    var name:String = "kim"
    var age:Int = 33

    fun sleep():Unit{
        println("sleep()...")
    }

    fun sleep2() = println("sleep2()...")

    fun getColor():Int{
        return 111
    }

    fun getColor2() = 222

}//end class

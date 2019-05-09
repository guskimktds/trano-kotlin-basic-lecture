package com.test

fun main() {
    println("constructor overloading")

    var b:Board = Board(11)
    println(b.num)
    println(b.title)

    b = Board("content2", "title2")

    println(b.num)
    println(b.title)
    println(b.content)

    b = Board()

    println(b.num)
    println(b.title)


}//end main()

class Board /*constructor()*/{
    var num:Int = 1
    var title:String = "title"
    var content:String = "content"

    constructor(){
        num = 33
        title = "ttile33"
        content = "content33"
    }

    constructor(num:Int):this(){       // this() 하면 constructor() 를 우선 실행하고나서 실행
        println("constructor(num:Int)")
        this.num = num
    }

    constructor(content:String,title:String):this(){
        println("constructor(num:Int, title:String)")
        this.title = title
        this.content = content
    }

    constructor(title:String,num:Int){
        println("constructor(title:String,num:Int)")
        this.num = num
        this.title = title
    }
}
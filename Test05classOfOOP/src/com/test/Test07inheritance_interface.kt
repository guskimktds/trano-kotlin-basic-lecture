package com.test

fun main(){
    println("inheritance interface")

    val b:Book = Store(50000, 255)

    println(b.price)
    b.fn1()
    b.fn2()
    b.fn3()

    val n:Note = Store(50000, 255)
    n.fn4()
    n.fn5()

    val s:Store = Store(50000, 255)
    s.fn1()
    s.fn2()
    s.fn3()
    s.fn4()
    s.fn5()

}//end main()

interface Book{
    //var price:Int = 30000 //속성오버라이드를 강제하기 때문에 상속받은쪽에서 초기화를 강제한다. = 3000 (x)
    var price:Int
    fun fn1():Unit
    fun fn2():String
    fun fn3():String{
        println("Book fn3()...")
        return "kim"
    }
}


interface Note /*:Book*/ {  //인터페이스가 인터페이스를 상속받을수 있음 /*:Book*/
    var color:Int

    fun fn4():Int
    fun fn5():IntArray

}

//객체를 생성하기 위한 인터페이스를 상속 받은 클래스를 생성
class Store(override var price: Int, override var color: Int) :Book, Note{
    override fun fn4(): Int {
        println("Store fn4()...")
        return 100
    }

    override fun fn5(): IntArray {
        println("Store fn5()...")
        return IntArray(5)
    }
//    override var price: Int
//        get() = 3000
//        set(value) {}

    override fun fn1() {
        println("Store fn1()...")
    }

    override fun fn2(): String {
        println("Store fn2()...")
        return "lee"
    }

}



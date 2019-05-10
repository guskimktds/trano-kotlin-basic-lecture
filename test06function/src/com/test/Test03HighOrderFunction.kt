package com.test

fun main() {
    println("High Order Function")

    aaa(10)

    //1.
    var fn:(Int) -> Int   //변수에 함수타입을 할당,
    fn = {x -> x*x}
    println(fn(10))

    //2. argument
    var fn2:(Int,Int) -> Int
    fn2 = {x,y -> x+y}
    println(fn2(10,20))

    var fn3:(Int,String) -> String
    fn3 = {x,y -> "$x $y "+y+x}
    println(fn3(10,"kim"))

    var fn4:(Int,String) -> Array<*> = {x,y -> arrayOf(x,y)}
    println(fn4(10,"kim"))

    bbb({x->x*x})

    bbb2({x,y -> x+y})
    bbb2(fun(x:Int,y:Int):Int{return 0})

    bbb3({su,str -> "$su $str"})
    bbb3(fun(x:Int,y:String):String{return "admin"})

    bbb4({su,str -> arrayOf(su,str)})
    bbb4(fun(x:Int,y:String):Array<*>{return arrayOf(1,2,3)})

    //리플렉션? 클래스를 파라미터로 전달하는 방식식

    //3.return
    ccc()()

    println(ccc2()(10))
    
    println(ccc3()(10,20))



}//end main

fun ccc3(): (Int,Int) -> Int {  //파라미터 Int,Int, 반환값 Int
    println("ccc3()...")
    return {x,y->x + y}
}


fun ccc2(): (Int) -> Int {  //파라미터 Int, 반환값 Int
    println("ccc2()...")
    return {x->x*x}
}


fun ccc(): () -> Unit {  //파라미터도 없고, 반환하지 않고 실행만 하면 Unit
    println("ccc()...")
    return fun(){ println("return fn()") }
}

fun bbb2(fn:(Int,Int) -> Int) {
    println("bbb2()...")
    println(fn(30,50))
}
fun bbb3(fn:(Int,String) -> String) {
    println("bbb3()...")
    println(fn(300,"yang"))
}
fun bbb4(fn:(Int,String) -> Array<*>) {
    println("bbb4()...")
    println(fn(4000,"kang"))
}
fun bbb(fn:(Int) -> Int) {
    println("bbb()...")
    println(fn(33))
}

fun aaa(x:Int) {
    println("aaa()...$x")
}
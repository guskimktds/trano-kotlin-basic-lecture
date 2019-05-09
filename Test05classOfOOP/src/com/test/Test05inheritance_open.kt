package com.test

fun main(){
    println("Inheritance open")

    val p:Person2 = Person2()
    println(p.name)
    p.fn()
    p.fn2()
    println(p.toString())

    println("=============================")
    val m:Man = Man()
    m.fn()
    m.fn2()
    println(m.toString())

    println("=============================")

    val f:Father = Father()
    println(f.nickName)

    println("=============================")
    val p2:Person2 = Man()   //타입은 부모로 정의, 사용은 자식객체를 사용하면 loose coupling
    println(p2.name)
    p2.fn2()

    val p3:Person2 = Father()   //타입은 부모로 정의, 사용은 자식객체를 사용하면 loose coupling
    println(p3.name)
    p3.fn2()

    val m2:Man = Father()   //타입은 부모로 정의, 사용은 자식객체를 사용하면 loose coupling
    println(m2.name)
    m2.fn2()




}//end main()

// 상속 : overriding, 다형성

open class Person2{
    open val name:String = "kim"

    fun fn(){
        println("Person2 fn()...")
    }

    open fun fn2(){
        println("Person2 fn2()...")
    }

    override fun toString(): String {
//        return super.toString()
        return "test.com.Person2:$name"
    }
}//end Person2()

open class Man:Person2(){  //Person2 클래스를 상속받는다. final 을 해제하려면 부모클래스에 open 키워드
    override val name:String = "Yang"  //(속성에 대한 재정의)초기변수값도 부모의 값을 변경하려고하면 부모에 open, 자식에 override
    val money:Int = 100000000
    init{
        println(name)
        println(super.name) //super(부모)의 값을 사용하고자 할때
        fn()
    }

    //재정의(overriding) 부모클래스의 fun 에 final 을 open 으로 해제, 전제는 상속관계여야함
    override fun fn2(){
        println("Man overriding fn2()...")
    }

    override fun toString(): String {
//        return super.toString()
        return "test.com.Man:$name"
    }

}//end Man()

class Father:Man(){
    var nickName:String = "mike"
}

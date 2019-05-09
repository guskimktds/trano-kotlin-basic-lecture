package com.test

fun main(){
    println("inheritance abstract")

    val a:Animal = Cat()  //추상클래스를 상속받은 재정의된 클래스로 생성
    a.absFn()

}//end main()

//상속받는 클래스에서 로직처리를 하도록 강제하는 명세(추상) 클래스
abstract class Animal{

    abstract fun absFn()
    open fun test() = 111  // 기본적을 강제되지 않아 만약 오버라이드해서 사용할려면  open

    open fun test2(){

    }
}

abstract class Animal2:Animal(){

}

class Cat:Animal() {   //Animal2 를 상속받으면 Animal 클래스 내 메소드를 오버라이드 해야함
    override fun absFn() {
        println("Cat override absFn()")
    }
    override fun test() = 333  //override 시 추상메소드에 형태를 동일하게 사용해야한다. {}가 없는데 넣으면 Unit 로 오류가 발생할수 있음
    override fun test2(){

    }
}

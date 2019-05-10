package com.test

fun main() {
    println("Thread...Runnable")

    //1. java Thread
//    new Thread(){
//        void run(){
//            println()
//        }
//    }.start();


    //비동기 처리되었다.
    //코루틴, 코딩으로 sw 기반 스레드 처리, 기본은 하드웨어 프로세스에 제어를 넘겨서 스레드 처리함
    Thread{
        for(i in 0..10){
            print("$i ")
            Thread.sleep(500)
        }
    }.start()

    //2. Thread(Runnable).start(), 생성자의 argument를 이용한 스레드 처리
    Thread(Runnable {
        for(i in 'a'..'j'){
            print("$i ")
            Thread.sleep(500)
        }
    }).start()

    //3. Thread(Runnable).run{start()}
    Thread(Runnable {
        testLoop()
    }).run{start()}


    //4.Thread() class 상속
    ThreadEx().start()

    //5.Runnable interface implements
    Thread(RunnableImpl()).start()

    println("end main....")

}//end main

open class AAA
class RunnableImpl:AAA(), Runnable{
    override fun run() {
        for(i in 90..99){
            print("$i ")
            Thread.sleep(500)
        }
    }
}

class ThreadEx:Thread(){
    override fun run() {
        for(i in 20..29){
            print("$i ")
            Thread.sleep(500)
        }
    }
}


fun testLoop(){

    for(i in 'a'..'j'){
        print("$i ")
        Thread.sleep(500)
    }
}

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



    println("end main....")

}//end main

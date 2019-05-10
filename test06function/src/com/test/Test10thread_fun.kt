package com.test

import kotlin.concurrent.thread

fun main(){
    println("thread fun....")

    //
    thread(true){
        for(i in 90..99){
            print("$i ")
            Thread.sleep(500)
        }
    }

    thread(start=true, priority = 8){
        for(i in 11..20){
            print("$i ")
            Thread.sleep(500)
        }
    }

    println("thread end")
}
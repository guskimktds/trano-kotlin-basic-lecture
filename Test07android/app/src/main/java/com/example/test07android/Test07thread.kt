package com.example.test07android

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main(){

    println("main start")
    /*thread(true){
        for(i in 90..99){
            print("$i ")
            Thread.sleep(500)
        }
    }*/

    launch{
        for(i in 90..99){
            print("$i ")
            //Thread.sleep(500)
        }
    }
    runBlocking { val job = launch(Dispatchers.Default){
        for(i in 1..10){
            print("$i ")
            //Thread.sleep(500)
        }
    } }
    println("main end")
}
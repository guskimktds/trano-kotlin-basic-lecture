package com.test

import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.declaredMemberProperties

fun main(){
    println("Reflection class")

    println("============kotlin.reflect============")
    println(Test05Activity::class)
    println(Test05Activity::class.qualifiedName)
    println(Test05Activity::class.constructors)

    println(Test05Activity::class.declaredMemberProperties)
    Test05Activity::class.declaredMemberProperties.forEach { println("${it.visibility} ${it.name}") }

    println(Test05Activity::class.declaredMemberFunctions)
    Test05Activity::class.declaredMemberFunctions.forEach { println("${it.name} ${it.returnType}") }

    println("============kotlin.reflect============")
    println(Test05Activity::class.declaredMemberFunctions.filter { it.name.equals("login") })
    println(Test05Activity::class.declaredMemberFunctions.map { it.name+" aaaaaa" })
    println(Test05Activity::class.declaredMemberFunctions.parallelStream().count())
    println(Test05Activity::class.declaredMemberFunctions.parallelStream().findFirst())



}

class Test05Activity(val id:String,val pw:String, var age:Int){
    fun login():Boolean{
        if(id.equals("admin") && pw.equals("hi12345")) return true
        return false
    }

    fun onCreate(saveInstanceState:Bundle){
        println("onCreate()...")

    }

    fun onStart(){
        println("onStart()...")
    }
}

class Bundle



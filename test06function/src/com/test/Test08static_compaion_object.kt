package com.test

fun main() {
    println("static companion object")

    println(Test08companionObject.HORIZONTAL_SIZE)
    println(Test08companionObject.VERTICAL_SIZE)
//    println(Test08companionObject.VIEW_COLOR[1]) //private
}//end main

class Test08companionObject{
    companion object {
        private val VIEW_COLOR = intArrayOf(111,222,255)
        val HORIZONTAL_SIZE = 20_0000
        val VERTICAL_SIZE = 10_0000
    }
}
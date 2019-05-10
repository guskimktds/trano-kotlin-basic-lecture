package com.test

fun main(){
    println("null safe...?.let{}")

//    var action = null
    var action = TestAction()
    action?.let{
        action.setVisible(true)
    }

}//end main

//null 이면 콜하지 못하게 하려면, 컴파일단계에서 안정적으로 처리하고자 하면
class TestAction{
    fun setVisible(x:Boolean){}
}
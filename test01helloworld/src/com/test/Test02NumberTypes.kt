package com.test

fun main(){
    println("number type")

    println("${Double.MIN_VALUE} ~ ${Double.MAX_VALUE}")
    println("${Float.MIN_VALUE} ~ ${Float.MAX_VALUE}")
    println("${Long.MIN_VALUE} ~ ${Long.MAX_VALUE}")
    println("${Int.MIN_VALUE} ~ ${Int.MAX_VALUE}")
    println("${Short.MIN_VALUE} ~ ${Short.MAX_VALUE}")
    println("${Char.MIN_VALUE} ~ ${Char.MAX_VALUE}")
    println("${Byte.MIN_VALUE} ~ ${Byte.MAX_VALUE}")
//    println("${Long.MIN_VALUE} ~ ${Long.MAX_VALUE}")

    println("---------UInt---------------------------------------")

    println("${UInt.MIN_VALUE} ~ ${UInt.MAX_VALUE}")


    println("--------toUInt----------------------------------------")

//    println("${Double.MIN_VALUE.toUInt()} ~ ${Double.MAX_VALUE.toUInt()}")
//    println("${Float.MIN_VALUE.toUInt()} ~ ${Float.MAX_VALUE.toUInt()}")
    println("${Long.MIN_VALUE.toUInt()} ~ ${Long.MAX_VALUE.toUInt()}")
    println("${Int.MIN_VALUE.toUInt()} ~ ${Int.MAX_VALUE.toUInt()}")
    println("${Short.MIN_VALUE.toUInt()} ~ ${Short.MAX_VALUE.toUInt()}")
//    println("${Char.MIN_VALUE.toUInt()} ~ ${Char.MAX_VALUE.toUInt()}")
    println("${Byte.MIN_VALUE.toUInt()} ~ ${Byte.MAX_VALUE.toUInt()}")

    println("-----------toString-------------------------------------")
    println("${Byte.MIN_VALUE.toUInt().toString(2)} ~ ${Byte.MAX_VALUE.toUInt().toString(2)}")
}

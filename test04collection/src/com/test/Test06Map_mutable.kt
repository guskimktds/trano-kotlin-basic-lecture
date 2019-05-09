package com.test

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

fun main() {
    println("map mutable")

    println("mutable mutableMapOf(), hashMapOf(): many Type, key unique, value not unique, index X")
    //var map:Map<Any,*> = mutableMapOf("key1" to 100, 2 to 100, "key3" to "kim", "key4" to null, "key5" to IntArray(5)) //{name: 'yang'}
    var map:HashMap<Any,Any?> = hashMapOf("key1" to 100, 2 to 100, "key3" to "kim", "key4" to null, "key5" to IntArray(5)) //{name: 'yang'}

    println(map.size)

//    map = map.plus(Pair<String,String>("key8","name8"))
    map.put("key7","name77")
    println(map.size)
    map.remove(2)
    println(map.size)

    map.replace("key1", 3333)

    println("=======map.values=======")
    println(map)
    println(map.values)
    println(map.keys)
    println(map.get("key1"))
    println(map.get(1))

    for(x in map) {
        println("${x.key}:${x.value}")
    }


    println("=======filterValues=======")
    println(map.filterValues { it==null })
    println(map.filterValues { it!=null })
    println(map.filterValues { it is Int })
    println(map.filterValues { it is String })
    println(map.filterValues { it is IntArray })

    println("=======mapValues=======")
    println(map.mapValues { it.value.toString()+"%" })
    println(map.mapValues { if(it.value is Int)it.value.toString()+"%" else null }) //삼한연산 처리하므로 else null 이 있어야 정상적인 결과를 얻는다.
    println(map.mapValues { if(it.value is Int)it.value.toString()+"%" else if(it.value is String)it.value.toString()+"player" else it.value }) //삼한연산 처리하므로 else null 이 있어야 정상적인 결과를 얻는다.

    println("=======mapValues=======")
    val p1:Pair<String,String> = Pair("name1","yang1")
    val p2:Pair<String,String> = Pair("name2","yang2")
    val p3:Pair<String,String> = Pair("name3","yang3")
    val p4:Pair<String,String> = Pair("name4","yang4")

    val pMap:HashMap<String,String> = hashMapOf(p1,p2,p3,p4)
    pMap.put("name5","yang5")
    println(pMap)

    println("=======Pair data class Object=======")
    val sp:Pair<Int,Student> = Pair(1,Student(33,"lee33"))
    val sp1:Pair<Int,Student> = Pair(2,Student(44,"lee44"))
    val sp2:Pair<Int,Student> = Pair(3,Student())

    val sMap:HashMap<Int,Student> = hashMapOf(sp,sp1,sp2)
    sMap.put(4,Student(55,"lee55"))
    println(sMap)
    println(sMap.get(1)?.number) //nullable
    println(sMap.get(2)!!.number) //not null
    println(sMap.get(3)!!.number) //not null
    println(sMap.get(4)!!.number) //not null
    println(sMap.get(1)?.name) //not null
    println(sMap.get(2)!!.name) //not null
    println(sMap.get(3)!!.name) //not null
    println(sMap.get(4)!!.name) //not null

}//end main

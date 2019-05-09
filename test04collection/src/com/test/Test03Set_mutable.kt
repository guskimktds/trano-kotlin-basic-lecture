package com.test

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashSet

fun main() {
    println("List mutable")

//    val set:MutableSet<Any?> =  mutableSetOf(1,2,1,"kim",3,3,null,true,false,IntArray(3), arrayOf(1,2,3))  //중복허용, 인덱스 생성됨, readonly
    val set:HashSet<Any?> =  hashSetOf(1,2,1,"kim",3,3,null,true,false,IntArray(3), arrayOf(1,2,3))  //중복허용, 인덱스 생성됨, readonly
//    val list:ArrayList<*> = arrayListOf(1,2,1,"kim",3,3,null,false,IntArray(3), arrayOf(1,2,3))  //중복허용, 인덱스 생성됨, readonly

    println(set)
    set.add("kim")
    set.add("kim2")
    set.remove(false)
//    set.clear()

    for (x in set) {
        if(x is IntArray) {
            for(item in x){
                print("$item ")
            }
            println()
        }else if(x is Array<*>) {
            println(Arrays.deepToString(x))
            println()
        }else {
            print("$x ")
        }

    }
    println()

    println("============filterNotNull==================")
    println(set.filterNotNull())


    println("============filterNotNull==================")
    println(set.filterNotNull())

    println("============filterIsInstance==================")
    println(set.filterIsInstance<Int>())
    println(set.filterIsInstance<IntArray>())
    println(set.filterIsInstance<String>())
    println(set.filterIsInstance<Array<*>>())
    println(set.filterIsInstance<Array<Int>>())

    println("============toIntArray()==================")
    var arr:HashSet<Int> = hashSetOf<Int>(1,2,3,1,2,3,1,2,3)
//    val sus:IntArray = arrayListOf<Int>(1,2,3).toIntArray()    //함수형
    arr.add(999)
    val sus:HashSet<Int> = hashSetOf<Int>(1,2,3).toHashSet()    //함수형
    println(sus.sum())
    println(sus.sum())
    for(item in sus) {
        print("$item ")
    }
    println()
//
//    println("============toTypeArray=============")
//
//    val list2:ArrayList<String> = arrayListOf("kim","gus","bear")
//    val names = list2.filterIsInstance<String>()
//    println(names)
//
//    val list3:List<Any?> = arrayListOf(null,"kim","gus","bear",1,2,3)  //Any 와 Any? 차이  null 허용
//    val names1 = list3.filterIsInstance<String>()
//    println(names1)
//
//    println("===%s %s %s===".format(*names.toTypedArray()))  //*을 붙인 결과 toTypeArray 가 에러없어 표시
//    println("===%d %d %d===%d".format(*sus.toTypedArray(), sus.sum()))  //*을 붙인 결과 toTypeArray 가 에러없어 표시
//
    println("============listOf=============")
    var set33 = hashSetOf<Int>(1,2,3)

//    list33 += 4
//    list33 += 5
//    list33 += 6
    set33.add(44)
    set33.add(44)
    set33.add(44)
    println(set33)

    println("============listOf=============")
    println("============listOf=============")
    println("============listOf=============")
    println("============listOf=============")
//
    val p1 = Person()
    val p2 = Person("kim1")
    val p3 = Person("kim2", 33)
    val p4 = Person("kim3", 33)
    val p5 = Person("kim3", 44)
    val p6 = Person("kim3", 44)

    println(p1.name+" "+p1.age)
    println(p2.name+" "+p2.age)
    println(p3.name+" "+p3.age)
    println(p4.name+" "+p4.age)
    println(p5.name+" "+p5.age)
    println(p6.name+" "+p6.age)

    println("============listOf<Person>(p1,p2,p3,p4,p5,p6)=============")

    val ps = hashSetOf<Person>(p1,p2,p3,p4,p5,p6)

    ps.add(Person("kim3", 33))

    ps.forEach { println("${it.name} ${it.age}") }

    println("============asSequence=============")
    val search = ps.asSequence().filter { it.age>30 }.toHashSet()
    println(search)
    search.forEach { println("${it.name} ${it.age}") }

    println("============sequenceOf()=============")
    val result = sequenceOf(0,1,2,3,4,5,5,5,5,5).toHashSet()
    println(result)

    val result2 = sequenceOf(0,1,2,3,4,5,5,5,5,5).filter { it%2==0 }.toHashSet()
    println(result2)

    println("============generateSequence()=============")

    val result3 = generateSequence(0){it+1}.take(10).toHashSet()
    println(result3)

    println("============(0..10).asSequence().filter=============")

//    val result4= (0..10).asSequence().toSet()
    val result4= (0..10).asSequence().filter { it%2==1 }.toHashSet()
    println(result4)

    println("============('A'..'Z').asSequence().filter=============")
    val result5= ('A'..'Z').asSequence().toHashSet()
    println(result5)

    result5.remove('Z')
    println(result5)
    val result6= (0..10).asSequence().toHashSet()
    println(result6)

    val result7= result6.map { it*10 }.toHashSet()

    result7.add(111)
    println(result7)


    println("============joinToString=============")
    val join = result7.joinToString("-")
    println(join)

    val join2 = result7.joinToString("-", "[", "]", 10)
    println(join2)

    val result8 = ('a'..'z').asSequence().toHashSet()
    result8.add('Y')
    result8.add('C')
    println(result8)
    println(result8.any { it.isUpperCase() })  //하나라도 대문자이면 true, 없으면  false

//    val up = result8.any { it.toUpperCase() }
    val up = result8.map { it.toUpperCase() }

    println(up)

}//end main

package com.test

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    println("List mutable")

    println("============mutableListOf >> =============")
    val list:MutableList<Any?> =  mutableListOf(1,2,1,"kim",3,3,null,false,IntArray(3), arrayOf(1,2,3))  //중복허용, 인덱스 생성됨, readonly
//    val list:ArrayList<*> = arrayListOf(1,2,1,"kim",3,3,null,false,IntArray(3), arrayOf(1,2,3))  //중복허용, 인덱스 생성됨, readonly

    println(list)
    list.add(111)
    list.add("kang")
    list.set(0,100)
    list.remove(6)
//    list.clear()

    for (x in list) {
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
    println(list[0])

    println(list.get(3))

    println("============filterNotNull==================")
    println(list.filterNotNull())

    println("============filterIsInstance==================")
    println(list.filterIsInstance<Int>())
    println(list.filterIsInstance<IntArray>())
    println(list.filterIsInstance<String>())
    println(list.filterIsInstance<Array<*>>())
    println(list.filterIsInstance<Array<Int>>())

    println("============toIntArray()==================")
    var arr:ArrayList<Int> = arrayListOf<Int>(1,2,3)
    val sus:IntArray = arrayListOf<Int>(1,2,3).toIntArray()    //함수형
    println(sus.sum())
    println(sus.sum())
    for(item in sus) {
        print("$item ")
    }
    println()

    println("============toTypeArray=============")

    val list2:ArrayList<String> = arrayListOf("kim","gus","bear")
    val names = list2.filterIsInstance<String>()
    println(names)

    val list3:List<Any?> = arrayListOf(null,"kim","gus","bear",1,2,3)  //Any 와 Any? 차이  null 허용
    val names1 = list3.filterIsInstance<String>()
    println(names1)

    println("===%s %s %s===".format(*names.toTypedArray()))  //*을 붙인 결과 toTypeArray 가 에러없어 표시
    println("===%d %d %d===%d".format(*sus.toTypedArray(), sus.sum()))  //*을 붙인 결과 toTypeArray 가 에러없어 표시

    println("============listOf=============")
    var list33 = arrayListOf<Int>(1,2,3)

//    list33 += 4
//    list33 += 5
//    list33 += 6
    println(list33)

    println("============listOf=============")
    println("============listOf=============")
    println("============listOf=============")
    println("============listOf=============")

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

    val ps:ArrayList<Person> = arrayListOf<Person>(p1,p2,p3,p4,p5,p6)

    ps.forEach { println("${it.name} ${it.age}") }

    println("============asSequence=============")
    val search = ps.asSequence().filter { it.age>30 }.distinct().toMutableList()
    search.add(Person("kim44", 444))
    println(search)

    println("============sequenceOf()=============")
    val result = sequenceOf(0,1,2,3,4,5).toMutableList()
    result.add(100)
    println(result)

    val result2 = sequenceOf(0,1,2,3,4,5).filter { it%2==0 }.toMutableList()
    println(result2)

    println("============generateSequence()=============")

    val result3 = generateSequence(0){it+1}.take(10).toMutableList()
    println(result3)

    println("============(0..10).asSequence().filter=============")

    val result4= (0..10).asSequence().filter { it%2==1 }.toMutableList()
    result4.add(100)
    println(result4)

    println("============('A'..'Z').asSequence().filter=============")
    val result5= ('A'..'Z').asSequence().toMutableList()
    println(result5)


    val result6= (0..10).asSequence().toMutableList()
    println(result6)

    val result7= result6.map { it*10 }
    println(result7)


//    println("============joinToString=============")
//    val join = result7.joinToString {  }
//    println(result5)

}//end main

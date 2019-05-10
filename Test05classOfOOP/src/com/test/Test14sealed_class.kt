package com.test

sealed class Zoo(val name:String){

    class Elephant(name:String, val nose:String):Zoo(name)
    class Tiger(name:String, val eye:String):Zoo(name)
    class Lion(name:String, val mouth:String):Zoo(name)

    fun whatAnimal(zoo:Zoo) = when(zoo){
        is Elephant -> {
            println("${zoo.name} ${zoo.nose}")
        }
        is Tiger -> {
            println("${zoo.name} ${zoo.eye}")

        }
        is Lion -> {
            println("${zoo.name} ${zoo.mouth}")

        }
//        else -> {
//        }
    }

}


fun main() {
    println("sealed class")

    val zoo:Zoo = Zoo.Elephant("kim1", "very long")
    zoo.whatAnimal(zoo)

    val zoo2:Zoo = Zoo.Tiger("kim2", "very nice")
    zoo.whatAnimal(zoo2)

    val zoo3:Zoo = Zoo.Lion("kim3", "very very")
    zoo.whatAnimal(zoo3)
}
package com.david_glez.seccion3_fundamentos_kotlin

fun main(){
    newTopic("Bucles")
    showPersons("Alan", "David", "Gisel")
    showPersons("David", "Gis", "Alejandro", "Pedro", "Angel", "Jorge")
}

fun showPersons(p1: String, p2: String, p3: String){
    println(p1)
    println(p2)
    println(p3)
}

fun showPersons(vararg persons: String){
    newTopic("Ciclo for")
    for (person in persons) println(person)

    newTopic("While")
    var index = 0
    while (index < persons.size){
        if (persons[index] == "David") println("Hola David!")
        println(persons[index])
        index ++
    }

    newTopic("When")
    index = (0..persons.size -1).random()
    println(index)
    when(persons[index]){
        "David" -> println("Es David")
        "Gis" -> println("Es Gis")
        "Alejandro" -> {
            println("Es Alejandro")
            println("Ir a otra pantalla")
        }
        else -> println(persons[index])
    }
}
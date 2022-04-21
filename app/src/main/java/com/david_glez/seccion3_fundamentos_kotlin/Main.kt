package com.david_glez.seccion3_fundamentos_kotlin

const val separator = "=========="
/*Si sabemos cual es el valor de esa variable en tiempo de compilacion las buenas practicas dicen
* que debemos de agregar const para que el valor de la constante sea asignado en tiempo de compilacion
* y solo se usa de manera global*/

fun main(){
    //print("Hola Kotlin")
    newTopic("Hola Kotlin desde funcion")
    newTopic("Variables y Constantes")
    //Constantes, Kotlin por defecta el tipo de variable que es
    val a = 2
    val b = "Hola"
    val c = true
    println("a = $a")
    println("b = $b")
    println("c = $c")

    //Variables
    var d: String
    d = "String"
    println("d = $d")

    newTopic("Nulos")
    var objNull: Any? //Any es para que la variable pueda adquirir cualquier valor
    objNull = null
    println(objNull)
}

fun newTopic(topic: String){
    //println(topic)
    print("\n$separator $topic $separator\n")
}
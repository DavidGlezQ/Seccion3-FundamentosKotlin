package com.david_glez.seccion3_fundamentos_kotlin

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
    print("\n========== $topic ==========\n")
}
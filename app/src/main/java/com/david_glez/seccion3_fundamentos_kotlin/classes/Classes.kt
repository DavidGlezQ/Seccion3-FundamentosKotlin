package com.david_glez.seccion3_fundamentos_kotlin.classes

import com.david_glez.seccion3_fundamentos_kotlin.newTopic

fun main(){
    newTopic("Clases")
    val phone: Phone = Phone(123456789) // El Phone es redundante
    //val phone = Phone(123456789)
    phone.call()
    phone.showNumber()
    //println(phone.number)

    newTopic("Herencia")
    val smartphone = Smartphone(1836678234, true) // Herencia
    smartphone.call()

    newTopic("Sobrecarga")
    smartphone.showNumber()
    println("Privado? ${smartphone.isPrivate}")

    newTopic("Data Classes")
    val myUser = User(0, "David", "Gonzalez", Group.FAMILY.ordinal)
    val bro = myUser.copy(1, "Alejandro")
    val friend = bro.copy(2, group = Group.FRIEND.ordinal)

    println(myUser.component3())
    println(myUser)
    println(bro)
    println(friend)

    /*Todo el bloque de codigo tiene el mismo contexto, por lo que en la variable isPrivate ya no es
    *  necesario poner el contexto.*/
    newTopic("Funciones de alcance")
    with(smartphone){
        println("Privado? $isPrivate")
        call()
    }

    /*friend.group = Group.WORK.ordinal
    friend.name = "David"
    friend.lastName = "Gonzalez"*/
    friend.apply {
        group = Group.WORK.ordinal
        name = "Alejandro"
        lastName = "Quezada"
    }

    println(friend)

}
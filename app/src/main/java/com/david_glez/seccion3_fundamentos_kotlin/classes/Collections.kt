package com.david_glez.seccion3_fundamentos_kotlin.classes

import com.david_glez.seccion3_fundamentos_kotlin.newTopic

fun main(){
    newTopic("Colecciones")
    newTopic("Solo lectura")
    val frutaList = listOf("Manzana", "Banana", "Uva", "Lima")
    println(frutaList.get((0..frutaList.size -1).random()))
    println("Index de Uva es ${frutaList.indexOf("Uva")}")

    newTopic("Mutable List")
    val myUser = User(0, "David", "Gonzalez", Group.FAMILY.ordinal)
    val bro = myUser.copy(1, "Alejandro")
    val friend = bro.copy(2, group = Group.FRIEND.ordinal)

    val userList = mutableListOf(myUser, bro)
    println(userList)
    userList.add(friend)
    println(userList)
    // remove
    userList.removeAt(1)
    userList.remove(myUser)
    println(userList)

    val userSelectList = mutableListOf<User>()
    println(userSelectList)
    //userSelectList.addAll(userList)
    userSelectList.add(myUser)
    println(userSelectList)

    // Se sustituye el obejto de ese litsOf
    userSelectList.set(0, bro)
    println(userSelectList)

    // Kotlin si permite repetir un objeto en una lista
    userSelectList.add(myUser)
    userSelectList.add(myUser)
    println(userSelectList)

    newTopic("Map") // Funcionan en clave valor
    val userMap = mutableMapOf<Int, User>()
    println(userMap)
    userMap.put(myUser.id.toInt(), myUser)
    userMap.put(myUser.id.toInt(), myUser) // Aqui no se pueden suplicar los valores
    println(userMap)

    userMap.put(friend.id.toInt(), friend)
    println(userMap)

    userMap.remove(2)
    println(userMap)
    println(userMap.isEmpty())
    println(userMap.containsKey(0))
    userMap.put(bro.id.toInt(), bro)
    userMap.put(friend.id.toInt(), friend)
    println(userMap)
    println(userMap.keys)
    println(userMap.values)

    val tarea2 = Tarea2(0, "David", 23, "Masculino")
    println(tarea2)
    println(tarea2.printTarea2(tarea2))

}
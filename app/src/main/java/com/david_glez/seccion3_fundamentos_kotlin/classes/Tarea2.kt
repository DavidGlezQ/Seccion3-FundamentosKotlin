package com.david_glez.seccion3_fundamentos_kotlin.classes

data class Tarea2(val id: Long, val name: String, val age: Int, val gender: String) {

    open fun printTarea2(tarea2: Tarea2){
        println("Mi nombre es $name mi edad es $age y mi sexo es $gender")
    }
}
package com.david_glez.seccion3_fundamentos_kotlin.classes

// Con la palabra reservada open hacemos que una clase pueda ser heredada, por defecto no se puede en kotlin
open class Phone (protected val number: Int){ // Asi podemos definir su constructor y tambien funciona como propiedad
    open fun call(){
        println("Llamando...")
    }

    open fun showNumber(){
        println("Mi numero es $number")
    }
}
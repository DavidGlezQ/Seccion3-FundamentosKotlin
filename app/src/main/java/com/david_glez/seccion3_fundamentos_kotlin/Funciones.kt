package com.david_glez.seccion3_fundamentos_kotlin

import java.lang.Math.abs

fun main(){
    sayHello()
    newTopic("Argumentos")
    println(sum(12, 5))
    val a = 2
    val b = 3
    println("$a + $b = ${sum(a, b)}")
    println("$a - $b = ${sub(a, b)}")

    newTopic("Infix")
    val c = -3
    println(c.enableAbs(false))
    println("$a + $c = ${sum(a, c.enableAbs(false))}")
    println("$a + $c = ${sum(a, c.enableAbs(true))}")

    newTopic("Sobrecarga")
    showProducts("Soda", "10%")
    showProducts("Pan")
    showProducts("Caramelo", "%5")
    showProducts("Agua", vigencia = "15 de marzo") // Argumentos nombrados
}

private fun sayHello(): Unit { // Unit es lo mismo que void, en kotlin es redundante ya que por defecto lo hace Unit
    println("Hola Kotlin")
}

fun sum(a: Int, b: Int): Int{
    return a + b
}

fun sub(a: Int, b: Int) = a - b

infix fun Int.enableAbs(enable: Boolean) = if (enable) abs(this) else this

// Sobrecarga
fun showProducts(name: String, promo: String = "Sin Promocion", vigencia: String = "Agotar Existencia"){
    println("$name = $promo hasta $vigencia")
}
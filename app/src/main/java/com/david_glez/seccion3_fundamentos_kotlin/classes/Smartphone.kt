package com.david_glez.seccion3_fundamentos_kotlin.classes

class Smartphone(number: Int, val isPrivate: Boolean): Phone(number) {

    override fun showNumber() {
        if (isPrivate) println("Desconocido") else super.showNumber()
    }
}
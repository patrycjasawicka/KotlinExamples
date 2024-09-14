package com.example.kotlinapplication.functionreference

fun double(x: Int): Int = x * 2

fun isEven(x: Int): Boolean = x % 2 == 0

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val doubledNumbers = listOf<Int>() // TODO: podwój elementy z listy, wykorzystaj function reference
    println("Doubled Numbers: $doubledNumbers")

    val evenNumbers = listOf<Int>()  // TODO: odfiltruj nieparzyste wartości, wykorzystaj function reference
    println("Even Numbers: $evenNumbers")
}

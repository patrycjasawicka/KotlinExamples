package com.example.kotlinapplication.lambda

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evenNumbers = numbers.filter { it % 2 == 0 }

    println("Even numbers: $evenNumbers")
}

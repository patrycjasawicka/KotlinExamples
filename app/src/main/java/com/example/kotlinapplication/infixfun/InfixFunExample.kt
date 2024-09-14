package com.example.kotlinapplication.infixfun

fun main() {
    val person = "name" to "Alice"
    println("Pair: ${person.first} -> ${person.second}")

    for (i in 1 until 5) {
        print("$i ")
    }
    println()

    for (i in 5 downTo 1) {
        print("$i ")
    }
    println()
}

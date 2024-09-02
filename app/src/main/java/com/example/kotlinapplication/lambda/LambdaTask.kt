package com.example.kotlinapplication.lambda

data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(
        Person("Alice", 30),
        Person("Bob", 25),
        Person("Charlie", 35),
        Person("David", 22),
        Person("Eve", 29)
    )

    val ageThreshold = 25

    //TODO:
    // 1. Odfiltruj ludzi, którzy są starsi niż wiek podany w ageThreshold
    // 2. Posortuj ich alfabetycznie po imieniu
    // 3. Wypisz wynikową listę
    println("People older than $ageThreshold, sorted by name:")
    //    ...
}

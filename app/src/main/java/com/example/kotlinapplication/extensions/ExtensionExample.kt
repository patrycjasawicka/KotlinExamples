package com.example.kotlinapplication.extensions

fun String.capitalizeWords(): String {
    return this.split(" ").joinToString(" ") { it.uppercase() }
}

fun main() {
    val sentence = "hello world from kotlin"
    val capitalizedSentence = sentence.capitalizeWords()

    println(capitalizedSentence)
}
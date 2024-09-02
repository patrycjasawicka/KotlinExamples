package com.example.kotlinapplication.types

fun printIfNotNull(value: Any?) {
    if (value != null) {
        println(value)
    } else {
        println("Value is null")
    }
}

fun failWithError(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun infiniteLoop(): Nothing {
    while (true) {
        // Do nothing, loop forever
    }
}

fun logMessage(message: String): Unit {
    println("Log: $message")
}

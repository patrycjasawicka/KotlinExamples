package com.example.kotlinapplication.inlinefunctions

// TODO: Zmodyfikuj funkcję w taki sposób, żeby pozbyć się błędu
inline fun executeOperationsWithNoinline(
    operation1: () -> Unit,
    operation2: () -> Unit
) {
    println("Starting operations...")
    operation1()
    // TODO: Odkomentuj
//    passToAnotherFunction(operation2)
    println("Operations complete.")
}

fun passToAnotherFunction(operation: () -> Unit) {
    println("Inside passToAnotherFunction:")
    operation()
}

// TODO: Zmodyfikuj funckję w taki sposób, żeby pozbyć się błędu
inline fun <T> checkType(value: Any) {
    // TODO: Odkomentuj
//    if (value is T) {
//        println("The value is of type ${T::class.simpleName}")
//    } else {
//        println("The value is NOT of type ${T::class.simpleName}")
//    }
}


fun main() {
    executeOperationsWithNoinline(
        operation1 = { println("Executing operation 1 with inline") },
        operation2 = { println("Executing operation 2 with noinline") }
    )

    checkType<String>("Hello, Kotlin!")
    checkType<Int>("Hello, Kotlin!")
}

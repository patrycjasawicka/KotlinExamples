package com.example.kotlinapplication.inlineclassesandtypealias

// TODO: Wykorzystaj typealias dla parametru sumFunction
fun calculateSum(x: Int, y: Int, sumFunction: (Int, Int) -> Int): Int {
    return sumFunction(x, y)
}

fun sum(x: Int, y: Int): Int {
    return x + y
}


fun main() {
    val sumFunction: (Int, Int) -> Int = { a, b -> a + b }

    val result = calculateSum(10, 20, sumFunction)
    println("The sum is: $result")

    val result2 = calculateSum(5, 15, ::sum)
    println("The sum is: $result2")
}

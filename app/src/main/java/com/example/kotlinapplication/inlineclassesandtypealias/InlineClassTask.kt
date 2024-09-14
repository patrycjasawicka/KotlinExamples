package com.example.kotlinapplication.inlineclassesandtypealias

// TODO: Poniższy kod posiada buga: wartości są błędnie przypisywane
// Zaproponuj rozwiązanie, które zapobiegnie tego typu błędom
// Wykorzystaj do tego inline classes
fun processOrder(userId: String, orderId: String) {
    println("Processing order with ID $orderId for user $userId")
}

fun main() {
        val userId = "user123"
        val orderId = "ORD-456"

        processOrder(orderId, userId)
}

package com.example.kotlinapplication.varianceannotations

class Producer<out T>(private val item: T) {
    fun produce(): T {
        return item
    }
}

fun handleProducer(producer: Producer<Animal>) {
    val animal: Animal = producer.produce()
    animal.feed()
}

fun main() {
    val dogProducer: Producer<Dog> = Producer(Dog())
    handleProducer(dogProducer)
}

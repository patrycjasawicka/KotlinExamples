package com.example.kotlinapplication.varianceannotations

open class Animal {
    fun feed() = println("Feeding an animal")
}

class Dog : Animal() {
    fun bark() = println("Barking")
}

fun addDogToList(animalList: MutableList<in Dog>) {
    animalList.add(Dog())
}

fun main() {
    val animals: MutableList<Animal> = mutableListOf(Animal(), Animal())
    addDogToList(animals)
}

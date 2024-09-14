package com.example.kotlinapplication.varianceannotations


class Cat : Animal() {
    fun meow() = println("Meowing!")
}

// TODO: Odkomentuj i uzupełnij odpowiednie typy w klasie i funkcji, która jej używa
// Wybierz odpowiednią "wariancję"

//class Cage<>(private val animals: List<T>) {
//    fun getAnimals(): List<T> = animals
//}
//
//fun printAnimalTypes(cage: Cage<>) {
//    for (animal in cage.getAnimals()) {
//        println(animal::class.simpleName)
//        animal.feed()
//    }
//}

///////////////////////

// TODO: Odkomentuj i uzupełnij odpowiednie typy w klasie i funkcji, która jej używa
// Wybierz odpowiednią "wariancję"
//class Caretaker<> {
//    fun takeCare(animal: T) {
//        println("Taking care of a ${animal::class.simpleName}")
//    }
//}
//
//
//fun careForDogs(caretaker: Caretaker<>) {
//    caretaker.takeCare(Dog())
//}

fun main() {
    // TODO: Odkomentuj
//    val dogCage: Cage<Dog> = Cage(listOf(Dog(), Dog()))
//    val catCage: Cage<Cat> = Cage(listOf(Cat(), Cat()))
//
//    printAnimalTypes(dogCage)
//    printAnimalTypes(catCage)
//
//    val animalCaretaker: Caretaker<Animal> = Caretaker()
//    val dogCaretaker: Caretaker<Dog> = Caretaker()
//
//    careForDogs(dogCaretaker)
//    careForDogs(animalCaretaker)
}

package com.example.kotlinapplication.nullability

data class Person(val name: String?, val age: Int?)

fun printPersonInfo(person: Person?) {
    //TODO:
    // 1. Wypisz imię osoby. W przypadku, kiedy jest nullem, wypisz domyślną wartość, np. "Unknown name"
    // 2. Sprawdź czy osoba jest dorosła, wypisz odpowiednią wiadomość na konsolę.
    // W przypadku, kiedy wiek jest nullem, wypisz "Age: Unknown"
}

fun main() {
    val person1 = Person("Alice", 25)
    val person2 = Person(null, 17)
    val person3 = Person("Bob", null)

    printPersonInfo(person1)
    println()
    printPersonInfo(person2)
    println()
    printPersonInfo(person3)
}

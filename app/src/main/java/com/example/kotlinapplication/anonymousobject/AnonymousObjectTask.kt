package com.example.kotlinapplication.anonymousobject

data class Person(val name: String, val age: Int, val height: Double)

fun sortPeople(people: List<Person>, comparator: Comparator<Person>): List<Person> {
    return people.sortedWith(comparator)
}

// TODO:
// 1. Dodaj komparatory dla imion, wieku i wzrostu

fun main() {
    val people = listOf(
        Person("Alice", 30, 5.5),
        Person("Bob", 25, 6.0),
        Person("Charlie", 28, 5.8),
        Person("Diana", 22, 5.7)
    )

    // TODO: odkomentuj
//    println("Sorted by name:")
//    sortPeople(people, nameComparator).forEach { println(it) }
//
//    println("\nSorted by age:")
//    sortPeople(people, ageComparator).forEach { println(it) }
//
//    println("\nSorted by height:")
//    sortPeople(people, heightComparator).forEach { println(it) }
}

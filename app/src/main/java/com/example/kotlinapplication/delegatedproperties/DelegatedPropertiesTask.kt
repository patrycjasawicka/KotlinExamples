package com.example.kotlinapplication.delegatedproperties


class UserProfile(private val userProfileMap: MutableMap<String, Any?>) {

    // TODO: Zaimplementuj fullName w taki sposób, żeby zwracał stringa złączonego z firstName i lastName
    // firstName i lastName odczytaj z mapy userProfileMap
    // Zaimplementuj to w taki sposób, żeby wartość tworzyła się dopiero przy próbie odczytania
    // Wykorzystaj do tego jednego ze standardowych delegatów
    val fullName: String = ""

    // TODO: Zaimplementuj email w taki sposób, żeby za każdym razem, kiedy przypisywana jest nowa wartość,
    //  na konsoli wypisywała się wiadomość "Email changed from oldValue to newValue" odpowiednio uzupełniona
    // Wykorzystaj do tego jednego ze standardowych delegatów
    var email: String = ""

    // TODO: Wykorzystaj jednego ze standardowych delegatów, żeby odczytać w krótki sposób wartości dla age i location
    val age: Int = 0
    val location: String = ""
}

fun main() {
    val userMap = mutableMapOf<String, Any?>(
        "firstName" to "John",
        "lastName" to "Doe",
        "age" to 30,
        "location" to "New York"
    )

    val userProfile = UserProfile(userMap)

    println("Full Name: ${userProfile.fullName}")

    userProfile.email = "john.doe@example.com"
    userProfile.email = "john.newemail@example.com"

    println("Age: ${userProfile.age}")
    println("Location: ${userProfile.location}")
}

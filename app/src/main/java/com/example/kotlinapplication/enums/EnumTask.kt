package com.example.kotlinapplication.enums

// TODO:
// Zdefiniuj enum klasę UserRole, która będzie przyjmować jako paramter poziom uprawnień w postaci integera
// Klasa UserRole może zawierać 3 warianty: Admin, użytkownik i gość
// Każdemu z nich przypisz odpowiedni poziom uprawnień
// Zdefiniuj również abstrakcyjną funkcję canPerformAction(action: String): Boolean i zaimplementuj ją dla każdego rodzaju użytkownika wykorzystując anonymous class
// Admin może wykonać akcję, jeśli zawiera w sobie stringa "delete data" albo "view data"
// Użytkownik może wykonać akcję, jeśli zawiera "view data"
// Gość nie może wykonań żadnej akcji

// TODO: Odkomentuj
//fun performAction(role: UserRole, action: String): String {
//    return if (role.canPerformAction(action)) {
//        "${role.name} can perform action: $action"
//    } else {
//        "${role.name} cannot perform action: $action"
//    }
//}

fun main() {
//    val admin = UserRole.Admin
//    val user = UserRole.User
//    val guest = UserRole.Guest

//    println(performAction(admin, "delete data"))
//    println(performAction(admin, "view data"))
//    println(performAction(user, "delete data"))
//    println(performAction(user, "view data"))
//    println(performAction(guest, "view data"))
}

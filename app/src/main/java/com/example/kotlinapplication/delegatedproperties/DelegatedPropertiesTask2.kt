package com.example.kotlinapplication.delegatedproperties

import kotlin.reflect.KProperty

class SetOnce<T>(private var value: T? = null) {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): T? {
        return value
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, newValue: T?) {
        // TODO: Ustaw wartość tylko jeśli jeszcze nie jest ustawiona, w przeciwnym wypadku rzuć wyjątek
    }
}

class UserProfile2 {
    var username: String? by SetOnce()
}

fun main() {
    val userProfile = UserProfile2()

    userProfile.username = "johnDoe123"
    userProfile.username = "johnDoe456"
}

package com.example.kotlinapplication.anonymousobject

interface EventListener {
    fun onEvent(eventName: String)
}

class EventManager {

    private val listeners = mutableListOf<EventListener>()

    fun registerListener(listener: EventListener) {
        listeners.add(listener)
    }

    fun triggerEvent(eventName: String) {
        println("Event triggered: $eventName")
        for (listener in listeners) {
            listener.onEvent(eventName)
        }
    }
}

fun main() {
    val eventManager = EventManager()

    eventManager.registerListener(object : EventListener {
        override fun onEvent(eventName: String) {
            println("Listener 1 received event: $eventName")
        }
    })

    eventManager.registerListener(object : EventListener {
        override fun onEvent(eventName: String) {
            println("Listener 2 received event: $eventName")
        }
    })

    eventManager.triggerEvent("UserLoggedIn")
    eventManager.triggerEvent("DataLoaded")
}

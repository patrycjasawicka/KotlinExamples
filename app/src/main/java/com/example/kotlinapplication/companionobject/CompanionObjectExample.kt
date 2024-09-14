package com.example.kotlinapplication.companionobject

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Logger private constructor() {

    companion object {
        private const val TAG = "MyAppLogger"
        private var instance: Logger? = null

        fun getInstance(): Logger {
            if (instance == null) {
                instance = Logger()
            }
            return instance!!
        }
    }

    fun log(message: String) {
        val timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
        println("[$timestamp] $TAG: $message")
    }
}

fun main() {
    val logger = Logger.getInstance()
    logger.log("This is a log message.")

    val anotherLogger = Logger.getInstance()
    anotherLogger.log("This is another log message.")
}

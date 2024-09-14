package com.example.kotlinapplication.delegatedfunctions

interface Logger {
    fun logInfo(message: String)
    fun logError(message: String)
}

class ConsoleLogger : Logger {
    override fun logInfo(message: String) {
        println("INFO: $message")
    }

    override fun logError(message: String) {
        println("ERROR: $message")
    }
}

class FileLogger : Logger {
    override fun logInfo(message: String) {
        println("Writing INFO to file: $message")
    }

    override fun logError(message: String) {
        println("Writing ERROR to file: $message")
    }
}

// TODO: Stwórz klasę Service, która będzie implementowała interface Logger i doda do niego dodatkową funkcję performAction
// Nie implementuj istniejących funkcji z interfacu Logger, tylko wykorzystaj do tego class delegation

fun main() {
    // TODO: Odkomentuj
//    val consoleService = Service(ConsoleLogger())
//    consoleService.performAction()
//    consoleService.logError("Something went wrong with the console logger")
//
//    println("\nSwitching to FileLogger\n")
//
//    val fileService = Service(FileLogger())
//    fileService.performAction()
//    fileService.logInfo("This will be logged in a file")
}

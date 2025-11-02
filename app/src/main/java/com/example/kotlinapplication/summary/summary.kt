package com.example.kotlinapplication.summary
import kotlin.properties.Delegates

// TODO: Zmodyfikuj deklarację klasy
class Task(
    val id: Int,
    val title: String,
    val description: String?,
    val status: TaskStatus = TaskStatus()
)

// TODO: Zmodyfikuj deklarację klasy
class TaskStatus {
    object Pending
    object InProgress
    object Completed
}

// TODO: Dopisz implementację funkcji
// Czym są poniższe 3 funkcje (jak nazywa się ich rodzaj)?
fun Task.markCompleted(): Task = this

fun Task.start(): Task = this

fun Task.withDescription(newDesc: String?): Task = this

class TaskRepository {
    private val tasks = mutableListOf<Task>()

    // TODO: Odkomentuj i zmodyfikuj
//    object {
//        private var nextId = 1
//        fun generateId() = nextId++
//    }

    fun addTask(title: String, description: String?): Task {
        val task = Task(/*generateId()*/1, title, description)
        tasks.add(task)
        return task
    }

    fun updateTask(updated: Task) {
        val index = tasks.indexOfFirst { it.id == updated.id }
        if (index != -1) tasks[index] = updated
    }

    fun getAllTasks(): List<Task> = tasks
}

class Settings {
    // TODO: Przepisz kod w taki sposób, żeby skorzystać z Delegated property
    // Jakie inne delegaty znasz?
    var theme: String = "Light"
        set(value) {
            println("Theme changed from $field to $value")
            field = value
        }
}

// TODO: Dokończ implementację funkcji
private fun getCompletedTasks(repo: TaskRepository): List<Task> =
    repo.getAllTasks()

fun main() {
    val repo = TaskRepository()
    val settings = Settings()

    var task1 = repo.addTask("Learn Kotlin", null)
    var task2 = repo.addTask("Build a project", "Use Kotlin features")

    task1 = task1.start().withDescription("Practice Kotlin core concepts")
    task2 = task2.markCompleted()

    repo.updateTask(task1)
    repo.updateTask(task2)

    repo.getAllTasks().forEach { println(it) }

    settings.theme = "Dark"

    val completed = getCompletedTasks(repo)
    println("Completed tasks: ${completed.size}")
}


